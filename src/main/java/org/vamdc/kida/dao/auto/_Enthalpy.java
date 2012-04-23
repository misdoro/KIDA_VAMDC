package org.vamdc.kida.dao.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Enthalpy was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Enthalpy extends CayenneDataObject {

    public static final String AUTHOR_EMAIL_PROPERTY = "authorEmail";
    public static final String BIBLIOGRAPHY_ID_PROPERTY = "bibliographyId";
    public static final String COMMENT_PROPERTY = "comment";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String DATABASE_PROPERTY = "database";
    public static final String EXPERT_EMAIL_PROPERTY = "expertEmail";
    public static final String EXPERTIZE_PROPERTY = "expertize";
    public static final String ID_PROPERTY = "id";
    public static final String JUSTIFICATION_PROPERTY = "justification";
    public static final String METHOD_PROPERTY = "method";
    public static final String ORIGIN_PROPERTY = "origin";
    public static final String REF_PROPERTY = "ref";
    public static final String SPECIES_ID_PROPERTY = "speciesId";
    public static final String TEMPERATURE_PROPERTY = "temperature";
    public static final String TYPE_UNCERT_PROPERTY = "typeUncert";
    public static final String UNCERT_PROPERTY = "uncert";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String VALUE_PROPERTY = "value";

    public static final String ID_PK_COLUMN = "id";

    public void setAuthorEmail(String authorEmail) {
        writeProperty("authorEmail", authorEmail);
    }
    public String getAuthorEmail() {
        return (String)readProperty("authorEmail");
    }

    public void setBibliographyId(Integer bibliographyId) {
        writeProperty("bibliographyId", bibliographyId);
    }
    public Integer getBibliographyId() {
        return (Integer)readProperty("bibliographyId");
    }

    public void setComment(String comment) {
        writeProperty("comment", comment);
    }
    public String getComment() {
        return (String)readProperty("comment");
    }

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setDatabase(String database) {
        writeProperty("database", database);
    }
    public String getDatabase() {
        return (String)readProperty("database");
    }

    public void setExpertEmail(String expertEmail) {
        writeProperty("expertEmail", expertEmail);
    }
    public String getExpertEmail() {
        return (String)readProperty("expertEmail");
    }

    public void setExpertize(String expertize) {
        writeProperty("expertize", expertize);
    }
    public String getExpertize() {
        return (String)readProperty("expertize");
    }

    public void setId(Integer id) {
        writeProperty("id", id);
    }
    public Integer getId() {
        return (Integer)readProperty("id");
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

    public void setSpeciesId(Integer speciesId) {
        writeProperty("speciesId", speciesId);
    }
    public Integer getSpeciesId() {
        return (Integer)readProperty("speciesId");
    }

    public void setTemperature(Float temperature) {
        writeProperty("temperature", temperature);
    }
    public Float getTemperature() {
        return (Float)readProperty("temperature");
    }

    public void setTypeUncert(String typeUncert) {
        writeProperty("typeUncert", typeUncert);
    }
    public String getTypeUncert() {
        return (String)readProperty("typeUncert");
    }

    public void setUncert(Float uncert) {
        writeProperty("uncert", uncert);
    }
    public Float getUncert() {
        return (Float)readProperty("uncert");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void setValue(Float value) {
        writeProperty("value", value);
    }
    public Float getValue() {
        return (Float)readProperty("value");
    }

}