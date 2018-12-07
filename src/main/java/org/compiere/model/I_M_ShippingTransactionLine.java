package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShippingTransactionLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShippingTransactionLine {

    /**
     * TableName=M_ShippingTransactionLine
     */
    String Table_Name = "M_ShippingTransactionLine";

    /**
     * AD_Table_ID=200052
     */
    int Table_ID = 200052;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_UOM_Length_ID
     */
    String COLUMNNAME_C_UOM_Length_ID = "C_UOM_Length_ID";
    /**
     * Column name C_UOM_Weight_ID
     */
    String COLUMNNAME_C_UOM_Weight_ID = "C_UOM_Weight_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Height
     */
    String COLUMNNAME_Height = "Height";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Length
     */
    String COLUMNNAME_Length = "Length";
    /**
     * Column name MasterTrackingNo
     */
    String COLUMNNAME_MasterTrackingNo = "MasterTrackingNo";
    /**
     * Column name M_PackageMPS_ID
     */
    String COLUMNNAME_M_PackageMPS_ID = "M_PackageMPS_ID";
    /**
     * Column name M_ShippingTransaction_ID
     */
    String COLUMNNAME_M_ShippingTransaction_ID = "M_ShippingTransaction_ID";
    /**
     * Column name M_ShippingTransactionLine_ID
     */
    String COLUMNNAME_M_ShippingTransactionLine_ID =
            "M_ShippingTransactionLine_ID";
    /**
     * Column name M_ShippingTransactionLine_UU
     */
    String COLUMNNAME_M_ShippingTransactionLine_UU =
            "M_ShippingTransactionLine_UU";
    /**
     * Column name Price
     */
    String COLUMNNAME_Price = "Price";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name TrackingNo
     */
    String COLUMNNAME_TrackingNo = "TrackingNo";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Weight
     */
    String COLUMNNAME_Weight = "Weight";
    /**
     * Column name Width
     */
    String COLUMNNAME_Width = "Width";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get UOM for Length. Standard Unit of Measure for Length
     */
    int getC_UOM_Length_ID();

    /**
     * Set UOM for Length. Standard Unit of Measure for Length
     */
    void setC_UOM_Length_ID(int C_UOM_Length_ID);

    I_C_UOM getC_UOM_Length() throws RuntimeException;

    /**
     * Get UOM for Weight. Standard Unit of Measure for Weight
     */
    int getC_UOM_Weight_ID();

    /**
     * Set UOM for Weight. Standard Unit of Measure for Weight
     */
    void setC_UOM_Weight_ID(int C_UOM_Weight_ID);

    I_C_UOM getC_UOM_Weight() throws RuntimeException;

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Height
     */
    BigDecimal getHeight();

    /**
     * Set Height
     */
    void setHeight(BigDecimal Height);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Length
     */
    BigDecimal getLength();

    /**
     * Set Length
     */
    void setLength(BigDecimal Length);

    /**
     * Get Master Tracking No
     */
    String getMasterTrackingNo();

    /**
     * Set Master Tracking No
     */
    void setMasterTrackingNo(String MasterTrackingNo);

    /**
     * Get Package MPS
     */
    int getM_PackageMPS_ID();

    /**
     * Set Package MPS
     */
    void setM_PackageMPS_ID(int M_PackageMPS_ID);

    I_M_PackageMPS getM_PackageMPS() throws RuntimeException;

    /**
     * Get Shipping Transaction
     */
    int getM_ShippingTransaction_ID();

    /**
     * Set Shipping Transaction
     */
    void setM_ShippingTransaction_ID(int M_ShippingTransaction_ID);

    I_M_ShippingTransaction getM_ShippingTransaction() throws RuntimeException;

    /**
     * Get Shipping Transaction Line
     */
    int getM_ShippingTransactionLine_ID();

    /**
     * Set Shipping Transaction Line
     */
    void setM_ShippingTransactionLine_ID(int M_ShippingTransactionLine_ID);

    /**
     * Get M_ShippingTransactionLine_UU
     */
    String getM_ShippingTransactionLine_UU();

    /**
     * Set M_ShippingTransactionLine_UU
     */
    void setM_ShippingTransactionLine_UU(String M_ShippingTransactionLine_UU);

    /**
     * Get Price. Price
     */
    BigDecimal getPrice();

    /**
     * Set Price. Price
     */
    void setPrice(BigDecimal Price);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Tracking No. Number to track the shipment
     */
    String getTrackingNo();

    /**
     * Set Tracking No. Number to track the shipment
     */
    void setTrackingNo(String TrackingNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Weight. Weight of a product
     */
    BigDecimal getWeight();

    /**
     * Set Weight. Weight of a product
     */
    void setWeight(BigDecimal Weight);

    /**
     * Get Width
     */
    BigDecimal getWidth();

    /**
     * Set Width
     */
    void setWidth(BigDecimal Width);
}
