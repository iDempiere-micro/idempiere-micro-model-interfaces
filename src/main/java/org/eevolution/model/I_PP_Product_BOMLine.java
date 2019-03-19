package org.eevolution.model;

import org.compiere.model.I_M_AttributeSetInstance;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Product_BOMLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_PP_Product_BOMLine {

    /**
     * TableName=PP_Product_BOMLine
     */
    String Table_Name = "PP_Product_BOMLine";

    /**
     * AD_Table_ID=53019
     */
    int Table_ID = 53019;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Assay
     */
    String COLUMNNAME_Assay = "Assay";
    /**
     * Column name BackflushGroup
     */
    String COLUMNNAME_BackflushGroup = "BackflushGroup";
    /**
     * Column name ComponentType
     */
    String COLUMNNAME_ComponentType = "ComponentType";
    /**
     * Column name CostAllocationPerc
     */
    String COLUMNNAME_CostAllocationPerc = "CostAllocationPerc";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Feature
     */
    String COLUMNNAME_Feature = "Feature";
    /**
     * Column name Forecast
     */
    String COLUMNNAME_Forecast = "Forecast";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCritical
     */
    String COLUMNNAME_IsCritical = "IsCritical";
    /**
     * Column name IsQtyPercentage
     */
    String COLUMNNAME_IsQtyPercentage = "IsQtyPercentage";
    /**
     * Column name IssueMethod
     */
    String COLUMNNAME_IssueMethod = "IssueMethod";
    /**
     * Column name LeadTimeOffset
     */
    String COLUMNNAME_LeadTimeOffset = "LeadTimeOffset";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_ChangeNotice_ID
     */
    String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PP_Product_BOM_ID
     */
    String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";
    /**
     * Column name PP_Product_BOMLine_ID
     */
    String COLUMNNAME_PP_Product_BOMLine_ID = "PP_Product_BOMLine_ID";
    /**
     * Column name PP_Product_BOMLine_UU
     */
    String COLUMNNAME_PP_Product_BOMLine_UU = "PP_Product_BOMLine_UU";
    /**
     * Column name QtyBatch
     */
    String COLUMNNAME_QtyBatch = "QtyBatch";
    /**
     * Column name QtyBOM
     */
    String COLUMNNAME_QtyBOM = "QtyBOM";
    /**
     * Column name Scrap
     */
    String COLUMNNAME_Scrap = "Scrap";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    String COLUMNNAME_ValidTo = "ValidTo";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Quantity Assay. Indicated the Quantity Assay to use into Quality Order
     */
    BigDecimal getAssay();

    /**
     * Set Quantity Assay. Indicated the Quantity Assay to use into Quality Order
     */
    void setAssay(BigDecimal Assay);

    /**
     * Get Backflush Group. The Grouping Components to the Backflush
     */
    String getBackflushGroup();

    /**
     * Set Backflush Group. The Grouping Components to the Backflush
     */
    void setBackflushGroup(String BackflushGroup);

    /**
     * Get Component Type. Component Type for a Bill of Material or Formula
     */
    String getComponentType();

    /**
     * Set Component Type. Component Type for a Bill of Material or Formula
     */
    void setComponentType(String ComponentType);

    /**
     * Get Cost Allocation Percent. Cost allocation percent in case of a co-product.
     */
    BigDecimal getCostAllocationPerc();

    /**
     * Set Cost Allocation Percent. Cost allocation percent in case of a co-product.
     */
    void setCostAllocationPerc(BigDecimal CostAllocationPerc);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get UOM. Unit of Measure
     */
    int getUOMId();

    /**
     * Set UOM. Unit of Measure
     */
    void setUOMId(int C_UOM_ID);

    org.compiere.model.I_C_UOM getUOM() throws RuntimeException;

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Feature. Indicated the Feature for Product Configure
     */
    String getFeature();

    /**
     * Set Feature. Indicated the Feature for Product Configure
     */
    void setFeature(String Feature);

    /**
     * Get Forecast. Indicated the % of participation this component into a of the BOM Planning
     */
    BigDecimal getForecast();

    /**
     * Set Forecast. Indicated the % of participation this component into a of the BOM Planning
     */
    void setForecast(BigDecimal Forecast);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Is Critical Component. Indicate that a Manufacturing Order can not begin without have this
     * component
     */
    void setIsCritical(boolean IsCritical);

    /**
     * Get Is Critical Component. Indicate that a Manufacturing Order can not begin without have this
     * component
     */
    boolean isCritical();

    /**
     * Set Is Qty Percentage. Indicate that this component is based in % Quantity
     */
    void setIsQtyPercentage(boolean IsQtyPercentage);

    /**
     * Get Is Qty Percentage. Indicate that this component is based in % Quantity
     */
    boolean isQtyPercentage();

    /**
     * Get Issue Method. There are two methods for issue the components to Manufacturing Order
     */
    String getIssueMethod();

    /**
     * Set Issue Method. There are two methods for issue the components to Manufacturing Order
     */
    void setIssueMethod(String IssueMethod);

    /**
     * Get Lead Time Offset. Optional Lead Time offset before starting production
     */
    int getLeadTimeOffset();

    /**
     * Set Lead Time Offset. Optional Lead Time offset before starting production
     */
    void setLeadTimeOffset(int LeadTimeOffset);

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

    /**
     * Get Change Notice. Bill of Materials (Engineering) Change Notice (Version)
     */
    int getChangeNoticeId();

    /**
     * Set Change Notice. Bill of Materials (Engineering) Change Notice (Version)
     */
    void setChangeNoticeId(int M_ChangeNotice_ID);

    org.compiere.model.I_M_ChangeNotice getChangeNotice() throws RuntimeException;

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    org.compiere.model.I_M_Product getProduct() throws RuntimeException;

    /**
     * Get BOM & Formula. BOM & Formula
     */
    int getProductBOMId();

    /**
     * Set BOM & Formula. BOM & Formula
     */
    void setProductBOMId(int PP_Product_BOM_ID);

    org.eevolution.model.I_PP_Product_BOM getProductBOM() throws RuntimeException;

    /**
     * Get BOM Line. BOM Line
     */
    int getProductBOMLineId();

    /**
     * Set BOM Line. BOM Line
     */
    void setProductBOMLineId(int PP_Product_BOMLine_ID);

    /**
     * Get Quantity in %. Indicate the Quantity % use in this Formula
     */
    BigDecimal getQtyBatch();

    /**
     * Set Quantity in %. Indicate the Quantity % use in this Formula
     */
    void setQtyBatch(BigDecimal QtyBatch);

    /**
     * Get Quantity. Indicate the Quantity use in this BOM
     */
    BigDecimal getQtyBOM();

    /**
     * Set Quantity. Indicate the Quantity use in this BOM
     */
    void setQtyBOM(BigDecimal QtyBOM);

    /**
     * Get Scrap %. Indicate the Scrap % for calculate the Scrap Quantity
     */
    BigDecimal getScrap();

    /**
     * Set Scrap %. Indicate the Scrap % for calculate the Scrap Quantity
     */
    void setScrap(BigDecimal Scrap);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    void setValidTo(Timestamp ValidTo);
}
