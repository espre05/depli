package com.depli.service.store.graph;

import com.depli.store.cache.graph.ProcessingUnitGraphData;

/**
 * Processing unit graph data service
 *
 * Provides service to manage processing unit graph data cache and to consume
 * manipulated data from cache.
 *
 * @author lpsandaruwan
 * @since 9/19/17
 */

public interface ProcessingUnitGraphDataService {

  /**
   * Retrieves ProcessingUnitGraphData object from CPU graph data object cache
   * using Long value, nodeId which is generated by application when persisting JMX remote
   * connection node's metadata.
   *
   * @param nodeId node ID of the JMX remote connection
   * @return CPU graph data object for particular node ID
   */
  public ProcessingUnitGraphData getByNodeId(Long nodeId);

  /**
   * Stores thread descriptor object in CPU graph data object cache
   * using Long value, nodeId which is generated by application when persisting JMX remote
   * connection node's metadata.
   *
   * @param nodeId node ID of the JMX remote connection
   * @param processingUnitGraphData CPU graph data object for particular node ID
   */
  public void save(Long nodeId, ProcessingUnitGraphData processingUnitGraphData);
}