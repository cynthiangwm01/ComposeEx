package com.example.composeex.data.remote.response_data.manufacturer_detail


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ManufacturerDetailContent(
    @SerializedName("Address")
    val address: String?,
    @SerializedName("Address2")
    val address2: Any?,
    @SerializedName("City")
    val city: String?,
    @SerializedName("ContactEmail")
    val contactEmail: String?,
    @SerializedName("ContactFax")
    val contactFax: Any?,
    @SerializedName("ContactPhone")
    val contactPhone: String?,
    @SerializedName("Country")
    val country: String?,
    @SerializedName("DBAs")
    val dBAs: Any?,
    @SerializedName("EquipmentItems")
    val equipmentItems: List<Any?>?,
    @SerializedName("LastUpdated")
    val lastUpdated: String?,
    @SerializedName("ManufacturerTypes")
    val manufacturerTypes: List<ManufacturerType?>?,
    @SerializedName("Mfr_CommonName")
    val mfrCommonName: Any?,
    @SerializedName("Mfr_ID")
    val mfrID: Int,
    @SerializedName("Mfr_Name")
    val mfrName: String?,
    @SerializedName("OtherManufacturerDetails")
    val otherManufacturerDetails: Any?,
    @SerializedName("PostalCode")
    val postalCode: String?,
    @SerializedName("PrimaryProduct")
    val primaryProduct: Any?,
    @SerializedName("PrincipalFirstName")
    val principalFirstName: String?,
    @SerializedName("PrincipalLastName")
    val principalLastName: Any?,
    @SerializedName("PrincipalPosition")
    val principalPosition: String?,
    @SerializedName("StateProvince")
    val stateProvince: String?,
    @SerializedName("SubmittedName")
    val submittedName: String?,
    @SerializedName("SubmittedOn")
    val submittedOn: String?,
    @SerializedName("SubmittedPosition")
    val submittedPosition: String?,
    @SerializedName("VehicleTypes")
    val vehicleTypes: List<VehicleType?>?
) : Serializable