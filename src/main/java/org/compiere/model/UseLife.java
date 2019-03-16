/**
 *
 */
package org.compiere.model;

import java.sql.Timestamp;
import java.util.Properties;

/**
 * Describe Use life Feature
 *
 * @author Teo Sarca, SC Arhipac SRL
 * @version $Id$
 */
public interface UseLife extends SetGetModel {
    Properties getCtx();

    Timestamp getAssetServiceDate();
}
