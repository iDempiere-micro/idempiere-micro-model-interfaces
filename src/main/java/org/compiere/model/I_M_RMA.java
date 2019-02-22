package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.util.Properties;

/**
 * Generated Interface for M_RMA
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_RMA extends IPO {

    /**
     * TableName=M_RMA
     */
    String Table_Name = "M_RMA";

    /**
     * AD_Table_ID=661
     */
    int Table_ID = 661;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name Amt
     */
    String COLUMNNAME_Amt = "Amt";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name CreateFrom
     */
    String COLUMNNAME_CreateFrom = "CreateFrom";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocAction
     */
    String COLUMNNAME_DocAction = "DocAction";
    /**
     * Column name DocStatus
     */
    String COLUMNNAME_DocStatus = "DocStatus";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name GenerateTo
     */
    String COLUMNNAME_GenerateTo = "GenerateTo";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name InOut_ID
     */
    String COLUMNNAME_InOut_ID = "InOut_ID";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name M_RMA_ID
     */
    String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
    /**
     * Column name M_RMAType_ID
     */
    String COLUMNNAME_M_RMAType_ID = "M_RMAType_ID";
    /**
     * Column name M_RMA_UU
     */
    String COLUMNNAME_M_RMA_UU = "M_RMA_UU";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Ref_RMA_ID
     */
    String COLUMNNAME_Ref_RMA_ID = "Ref_RMA_ID";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Amount. Amount
     */
    void setAmt(BigDecimal Amt);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Get Document Action. The targeted status of the document
     */
    String getDocAction();

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Get RMA. Return Material Authorization
     */
    int getM_RMA_ID();

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    I_M_RMALine[] getLines(boolean b);

    Properties getCtx();

    int getPrecision();

    boolean isTaxIncluded();

    I_M_RMATax[] getTaxes(boolean b);

    I_C_Order getOriginalOrder();

    boolean isComplete();

    I_M_InOut getShipment();
}
