package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Language
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface Language extends PersistentObject {

    /**
     * TableName=AD_Language
     */
    String Table_Name = "AD_Language";

    /**
     * AD_Table_ID=111
     */
    int Table_ID = 111;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);


    /**
     * Column name AD_Language
     */
    String COLUMNNAME_AD_Language = "AD_Language";
    /**
     * Column name AD_Language_ID
     */
    String COLUMNNAME_AD_Language_ID = "AD_Language_ID";
    /**
     * Column name AD_PrintPaper_ID
     */
    String COLUMNNAME_AD_PrintPaper_ID = "AD_PrintPaper_ID";
    /**
     * Column name CountryCode
     */
    String COLUMNNAME_CountryCode = "CountryCode";
    /**
     * Column name DatePattern
     */
    String COLUMNNAME_DatePattern = "DatePattern";
    /**
     * Column name IsBaseLanguage
     */
    String COLUMNNAME_IsBaseLanguage = "IsBaseLanguage";
    /**
     * Column name IsSystemLanguage
     */
    String COLUMNNAME_IsSystemLanguage = "IsSystemLanguage";
    /**
     * Column name LanguageISO
     */
    String COLUMNNAME_LanguageISO = "LanguageISO";

    /**
     * Get Language. Language for this entity
     */
    String getLanguage();

    /**
     * Set Language. Language for this entity
     */
    void setLanguage(String AD_Language);

    /**
     * Get Language ID
     */
    int getLanguageId();

    /**
     * Set Language ID
     */
    void setLanguageId(int AD_Language_ID);

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

    /**
     * Get Date Pattern. Java Date Pattern
     */
    String getDatePattern();

    /**
     * Set Base Language. The system information is maintained in this language
     */
    void setIsBaseLanguage(boolean IsBaseLanguage);

    /**
     * Get Base Language. The system information is maintained in this language
     */
    boolean isBaseLanguage();

    /**
     * Set System Language. The screens, etc. are maintained in this Language
     */
    void setIsSystemLanguage(boolean IsSystemLanguage);

    /**
     * Get System Language. The screens, etc. are maintained in this Language
     */
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

    void saveEx();
}
