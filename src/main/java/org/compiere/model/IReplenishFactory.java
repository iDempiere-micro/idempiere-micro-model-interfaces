package org.compiere.model;

public interface IReplenishFactory {

  /**
   * @param className
   * @return Replenish instance
   */
  public ReplenishInterface newReplenishInstance(String className);
}
