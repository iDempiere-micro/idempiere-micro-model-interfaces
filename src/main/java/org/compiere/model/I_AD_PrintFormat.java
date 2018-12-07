package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_PrintFormat
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PrintFormat {

    /**
     * TableName=AD_PrintFormat
     */
    String Table_Name = "AD_PrintFormat";

    /**
     * AD_Table_ID=493
     */
    int Table_ID = 493;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_PrintColor_ID
     */
    String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
    /**
     * Column name AD_PrintFont_ID
     */
    String COLUMNNAME_AD_PrintFont_ID = "AD_PrintFont_ID";
    /**
     * Column name AD_PrintFormat_ID
     */
    String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
    /**
     * Column name AD_PrintFormat_UU
     */
    String COLUMNNAME_AD_PrintFormat_UU = "AD_PrintFormat_UU";
    /**
     * Column name AD_PrintPaper_ID
     */
    String COLUMNNAME_AD_PrintPaper_ID = "AD_PrintPaper_ID";
    /**
     * Column name AD_PrintTableFormat_ID
     */
    String COLUMNNAME_AD_PrintTableFormat_ID = "AD_PrintTableFormat_ID";
    /**
     * Column name AD_ReportView_ID
     */
    String COLUMNNAME_AD_ReportView_ID = "AD_ReportView_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
    /**
     * Column name Args
     */
    String COLUMNNAME_Args = "Args";
    /**
     * Column name Classname
     */
    String COLUMNNAME_Classname = "Classname";
    /**
     * Column name CreateCopy
     */
    String COLUMNNAME_CreateCopy = "CreateCopy";
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
     * Column name FooterMargin
     */
    String COLUMNNAME_FooterMargin = "FooterMargin";
    /**
     * Column name HeaderMargin
     */
    String COLUMNNAME_HeaderMargin = "HeaderMargin";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsForm
     */
    String COLUMNNAME_IsForm = "IsForm";
    /**
     * Column name IsStandardHeaderFooter
     */
    String COLUMNNAME_IsStandardHeaderFooter = "IsStandardHeaderFooter";
    /**
     * Column name IsTableBased
     */
    String COLUMNNAME_IsTableBased = "IsTableBased";
    /**
     * Column name JasperProcess_ID
     */
    String COLUMNNAME_JasperProcess_ID = "JasperProcess_ID";
    /**
     * Column name PrinterName
     */
    String COLUMNNAME_PrinterName = "PrinterName";
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
     * Get Print Color. Color used for printing and display
     */
    int getAD_PrintColor_ID();

    /**
     * Set Print Color. Color used for printing and display
     */
    void setAD_PrintColor_ID(int AD_PrintColor_ID);

    I_AD_PrintColor getAD_PrintColor() throws RuntimeException;

    /**
     * Get Print Font. Maintain Print Font
     */
    int getAD_PrintFont_ID();

    /**
     * Set Print Font. Maintain Print Font
     */
    void setAD_PrintFont_ID(int AD_PrintFont_ID);

    I_AD_PrintFont getAD_PrintFont() throws RuntimeException;

    /**
     * Get Print Format. Data Print Format
     */
    int getAD_PrintFormat_ID();

    /**
     * Set Print Format. Data Print Format
     */
    void setAD_PrintFormat_ID(int AD_PrintFormat_ID);

    /**
     * Get AD_PrintFormat_UU
     */
    String getAD_PrintFormat_UU();

    /**
     * Set AD_PrintFormat_UU
     */
    void setAD_PrintFormat_UU(String AD_PrintFormat_UU);

    /**
     * Get Print Paper. Printer paper definition
     */
    int getAD_PrintPaper_ID();

    /**
     * Set Print Paper. Printer paper definition
     */
    void setAD_PrintPaper_ID(int AD_PrintPaper_ID);

    I_AD_PrintPaper getAD_PrintPaper() throws RuntimeException;

    /**
     * Get Print Table Format. Table Format in Reports
     */
    int getAD_PrintTableFormat_ID();

    /**
     * Set Print Table Format. Table Format in Reports
     */
    void setAD_PrintTableFormat_ID(int AD_PrintTableFormat_ID);

    I_AD_PrintTableFormat getAD_PrintTableFormat() throws RuntimeException;

    /**
     * Get Report View. View used to generate this report
     */
    int getAD_ReportView_ID();

    /**
     * Set Report View. View used to generate this report
     */
    void setAD_ReportView_ID(int AD_ReportView_ID);

    I_AD_ReportView getAD_ReportView() throws RuntimeException;

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    I_AD_Table getAD_Table() throws RuntimeException;

    /**
     * Get Window. Data entry or display window
     */
    int getAD_Window_ID();

    /**
     * Set Window. Data entry or display window
     */
    void setAD_Window_ID(int AD_Window_ID);

    I_AD_Window getAD_Window() throws RuntimeException;

    /**
     * Get Args
     */
    String getArgs();

    /**
     * Set Args
     */
    void setArgs(String Args);

    /**
     * Get Classname. Java Classname
     */
    String getClassname();

    /**
     * Set Classname. Java Classname
     */
    void setClassname(String Classname);

    /**
     * Get Create Copy
     */
    String getCreateCopy();

    /**
     * Set Create Copy
     */
    void setCreateCopy(String CreateCopy);

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
     * Get Footer Margin. Margin of the Footer in 1/72 of an inch
     */
    int getFooterMargin();

    /**
     * Set Footer Margin. Margin of the Footer in 1/72 of an inch
     */
    void setFooterMargin(int FooterMargin);

    /**
     * Get Header Margin. Margin of the Header in 1/72 of an inch
     */
    int getHeaderMargin();

    /**
     * Set Header Margin. Margin of the Header in 1/72 of an inch
     */
    void setHeaderMargin(int HeaderMargin);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Form. If Selected, a Form is printed, if not selected a columnar List report
     */
    void setIsForm(boolean IsForm);

    /**
     * Get Form. If Selected, a Form is printed, if not selected a columnar List report
     */
    boolean isForm();

    /**
     * Set Standard Header/Footer. The standard Header and Footer is used
     */
    void setIsStandardHeaderFooter(boolean IsStandardHeaderFooter);

    /**
     * Get Standard Header/Footer. The standard Header and Footer is used
     */
    boolean isStandardHeaderFooter();

    /**
     * Set Table Based. Table based List Reporting
     */
    void setIsTableBased(boolean IsTableBased);

    /**
     * Get Table Based. Table based List Reporting
     */
    boolean isTableBased();

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
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Printer Name. Name of the Printer
     */
    String getPrinterName();

    /**
     * Set Printer Name. Name of the Printer
     */
    void setPrinterName(String PrinterName);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
