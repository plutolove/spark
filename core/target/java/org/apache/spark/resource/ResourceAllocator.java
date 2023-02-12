package org.apache.spark.resource;
/**
 * Map from an address to its availability, a value > 0 means the address is available,
 * while value of 0 means the address is fully assigned.
 * <p>
 * For task resources ({@link org.apache.spark.scheduler.ExecutorResourceInfo}), this value
 * can be a multiple, such that each address can be allocated up to {@link slotsPerAddress}
 * times.
 * <p>
 * TODO Use {@link OpenHashMap} instead to gain better performance.
 */
public  interface ResourceAllocator {
  /**
   * Acquire a sequence of resource addresses (to a launched task), these addresses must be
   * available. When the task finishes, it will return the acquired resource addresses.
   * Throw an Exception if an address is not available or doesn't exist.
   * @param addrs (undocumented)
   */
  public  void acquire (scala.collection.Seq<java.lang.String> addrs)  ;
  /**
   * Sequence of currently assigned resource addresses.
   * <p>
   * With {@link slotsPerAddress} greater than 1, {@link assignedAddrs} can contain duplicate addresses
   * e.g. with {@link slotsPerAddress} == 2, assignedAddrs for addresses 0 and 1 can look like
   * Seq("0", "1", "1"), where address 0 was assigned once, and 1 was assigned twice.
   * @return (undocumented)
   */
    scala.collection.Seq<java.lang.String> assignedAddrs ()  ;
  /**
   * Sequence of currently available resource addresses.
   * <p>
   * With {@link slotsPerAddress} greater than 1, {@link availableAddrs} can contain duplicate addresses
   * e.g. with {@link slotsPerAddress} == 2, availableAddrs for addresses 0 and 1 can look like
   * Seq("0", "0", "1"), where address 0 has two assignments available, and 1 has one.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> availableAddrs ()  ;
  /**
   * Release a sequence of resource addresses, these addresses must have been assigned. Resource
   * addresses are released when a task has finished.
   * Throw an Exception if an address is not assigned or doesn't exist.
   * @param addrs (undocumented)
   */
  public  void release (scala.collection.Seq<java.lang.String> addrs)  ;
  public  scala.collection.Seq<java.lang.String> resourceAddresses ()  ;
  public  java.lang.String resourceName ()  ;
  public  int slotsPerAddress ()  ;
}
