package org.vamdc.kida.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _ImportInfosNewSpecie was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ImportInfosNewSpecie extends CayenneDataObject {

    public static final String APPLICATION_PROPERTY = "application";
    public static final String CAS_PROPERTY = "cas";
    public static final String CHARGE_PROPERTY = "charge";
    public static final String COMMON_NAME_PROPERTY = "commonName";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String ELECTRONIC_STATE_PROPERTY = "electronicState";
    public static final String INCHI_PROPERTY = "inchi";
    public static final String IS_PAUSE_PROPERTY = "isPause";
    public static final String SPECIES_PROPERTY = "species";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";

    public static final String ID_PK_COLUMN = "id";

    public void setApplication(String application) {
        writeProperty("application", application);
    }
    public String getApplication() {
        return (String)readProperty("application");
    }

    public void setCas(String cas) {
        writeProperty("cas", cas);
    }
    public String getCas() {
        return (String)readProperty("cas");
    }

    public void setCharge(Integer charge) {
        writeProperty("charge", charge);
    }
    public Integer getCharge() {
        return (Integer)readProperty("charge");
    }

    public void setCommonName(String commonName) {
        writeProperty("commonName", commonName);
    }
    public String getCommonName() {
        return (String)readProperty("commonName");
    }

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setElectronicState(String electronicState) {
        writeProperty("electronicState", electronicState);
    }
    public String getElectronicState() {
        return (String)readProperty("electronicState");
    }

    public void setInchi(String inchi) {
        writeProperty("inchi", inchi);
    }
    public String getInchi() {
        return (String)readProperty("inchi");
    }

    public void setIsPause(Integer isPause) {
        writeProperty("isPause", isPause);
    }
    public Integer getIsPause() {
        return (Integer)readProperty("isPause");
    }

    public void setSpecies(String species) {
        writeProperty("species", species);
    }
    public String getSpecies() {
        return (String)readProperty("species");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

}