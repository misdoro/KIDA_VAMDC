package org.vamdc.kida.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Search was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Search extends CayenneDataObject {

    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String QUERY_PARAM_PROPERTY = "queryParam";
    public static final String TYPE_CHANNEL_ID_PROPERTY = "typeChannelId";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String USER_EMAIL_PROPERTY = "userEmail";

    public static final String RANDOM_KEY_PK_COLUMN = "random_key";
    public static final String REA_PROD_PK_COLUMN = "rea_prod";
    public static final String REACTION_ID_PK_COLUMN = "reaction_id";

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setQueryParam(String queryParam) {
        writeProperty("queryParam", queryParam);
    }
    public String getQueryParam() {
        return (String)readProperty("queryParam");
    }

    public void setTypeChannelId(Integer typeChannelId) {
        writeProperty("typeChannelId", typeChannelId);
    }
    public Integer getTypeChannelId() {
        return (Integer)readProperty("typeChannelId");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void setUserEmail(String userEmail) {
        writeProperty("userEmail", userEmail);
    }
    public String getUserEmail() {
        return (String)readProperty("userEmail");
    }

}