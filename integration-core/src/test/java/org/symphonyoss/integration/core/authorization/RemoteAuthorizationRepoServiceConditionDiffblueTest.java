package org.symphonyoss.integration.core.authorization;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import org.junit.Test;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.StandardAnnotationMetadata;

public class RemoteAuthorizationRepoServiceConditionDiffblueTest {
  /**
   * Method under test:
   * {@link RemoteAuthorizationRepoServiceCondition#matches(ConditionContext, AnnotatedTypeMetadata)}
   */
  @Test
  public void testMatches() {
    // Arrange
    RemoteAuthorizationRepoServiceCondition remoteAuthorizationRepoServiceCondition = new RemoteAuthorizationRepoServiceCondition();
    ConditionContext conditionContext = mock(ConditionContext.class);
    Class<Object> introspectedClass = Object.class;

    // Act and Assert
    assertTrue(remoteAuthorizationRepoServiceCondition.matches(conditionContext,
        new StandardAnnotationMetadata(introspectedClass)));
  }
}
