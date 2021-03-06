package org.vamdc.kida.dao.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.dao.BugsAndFeatures;
import org.vamdc.kida.dao.ChannelValue;
import org.vamdc.kida.dao.Comment;
import org.vamdc.kida.dao.GetLogged;
import org.vamdc.kida.dao.SfGuardRememberKey;
import org.vamdc.kida.dao.SfGuardUserGroup;
import org.vamdc.kida.dao.SfGuardUserPermission;
import org.vamdc.kida.dao.SfGuardUserProfile;
import org.vamdc.kida.dao.TotalRate;

/**
 * Class _SfGuardUser was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SfGuardUser extends CayenneDataObject {

    public static final String ALGORITHM_PROPERTY = "algorithm";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String ID_PROPERTY = "id";
    public static final String IS_ACTIVE_PROPERTY = "isActive";
    public static final String IS_SUPER_ADMIN_PROPERTY = "isSuperAdmin";
    public static final String LAST_LOGIN_PROPERTY = "lastLogin";
    public static final String PASSWORD_PROPERTY = "password";
    public static final String SALT_PROPERTY = "salt";
    public static final String BUGS_AND_FEATURESES_PROPERTY = "bugsAndFeatureses";
    public static final String CHANNEL_VALUES_PROPERTY = "channelValues";
    public static final String CHANNEL_VALUES1_PROPERTY = "channelValues1";
    public static final String COMMENTS_PROPERTY = "comments";
    public static final String GET_LOGGEDS_PROPERTY = "getLoggeds";
    public static final String SF_GUARD_REMEMBER_KEYS_PROPERTY = "sfGuardRememberKeys";
    public static final String SF_GUARD_USER_GROUPS_PROPERTY = "sfGuardUserGroups";
    public static final String SF_GUARD_USER_PERMISSIONS_PROPERTY = "sfGuardUserPermissions";
    public static final String SF_GUARD_USER_PROFILES_PROPERTY = "sfGuardUserProfiles";
    public static final String TOTAL_RATES_PROPERTY = "totalRates";
    public static final String TOTAL_RATES1_PROPERTY = "totalRates1";

    public static final String ID_PK_COLUMN = "id";

    public void setAlgorithm(String algorithm) {
        writeProperty("algorithm", algorithm);
    }
    public String getAlgorithm() {
        return (String)readProperty("algorithm");
    }

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setId(Integer id) {
        writeProperty("id", id);
    }
    public Integer getId() {
        return (Integer)readProperty("id");
    }

    public void setIsActive(Byte isActive) {
        writeProperty("isActive", isActive);
    }
    public Byte getIsActive() {
        return (Byte)readProperty("isActive");
    }

    public void setIsSuperAdmin(Byte isSuperAdmin) {
        writeProperty("isSuperAdmin", isSuperAdmin);
    }
    public Byte getIsSuperAdmin() {
        return (Byte)readProperty("isSuperAdmin");
    }

    public void setLastLogin(Date lastLogin) {
        writeProperty("lastLogin", lastLogin);
    }
    public Date getLastLogin() {
        return (Date)readProperty("lastLogin");
    }

    public void setPassword(String password) {
        writeProperty("password", password);
    }
    public String getPassword() {
        return (String)readProperty("password");
    }

    public void setSalt(String salt) {
        writeProperty("salt", salt);
    }
    public String getSalt() {
        return (String)readProperty("salt");
    }

    public void addToBugsAndFeatureses(BugsAndFeatures obj) {
        addToManyTarget("bugsAndFeatureses", obj, true);
    }
    public void removeFromBugsAndFeatureses(BugsAndFeatures obj) {
        removeToManyTarget("bugsAndFeatureses", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<BugsAndFeatures> getBugsAndFeatureses() {
        return (List<BugsAndFeatures>)readProperty("bugsAndFeatureses");
    }


    public void addToChannelValues(ChannelValue obj) {
        addToManyTarget("channelValues", obj, true);
    }
    public void removeFromChannelValues(ChannelValue obj) {
        removeToManyTarget("channelValues", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ChannelValue> getChannelValues() {
        return (List<ChannelValue>)readProperty("channelValues");
    }


    public void addToChannelValues1(ChannelValue obj) {
        addToManyTarget("channelValues1", obj, true);
    }
    public void removeFromChannelValues1(ChannelValue obj) {
        removeToManyTarget("channelValues1", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ChannelValue> getChannelValues1() {
        return (List<ChannelValue>)readProperty("channelValues1");
    }


    public void addToComments(Comment obj) {
        addToManyTarget("comments", obj, true);
    }
    public void removeFromComments(Comment obj) {
        removeToManyTarget("comments", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Comment> getComments() {
        return (List<Comment>)readProperty("comments");
    }


    public void addToGetLoggeds(GetLogged obj) {
        addToManyTarget("getLoggeds", obj, true);
    }
    public void removeFromGetLoggeds(GetLogged obj) {
        removeToManyTarget("getLoggeds", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<GetLogged> getGetLoggeds() {
        return (List<GetLogged>)readProperty("getLoggeds");
    }


    public void addToSfGuardRememberKeys(SfGuardRememberKey obj) {
        addToManyTarget("sfGuardRememberKeys", obj, true);
    }
    public void removeFromSfGuardRememberKeys(SfGuardRememberKey obj) {
        removeToManyTarget("sfGuardRememberKeys", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SfGuardRememberKey> getSfGuardRememberKeys() {
        return (List<SfGuardRememberKey>)readProperty("sfGuardRememberKeys");
    }


    public void addToSfGuardUserGroups(SfGuardUserGroup obj) {
        addToManyTarget("sfGuardUserGroups", obj, true);
    }
    public void removeFromSfGuardUserGroups(SfGuardUserGroup obj) {
        removeToManyTarget("sfGuardUserGroups", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SfGuardUserGroup> getSfGuardUserGroups() {
        return (List<SfGuardUserGroup>)readProperty("sfGuardUserGroups");
    }


    public void addToSfGuardUserPermissions(SfGuardUserPermission obj) {
        addToManyTarget("sfGuardUserPermissions", obj, true);
    }
    public void removeFromSfGuardUserPermissions(SfGuardUserPermission obj) {
        removeToManyTarget("sfGuardUserPermissions", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SfGuardUserPermission> getSfGuardUserPermissions() {
        return (List<SfGuardUserPermission>)readProperty("sfGuardUserPermissions");
    }


    public void addToSfGuardUserProfiles(SfGuardUserProfile obj) {
        addToManyTarget("sfGuardUserProfiles", obj, true);
    }
    public void removeFromSfGuardUserProfiles(SfGuardUserProfile obj) {
        removeToManyTarget("sfGuardUserProfiles", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SfGuardUserProfile> getSfGuardUserProfiles() {
        return (List<SfGuardUserProfile>)readProperty("sfGuardUserProfiles");
    }


    public void addToTotalRates(TotalRate obj) {
        addToManyTarget("totalRates", obj, true);
    }
    public void removeFromTotalRates(TotalRate obj) {
        removeToManyTarget("totalRates", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<TotalRate> getTotalRates() {
        return (List<TotalRate>)readProperty("totalRates");
    }


    public void addToTotalRates1(TotalRate obj) {
        addToManyTarget("totalRates1", obj, true);
    }
    public void removeFromTotalRates1(TotalRate obj) {
        removeToManyTarget("totalRates1", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<TotalRate> getTotalRates1() {
        return (List<TotalRate>)readProperty("totalRates1");
    }


}
