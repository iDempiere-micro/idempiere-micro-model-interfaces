package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for T_ReportStatement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_ReportStatement {

    /**
     * TableName=T_ReportStatement
     */
    String Table_Name = "T_ReportStatement";

    /**
     * AD_Table_ID=545
     */
    int Table_ID = 545;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_PInstance_ID
     */
    String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
    /**
     * Column name AmtAcctCr
     */
    String COLUMNNAME_AmtAcctCr = "AmtAcctCr";
    /**
     * Column name AmtAcctDr
     */
    String COLUMNNAME_AmtAcctDr = "AmtAcctDr";
    /**
     * Column name Balance
     */
    String COLUMNNAME_Balance = "Balance";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Fact_Acct_ID
     */
    String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";
    /**
     * Column name LevelNo
     */
    String COLUMNNAME_LevelNo = "LevelNo";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name T_ReportStatement_UU
     */
    String COLUMNNAME_T_ReportStatement_UU = "T_ReportStatement_UU";

    /**
     * Get Process Instance. Instance of the process
     */
    int getAD_PInstance_ID();

    /**
     * Set Process Instance. Instance of the process
     */
    void setAD_PInstance_ID(int AD_PInstance_ID);

    I_AD_PInstance getAD_PInstance() throws RuntimeException;

    /**
     * Get Accounted Credit. Accounted Credit Amount
     */
    BigDecimal getAmtAcctCr();

    /**
     * Set Accounted Credit. Accounted Credit Amount
     */
    void setAmtAcctCr(BigDecimal AmtAcctCr);

    /**
     * Get Accounted Debit. Accounted Debit Amount
     */
    BigDecimal getAmtAcctDr();

    /**
     * Set Accounted Debit. Accounted Debit Amount
     */
    void setAmtAcctDr(BigDecimal AmtAcctDr);

    /**
     * Get Balance
     */
    BigDecimal getBalance();

    /**
     * Set Balance
     */
    void setBalance(BigDecimal Balance);

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Accounting Fact
     */
    int getFact_Acct_ID();

    /**
     * Set Accounting Fact
     */
    void setFact_Acct_ID(int Fact_Acct_ID);

    I_Fact_Acct getFact_Acct() throws RuntimeException;

    /**
     * Get Level no
     */
    int getLevelNo();

    /**
     * Set Level no
     */
    void setLevelNo(int LevelNo);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get T_ReportStatement_UU
     */
    String getT_ReportStatement_UU();

    /**
     * Set T_ReportStatement_UU
     */
    void setT_ReportStatement_UU(String T_ReportStatement_UU);
}
