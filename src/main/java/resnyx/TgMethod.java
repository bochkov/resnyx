package resnyx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.codec.Charsets;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import resnyx.methods.chat.*;
import resnyx.methods.edit.*;
import resnyx.methods.message.*;
import resnyx.methods.other.AnswerCallbackQuery;
import resnyx.methods.other.GetFile;
import resnyx.methods.other.GetMe;
import resnyx.methods.other.GetUserProfilePhotos;
import resnyx.methods.stickers.*;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * abstract class for all telegram api methods
 *
 * @param <T>
 */
@Data
@NoArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "method")
@JsonSubTypes({
        @JsonSubTypes.Type(value = GetMe.class, name = GetMe.METHOD),
        @JsonSubTypes.Type(value = SendMessage.class, name = SendMessage.METHOD),
        @JsonSubTypes.Type(value = ForwardMessage.class, name = ForwardMessage.METHOD),
        @JsonSubTypes.Type(value = SendPhoto.class, name = SendPhoto.METHOD),
        @JsonSubTypes.Type(value = SendAudio.class, name = SendAudio.METHOD),
        @JsonSubTypes.Type(value = SendDocument.class, name = SendDocument.METHOD),
        @JsonSubTypes.Type(value = SendVideo.class, name = SendVideo.METHOD),
        @JsonSubTypes.Type(value = SendAnimation.class, name = SendAnimation.METHOD),
        @JsonSubTypes.Type(value = SendVoice.class, name = SendVoice.METHOD),
        @JsonSubTypes.Type(value = SendVideoNote.class, name = SendVideoNote.METHOD),
        @JsonSubTypes.Type(value = SendMediaGroup.class, name = SendMediaGroup.METHOD),
        @JsonSubTypes.Type(value = SendLocation.class, name = SendLocation.METHOD),
        @JsonSubTypes.Type(value = EditMessageLiveLoc.class, name = EditMessageLiveLoc.METHOD),
        @JsonSubTypes.Type(value = StopMessageLiveLoc.class, name = StopMessageLiveLoc.METHOD),
        @JsonSubTypes.Type(value = SendVenue.class, name = SendVenue.METHOD),
        @JsonSubTypes.Type(value = SendContact.class, name = SendContact.METHOD),
        @JsonSubTypes.Type(value = SendPoll.class, name = SendPoll.METHOD),
        @JsonSubTypes.Type(value = SendChatAction.class, name = SendChatAction.METHOD),
        @JsonSubTypes.Type(value = GetUserProfilePhotos.class, name = GetUserProfilePhotos.METHOD),
        @JsonSubTypes.Type(value = GetFile.class, name = GetFile.METHOD),
        @JsonSubTypes.Type(value = KickChatMember.class, name = KickChatMember.METHOD),
        @JsonSubTypes.Type(value = UnbanChatMember.class, name = UnbanChatMember.METHOD),
        @JsonSubTypes.Type(value = RestrictChatMember.class, name = RestrictChatMember.METHOD),
        @JsonSubTypes.Type(value = PromoteChatMember.class, name = PromoteChatMember.METHOD),
        @JsonSubTypes.Type(value = ExportChatInviteLink.class, name = ExportChatInviteLink.METHOD),
        @JsonSubTypes.Type(value = SetChatPhoto.class, name = SetChatPhoto.METHOD),
        @JsonSubTypes.Type(value = DeleteChatPhoto.class, name = DeleteChatPhoto.METHOD),
        @JsonSubTypes.Type(value = SetChatPhoto.class, name = SetChatPhoto.METHOD),
        @JsonSubTypes.Type(value = SetChatTitle.class, name = SetChatTitle.METHOD),
        @JsonSubTypes.Type(value = SetChatDescription.class, name = SetChatDescription.METHOD),
        @JsonSubTypes.Type(value = SetChatPermissions.class, name = SetChatPermissions.METHOD),
        @JsonSubTypes.Type(value = PinChatMessage.class, name = PinChatMessage.METHOD),
        @JsonSubTypes.Type(value = UnpinChatMessage.class, name = UnpinChatMessage.METHOD),
        @JsonSubTypes.Type(value = LeaveChat.class, name = LeaveChat.METHOD),
        @JsonSubTypes.Type(value = GetChat.class, name = GetChat.METHOD),
        @JsonSubTypes.Type(value = GetChatAdmins.class, name = GetChatAdmins.METHOD),
        @JsonSubTypes.Type(value = GetChatMembersCount.class, name = GetChatMembersCount.METHOD),
        @JsonSubTypes.Type(value = GetChatMember.class, name = GetChatMember.METHOD),
        @JsonSubTypes.Type(value = SetChatStickerSet.class, name = SetChatStickerSet.METHOD),
        @JsonSubTypes.Type(value = DeleteChatStickerSet.class, name = DeleteChatStickerSet.METHOD),
        @JsonSubTypes.Type(value = AnswerCallbackQuery.class, name = AnswerCallbackQuery.METHOD),
        @JsonSubTypes.Type(value = EditMessageText.class, name = EditMessageText.METHOD),
        @JsonSubTypes.Type(value = EditMessageCaption.class, name = EditMessageCaption.METHOD),
        @JsonSubTypes.Type(value = EditMessageMedia.class, name = EditMessageMedia.METHOD),
        @JsonSubTypes.Type(value = EditMessageReplyMarkup.class, name = EditMessageReplyMarkup.METHOD),
        @JsonSubTypes.Type(value = StopPoll.class, name = StopPoll.METHOD),
        @JsonSubTypes.Type(value = DeleteMessage.class, name = DeleteMessage.METHOD),
        @JsonSubTypes.Type(value = SendSticker.class, name = SendSticker.METHOD),
        @JsonSubTypes.Type(value = GetStickerSet.class, name = GetStickerSet.METHOD),
        @JsonSubTypes.Type(value = UploadStickerFile.class, name = UploadStickerFile.METHOD),
        @JsonSubTypes.Type(value = CreateNewStickerSet.class, name = CreateNewStickerSet.METHOD),
        @JsonSubTypes.Type(value = AddStickerToSet.class, name = AddStickerToSet.METHOD),
        @JsonSubTypes.Type(value = SetStickerPositionInSet.class, name = SetStickerPositionInSet.METHOD),
})
public abstract class TgMethod<T> implements Serializable {

