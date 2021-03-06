package com.depli.service.store.cache.descriptor;

import com.depli.store.cache.descriptor.ClassLoadingDescriptor;
import org.infinispan.Cache;

/**
 * Class Loading Data descriptor cache service
 *
 * Service to retrieve and clear the cache which contains class loading data descriptors.
 *
 * @author lpsandaruwan
 * @since 9/11/17
 */

public interface ClassLoadingDescriptorCacheService {

  /**
   * Returns infinispan cache which uses to store and retrieve class loading data
   * descriptors mapped by the Long values, node IDs related to remote JMX connections
   * which are generated by hibernate.
   *
   * @return class loading data descriptor cache
   */
  public Cache<Long, ClassLoadingDescriptor> getCache();

  /**
   * Clears the cache which contains the map of Long values, node IDs related to
   * remote JMX connections which are generated by hibernate and class loading data
   * descriptors.
   */
  public void clearCache();
}
