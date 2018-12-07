package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PP_Product_BOMLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_Product_BOMLine {

    /**
     * TableName=PP_Product_BOMLine
     */
    public static final String Table_Name = "PP_Product_BOMLine";

    /**
     * AD_Table_ID=53019
     */
    public static final int Table_ID = 53019;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
     * Column name M_Product_ID
     */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PP_Product_BOM_ID
     */
    public static final String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";
    /**
     * Column name PP_Product_BOMLine_ID
     */
    public static final String COLUMNNAME_PP_Product_BOMLine_ID = "PP_Product_BOMLine_ID";
    /**
     * Column name PP_Product_BOMLine_UU
     */
    public static final String COLUMNNAME_PP_Product_BOMLine_UU = "PP_Product_BOMLine_UU";
    /**
     * Column name QtyBatch
     */
    public static final String COLUMNNAME_QtyBatch = "QtyBatch";
    /**
     * Column name QtyBOM
     */
    public static final String COLUMNNAME_QtyBOM = "QtyBOM";
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
     * Set Organization. Organizational entity within client
     */
    public void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

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
    public int getC_UOM_ID();

    /**
     * Set UOM. Unit of Measure
     */
    public void setC_UOM_ID(int C_UOM_ID);

    public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException;

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
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    public void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    public int getMAttributeSetInstance_ID();

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
     * Get Product. Product, Service, Item
     */
    public int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    public void setM_Product_ID(int M_Product_ID);

    public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get BOM & Formula. BOM & Formula
     */
    public int getPP_Product_BOM_ID();

    /**
     * Set BOM & Formula. BOM & Formula
     */
    public void setPP_Product_BOM_ID(int PP_Product_BOM_ID);

    public org.eevolution.model.I_PP_Product_BOM getPP_Product_BOM() throws RuntimeException;

    /**
     * Get BOM Line. BOM Line
     */
    public int getPP_Product_BOMLine_ID();

    /**
     * Set BOM Line. BOM Line
     */
    public void setPP_Product_BOMLine_ID(int PP_Product_BOMLine_ID);

    /**
     * Get PP_Product_BOMLine_UU
     */
    public String getPP_Product_BOMLine_UU();

    /**
     * Set PP_Product_BOMLine_UU
     */
    public void setPP_Product_BOMLine_UU(String PP_Product_BOMLine_UU);

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
