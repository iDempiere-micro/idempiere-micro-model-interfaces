package org.eevolution.model;

import org.compiere.model.I_M_AttributeSetInstance;
import org.compiere.model.I_M_Locator;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Order_BOMLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_Order_BOMLine {

    /**
     * TableName=PP_Order_BOMLine
     */
    public static final String Table_Name = "PP_Order_BOMLine";

    /**
     * AD_Table_ID=53025
     */
    public static final int Table_ID = 53025;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_User_ID
     */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name Assay
     */
    public static final String COLUMNNAME_Assay = "Assay";
    /**
     * Column name BackflushGroup
     */
    public static final String COLUMNNAME_BackflushGroup = "BackflushGroup";
    /**
     * Column name ComponentType
     */
    public static final String COLUMNNAME_ComponentType = "ComponentType";
    /**
     * Column name CostAllocationPerc
     */
    public static final String COLUMNNAME_CostAllocationPerc = "CostAllocationPerc";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_UOM_ID
     */
    public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name DateDelivered
     */
    public static final String COLUMNNAME_DateDelivered = "DateDelivered";
    /**
     * Column name Description
     */
    public static final String COLUMNNAME_Description = "Description";
    /**
     * Column name Feature
     */
    public static final String COLUMNNAME_Feature = "Feature";
    /**
     * Column name Forecast
     */
    public static final String COLUMNNAME_Forecast = "Forecast";
    /**
     * Column name Help
     */
    public static final String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCritical
     */
    public static final String COLUMNNAME_IsCritical = "IsCritical";
    /**
     * Column name IsQtyPercentage
     */
    public static final String COLUMNNAME_IsQtyPercentage = "IsQtyPercentage";
    /**
     * Column name IssueMethod
     */
    public static final String COLUMNNAME_IssueMethod = "IssueMethod";
    /**
     * Column name LeadTimeOffset
     */
    public static final String COLUMNNAME_LeadTimeOffset = "LeadTimeOffset";
    /**
     * Column name Line
     */
    public static final String COLUMNNAME_Line = "Line";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_ChangeNotice_ID
     */
    public static final String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
    /**
     * Column name M_Locator_ID
     */
    public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_Product_ID
     */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Warehouse_ID
     */
    public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name PP_Order_BOM_ID
     */
    public static final String COLUMNNAME_PP_Order_BOM_ID = "PP_Order_BOM_ID";
    /**
     * Column name PP_Order_BOMLine_ID
     */
    public static final String COLUMNNAME_PP_Order_BOMLine_ID = "PP_Order_BOMLine_ID";
    /**
     * Column name PP_Order_BOMLine_UU
     */
    public static final String COLUMNNAME_PP_Order_BOMLine_UU = "PP_Order_BOMLine_UU";
    /**
     * Column name PP_Order_ID
     */
    public static final String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
    /**
     * Column name QtyBatch
     */
    public static final String COLUMNNAME_QtyBatch = "QtyBatch";
    /**
     * Column name QtyBOM
     */
    public static final String COLUMNNAME_QtyBOM = "QtyBOM";
    /**
     * Column name QtyDelivered
     */
    public static final String COLUMNNAME_QtyDelivered = "QtyDelivered";
    /**
     * Column name QtyEntered
     */
    public static final String COLUMNNAME_QtyEntered = "QtyEntered";
    /**
     * Column name QtyPost
     */
    public static final String COLUMNNAME_QtyPost = "QtyPost";
    /**
     * Column name QtyReject
     */
    public static final String COLUMNNAME_QtyReject = "QtyReject";
    /**
     * Column name QtyRequiered
     */
    public static final String COLUMNNAME_QtyRequiered = "QtyRequiered";
    /**
     * Column name QtyReserved
     */
    public static final String COLUMNNAME_QtyReserved = "QtyReserved";
    /**
     * Column name QtyScrap
     */
    public static final String COLUMNNAME_QtyScrap = "QtyScrap";
    /**
     * Column name Scrap
     */
    public static final String COLUMNNAME_Scrap = "Scrap";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidFrom
     */
    public static final String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    public static final String COLUMNNAME_ValidTo = "ValidTo";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    public int getUserId();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    public void setUserId(int AD_User_ID);

    public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Quantity Assay. Indicated the Quantity Assay to use into Quality Order
     */
    public BigDecimal getAssay();

    /**
     * Set Quantity Assay. Indicated the Quantity Assay to use into Quality Order
     */
    public void setAssay(BigDecimal Assay);

    /**
     * Get Backflush Group. The Grouping Components to the Backflush
     */
    public String getBackflushGroup();

    /**
     * Set Backflush Group. The Grouping Components to the Backflush
     */
    public void setBackflushGroup(String BackflushGroup);

    /**
     * Get Component Type. Component Type for a Bill of Material or Formula
     */
    public String getComponentType();

    /**
     * Set Component Type. Component Type for a Bill of Material or Formula
     */
    public void setComponentType(String ComponentType);

    /**
     * Get Cost Allocation Percent. Cost allocation percent in case of a co-product.
     */
    public BigDecimal getCostAllocationPerc();

    /**
     * Set Cost Allocation Percent. Cost allocation percent in case of a co-product.
     */
    public void setCostAllocationPerc(BigDecimal CostAllocationPerc);

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get UOM. Unit of Measure
     */
    public int getUOMId();

    /**
     * Set UOM. Unit of Measure
     */
    public void setUOMId(int C_UOM_ID);

    public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException;

    /**
     * Get Date Delivered. Date when the product was delivered
     */
    public Timestamp getDateDelivered();

    /**
     * Set Date Delivered. Date when the product was delivered
     */
    public void setDateDelivered(Timestamp DateDelivered);

    /**
     * Get Description. Optional short description of the record
     */
    public String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    public void setDescription(String Description);

    /**
     * Get Feature. Indicated the Feature for Product Configure
     */
    public String getFeature();

    /**
     * Set Feature. Indicated the Feature for Product Configure
     */
    public void setFeature(String Feature);

    /**
     * Get Forecast. Indicated the % of participation this component into a of the BOM Planning
     */
    public BigDecimal getForecast();

    /**
     * Set Forecast. Indicated the % of participation this component into a of the BOM Planning
     */
    public void setForecast(BigDecimal Forecast);

    /**
     * Get Comment/Help. Comment or Hint
     */
    public String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    public void setHelp(String Help);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Set Is Critical Component. Indicate that a Manufacturing Order can not begin without have this
     * component
     */
    public void setIsCritical(boolean IsCritical);

    /**
     * Get Is Critical Component. Indicate that a Manufacturing Order can not begin without have this
     * component
     */
    public boolean isCritical();

    /**
     * Set Is Qty Percentage. Indicate that this component is based in % Quantity
     */
    public void setIsQtyPercentage(boolean IsQtyPercentage);

    /**
     * Get Is Qty Percentage. Indicate that this component is based in % Quantity
     */
    public boolean isQtyPercentage();

    /**
     * Get Issue Method. There are two methods for issue the components to Manufacturing Order
     */
    public String getIssueMethod();

    /**
     * Set Issue Method. There are two methods for issue the components to Manufacturing Order
     */
    public void setIssueMethod(String IssueMethod);

    /**
     * Get Lead Time Offset. Optional Lead Time offset before starting production
     */
    public int getLeadTimeOffset();

    /**
     * Set Lead Time Offset. Optional Lead Time offset before starting production
     */
    public void setLeadTimeOffset(int LeadTimeOffset);

    /**
     * Get Line No. Unique line for this document
     */
    public int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    public void setLine(int Line);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    public int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    public void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    public I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

    /**
     * Get Change Notice. Bill of Materials (Engineering) Change Notice (Version)
     */
    public int getM_ChangeNotice_ID();

    /**
     * Set Change Notice. Bill of Materials (Engineering) Change Notice (Version)
     */
    public void setM_ChangeNotice_ID(int M_ChangeNotice_ID);

    public org.compiere.model.I_M_ChangeNotice getM_ChangeNotice() throws RuntimeException;

    /**
     * Get Locator. Warehouse Locator
     */
    public int getLocatorId();

    /**
     * Set Locator. Warehouse Locator
     */
    public void setLocatorId(int M_Locator_ID);

    public I_M_Locator getM_Locator() throws RuntimeException;

    /**
     * Get Product. Product, Service, Item
     */
    public int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    public void setProductId(int M_Product_ID);

    public org.compiere.model.I_M_Product getProduct() throws RuntimeException;

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    public int getWarehouseId();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    public void setWarehouseId(int M_Warehouse_ID);

    public org.compiere.model.I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /**
     * Get Manufacturing Order BOM
     */
    public int getPP_Order_BOM_ID();

    /**
     * Set Manufacturing Order BOM
     */
    public void setPP_Order_BOM_ID(int PP_Order_BOM_ID);

    public org.eevolution.model.I_PP_Order_BOM getPP_Order_BOM() throws RuntimeException;

    /**
     * Get Manufacturing Order BOM Line
     */
    public int getPP_Order_BOMLine_ID();

    /**
     * Set Manufacturing Order BOM Line
     */
    public void setPP_Order_BOMLine_ID(int PP_Order_BOMLine_ID);

    /**
     * Get PP_Order_BOMLine_UU
     */
    public String getPP_Order_BOMLine_UU();

    /**
     * Set PP_Order_BOMLine_UU
     */
    public void setPP_Order_BOMLine_UU(String PP_Order_BOMLine_UU);

    /**
     * Get Manufacturing Order. Manufacturing Order
     */
    public int getPP_Order_ID();

    /**
     * Set Manufacturing Order. Manufacturing Order
     */
    public void setPP_Order_ID(int PP_Order_ID);

    public org.eevolution.model.I_PP_Order getPP_Order() throws RuntimeException;

    /**
     * Get Quantity in %. Indicate the Quantity % use in this Formula
     */
    public BigDecimal getQtyBatch();

    /**
     * Set Quantity in %. Indicate the Quantity % use in this Formula
     */
    public void setQtyBatch(BigDecimal QtyBatch);

    /**
     * Get Quantity. Indicate the Quantity use in this BOM
     */
    public BigDecimal getQtyBOM();

    /**
     * Set Quantity. Indicate the Quantity use in this BOM
     */
    public void setQtyBOM(BigDecimal QtyBOM);

    /**
     * Get Delivered Quantity. Delivered Quantity
     */
    public BigDecimal getQtyDelivered();

    /**
     * Set Delivered Quantity. Delivered Quantity
     */
    public void setQtyDelivered(BigDecimal QtyDelivered);

    /**
     * Get Quantity. The Quantity Entered is based on the selected UoM
     */
    public BigDecimal getQtyEntered();

    /**
     * Set Quantity. The Quantity Entered is based on the selected UoM
     */
    public void setQtyEntered(BigDecimal QtyEntered);

    /**
     * Get Qty Post
     */
    public BigDecimal getQtyPost();

    /**
     * Set Qty Post
     */
    public void setQtyPost(BigDecimal QtyPost);

    /**
     * Get Qty Reject
     */
    public BigDecimal getQtyReject();

    /**
     * Set Qty Reject
     */
    public void setQtyReject(BigDecimal QtyReject);

    /**
     * Get Qty Requiered
     */
    public BigDecimal getQtyRequiered();

    /**
     * Set Qty Requiered
     */
    public void setQtyRequiered(BigDecimal QtyRequiered);

    /**
     * Get Reserved Quantity. Reserved Quantity
     */
    public BigDecimal getQtyReserved();

    /**
     * Set Reserved Quantity. Reserved Quantity
     */
    public void setQtyReserved(BigDecimal QtyReserved);

    /**
     * Get Scrap %. Scrap % Quantity for this componet
     */
    public BigDecimal getQtyScrap();

    /**
     * Set Scrap %. Scrap % Quantity for this componet
     */
    public void setQtyScrap(BigDecimal QtyScrap);

    /**
     * Get Scrap %. Indicate the Scrap % for calculate the Scrap Quantity
     */
    public BigDecimal getScrap();

    /**
     * Set Scrap %. Indicate the Scrap % for calculate the Scrap Quantity
     */
    public void setScrap(BigDecimal Scrap);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    public Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    public void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    public Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    public void setValidTo(Timestamp ValidTo);
}
