package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Phase
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Phase {

    /**
     * TableName=C_Phase
     */
    String Table_Name = "C_Phase";

    /**
     * AD_Table_ID=577
     */
    int Table_ID = 577;

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
     * Column name C_Phase_ID
     */
    String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
    /**
     * Column name C_Phase_UU
     */
    String COLUMNNAME_C_Phase_UU = "C_Phase_UU";
    /**
     * Column name C_ProjectType_ID
     */
    String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name StandardQty
     */
    String COLUMNNAME_StandardQty = "StandardQty";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Standard Phase. Standard Phase of the Project Type
     */
    int getC_Phase_ID();

    /**
     * Set Standard Phase. Standard Phase of the Project Type
     */
    void setC_Phase_ID(int C_Phase_ID);

    /**
     * Get C_Phase_UU
     */
    String getC_Phase_UU();

    /**
     * Set C_Phase_UU
     */
    void setC_Phase_UU(String C_Phase_UU);

    /**
     * Get Project Type. Type of the project
     */
    int getC_ProjectType_ID();

    /**
     * Set Project Type. Type of the project
     */
    void setC_ProjectType_ID(int C_ProjectType_ID);

    I_C_ProjectType getC_ProjectType() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

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
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Standard Quantity. Standard Quantity
     */
    BigDecimal getStandardQty();

    /**
     * Set Standard Quantity. Standard Quantity
     */
    void setStandardQty(BigDecimal StandardQty);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
