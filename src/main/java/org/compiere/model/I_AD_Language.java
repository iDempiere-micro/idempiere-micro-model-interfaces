package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Language
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Language {

  /** TableName=AD_Language */
  String Table_Name = "AD_Language";

  /** AD_Table_ID=111 */
  int Table_ID = 111;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Language */
  String COLUMNNAME_AD_Language = "AD_Language";
  /** Column name AD_Language_ID */
  String COLUMNNAME_AD_Language_ID = "AD_Language_ID";
  /** Column name AD_Language_UU */
  String COLUMNNAME_AD_Language_UU = "AD_Language_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PrintPaper_ID */
  String COLUMNNAME_AD_PrintPaper_ID = "AD_PrintPaper_ID";
  /** Column name CountryCode */
  String COLUMNNAME_CountryCode = "CountryCode";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DatePattern */
  String COLUMNNAME_DatePattern = "DatePattern";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsBaseLanguage */
  String COLUMNNAME_IsBaseLanguage = "IsBaseLanguage";
  /** Column name IsDecimalPoint */
  String COLUMNNAME_IsDecimalPoint = "IsDecimalPoint";
  /** Column name IsLoginLocale */
  String COLUMNNAME_IsLoginLocale = "IsLoginLocale";
  /** Column name IsSystemLanguage */
  String COLUMNNAME_IsSystemLanguage = "IsSystemLanguage";
  /** Column name LanguageISO */
  String COLUMNNAME_LanguageISO = "LanguageISO";
  /** Column name PrintName */
  String COLUMNNAME_PrintName = "PrintName";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name TimePattern */
  String COLUMNNAME_TimePattern = "TimePattern";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Language. Language for this entity */
  String getADLanguage();

  /** Set Language. Language for this entity */
  void setADLanguage(String AD_Language);

  /** Set Language ID */
  void setADLanguage_ID(int AD_Language_ID);

  /** Get Language ID */
  int getAD_Language_ID();

  /** Set AD_Language_UU */
  void setADLanguage_UU(String AD_Language_UU);

  /** Get AD_Language_UU */
  String getAD_Language_UU();

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Print Paper. Printer paper definition */
  int getAD_PrintPaper_ID();

  /** Set Print Paper. Printer paper definition */
  void setAD_PrintPaper_ID(int AD_PrintPaper_ID);

  I_AD_PrintPaper getAD_PrintPaper() throws RuntimeException;

  /**
   * Get ISO Country Code. Upper-case two-letter alphanumeric ISO Country code according to ISO
   * 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
   */
  String getCountryCode();

  /**
   * Set ISO Country Code. Upper-case two-letter alphanumeric ISO Country code according to ISO
   * 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
   */
  void setCountryCode(String CountryCode);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Date Pattern. Java Date Pattern */
  String getDatePattern();

  /** Set Date Pattern. Java Date Pattern */
  void setDatePattern(String DatePattern);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Base Language. The system information is maintained in this language */
  void setIsBaseLanguage(boolean IsBaseLanguage);

  /** Get Base Language. The system information is maintained in this language */
  boolean isBaseLanguage();

  /** Set Decimal Point. The number notation has a decimal point (no decimal comma) */
  void setIsDecimalPoint(boolean IsDecimalPoint);

  /** Get Decimal Point. The number notation has a decimal point (no decimal comma) */
  boolean isDecimalPoint();

  /** Set Login Locale */
  void setIsLoginLocale(boolean IsLoginLocale);

  /** Get Login Locale */
  boolean isLoginLocale();

  /** Set System Language. The screens, etc. are maintained in this Language */
  void setIsSystemLanguage(boolean IsSystemLanguage);

  /** Get System Language. The screens, etc. are maintained in this Language */
  boolean isSystemLanguage();

  /**
   * Get ISO Language Code. Lower-case two-letter ISO-3166 code -
   * http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt
   */
  String getLanguageISO();

  /**
   * Set ISO Language Code. Lower-case two-letter ISO-3166 code -
   * http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt
   */
  void setLanguageISO(String LanguageISO);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Print Text. The label text to be printed on a document or correspondence. */
  String getPrintName();

  /** Set Print Text. The label text to be printed on a document or correspondence. */
  void setPrintName(String PrintName);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Time Pattern. Java Time Pattern */
  String getTimePattern();

  /** Set Time Pattern. Java Time Pattern */
  void setTimePattern(String TimePattern);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  void saveEx(String trxName);
}
