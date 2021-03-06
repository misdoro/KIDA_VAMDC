package org.vamdc.kida.dao.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.dao.Biblio;
import org.vamdc.kida.dao.Channel;
import org.vamdc.kida.dao.ChannelVariable;
import org.vamdc.kida.dao.Formula;
import org.vamdc.kida.dao.SfGuardUser;
import org.vamdc.kida.dao.ValidityRange;

/**
 * Class _ChannelValue was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ChannelValue extends CayenneDataObject {

    public static final String ADD_JUSTIFICATION_PROPERTY = "addJustification";
    public static final String APPLICATION_PROPERTY = "application";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String CV_FIELD_PROPERTY = "cvField";
    public static final String DATABASE_PROPERTY = "database";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String EXPERT_AUTHORISED_PROPERTY = "expertAuthorised";
    public static final String EXPERTIZE_PROPERTY = "expertize";
    public static final String ID_PROPERTY = "id";
    public static final String IS_TEMP_PROPERTY = "isTemp";
    public static final String IS_TRASH_PROPERTY = "isTrash";
    public static final String JUSTIFICATION_PROPERTY = "justification";
    public static final String METHOD_PROPERTY = "method";
    public static final String ORIGIN_PROPERTY = "origin";
    public static final String REF_PROPERTY = "ref";
    public static final String STATUS_PROPERTY = "status";
    public static final String TRASH_AUTHOR_PROPERTY = "trashAuthor";
    public static final String TRASH_COMMENT_PROPERTY = "trashComment";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String BIBLIOGRAPHY_PROPERTY = "bibliography";
    public static final String CHANNEL_PROPERTY = "channel";
    public static final String CHANNEL_VARIABLES_PROPERTY = "channelVariables";
    public static final String FORMULA_PROPERTY = "formula";
    public static final String TO_SF_GUARD_USER_PROPERTY = "toSfGuardUser";
    public static final String TO_SF_GUARD_USER1_PROPERTY = "toSfGuardUser1";
    public static final String VALIDITY_RANGE_PROPERTY = "validityRange";

    public static final String ID_PK_COLUMN = "id";

    public void setAddJustification(String addJustification) {
        writeProperty("addJustification", addJustification);
    }
    public String getAddJustification() {
        return (String)readProperty("addJustification");
    }

    public void setApplication(String application) {
        writeProperty("application", application);
    }
    public String getApplication() {
        return (String)readProperty("application");
    }

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setCvField(String cvField) {
        writeProperty("cvField", cvField);
    }
    public String getCvField() {
        return (String)readProperty("cvField");
    }

    public void setDatabase(String database) {
        writeProperty("database", database);
    }
    public String getDatabase() {
        return (String)readProperty("database");
    }

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setExpertAuthorised(String expertAuthorised) {
        writeProperty("expertAuthorised", expertAuthorised);
    }
    public String getExpertAuthorised() {
        return (String)readProperty("expertAuthorised");
    }

    public void setExpertize(Integer expertize) {
        writeProperty("expertize", expertize);
    }
    public Integer getExpertize() {
        return (Integer)readProperty("expertize");
    }

    public void setId(Integer id) {
        writeProperty("id", id);
    }
    public Integer getId() {
        return (Integer)readProperty("id");
    }

    public void setIsTemp(Byte isTemp) {
        writeProperty("isTemp", isTemp);
    }
    public Byte getIsTemp() {
        return (Byte)readProperty("isTemp");
    }

    public void setIsTrash(Integer isTrash) {
        writeProperty("isTrash", isTrash);
    }
    public Integer getIsTrash() {
        return (Integer)readProperty("isTrash");
    }

    public void setJustification(String justification) {
        writeProperty("justification", justification);
    }
    public String getJustification() {
        return (String)readProperty("justification");
    }

    public void setMethod(String method) {
        writeProperty("method", method);
    }
    public String getMethod() {
        return (String)readProperty("method");
    }

    public void setOrigin(String origin) {
        writeProperty("origin", origin);
    }
    public String getOrigin() {
        return (String)readProperty("origin");
    }

    public void setRef(String ref) {
        writeProperty("ref", ref);
    }
    public String getRef() {
        return (String)readProperty("ref");
    }

    public void setStatus(Integer status) {
        writeProperty("status", status);
    }
    public Integer getStatus() {
        return (Integer)readProperty("status");
    }

    public void setTrashAuthor(String trashAuthor) {
        writeProperty("trashAuthor", trashAuthor);
    }
    public String getTrashAuthor() {
        return (String)readProperty("trashAuthor");
    }

    public void setTrashComment(String trashComment) {
        writeProperty("trashComment", trashComment);
    }
    public String getTrashComment() {
        return (String)readProperty("trashComment");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void setBibliography(Biblio bibliography) {
        setToOneTarget("bibliography", bibliography, true);
    }

    public Biblio getBibliography() {
        return (Biblio)readProperty("bibliography");
    }


    public void setChannel(Channel channel) {
        setToOneTarget("channel", channel, true);
    }

    public Channel getChannel() {
        return (Channel)readProperty("channel");
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


    public void setFormula(Formula formula) {
        setToOneTarget("formula", formula, true);
    }

    public Formula getFormula() {
        return (Formula)readProperty("formula");
    }


    public void setToSfGuardUser(SfGuardUser toSfGuardUser) {
        setToOneTarget("toSfGuardUser", toSfGuardUser, true);
    }

    public SfGuardUser getToSfGuardUser() {
        return (SfGuardUser)readProperty("toSfGuardUser");
    }


    public void setToSfGuardUser1(SfGuardUser toSfGuardUser1) {
        setToOneTarget("toSfGuardUser1", toSfGuardUser1, true);
    }

    public SfGuardUser getToSfGuardUser1() {
        return (SfGuardUser)readProperty("toSfGuardUser1");
    }


    public void setValidityRange(ValidityRange validityRange) {
        setToOneTarget("validityRange", validityRange, true);
    }

    public ValidityRange getValidityRange() {
        return (ValidityRange)readProperty("validityRange");
    }


}
