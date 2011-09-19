package org.vamdc.kida.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.ChannelVariable;
import org.vamdc.kida.Reaction;
import org.vamdc.kida.SfGuardUser;
import org.vamdc.kida.ValidityRange;

/**
 * Class _TotalRate was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TotalRate extends CayenneDataObject {

    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String EXPERTIZE_PROPERTY = "expertize";
    public static final String JUSTIFICATION_PROPERTY = "justification";
    public static final String METHOD_PROPERTY = "method";
    public static final String ORIGIN_PROPERTY = "origin";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String CHANNEL_VARIABLE_ARRAY_PROPERTY = "channelVariableArray";
    public static final String TO_REACTION_PROPERTY = "toReaction";
    public static final String TO_SF_GUARD_USER_PROPERTY = "toSfGuardUser";
    public static final String TO_SF_GUARD_USER1_PROPERTY = "toSfGuardUser1";
    public static final String TO_VALIDITY_RANGE_PROPERTY = "toValidityRange";

    public static final String ID_PK_COLUMN = "id";

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setExpertize(Integer expertize) {
        writeProperty("expertize", expertize);
    }
    public Integer getExpertize() {
        return (Integer)readProperty("expertize");
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

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void addToChannelVariableArray(ChannelVariable obj) {
        addToManyTarget("channelVariableArray", obj, true);
    }
    public void removeFromChannelVariableArray(ChannelVariable obj) {
        removeToManyTarget("channelVariableArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ChannelVariable> getChannelVariableArray() {
        return (List<ChannelVariable>)readProperty("channelVariableArray");
    }


    public void setToReaction(Reaction toReaction) {
        setToOneTarget("toReaction", toReaction, true);
    }

    public Reaction getToReaction() {
        return (Reaction)readProperty("toReaction");
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


    public void setToValidityRange(ValidityRange toValidityRange) {
        setToOneTarget("toValidityRange", toValidityRange, true);
    }

    public ValidityRange getToValidityRange() {
        return (ValidityRange)readProperty("toValidityRange");
    }


}