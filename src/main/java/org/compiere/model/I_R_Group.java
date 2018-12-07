package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_Group
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_Group {

    /**
     * TableName=R_Group
     */
    String Table_Name = "R_Group";

    /**
     * AD_Table_ID=773
     */
    int Table_ID = 773;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

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
     * Column name M_ChangeNotice_ID
     */
    String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
    /**
     * Column name PP_Product_BOM_ID
     */
    String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";
    /**
     * Column name R_Group_ID
     */
    String COLUMNNAME_R_Group_ID = "R_Group_ID";
    /**
     * Column name R_Group_UU
     */
    String COLUMNNAME_R_Group_UU = "R_Group_UU";
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
     * Get Change Notice. Bill of Materials (Engineering) Change Notice (Version)
     */
    int getM_ChangeNotice_ID();

    /**
     * Set Change Notice. Bill of Materials (Engineering) Change Notice (Version)
     */
    void setM_ChangeNotice_ID(int M_ChangeNotice_ID);

    I_M_ChangeNotice getM_ChangeNotice() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get BOM & Formula. BOM & Formula
     */
    int getPP_Product_BOM_ID();

    /**
     * Set BOM & Formula. BOM & Formula
     */
    void setPP_Product_BOM_ID(int PP_Product_BOM_ID);

    org.eevolution.model.I_PP_Product_BOM getPP_Product_BOM() throws RuntimeException;

    /**
     * Get Group. Request Group
     */
    int getR_Group_ID();

    /**
     * Set Group. Request Group
     */
    void setR_Group_ID(int R_Group_ID);

    /**
     * Get R_Group_UU
     */
    String getR_Group_UU();

    /**
     * Set R_Group_UU
     */
    void setR_Group_UU(String R_Group_UU);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
