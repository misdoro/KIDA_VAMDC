package org.vamdc.kida.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.Datasheet;
import org.vamdc.kida.ExperimentHasChannel;
import org.vamdc.kida.TotalRate;

/**
 * Class _Reaction was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Reaction extends CayenneDataObject {

    public static final String ADDED_STATUS_PROPERTY = "addedStatus";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String DATASHEET_ARRAY_PROPERTY = "datasheetArray";
    public static final String EXPERIMENT_HAS_CHANNEL_ARRAY_PROPERTY = "experimentHasChannelArray";
    public static final String TOTAL_RATE_ARRAY_PROPERTY = "totalRateArray";

    public static final String ID_PK_COLUMN = "id";

    public void setAddedStatus(Integer addedStatus) {
        writeProperty("addedStatus", addedStatus);
    }
    public Integer getAddedStatus() {
        return (Integer)readProperty("addedStatus");
    }

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void addToDatasheetArray(Datasheet obj) {
        addToManyTarget("datasheetArray", obj, true);
    }
    public void removeFromDatasheetArray(Datasheet obj) {
        removeToManyTarget("datasheetArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Datasheet> getDatasheetArray() {
        return (List<Datasheet>)readProperty("datasheetArray");
    }


    public void addToExperimentHasChannelArray(ExperimentHasChannel obj) {
        addToManyTarget("experimentHasChannelArray", obj, true);
    }
    public void removeFromExperimentHasChannelArray(ExperimentHasChannel obj) {
        removeToManyTarget("experimentHasChannelArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ExperimentHasChannel> getExperimentHasChannelArray() {
        return (List<ExperimentHasChannel>)readProperty("experimentHasChannelArray");
    }


    public void addToTotalRateArray(TotalRate obj) {
        addToManyTarget("totalRateArray", obj, true);
    }
    public void removeFromTotalRateArray(TotalRate obj) {
        removeToManyTarget("totalRateArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<TotalRate> getTotalRateArray() {
        return (List<TotalRate>)readProperty("totalRateArray");
    }


}