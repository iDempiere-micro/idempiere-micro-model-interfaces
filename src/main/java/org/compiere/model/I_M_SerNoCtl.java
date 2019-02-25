package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_SerNoCtl
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_SerNoCtl {

    /**
     * AD_Table_ID=555
     */
    int Table_ID = 555;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name CurrentNext
     */
    String COLUMNNAME_CurrentNext = "CurrentNext";
    /**
     * Column name IncrementNo
     */
    String COLUMNNAME_IncrementNo = "IncrementNo";
    /**
     * Column name Prefix
     */
    String COLUMNNAME_Prefix = "Prefix";
    /**
     * Column name StartNo
     */
    String COLUMNNAME_StartNo = "StartNo";
    /**
     * Column name Suffix
     */
    String COLUMNNAME_Suffix = "Suffix";

    /**
     * Get Current Next. The next number to be used
     */
    int getCurrentNext();

    /**
     * Set Current Next. The next number to be used
     */
    void setCurrentNext(int CurrentNext);

    /**
     * Get Increment. The number to increment the last document number by
     */
    int getIncrementNo();

    /**
     * Set Increment. The number to increment the last document number by
     */
    void setIncrementNo(int IncrementNo);

    /**
     * Get Prefix. Prefix before the sequence number
     */
    String getPrefix();

    /**
     * Set Start No. Starting number/position
     */
    void setStartNo(int StartNo);

    /**
     * Get Suffix. Suffix after the number
     */
    String getSuffix();

}
