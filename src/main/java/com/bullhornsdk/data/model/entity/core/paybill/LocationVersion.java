package com.bullhornsdk.data.model.entity.core.paybill;

import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by fayranne.lipton 4/3/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address",
    "customDate1", "customDate2", "customDate3",
    "customFloat1", "customFloat2", "customFloat3", "customInt1",
    "customInt2", "customInt3", "customText1", "customText10",
    "customText11", "customText12", "customText13", "customText14",
    "customText15", "customText16", "customText17", "customText18",
    "customText19", "customText2", "customText20", "customText3",
    "customText4", "customText5", "customText6", "customText7",
    "customText8", "customText9", "customTextBlock1", "customTextBlock2",
    "customTextBlock3", "customTextBlock4", "customTextBlock5",
    "dateAdded", "dateLastModified", "description", "effectiveDate",
    "effectiveEndDate", "externalID", "isBillTo", "isFirst", "isSoldTo",
    "isWorkSite", "status", "title" })
public class LocationVersion implements QueryEntity, UpdateEntity, CreateEntity, DateLastModifiedEntity {

    private Integer id;

    private Address address;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    @JsonIgnore
    private String description;

    private Date effectiveDate;

    private Date effectiveEndDate;

    @JsonIgnore
    @Size(max = 100)
    private String externalID;

    private boolean isBillTo;

    private boolean isFirst;

    private boolean isSoldTo;

    private boolean isWorkSite;

    @JsonIgnore
    @Size(max = 100)
    private String status;

    @JsonIgnore
    @Size(max = 100)
    private String title;

    private Boolean isDeleted;

    /**
     * Returns the entity with the required fields for an insert set.
     *
     * @return
     */
    public LocationVersion instantiateForInsert() {
        LocationVersion entity = new LocationVersion();
        entity.setIsDeleted(Boolean.FALSE);
        entity.setStatus("New Location");
        entity.setIsWorkSite(Boolean.FALSE);
        entity.setIsBillTo(Boolean.FALSE);
        entity.setIsSoldTo(Boolean.FALSE);
        entity.setTitle("title");

        return entity;
    }

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @ReadOnly
    @Override
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @ReadOnly
    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @ReadOnly
    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonIgnore
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("effectiveEndDate")
    public Date getEffectiveEndDate() {
        return effectiveEndDate;
    }

    @JsonProperty("effectiveEndDate")
    public void setEffectiveEndDate(Date effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    @JsonProperty("externalID")
    public String getExternalID() {
        return externalID;
    }

    @JsonIgnore
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    @JsonProperty("isBillTo")
    public boolean getIsBillTo() {
        return isBillTo;
    }

    @JsonProperty("isBillTo")
    public void setIsBillTo(boolean billTo) {
        isBillTo = billTo;
    }

    @JsonProperty("isFirst")
    public boolean setIsFirst() {
        return isFirst;
    }

    @JsonProperty("isFirst")
    public void getIsFirst(boolean first) {
        isFirst = first;
    }

    @JsonProperty("isSoldTo")
    public boolean getIsSoldTo() {
        return isSoldTo;
    }

    @JsonProperty("isSoldTo")
    public void setIsSoldTo(boolean soldTo) {
        isSoldTo = soldTo;
    }

    @JsonProperty("isWorkSite")
    public boolean getIsWorkSite() {
        return isWorkSite;
    }

    @JsonProperty("isWorkSite")
    public void setIsWorkSite(boolean workSite) {
        isWorkSite = workSite;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonIgnore
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonIgnore
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

}
