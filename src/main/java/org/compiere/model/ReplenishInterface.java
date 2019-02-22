package org.compiere.model;

import java.math.BigDecimal;

/**
 * Custom Replenishment Interface
 *
 * @author Jorg Janke
 * @version $Id: ReplenishInterface.java,v 1.2 2006/07/30 00:51:05 jjanke Exp $
 */
public interface ReplenishInterface {

    /**
     * Return the Qty To Order
     *
     * @param wh        warehouse
     * @param replenish temporary replenishment
     * @return qty to order
     */
    public BigDecimal getQtyToOrder(I_M_Warehouse wh, I_T_Replenish replenish);
} //	ReplenishmentInterface
