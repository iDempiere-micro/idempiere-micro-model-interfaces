package org.compiere.model;

import java.math.BigDecimal;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for T_Report
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_Report {

  /** TableName=T_Report */
  String Table_Name = "T_Report";

  /** AD_Table_ID=544 */
  int Table_ID = 544;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_PInstance_ID */
  String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
  /** Column name Col_0 */
  String COLUMNNAME_Col_0 = "Col_0";
  /** Column name Col_1 */
  String COLUMNNAME_Col_1 = "Col_1";
  /** Column name Col_10 */
  String COLUMNNAME_Col_10 = "Col_10";
  /** Column name Col_11 */
  String COLUMNNAME_Col_11 = "Col_11";
  /** Column name Col_12 */
  String COLUMNNAME_Col_12 = "Col_12";
  /** Column name Col_13 */
  String COLUMNNAME_Col_13 = "Col_13";
  /** Column name Col_14 */
  String COLUMNNAME_Col_14 = "Col_14";
  /** Column name Col_15 */
  String COLUMNNAME_Col_15 = "Col_15";
  /** Column name Col_16 */
  String COLUMNNAME_Col_16 = "Col_16";
  /** Column name Col_17 */
  String COLUMNNAME_Col_17 = "Col_17";
  /** Column name Col_18 */
  String COLUMNNAME_Col_18 = "Col_18";
  /** Column name Col_19 */
  String COLUMNNAME_Col_19 = "Col_19";
  /** Column name Col_2 */
  String COLUMNNAME_Col_2 = "Col_2";
  /** Column name Col_20 */
  String COLUMNNAME_Col_20 = "Col_20";
  /** Column name Col_3 */
  String COLUMNNAME_Col_3 = "Col_3";
  /** Column name Col_4 */
  String COLUMNNAME_Col_4 = "Col_4";
  /** Column name Col_5 */
  String COLUMNNAME_Col_5 = "Col_5";
  /** Column name Col_6 */
  String COLUMNNAME_Col_6 = "Col_6";
  /** Column name Col_7 */
  String COLUMNNAME_Col_7 = "Col_7";
  /** Column name Col_8 */
  String COLUMNNAME_Col_8 = "Col_8";
  /** Column name Col_9 */
  String COLUMNNAME_Col_9 = "Col_9";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Fact_Acct_ID */
  String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";
  /** Column name LevelNo */
  String COLUMNNAME_LevelNo = "LevelNo";
  /** Column name PA_ReportLine_ID */
  String COLUMNNAME_PA_ReportLine_ID = "PA_ReportLine_ID";
  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name T_Report_UU */
  String COLUMNNAME_T_Report_UU = "T_Report_UU";

  /** Get Process Instance. Instance of the process */
  int getAD_PInstance_ID();

  /** Set Process Instance. Instance of the process */
  void setAD_PInstance_ID(int AD_PInstance_ID);

  I_AD_PInstance getAD_PInstance() throws RuntimeException;

  /** Get Col_0 */
  BigDecimal getCol_0();

  /** Set Col_0 */
  void setCol_0(BigDecimal Col_0);

  /** Get Col_1 */
  BigDecimal getCol_1();

  /** Set Col_1 */
  void setCol_1(BigDecimal Col_1);

  /** Get Col_10 */
  BigDecimal getCol_10();

  /** Set Col_10 */
  void setCol_10(BigDecimal Col_10);

  /** Get Col_11 */
  BigDecimal getCol_11();

  /** Set Col_11 */
  void setCol_11(BigDecimal Col_11);

  /** Get Col_12 */
  BigDecimal getCol_12();

  /** Set Col_12 */
  void setCol_12(BigDecimal Col_12);

  /** Get Col_13 */
  BigDecimal getCol_13();

  /** Set Col_13 */
  void setCol_13(BigDecimal Col_13);

  /** Get Col_14 */
  BigDecimal getCol_14();

  /** Set Col_14 */
  void setCol_14(BigDecimal Col_14);

  /** Get Col_15 */
  BigDecimal getCol_15();

  /** Set Col_15 */
  void setCol_15(BigDecimal Col_15);

  /** Get Col_16 */
  BigDecimal getCol_16();

  /** Set Col_16 */
  void setCol_16(BigDecimal Col_16);

  /** Get Col_17 */
  BigDecimal getCol_17();

  /** Set Col_17 */
  void setCol_17(BigDecimal Col_17);

  /** Get Col_18 */
  BigDecimal getCol_18();

  /** Set Col_18 */
  void setCol_18(BigDecimal Col_18);

  /** Get Col_19 */
  BigDecimal getCol_19();

  /** Set Col_19 */
  void setCol_19(BigDecimal Col_19);

  /** Get Col_2 */
  BigDecimal getCol_2();

  /** Set Col_2 */
  void setCol_2(BigDecimal Col_2);

  /** Get Col_20 */
  BigDecimal getCol_20();

  /** Set Col_20 */
  void setCol_20(BigDecimal Col_20);

  /** Get Col_3 */
  BigDecimal getCol_3();

  /** Set Col_3 */
  void setCol_3(BigDecimal Col_3);

  /** Get Col_4 */
  BigDecimal getCol_4();

  /** Set Col_4 */
  void setCol_4(BigDecimal Col_4);

  /** Get Col_5 */
  BigDecimal getCol_5();

  /** Set Col_5 */
  void setCol_5(BigDecimal Col_5);

  /** Get Col_6 */
  BigDecimal getCol_6();

  /** Set Col_6 */
  void setCol_6(BigDecimal Col_6);

  /** Get Col_7 */
  BigDecimal getCol_7();

  /** Set Col_7 */
  void setCol_7(BigDecimal Col_7);

  /** Get Col_8 */
  BigDecimal getCol_8();

  /** Set Col_8 */
  void setCol_8(BigDecimal Col_8);

  /** Get Col_9 */
  BigDecimal getCol_9();

  /** Set Col_9 */
  void setCol_9(BigDecimal Col_9);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Accounting Fact */
  int getFact_Acct_ID();

  /** Set Accounting Fact */
  void setFact_Acct_ID(int Fact_Acct_ID);

  /** Get Level no */
  int getLevelNo();

  /** Set Level no */
  void setLevelNo(int LevelNo);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Report Line */
  int getPA_ReportLine_ID();

  /** Set Report Line */
  void setPA_ReportLine_ID(int PA_ReportLine_ID);

  I_PA_ReportLine getPA_ReportLine() throws RuntimeException;

  /** Get Record ID. Direct internal record ID */
  int getRecord_ID();

  /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get T_Report_UU */
  String getT_Report_UU();

  /** Set T_Report_UU */
  void setT_Report_UU(String T_Report_UU);
}
