package com.symphony.security.cache;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import java.io.UnsupportedEncodingException;
import org.junit.Test;

public class SecurePersisterDiffblueTest {
  /**
   * Test {@link SecurePersister#getType()}.
   *
   * <ul>
   *   <li>Then return {@code SecurePersister(InMemoryPersister(of size 0))}.
   * </ul>
   *
   * <p>Method under test: {@link SecurePersister#getType()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String SecurePersister.getType()"})
  public void testGetType_thenReturnSecurePersisterInMemoryPersisterOfSize0() {
    // Arrange, Act and Assert
    assertEquals(
        "SecurePersister(InMemoryPersister(of size 0))",
        SecurePersisterFactory.createSecurePersister().getType());
  }

  /**
   * Test {@link SecurePersister#getType()}.
   *
   * <ul>
   *   <li>Then return {@code SecurePersister(SecurePersister(InMemoryPersister(of size 0)))}.
   * </ul>
   *
   * <p>Method under test: {@link SecurePersister#getType()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String SecurePersister.getType()"})
  public void testGetType_thenReturnSecurePersisterSecurePersisterInMemoryPersisterOfSize0() {
    // Arrange, Act and Assert
    assertEquals(
        "SecurePersister(SecurePersister(InMemoryPersister(of size 0)))",
        new SecurePersister(SecurePersisterFactory.createSecurePersister(), 1L).getType());
  }

  /**
   * Test {@link SecurePersister#SecurePersister(IPersister, long)}.
   *
   * <p>Method under test: {@link SecurePersister#SecurePersister(IPersister, long)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void SecurePersister.<init>(IPersister, long)"})
  public void testNewSecurePersister() {
    // Arrange, Act and Assert
    assertEquals(
        "SecurePersister(SecurePersister(InMemoryPersister(of size 0)))",
        new SecurePersister(SecurePersisterFactory.createSecurePersister(), 1L).getType());
  }

  /**
   * Test {@link SecurePersister#retrieve(byte[])}.
   *
   * <p>Method under test: {@link SecurePersister#retrieve(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] SecurePersister.retrieve(byte[])"})
  public void testRetrieve()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange and Act
    byte[] actualRetrieveResult =
        new SecurePersister(SecurePersisterFactory.createSecurePersister(), 1L)
            .retrieve("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertNull(actualRetrieveResult);
  }

  /**
   * Test {@link SecurePersister#retrieve(byte[])}.
   *
   * <ul>
   *   <li>Given createSecurePersister.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SecurePersister#retrieve(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] SecurePersister.retrieve(byte[])"})
  public void testRetrieve_givenCreateSecurePersister_thenReturnNull()
      throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange and Act
    byte[] actualRetrieveResult =
        SecurePersisterFactory.createSecurePersister().retrieve("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertNull(actualRetrieveResult);
  }
}
