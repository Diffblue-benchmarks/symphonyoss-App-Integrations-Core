package org.symphonyoss.integration.healthcheck.config;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;

public class RuntimeCacheResolverDiffblueTest {
  /**
   * Test {@link RuntimeCacheResolver#RuntimeCacheResolver(CacheManager)}.
   *
   * <p>Method under test: {@link RuntimeCacheResolver#RuntimeCacheResolver(CacheManager)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void RuntimeCacheResolver.<init>(CacheManager)"})
  public void testNewRuntimeCacheResolver() {
    // Arrange
    ConcurrentMapCacheManager cacheManager = new ConcurrentMapCacheManager();

    // Act and Assert
    assertSame(cacheManager, new RuntimeCacheResolver(cacheManager).getCacheManager());
  }
}
