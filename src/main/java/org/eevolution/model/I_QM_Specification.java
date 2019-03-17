package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for QM_Specification
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_QM_Specification {

    /**
     * TableName=QM_Specification
     */
    public static final String Table_Name = "QM_Specification";

    /**
     * AD_Table_ID=53040
     */
    public static final int Table_ID = 53040;

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
     * Column name AD_Workflow_ID
     */
    public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    public static final String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_AttributeSet_ID
     */
    public static final String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";
    /**
     * Column name M_Product_ID
     */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PP_Product_BOM_ID
     */
    public static final String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";
    /**
     * Column name QM_Specification_ID
     */
    public static final String COLUMNNAME_QM_Specification_ID = "QM_Specification_ID";
    /**
     * Column name QM_Specification_UU
     */
    public static final String COLUMNNAME_QM_Specification_UU = "QM_Specification_UU";
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
     * Get Workflow. Workflow or combination of tasks
     */
    public int getAD_WorkflowId();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    public void setAD_WorkflowId(int AD_Workflow_ID);

    public org.compiere.model.I_AD_Workflow getAD_Workflow() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    public String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    public void setDescription(String Description);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Get Attribute Set. Product Attribute Set
     */
    public int getAttributeSetId();

    /**
     * Set Attribute Set. Product Attribute Set
     */
    public void setAttributeSetId(int M_AttributeSet_ID);

    public org.compiere.model.I_M_AttributeSet getMAttributeSet() throws RuntimeException;

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
     * Get BOM & Formula. BOM & Formula
     */
    public int getPP_Product_BOMId();

    /**
     * Set BOM & Formula. BOM & Formula
     */
    public void setPP_Product_BOMId(int PP_Product_BOM_ID);

    public org.eevolution.model.I_PP_Product_BOM getPP_Product_BOM() throws RuntimeException;

    /**
     * Get Quality Specification
     */
    public int getQM_SpecificationId();

    /**
     * Set Quality Specification
     */
    public void setQM_SpecificationId(int QM_Specification_ID);

    /**
     * Get QM_Specification_UU
     */
    public String getQM_Specification_UU();

    /**
     * Set QM_Specification_UU
     */
    public void setQM_Specification_UU(String QM_Specification_UU);

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
