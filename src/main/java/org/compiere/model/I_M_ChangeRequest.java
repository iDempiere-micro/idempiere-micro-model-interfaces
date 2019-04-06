package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_ChangeRequest
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ChangeRequest {

    /**
     * AD_Table_ID=800
     */
    int Table_ID = 800;

    /**
     * TableName=M_ChangeRequest
     */
    String Table_Name = "M_ChangeRequest";

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name M_ChangeNotice_ID
     */
    String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
    /**
     * Column name M_FixChangeNotice_ID
     */
    String COLUMNNAME_M_FixChangeNotice_ID = "M_FixChangeNotice_ID";
    /**
     * Column name PP_Product_BOM_ID
     */
    String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Change Notice. Bill of Materials (Engineering) Change Notice (Version)
     */
    int getChangeNoticeId();

    /**
     * Set Change Notice. Bill of Materials (Engineering) Change Notice (Version)
     */
    void setChangeNoticeId(int M_ChangeNotice_ID);

    /**
     * Get Fixed in. Fixed in Change Notice
     */
    int getFixChangeNoticeId();

    /**
     * Get BOM & Formula. BOM & Formula
     */
    int getProductBOMId();

    /**
     * Set BOM & Formula. BOM & Formula
     */
    void setProductBOMId(int PP_Product_BOM_ID);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

}
