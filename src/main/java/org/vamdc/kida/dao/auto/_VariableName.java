package org.vamdc.kida.dao.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.dao.ChannelVariable;

/**
 * Class _VariableName was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VariableName extends CayenneDataObject {

    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String HTML_PROPERTY = "html";
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String CHANNEL_VARIABLES_PROPERTY = "channelVariables";

    public static final String ID_PK_COLUMN = "id";

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setHtml(String html) {
        writeProperty("html", html);
    }
    public String getHtml() {
        return (String)readProperty("html");
    }

    public void setId(Integer id) {
        writeProperty("id", id);
    }
    public Integer getId() {
        return (Integer)readProperty("id");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void addToChannelVariables(ChannelVariable obj) {
        addToManyTarget("channelVariables", obj, true);
    }
    public void removeFromChannelVariables(ChannelVariable obj) {
        removeToManyTarget("channelVariables", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ChannelVariable> getChannelVariables() {
        return (List<ChannelVariable>)readProperty("channelVariables");
    }


}