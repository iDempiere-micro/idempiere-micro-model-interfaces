package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_PasswordRule
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PasswordRule {

    /**
     * TableName=AD_PasswordRule
     */
    String Table_Name = "AD_PasswordRule";

    /**
     * AD_Table_ID=200005
     */
    int Table_ID = 200005;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_PasswordRule_ID
     */
    String COLUMNNAME_AD_PasswordRule_ID = "AD_PasswordRule_ID";
    /**
     * Column name AD_PasswordRule_UU
     */
    String COLUMNNAME_AD_PasswordRule_UU = "AD_PasswordRule_UU";
    /**
     * Column name AlphabeticalCharacter
     */
    String COLUMNNAME_AlphabeticalCharacter = "AlphabeticalCharacter";
    /**
     * Column name AlphabeticalSequence
     */
    String COLUMNNAME_AlphabeticalSequence = "AlphabeticalSequence";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Days_Reuse_Password
     */
    String COLUMNNAME_Days_Reuse_Password = "Days_Reuse_Password";
    /**
     * Column name DigitCharacter
     */
    String COLUMNNAME_DigitCharacter = "DigitCharacter";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDictMatchBackwards
     */
    String COLUMNNAME_IsDictMatchBackwards = "IsDictMatchBackwards";
    /**
     * Column name IsUserNameRule
     */
    String COLUMNNAME_IsUserNameRule = "IsUserNameRule";
    /**
     * Column name IsUsingDictionary
     */
    String COLUMNNAME_IsUsingDictionary = "IsUsingDictionary";
    /**
     * Column name IsWhitespace
     */
    String COLUMNNAME_IsWhitespace = "IsWhitespace";
    /**
     * Column name LowercaseCharacter
     */
    String COLUMNNAME_LowercaseCharacter = "LowercaseCharacter";
    /**
     * Column name MaxLength
     */
    String COLUMNNAME_MaxLength = "MaxLength";
    /**
     * Column name MinLength
     */
    String COLUMNNAME_MinLength = "MinLength";
    /**
     * Column name NonAlphaNumericCharacter
     */
    String COLUMNNAME_NonAlphaNumericCharacter = "NonAlphaNumericCharacter";
    /**
     * Column name NumericalSequence
     */
    String COLUMNNAME_NumericalSequence = "NumericalSequence";
    /**
     * Column name PathDictionary
     */
    String COLUMNNAME_PathDictionary = "PathDictionary";
    /**
     * Column name QWERTYSequence
     */
    String COLUMNNAME_QWERTYSequence = "QWERTYSequence";
    /**
     * Column name RepeatCharacterRegex
     */
    String COLUMNNAME_RepeatCharacterRegex = "RepeatCharacterRegex";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name UppercaseCharacter
     */
    String COLUMNNAME_UppercaseCharacter = "UppercaseCharacter";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Password Policies
     */
    void setAD_PasswordRule_ID(int AD_PasswordRule_ID);

    /**
     * Get Password Policies
     */
    int getADPasswordRule_ID();

    /**
     * Set AD_PasswordRule_UU
     */
    void setAD_PasswordRule_UU(String AD_PasswordRule_UU);

    /**
     * Get AD_PasswordRule_UU
     */
    String getADPasswordRule_UU();

    /**
     * Get Alphabetical Character. Require at least # alphabetical in passwords
     */
    int getAlphabeticalCharacter();

    /**
     * Set Alphabetical Character. Require at least # alphabetical in passwords
     */
    void setAlphabeticalCharacter(int AlphabeticalCharacter);

    /**
     * Get Alphabetical Sequence. Lenght of alphabetical sequence to validate
     */
    int getAlphabeticalSequence();

    /**
     * Set Alphabetical Sequence. Lenght of alphabetical sequence to validate
     */
    void setAlphabeticalSequence(int AlphabeticalSequence);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Days Reuse Password. Define number of day can reuser password
     */
    int getDays_Reuse_Password();

    /**
     * Set Days Reuse Password. Define number of day can reuser password
     */
    void setDays_Reuse_Password(int Days_Reuse_Password);

    /**
     * Get Digit Character. Require at least # digit in passwords
     */
    int getDigitCharacter();

    /**
     * Set Digit Character. Require at least # digit in passwords
     */
    void setDigitCharacter(int DigitCharacter);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Match Backwards of Dictionary. Match dictionary words backwards
     */
    void setIsDictMatchBackwards(boolean IsDictMatchBackwards);

    /**
     * Get Match Backwards of Dictionary. Match dictionary words backwards
     */
    boolean isDictMatchBackwards();

    /**
     * Set User Name Rule. Validate the password doesn't contain user name (ignore case and match
     * backwards)
     */
    void setIsUserNameRule(boolean IsUserNameRule);

    /**
     * Get User Name Rule. Validate the password doesn't contain user name (ignore case and match
     * backwards)
     */
    boolean isUserNameRule();

    /**
     * Set Using Dictionary
     */
    void setIsUsingDictionary(boolean IsUsingDictionary);

    /**
     * Get Using Dictionary
     */
    boolean isUsingDictionary();

    /**
     * Set Whitespace. Whitespace validation
     */
    void setIsWhitespace(boolean IsWhitespace);

    /**
     * Get Whitespace. Whitespace validation
     */
    boolean isWhitespace();

    /**
     * Get Lowercase Character. Require at least # lower case char
     */
    int getLowercaseCharacter();

    /**
     * Set Lowercase Character. Require at least # lower case char
     */
    void setLowercaseCharacter(int LowercaseCharacter);

    /**
     * Get Maximum Length. Maximum Length of Data
     */
    int getMaxLength();

    /**
     * Set Maximum Length. Maximum Length of Data
     */
    void setMaxLength(int MaxLength);

    /**
     * Get Minimum Length
     */
    int getMinLength();

    /**
     * Set Minimum Length
     */
    void setMinLength(int MinLength);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Non Alpha Numeric Character. Require at least # non-alphanumeric char
     */
    int getNonAlphaNumericCharacter();

    /**
     * Set Non Alpha Numeric Character. Require at least # non-alphanumeric char
     */
    void setNonAlphaNumericCharacter(int NonAlphaNumericCharacter);

    /**
     * Get Numerical Sequence. Length of numerical sequence to validate
     */
    int getNumericalSequence();

    /**
     * Set Numerical Sequence. Length of numerical sequence to validate
     */
    void setNumericalSequence(int NumericalSequence);

    /**
     * Get Path Dictionary
     */
    String getPathDictionary();

    /**
     * Set Path Dictionary
     */
    void setPathDictionary(String PathDictionary);

    /**
     * Get QWERTY Sequence. Lenght of QWERTY sequences to validate
     */
    int getQWERTYSequence();

    /**
     * Set QWERTY Sequence. Lenght of QWERTY sequences to validate
     */
    void setQWERTYSequence(int QWERTYSequence);

    /**
     * Get Repeat Character Regex. Length of repeated characters to validate
     */
    int getRepeatCharacterRegex();

    /**
     * Set Repeat Character Regex. Length of repeated characters to validate
     */
    void setRepeatCharacterRegex(int RepeatCharacterRegex);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Uppercase Character. Require at least # upper case char
     */
    int getUppercaseCharacter();

    /**
     * Set Uppercase Character. Require at least # upper case char
     */
    void setUppercaseCharacter(int UppercaseCharacter);
}
