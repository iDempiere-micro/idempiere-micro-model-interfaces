/**
 *
 */
package org.compiere.model;

import java.sql.Timestamp;

/**
 * Describe Use life Feature
 *
 * @author Teo Sarca, SC Arhipac SRL
 * @version $Id$
 */
public interface UseLife extends SetGetModel {


    Timestamp getAssetServiceDate();
}
