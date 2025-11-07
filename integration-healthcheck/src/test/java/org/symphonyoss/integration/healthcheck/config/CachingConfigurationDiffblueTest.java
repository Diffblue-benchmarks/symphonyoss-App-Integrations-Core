package org.symphonyoss.integration.healthcheck.config;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import java.util.Collection;
import java.util.Set;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {CachingConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class CachingConfigurationDiffblueTest {
  @Autowired
  private CachingConfiguration cachingConfiguration;

  /**
   * Method under test: {@link CachingConfiguration#cacheManager()}
   */
  @Test
  public void testCacheManager() {
    // Arrange and Act
    CacheManager actualCacheManagerResult = cachingConfiguration.cacheManager();

    // Assert
    Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
    assertTrue(cacheNames instanceof Set);
    assertTrue(actualCacheManagerResult instanceof ConcurrentMapCacheManager);
    assertFalse(((ConcurrentMapCacheManager) actualCacheManagerResult).isStoreByValue());
    assertTrue(cacheNames.isEmpty());
    assertTrue(((ConcurrentMapCacheManager) actualCacheManagerResult).isAllowNullValues());
  }

  /**
   * Method under test: {@link CachingConfiguration#cacheResolver(CacheManager)}
   */
  @Test
  public void testCacheResolver() {
    // Arrange and Act
    CacheResolver actualCacheResolverResult = cachingConfiguration.cacheResolver(new ConcurrentMapCacheManager());

    // Assert
    CacheManager cacheManager = ((RuntimeCacheResolver) actualCacheResolverResult).getCacheManager();
    Collection<String> cacheNames = cacheManager.getCacheNames();
    assertTrue(cacheNames instanceof Set);
    assertTrue(cacheManager instanceof ConcurrentMapCacheManager);
    assertTrue(actualCacheResolverResult instanceof RuntimeCacheResolver);
    assertFalse(((ConcurrentMapCacheManager) cacheManager).isStoreByValue());
    assertTrue(cacheNames.isEmpty());
    assertTrue(((ConcurrentMapCacheManager) cacheManager).isAllowNullValues());
  }

  /**
   * Method under test: {@link CachingConfiguration#cacheResolver(CacheManager)}
   */
  @Test
  public void testCacheResolver2() {
    // Arrange and Act
    CacheResolver actualCacheResolverResult = cachingConfiguration.cacheResolver(mock(CacheManager.class));

    // Assert
    CacheManager cacheManager = ((RuntimeCacheResolver) actualCacheResolverResult).getCacheManager();
    Collection<String> cacheNames = cacheManager.getCacheNames();
    assertTrue(cacheNames instanceof Set);
    assertTrue(cacheManager instanceof ConcurrentMapCacheManager);
    assertTrue(actualCacheResolverResult instanceof RuntimeCacheResolver);
    assertFalse(((ConcurrentMapCacheManager) cacheManager).isStoreByValue());
    assertTrue(cacheNames.isEmpty());
    assertTrue(((ConcurrentMapCacheManager) cacheManager).isAllowNullValues());
  }
}
