package org.compiere.model;

import java.math.BigDecimal;

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

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);


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
     * Get HTML. Text has HTML tags
     */
    boolean isHtml();

    /**
     * Get Subject. Mail Header (Subject)
     */
    String getMailHeader();

    /**
     * Get Mail Text. Text used for Mail message
     */
    String getMailText();

    /**
     * Get Mail Text 2. Optional second text part used for Mail message
     */
    String getMailText2();

    /**
     * Get Mail Text 3. Optional third text part used for Mail message
     */
    String getMailText3();

    /**
     * Get Mail Template. Text templates for mailings
     */
    int getMailTemplateId();

}
