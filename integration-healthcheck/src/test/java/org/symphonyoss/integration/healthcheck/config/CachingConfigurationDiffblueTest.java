package org.symphonyoss.integration.healthcheck.config;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Collection;
import java.util.Set;
import org.junit.Test;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.interceptor.CacheResolver;

public class CachingConfigurationDiffblueTest {
  /**
   * Test {@link CachingConfiguration#cacheManager()}.
   *
   * <ul>
   *   <li>Given {@link CachingConfiguration} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link CachingConfiguration#cacheManager()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"CacheManager CachingConfiguration.cacheManager()"})
  public void testCacheManager_givenCachingConfiguration() {
    // Arrange and Act
    CacheManager actualCacheManagerResult = new CachingConfiguration().cacheManager();

    // Assert
    Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
    assertTrue(cacheNames instanceof Set);
    assertTrue(actualCacheManagerResult instanceof ConcurrentMapCacheManager);
    assertFalse(((ConcurrentMapCacheManager) actualCacheManagerResult).isStoreByValue());
    assertTrue(cacheNames.isEmpty());
    assertTrue(((ConcurrentMapCacheManager) actualCacheManagerResult).isAllowNullValues());
  }

  /**
   * Test {@link CachingConfiguration#cacheResolver(CacheManager)} with {@code CacheManager}.
   *
   * <p>Method under test: {@link CachingConfiguration#cacheResolver(CacheManager)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"CacheResolver CachingConfiguration.cacheResolver(CacheManager)"})
  public void testCacheResolverWithCacheManager() {
    // Arrange
    CachingConfiguration cachingConfiguration = new CachingConfiguration();
    ConcurrentMapCacheManager cacheManager = new ConcurrentMapCacheManager();

    // Act
    CacheResolver actualCacheResolverResult = cachingConfiguration.cacheResolver(cacheManager);

    // Assert
    assertTrue(actualCacheResolverResult instanceof RuntimeCacheResolver);
    assertSame(cacheManager, ((RuntimeCacheResolver) actualCacheResolverResult).getCacheManager());
  }
}
