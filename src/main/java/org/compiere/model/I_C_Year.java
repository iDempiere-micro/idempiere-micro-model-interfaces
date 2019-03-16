package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Year
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Year {

    /**
     * TableName=C_Year
     */
    String Table_Name = "C_Year";

    /**
     * AD_Table_ID=177
     */
    int Table_ID = 177;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name C_Calendar_ID
     */
    String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
    /**
     * Column name C_Year_ID
     */
    String COLUMNNAME_C_Year_ID = "C_Year_ID";
    /**
     * Column name FiscalYear
     */
    String COLUMNNAME_FiscalYear = "FiscalYear";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";

    /**
     * Get Calendar. Accounting Calendar Name
     */
    int getCalendarId();

    /**
     * Set Calendar. Accounting Calendar Name
     */
    void setCalendarId(int C_Calendar_ID);

    /**
     * Get Year. Calendar Year
     */
    int getYearId();

    /**
     * Get Year. The Fiscal Year
     */
    String getFiscalYear();

    /**
     * Set Year. The Fiscal Year
     */
    void setFiscalYear(String FiscalYear);

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

}
