package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for T_1099Extract
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_1099Extract {

  /** TableName=T_1099Extract */
  String Table_Name = "T_1099Extract";

  /** AD_Table_ID=200067 */
  int Table_ID = 200067;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PInstance_ID */
  String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
  /** Column name AmtBucket01 */
  String COLUMNNAME_AmtBucket01 = "AmtBucket01";
  /** Column name AmtBucket02 */
  String COLUMNNAME_AmtBucket02 = "AmtBucket02";
  /** Column name AmtBucket03 */
  String COLUMNNAME_AmtBucket03 = "AmtBucket03";
  /** Column name AmtBucket04 */
  String COLUMNNAME_AmtBucket04 = "AmtBucket04";
  /** Column name AmtBucket05 */
  String COLUMNNAME_AmtBucket05 = "AmtBucket05";
  /** Column name AmtBucket06 */
  String COLUMNNAME_AmtBucket06 = "AmtBucket06";
  /** Column name AmtBucket07 */
  String COLUMNNAME_AmtBucket07 = "AmtBucket07";
  /** Column name AmtBucket08 */
  String COLUMNNAME_AmtBucket08 = "AmtBucket08";
  /** Column name AmtBucket09 */
  String COLUMNNAME_AmtBucket09 = "AmtBucket09";
  /** Column name AmtBucket10 */
  String COLUMNNAME_AmtBucket10 = "AmtBucket10";
  /** Column name AmtBucket11 */
  String COLUMNNAME_AmtBucket11 = "AmtBucket11";
  /** Column name AmtBucket12 */
  String COLUMNNAME_AmtBucket12 = "AmtBucket12";
  /** Column name AmtBucket13 */
  String COLUMNNAME_AmtBucket13 = "AmtBucket13";
  /** Column name AmtBucket14 */
  String COLUMNNAME_AmtBucket14 = "AmtBucket14";
  /** Column name AmtBucket15 */
  String COLUMNNAME_AmtBucket15 = "AmtBucket15";
  /** Column name AmtBucket16 */
  String COLUMNNAME_AmtBucket16 = "AmtBucket16";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Location_ID */
  String COLUMNNAME_C_Location_ID = "C_Location_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Cut_Date */
  String COLUMNNAME_Cut_Date = "Cut_Date";
  /** Column name Cut_Year */
  String COLUMNNAME_Cut_Year = "Cut_Year";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name T_1099Extract_UU */
  String COLUMNNAME_T_1099Extract_UU = "T_1099Extract_UU";
  /** Column name TaxID */
  String COLUMNNAME_TaxID = "TaxID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Process Instance. Instance of the process */
  int getAD_PInstance_ID();

  /** Set Process Instance. Instance of the process */
  void setAD_PInstance_ID(int AD_PInstance_ID);

  I_AD_PInstance getAD_PInstance() throws RuntimeException;

  /** Get Amount Bucket 1 */
  BigDecimal getAmtBucket01();

  /** Set Amount Bucket 1 */
  void setAmtBucket01(BigDecimal AmtBucket01);

  /** Get Amount Bucket 2 */
  BigDecimal getAmtBucket02();

  /** Set Amount Bucket 2 */
  void setAmtBucket02(BigDecimal AmtBucket02);

  /** Get Amount Bucket 3 */
  BigDecimal getAmtBucket03();

  /** Set Amount Bucket 3 */
  void setAmtBucket03(BigDecimal AmtBucket03);

  /** Get Amount Bucket 4 */
  BigDecimal getAmtBucket04();

  /** Set Amount Bucket 4 */
  void setAmtBucket04(BigDecimal AmtBucket04);

  /** Get Amount Bucket 5 */
  BigDecimal getAmtBucket05();

  /** Set Amount Bucket 5 */
  void setAmtBucket05(BigDecimal AmtBucket05);

  /** Get Amount Bucket 6 */
  BigDecimal getAmtBucket06();

  /** Set Amount Bucket 6 */
  void setAmtBucket06(BigDecimal AmtBucket06);

  /** Get Amount Bucket 7 */
  BigDecimal getAmtBucket07();

  /** Set Amount Bucket 7 */
  void setAmtBucket07(BigDecimal AmtBucket07);

  /** Get Amount Bucket 8 */
  BigDecimal getAmtBucket08();

  /** Set Amount Bucket 8 */
  void setAmtBucket08(BigDecimal AmtBucket08);

  /** Get Amount Bucket 9 */
  BigDecimal getAmtBucket09();

  /** Set Amount Bucket 9 */
  void setAmtBucket09(BigDecimal AmtBucket09);

  /** Get Amount Bucket 10 */
  BigDecimal getAmtBucket10();

  /** Set Amount Bucket 10 */
  void setAmtBucket10(BigDecimal AmtBucket10);

  /** Get Amount Bucket 11 */
  BigDecimal getAmtBucket11();

  /** Set Amount Bucket 11 */
  void setAmtBucket11(BigDecimal AmtBucket11);

  /** Get Amount Bucket 12 */
  BigDecimal getAmtBucket12();

  /** Set Amount Bucket 12 */
  void setAmtBucket12(BigDecimal AmtBucket12);

  /** Get Amount Bucket 13 */
  BigDecimal getAmtBucket13();

  /** Set Amount Bucket 13 */
  void setAmtBucket13(BigDecimal AmtBucket13);

  /** Get Amount Bucket 14 */
  BigDecimal getAmtBucket14();

  /** Set Amount Bucket 14 */
  void setAmtBucket14(BigDecimal AmtBucket14);

  /** Get Amount Bucket 15 */
  BigDecimal getAmtBucket15();

  /** Set Amount Bucket 15 */
  void setAmtBucket15(BigDecimal AmtBucket15);

  /** Get Amount Bucket 16 */
  BigDecimal getAmtBucket16();

  /** Set Amount Bucket 16 */
  void setAmtBucket16(BigDecimal AmtBucket16);

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Address. Location or Address */
  int getC_Location_ID();

  /** Set Address. Location or Address */
  void setC_Location_ID(int C_Location_ID);

  I_C_Location getC_Location() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Cut Date */
  Timestamp getCut_Date();

  /** Set Cut Date */
  void setCut_Date(Timestamp Cut_Date);

  /** Get Cut Year */
  int getCut_Year();

  /** Set Cut Year */
  void setCut_Year(int Cut_Year);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get T_1099Extract_UU */
  String getT_1099Extract_UU();

  /** Set T_1099Extract_UU */
  void setT_1099Extract_UU(String T_1099Extract_UU);

  /** Get Tax ID. Tax Identification */
  String getTaxID();

  /** Set Tax ID. Tax Identification */
  void setTaxID(String TaxID);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
