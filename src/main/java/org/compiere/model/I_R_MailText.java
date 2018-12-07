package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_MailText
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_MailText {

    /**
     * TableName=R_MailText
     */
    String Table_Name = "R_MailText";

    /**
     * AD_Table_ID=416
     */
    int Table_ID = 416;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsHtml
     */
    String COLUMNNAME_IsHtml = "IsHtml";
    /**
     * Column name MailHeader
     */
    String COLUMNNAME_MailHeader = "MailHeader";
    /**
     * Column name MailText
     */
    String COLUMNNAME_MailText = "MailText";
    /**
     * Column name MailText2
     */
    String COLUMNNAME_MailText2 = "MailText2";
    /**
     * Column name MailText3
     */
    String COLUMNNAME_MailText3 = "MailText3";
    /**
     * Column name R_MailText_ID
     */
    String COLUMNNAME_R_MailText_ID = "R_MailText_ID";
    /**
     * Column name R_MailText_UU
     */
    String COLUMNNAME_R_MailText_UU = "R_MailText_UU";
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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set HTML. Text has HTML tags
     */
    void setIsHtml(boolean IsHtml);

    /**
     * Get HTML. Text has HTML tags
     */
    boolean isHtml();

    /**
     * Get Subject. Mail Header (Subject)
     */
    String getMailHeader();

    /**
     * Set Subject. Mail Header (Subject)
     */
    void setMailHeader(String MailHeader);

    /**
     * Get Mail Text. Text used for Mail message
     */
    String getMailText();

    /**
     * Set Mail Text. Text used for Mail message
     */
    void setMailText(String MailText);

    /**
     * Get Mail Text 2. Optional second text part used for Mail message
     */
    String getMailText2();

    /**
     * Set Mail Text 2. Optional second text part used for Mail message
     */
    void setMailText2(String MailText2);

    /**
     * Get Mail Text 3. Optional third text part used for Mail message
     */
    String getMailText3();

    /**
     * Set Mail Text 3. Optional third text part used for Mail message
     */
    void setMailText3(String MailText3);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Mail Template. Text templates for mailings
     */
    int getR_MailText_ID();

    /**
     * Set Mail Template. Text templates for mailings
     */
    void setR_MailText_ID(int R_MailText_ID);

    /**
     * Get R_MailText_UU
     */
    String getR_MailText_UU();

    /**
     * Set R_MailText_UU
     */
    void setR_MailText_UU(String R_MailText_UU);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
