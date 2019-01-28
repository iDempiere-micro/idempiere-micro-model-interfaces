package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ChangeRequest
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ChangeRequest {

  /** TableName=M_ChangeRequest */
  String Table_Name = "M_ChangeRequest";

  /** AD_Table_ID=800 */
  int Table_ID = 800;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DetailInfo */
  String COLUMNNAME_DetailInfo = "DetailInfo";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
    /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name M_ChangeNotice_ID */
  String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
  /** Column name M_ChangeRequest_ID */
  String COLUMNNAME_M_ChangeRequest_ID = "M_ChangeRequest_ID";
  /** Column name M_ChangeRequest_UU */
  String COLUMNNAME_M_ChangeRequest_UU = "M_ChangeRequest_UU";
  /** Column name M_FixChangeNotice_ID */
  String COLUMNNAME_M_FixChangeNotice_ID = "M_FixChangeNotice_ID";
  /** Column name PP_Product_BOM_ID */
  String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";

    /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

    /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

    /** Get Change Notice. Bill of Materials (Engineering) Change Notice (Version) */
  int getM_ChangeNotice_ID();

  /** Set Change Notice. Bill of Materials (Engineering) Change Notice (Version) */
  void setM_ChangeNotice_ID(int M_ChangeNotice_ID);

    /** Get Fixed in. Fixed in Change Notice */
  int getM_FixChangeNotice_ID();

    /** Get BOM & Formula. BOM & Formula */
  int getPP_Product_BOM_ID();

  /** Set BOM & Formula. BOM & Formula */
  void setPP_Product_BOM_ID(int PP_Product_BOM_ID);

    /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

}
