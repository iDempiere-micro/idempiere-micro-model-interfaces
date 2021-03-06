package org.eevolution.model;

import org.compiere.model.I_M_AttributeSetInstance;
import org.compiere.model.I_M_Locator;
import org.compiere.model.User;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Order_BOMLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_PP_Order_BOMLine {

    /**
     * TableName=PP_Order_BOMLine
     */
    String Table_Name = "PP_Order_BOMLine";

    /**
     * AD_Table_ID=53025
     */
    int Table_ID = 53025;

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
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
     * Column name DateDelivered
     */
    String COLUMNNAME_DateDelivered = "DateDelivered";
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
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name PP_Order_BOM_ID
     */
    String COLUMNNAME_PP_Order_BOM_ID = "PP_Order_BOM_ID";
    /**
     * Column name PP_Order_BOMLine_ID
     */
    String COLUMNNAME_PP_Order_BOMLine_ID = "PP_Order_BOMLine_ID";
    /**
     * Column name PP_Order_BOMLine_UU
     */
    String COLUMNNAME_PP_Order_BOMLine_UU = "PP_Order_BOMLine_UU";
    /**
     * Column name PP_Order_ID
     */
    String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
    /**
     * Column name QtyBatch
     */
    String COLUMNNAME_QtyBatch = "QtyBatch";
    /**
     * Column name QtyBOM
     */
    String COLUMNNAME_QtyBOM = "QtyBOM";
    /**
     * Column name QtyDelivered
     */
    String COLUMNNAME_QtyDelivered = "QtyDelivered";
    /**
     * Column name QtyEntered
     */
    String COLUMNNAME_QtyEntered = "QtyEntered";
    /**
     * Column name QtyPost
     */
    String COLUMNNAME_QtyPost = "QtyPost";
    /**
     * Column name QtyReject
     */
    String COLUMNNAME_QtyReject = "QtyReject";
    /**
     * Column name QtyRequiered
     */
    String COLUMNNAME_QtyRequiered = "QtyRequiered";
    /**
     * Column name QtyReserved
     */
    String COLUMNNAME_QtyReserved = "QtyReserved";
    /**
     * Column name QtyScrap
     */
    String COLUMNNAME_QtyScrap = "QtyScrap";
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
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getUserId();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setUserId(int AD_User_ID);

    User getUser() throws RuntimeException;

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
     * Get Date Delivered. Date when the product was delivered
     */
    Timestamp getDateDelivered();

    /**
     * Set Date Delivered. Date when the product was delivered
     */
    void setDateDelivered(Timestamp DateDelivered);

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
     * Get Locator. Warehouse Locator
     */
    int getLocatorId();

    /**
     * Set Locator. Warehouse Locator
     */
    void setLocatorId(int M_Locator_ID);

    I_M_Locator getLocator() throws RuntimeException;

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
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getWarehouseId();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setWarehouseId(int M_Warehouse_ID);

    org.compiere.model.I_M_Warehouse getWarehouse() throws RuntimeException;

    /**
     * Get Manufacturing Order BOM
     */
    int getOrderBOMId();

    /**
     * Set Manufacturing Order BOM
     */
    void getOrderBOMId(int PP_Order_BOM_ID);

    org.eevolution.model.I_PP_Order_BOM getOrderBOM() throws RuntimeException;

    /**
     * Get Manufacturing Order BOM Line
     */
    int getOrderBOMLineId();

    /**
     * Set Manufacturing Order BOM Line
     */
    void setOrderBOMLineId(int PP_Order_BOMLine_ID);


    /**
     * Get Manufacturing Order. Manufacturing Order
     */
    int getOrderId();

    /**
     * Set Manufacturing Order. Manufacturing Order
     */
    void setOrderId(int PP_Order_ID);

    org.eevolution.model.I_PP_Order getOrder() throws RuntimeException;

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
     * Get Delivered Quantity. Delivered Quantity
     */
    BigDecimal getQtyDelivered();

    /**
     * Set Delivered Quantity. Delivered Quantity
     */
    void setQtyDelivered(BigDecimal QtyDelivered);

    /**
     * Get Quantity. The Quantity Entered is based on the selected UoM
     */
    BigDecimal getQtyEntered();

    /**
     * Set Quantity. The Quantity Entered is based on the selected UoM
     */
    void setQtyEntered(BigDecimal QtyEntered);

    /**
     * Get Qty Post
     */
    BigDecimal getQtyPost();

    /**
     * Set Qty Post
     */
    void setQtyPost(BigDecimal QtyPost);

    /**
     * Get Qty Reject
     */
    BigDecimal getQtyReject();

    /**
     * Set Qty Reject
     */
    void setQtyReject(BigDecimal QtyReject);

    /**
     * Get Qty Requiered
     */
    BigDecimal getQtyRequired();

    /**
     * Set Qty Requiered
     */
    void setQtyRequired(BigDecimal QtyRequiered);

    /**
     * Get Reserved Quantity. Reserved Quantity
     */
    BigDecimal getQtyReserved();

    /**
     * Set Reserved Quantity. Reserved Quantity
     */
    void setQtyReserved(BigDecimal QtyReserved);

    /**
     * Get Scrap %. Scrap % Quantity for this componet
     */
    BigDecimal getQtyScrap();

    /**
     * Set Scrap %. Scrap % Quantity for this componet
     */
    void setQtyScrap(BigDecimal QtyScrap);

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
