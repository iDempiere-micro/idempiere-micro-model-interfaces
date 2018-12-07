package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Info_Oth
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Info_Oth {

    /**
     * TableName=A_Asset_Info_Oth
     */
    String Table_Name = "A_Asset_Info_Oth";

    /**
     * AD_Table_ID=53136
     */
    int Table_ID = 53136;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name A_Asset_Info_Oth_ID
     */
    String COLUMNNAME_A_Asset_Info_Oth_ID = "A_Asset_Info_Oth_ID";
    /**
     * Column name A_Asset_Info_Oth_UU
     */
    String COLUMNNAME_A_Asset_Info_Oth_UU = "A_Asset_Info_Oth_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name A_User1
     */
    String COLUMNNAME_A_User1 = "A_User1";
    /**
     * Column name A_User10
     */
    String COLUMNNAME_A_User10 = "A_User10";
    /**
     * Column name A_User11
     */
    String COLUMNNAME_A_User11 = "A_User11";
    /**
     * Column name A_User12
     */
    String COLUMNNAME_A_User12 = "A_User12";
    /**
     * Column name A_User13
     */
    String COLUMNNAME_A_User13 = "A_User13";
    /**
     * Column name A_User14
     */
    String COLUMNNAME_A_User14 = "A_User14";
    /**
     * Column name A_User15
     */
    String COLUMNNAME_A_User15 = "A_User15";
    /**
     * Column name A_User2
     */
    String COLUMNNAME_A_User2 = "A_User2";
    /**
     * Column name A_User3
     */
    String COLUMNNAME_A_User3 = "A_User3";
    /**
     * Column name A_User4
     */
    String COLUMNNAME_A_User4 = "A_User4";
    /**
     * Column name A_User5
     */
    String COLUMNNAME_A_User5 = "A_User5";
    /**
     * Column name A_User6
     */
    String COLUMNNAME_A_User6 = "A_User6";
    /**
     * Column name A_User7
     */
    String COLUMNNAME_A_User7 = "A_User7";
    /**
     * Column name A_User8
     */
    String COLUMNNAME_A_User8 = "A_User8";
    /**
     * Column name A_User9
     */
    String COLUMNNAME_A_User9 = "A_User9";
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
     * Column name Text
     */
    String COLUMNNAME_Text = "Text";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getA_Asset_ID();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setA_Asset_ID(int A_Asset_ID);

    /**
     * Get A_Asset_Info_Oth_ID
     */
    int getA_Asset_Info_Oth_ID();

    /**
     * Set A_Asset_Info_Oth_ID
     */
    void setA_Asset_Info_Oth_ID(int A_Asset_Info_Oth_ID);

    /**
     * Get A_Asset_Info_Oth_UU
     */
    String getA_Asset_Info_Oth_UU();

    /**
     * Set A_Asset_Info_Oth_UU
     */
    void setA_Asset_Info_Oth_UU(String A_Asset_Info_Oth_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get A_User1
     */
    String getA_User1();

    /**
     * Set A_User1
     */
    void setA_User1(String A_User1);

    /**
     * Get A_User10
     */
    String getA_User10();

    /**
     * Set A_User10
     */
    void setA_User10(String A_User10);

    /**
     * Get A_User11
     */
    String getA_User11();

    /**
     * Set A_User11
     */
    void setA_User11(String A_User11);

    /**
     * Get A_User12
     */
    String getA_User12();

    /**
     * Set A_User12
     */
    void setA_User12(String A_User12);

    /**
     * Get A_User13
     */
    String getA_User13();

    /**
     * Set A_User13
     */
    void setA_User13(String A_User13);

    /**
     * Get A_User14
     */
    String getA_User14();

    /**
     * Set A_User14
     */
    void setA_User14(String A_User14);

    /**
     * Get A_User15
     */
    String getA_User15();

    /**
     * Set A_User15
     */
    void setA_User15(String A_User15);

    /**
     * Get A_User2
     */
    String getA_User2();

    /**
     * Set A_User2
     */
    void setA_User2(String A_User2);

    /**
     * Get A_User3
     */
    String getA_User3();

    /**
     * Set A_User3
     */
    void setA_User3(String A_User3);

    /**
     * Get A_User4
     */
    String getA_User4();

    /**
     * Set A_User4
     */
    void setA_User4(String A_User4);

    /**
     * Get A_User5
     */
    String getA_User5();

    /**
     * Set A_User5
     */
    void setA_User5(String A_User5);

    /**
     * Get A_User6
     */
    String getA_User6();

    /**
     * Set A_User6
     */
    void setA_User6(String A_User6);

    /**
     * Get A_User7
     */
    String getA_User7();

    /**
     * Set A_User7
     */
    void setA_User7(String A_User7);

    /**
     * Get A_User8
     */
    String getA_User8();

    /**
     * Set A_User8
     */
    void setA_User8(String A_User8);

    /**
     * Get A_User9
     */
    String getA_User9();

    /**
     * Set A_User9
     */
    void setA_User9(String A_User9);

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
     * Get Description
     */
    String getText();

    /**
     * Set Description
     */
    void setText(String Text);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
