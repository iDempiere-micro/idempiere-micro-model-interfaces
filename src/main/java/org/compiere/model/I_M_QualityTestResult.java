package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_QualityTestResult
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_QualityTestResult {

  /** TableName=M_QualityTestResult */
  String Table_Name = "M_QualityTestResult";

  /** AD_Table_ID=53331 */
  int Table_ID = 53331;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name ExpectedResult */
  String COLUMNNAME_ExpectedResult = "ExpectedResult";
    /** Column name IsQCPass */
  String COLUMNNAME_IsQCPass = "IsQCPass";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_QualityTest_ID */
  String COLUMNNAME_M_QualityTest_ID = "M_QualityTest_ID";
  /** Column name M_QualityTestResult_ID */
  String COLUMNNAME_M_QualityTestResult_ID = "M_QualityTestResult_ID";
  /** Column name M_QualityTestResult_UU */
  String COLUMNNAME_M_QualityTestResult_UU = "M_QualityTestResult_UU";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Result */
  String COLUMNNAME_Result = "Result";

    /** Set QC Pass */
  void setIsQCPass(boolean IsQCPass);

    /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

    /** Get Quality Test */
  int getM_QualityTest_ID();

  /** Set Quality Test */
  void setM_QualityTest_ID(int M_QualityTest_ID);

    /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

}
