package org.eevolution.model;

import org.compiere.model.I_M_AttributeSetInstance;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Order_BOM
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_Order_BOM {

    /**
     * TableName=PP_Order_BOM
     */
    public static final String Table_Name = "PP_Order_BOM";

    /**
     * AD_Table_ID=53026
     */
    public static final int Table_ID = 53026;

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
     * Column name BOMType
     */
    public static final String COLUMNNAME_BOMType = "BOMType";
    /**
     * Column name BOMUse
     */
    public static final String COLUMNNAME_BOMUse = "BOMUse";
    /**
     * Column name CopyFrom
     */
    public static final String COLUMNNAME_CopyFrom = "CopyFrom";
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
     * Column name DocumentNo
     */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name Help
     */
    public static final String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
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
     * Column name PP_Order_BOM_ID
     */
    public static final String COLUMNNAME_PP_Order_BOM_ID = "PP_Order_BOM_ID";
    /**
     * Column name PP_Order_BOM_UU
     */
    public static final String COLUMNNAME_PP_Order_BOM_UU = "PP_Order_BOM_UU";
    /**
     * Column name PP_Order_ID
     */
    public static final String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
    /**
     * Column name Processing
     */
    public static final String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Revision
     */
    public static final String COLUMNNAME_Revision = "Revision";
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
     * Column name Value
     */
    public static final String COLUMNNAME_Value = "Value";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get BOM Type. Type of BOM
     */
    public String getBOMType();

    /**
     * Set BOM Type. Type of BOM
     */
    public void setBOMType(String BOMType);

    /**
     * Get BOM Use. The use of the Bill of Material
     */
    public String getBOMUse();

    /**
     * Set BOM Use. The use of the Bill of Material
     */
    public void setBOMUse(String BOMUse);

    /**
     * Get Copy From. Copy From Record
     */
    public String getCopyFrom();

    /**
     * Set Copy From. Copy From Record
     */
    public void setCopyFrom(String CopyFrom);

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

    public org.compiere.model.I_C_UOM getUOM() throws RuntimeException;

    /**
     * Get Description. Optional short description of the record
     */
    public String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    public void setDescription(String Description);

    /**
     * Get Document No. Document sequence number of the document
     */
    public String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    public void setDocumentNo(String DocumentNo);

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
    public int getM_ChangeNoticeId();

    /**
     * Set Change Notice. Bill of Materials (Engineering) Change Notice (Version)
     */
    public void setM_ChangeNoticeId(int M_ChangeNotice_ID);

    public org.compiere.model.I_M_ChangeNotice getM_ChangeNotice() throws RuntimeException;

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
     * Get Name. Alphanumeric identifier of the entity
     */
    public String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    public void setName(String Name);

    /**
     * Get Manufacturing Order BOM
     */
    public int getPP_Order_BOMId();

    /**
     * Set Manufacturing Order BOM
     */
    public void setPP_Order_BOMId(int PP_Order_BOM_ID);

    /**
     * Get PP_Order_BOM_UU
     */
    public String getPP_Order_BOM_UU();

    /**
     * Set PP_Order_BOM_UU
     */
    public void setPP_Order_BOM_UU(String PP_Order_BOM_UU);

    /**
     * Get Manufacturing Order. Manufacturing Order
     */
    public int getPP_OrderId();

    /**
     * Set Manufacturing Order. Manufacturing Order
     */
    public void setPP_OrderId(int PP_Order_ID);

    public org.eevolution.model.I_PP_Order getPP_Order() throws RuntimeException;

    /**
     * Get Process Now
     */
    public boolean isProcessing();

    /**
     * Set Process Now
     */
    public void setProcessing(boolean Processing);

    /**
     * Get Revision
     */
    public String getRevision();

    /**
     * Set Revision
     */
    public void setRevision(String Revision);

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

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    public String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    public void setValue(String Value);
}
