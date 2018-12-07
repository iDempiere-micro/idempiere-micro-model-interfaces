package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_Report
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_Report {

    /**
     * TableName=PA_Report
     */
    String Table_Name = "PA_Report";

    /**
     * AD_Table_ID=445
     */
    int Table_ID = 445;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_PrintFormat_ID
     */
    String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name C_Calendar_ID
     */
    String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name JasperProcess_ID
     */
    String COLUMNNAME_JasperProcess_ID = "JasperProcess_ID";
    /**
     * Column name JasperProcessing
     */
    String COLUMNNAME_JasperProcessing = "JasperProcessing";
    /**
     * Column name ListSources
     */
    String COLUMNNAME_ListSources = "ListSources";
    /**
     * Column name ListSourcesXTrx
     */
    String COLUMNNAME_ListSourcesXTrx = "ListSourcesXTrx";
    /**
     * Column name ListTrx
     */
    String COLUMNNAME_ListTrx = "ListTrx";
    /**
     * Column name PA_ReportColumnSet_ID
     */
    String COLUMNNAME_PA_ReportColumnSet_ID = "PA_ReportColumnSet_ID";
    /**
     * Column name PA_ReportCube_ID
     */
    String COLUMNNAME_PA_ReportCube_ID = "PA_ReportCube_ID";
    /**
     * Column name PA_Report_ID
     */
    String COLUMNNAME_PA_Report_ID = "PA_Report_ID";
    /**
     * Column name PA_ReportLineSet_ID
     */
    String COLUMNNAME_PA_ReportLineSet_ID = "PA_ReportLineSet_ID";
    /**
     * Column name PA_Report_UU
     */
    String COLUMNNAME_PA_Report_UU = "PA_Report_UU";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Print Format. Data Print Format
     */
    int getAD_PrintFormat_ID();

    /**
     * Set Print Format. Data Print Format
     */
    void setAD_PrintFormat_ID(int AD_PrintFormat_ID);

    I_AD_PrintFormat getAD_PrintFormat() throws RuntimeException;

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setC_AcctSchema_ID(int C_AcctSchema_ID);

    I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

    /**
     * Get Calendar. Accounting Calendar Name
     */
    int getC_Calendar_ID();

    /**
     * Set Calendar. Accounting Calendar Name
     */
    void setC_Calendar_ID(int C_Calendar_ID);

    I_C_Calendar getC_Calendar() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Jasper Process. The Jasper Process used by the printengine if any process defined
     */
    int getJasperProcess_ID();

    /**
     * Set Jasper Process. The Jasper Process used by the printengine if any process defined
     */
    void setJasperProcess_ID(int JasperProcess_ID);

    I_AD_Process getJasperProcess() throws RuntimeException;

    /**
     * Get Jasper Process Now
     */
    String getJasperProcessing();

    /**
     * Set Jasper Process Now
     */
    void setJasperProcessing(String JasperProcessing);

    /**
     * Get List Sources. List Report Line Sources
     */
    boolean isListSources();

    /**
     * Set List Sources. List Report Line Sources
     */
    void setListSources(boolean ListSources);

    /**
     * Get Include source accounts with no transaction. Include source accounts with no transaction
     * for list report line sources
     */
    boolean isListSourcesXTrx();

    /**
     * Set Include source accounts with no transaction. Include source accounts with no transaction
     * for list report line sources
     */
    void setListSourcesXTrx(boolean ListSourcesXTrx);

    /**
     * Get List Transactions. List the report transactions
     */
    boolean isListTrx();

    /**
     * Set List Transactions. List the report transactions
     */
    void setListTrx(boolean ListTrx);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Report Column Set. Collection of Columns for Report
     */
    int getPA_ReportColumnSet_ID();

    /**
     * Set Report Column Set. Collection of Columns for Report
     */
    void setPA_ReportColumnSet_ID(int PA_ReportColumnSet_ID);

    I_PA_ReportColumnSet getPA_ReportColumnSet() throws RuntimeException;

    /**
     * Get Report Cube. Define reporting cube for pre-calculation of summary accounting data.
     */
    int getPA_ReportCube_ID();

    /**
     * Set Report Cube. Define reporting cube for pre-calculation of summary accounting data.
     */
    void setPA_ReportCube_ID(int PA_ReportCube_ID);

    I_PA_ReportCube getPA_ReportCube() throws RuntimeException;

    /**
     * Get Financial Report. Financial Report
     */
    int getPA_Report_ID();

    /**
     * Set Financial Report. Financial Report
     */
    void setPA_Report_ID(int PA_Report_ID);

    /**
     * Get Report Line Set
     */
    int getPA_ReportLineSet_ID();

    /**
     * Set Report Line Set
     */
    void setPA_ReportLineSet_ID(int PA_ReportLineSet_ID);

    I_PA_ReportLineSet getPA_ReportLineSet() throws RuntimeException;

    /**
     * Get PA_Report_UU
     */
    String getPA_Report_UU();

    /**
     * Set PA_Report_UU
     */
    void setPA_Report_UU(String PA_Report_UU);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
