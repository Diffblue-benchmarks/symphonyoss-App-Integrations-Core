package org.symphonyoss.integration.healthcheck.config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.interceptor.BasicOperation;
import org.springframework.cache.interceptor.CacheOperationInvocationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {RuntimeCacheResolver.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class RuntimeCacheResolverDiffblueTest {
  @MockBean
  private CacheManager cacheManager;

  @Autowired
  private RuntimeCacheResolver runtimeCacheResolver;

  /**
   * Method under test:
   * {@link RuntimeCacheResolver#getCacheNames(CacheOperationInvocationContext)}
   */
  @Test
  public void testGetCacheNames() {
    // Arrange
    CacheOperationInvocationContext<BasicOperation> context = mock(CacheOperationInvocationContext.class);
    when(context.getTarget()).thenReturn("Target");

    // Act
    Collection<String> actualCacheNames = runtimeCacheResolver.getCacheNames(context);

    // Assert
    verify(context).getTarget();
    assertTrue(actualCacheNames instanceof List);
    assertEquals(1, actualCacheNames.size());
    assertEquals("String", ((List<String>) actualCacheNames).get(0));
  }

  /**
   * Method under test:
   * {@link RuntimeCacheResolver#RuntimeCacheResolver(CacheManager)}
   */
  @Test
  public void testNewRuntimeCacheResolver() {
    // Arrange
    ConcurrentMapCacheManager cacheManager = new ConcurrentMapCacheManager();

    // Act and Assert
    assertSame(cacheManager, (new RuntimeCacheResolver(cacheManager)).getCacheManager());
  }
}
