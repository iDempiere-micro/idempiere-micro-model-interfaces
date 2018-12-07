package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Color
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Color {

  /** TableName=AD_Color */
  String Table_Name = "AD_Color";

  /** AD_Table_ID=457 */
  int Table_ID = 457;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Color_ID */
  String COLUMNNAME_AD_Color_ID = "AD_Color_ID";
  /** Column name AD_Color_UU */
  String COLUMNNAME_AD_Color_UU = "AD_Color_UU";
  /** Column name AD_Image_ID */
  String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Alpha */
  String COLUMNNAME_Alpha = "Alpha";
  /** Column name Alpha_1 */
  String COLUMNNAME_Alpha_1 = "Alpha_1";
  /** Column name Blue */
  String COLUMNNAME_Blue = "Blue";
  /** Column name Blue_1 */
  String COLUMNNAME_Blue_1 = "Blue_1";
  /** Column name ColorType */
  String COLUMNNAME_ColorType = "ColorType";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Green */
  String COLUMNNAME_Green = "Green";
  /** Column name Green_1 */
  String COLUMNNAME_Green_1 = "Green_1";
  /** Column name ImageAlpha */
  String COLUMNNAME_ImageAlpha = "ImageAlpha";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name LineDistance */
  String COLUMNNAME_LineDistance = "LineDistance";
  /** Column name LineWidth */
  String COLUMNNAME_LineWidth = "LineWidth";
  /** Column name Red */
  String COLUMNNAME_Red = "Red";
  /** Column name Red_1 */
  String COLUMNNAME_Red_1 = "Red_1";
  /** Column name RepeatDistance */
  String COLUMNNAME_RepeatDistance = "RepeatDistance";
  /** Column name StartPoint */
  String COLUMNNAME_StartPoint = "StartPoint";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get System Color. Color for backgrounds or indicators */
  int getAD_Color_ID();

  /** Set System Color. Color for backgrounds or indicators */
  void setAD_Color_ID(int AD_Color_ID);

  /** Get AD_Color_UU */
  String getAD_Color_UU();

  /** Set AD_Color_UU */
  void setAD_Color_UU(String AD_Color_UU);

  /** Get Image. Image or Icon */
  int getAD_Image_ID();

  /** Set Image. Image or Icon */
  void setAD_Image_ID(int AD_Image_ID);

  I_AD_Image getAD_Image() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Alpha. Color Alpha value 0-255 */
  int getAlpha();

  /** Set Alpha. Color Alpha value 0-255 */
  void setAlpha(int Alpha);

  /** Get 2nd Alpha. Alpha value for second color */
  int getAlpha_1();

  /** Set 2nd Alpha. Alpha value for second color */
  void setAlpha_1(int Alpha_1);

  /** Get Blue. Color RGB blue value */
  int getBlue();

  /** Set Blue. Color RGB blue value */
  void setBlue(int Blue);

  /** Get 2nd Blue. RGB value for second color */
  int getBlue_1();

  /** Set 2nd Blue. RGB value for second color */
  void setBlue_1(int Blue_1);

  /** Get Color Type. Color presentation for this color */
  String getColorType();

  /** Set Color Type. Color presentation for this color */
  void setColorType(String ColorType);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Green. RGB value */
  int getGreen();

  /** Set Green. RGB value */
  void setGreen(int Green);

  /** Get 2nd Green. RGB value for second color */
  int getGreen_1();

  /** Set 2nd Green. RGB value for second color */
  void setGreen_1(int Green_1);

  /** Get Image Alpha . Image Texture Composite Alpha */
  BigDecimal getImageAlpha();

  /** Set Image Alpha . Image Texture Composite Alpha */
  void setImageAlpha(BigDecimal ImageAlpha);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Default. Default value */
  void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  boolean isDefault();

  /** Get Line Distance. Distance between lines */
  int getLineDistance();

  /** Set Line Distance. Distance between lines */
  void setLineDistance(int LineDistance);

  /** Get Line Width. Width of the lines */
  int getLineWidth();

  /** Set Line Width. Width of the lines */
  void setLineWidth(int LineWidth);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Red. RGB value */
  int getRed();

  /** Set Red. RGB value */
  void setRed(int Red);

  /** Get 2nd Red. RGB value for second color */
  int getRed_1();

  /** Set 2nd Red. RGB value for second color */
  void setRed_1(int Red_1);

  /** Get Repeat Distance. Distance in points to repeat gradient color - or zero */
  int getRepeatDistance();

  /** Set Repeat Distance. Distance in points to repeat gradient color - or zero */
  void setRepeatDistance(int RepeatDistance);

  /** Get Start Point. Start point of the gradient colors */
  String getStartPoint();

  /** Set Start Point. Start point of the gradient colors */
  void setStartPoint(String StartPoint);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
