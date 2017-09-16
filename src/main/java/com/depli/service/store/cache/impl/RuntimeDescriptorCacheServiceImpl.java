package com.depli.service.store.cache.impl;

import com.depli.service.store.cache.RuntimeDescriptorCacheService;
import com.depli.store.cache.descriptor.RuntimeDescriptor;
import org.infinispan.Cache;
import org.infinispan.spring.provider.SpringEmbeddedCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.depli.constant.CacheName.RUNTIME_DESCRIPTOR_CACHE;

/**
 * Runtime descriptor cache service implementation.
 *
 * @author lpsandaruwan
 * @since 9/16/17
 */

@Service
public class RuntimeDescriptorCacheServiceImpl implements RuntimeDescriptorCacheService {

    @Autowired
    private SpringEmbeddedCacheManager springEmbeddedCacheManager;

    @Override
    public Cache<Long, RuntimeDescriptor> getCache() {
        return springEmbeddedCacheManager.getNativeCacheManager().getCache(RUNTIME_DESCRIPTOR_CACHE);
    }

    @Override
    public void clearCache() {
        springEmbeddedCacheManager.getCache(RUNTIME_DESCRIPTOR_CACHE).clear();
    }
}
