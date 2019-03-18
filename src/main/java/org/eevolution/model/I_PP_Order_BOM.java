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

public interface I_PP_Order_BOM {

    /**
     * TableName=PP_Order_BOM
     */
    String Table_Name = "PP_Order_BOM";

    /**
     * AD_Table_ID=53026
     */
    int Table_ID = 53026;

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
     * Column name BOMType
     */
    String COLUMNNAME_BOMType = "BOMType";
    /**
     * Column name BOMUse
     */
    String COLUMNNAME_BOMUse = "BOMUse";
    /**
     * Column name CopyFrom
     */
    String COLUMNNAME_CopyFrom = "CopyFrom";
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
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Column name PP_Order_BOM_ID
     */
    String COLUMNNAME_PP_Order_BOM_ID = "PP_Order_BOM_ID";
    /**
     * Column name PP_Order_BOM_UU
     */
    String COLUMNNAME_PP_Order_BOM_UU = "PP_Order_BOM_UU";
    /**
     * Column name PP_Order_ID
     */
    String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Revision
     */
    String COLUMNNAME_Revision = "Revision";
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
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get BOM Type. Type of BOM
     */
    String getBOMType();

    /**
     * Set BOM Type. Type of BOM
     */
    void setBOMType(String BOMType);

    /**
     * Get BOM Use. The use of the Bill of Material
     */
    String getBOMUse();

    /**
     * Set BOM Use. The use of the Bill of Material
     */
    void setBOMUse(String BOMUse);

    /**
     * Get Copy From. Copy From Record
     */
    String getCopyFrom();

    /**
     * Set Copy From. Copy From Record
     */
    void setCopyFrom(String CopyFrom);

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
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

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
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Manufacturing Order BOM
     */
    int getOrderBOMId();

    /**
     * Set Manufacturing Order BOM
     */
    void getOrderBOMId(int PP_Order_BOM_ID);

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
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Revision
     */
    String getRevision();

    /**
     * Set Revision
     */
    void setRevision(String Revision);

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

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