    private static final Logger LOG = LoggerFactory.getLogger(TgMethod.class);
    private static final ObjectMapper MAPPER = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);
    private static final TypeReference<Map<String, String>> MAP_TYPE = new TypeReference<>() {
    };

    private String token;

    public TgMethod(String token) {
        this.token = token;
    }

    protected abstract String method();

    protected abstract TypeReference<Answer<T>> type();

    protected List<NameValuePair> params() {
        Map<String, String> params = MAPPER.convertValue(this, MAP_TYPE);
        LOG.info("{}", params);
        List<NameValuePair> pairs = new ArrayList<>();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            pairs.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        return pairs;
    }

    protected HttpEntity toHttpEntity() {
        return new UrlEncodedFormEntity(params(), Charsets.UTF_8);
    }

    public Answer<T> execute() throws IOException {
        String json;
        try (CloseableHttpClient http = HttpClients.createDefault()) {
            HttpPost post = new HttpPost(
                    String.format("https://api.telegram.org/bot%s/%s", token, method())
            );
            post.setEntity(this.toHttpEntity());
            json = new String(
                    http.execute(post).getEntity().getContent().readAllBytes()
            );
        }
        LOG.debug("{}", json);
        Answer<T> answer = MAPPER.readValue(json, type());
        if (!answer.getOk()) {
            String msg = answer.errDesc();
            LOG.warn(msg);
        }
        return answer;
    }
}
