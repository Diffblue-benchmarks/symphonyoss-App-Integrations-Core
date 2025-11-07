package com.symphony.security.cache;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.exceptions.SymphonyInputException;
import com.symphony.security.exceptions.SymphonyNativeException;
import java.io.UnsupportedEncodingException;
import org.junit.Test;
import org.mockito.Mockito;

public class SecurePersisterDiffblueTest {
  /**
   * Method under test: {@link SecurePersister#close()}
   */
  @Test
  public void testClose() throws SymphonyInputException {
    // Arrange
    InMemoryPersister persister = mock(InMemoryPersister.class);
    doNothing().when(persister).close();

    // Act
    (new SecurePersister(persister, 1L)).close();

    // Assert
    verify(persister).close();
  }

  /**
   * Method under test: {@link SecurePersister#delete(byte[])}
   */
  @Test
  public void testDelete() throws SymphonyInputException, SymphonyNativeException, UnsupportedEncodingException {
    // Arrange
    InMemoryPersister persister = mock(InMemoryPersister.class);
    doNothing().when(persister).delete(Mockito.<byte[]>any());
    SecurePersister securePersister = new SecurePersister(persister, 1L);

    // Act
    securePersister.delete("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    verify(persister).delete(isA(byte[].class));
  }

  /**
   * Method under test: {@link SecurePersister#getType()}
   */
  @Test
  public void testGetType() {
    // Arrange, Act and Assert
    assertEquals("SecurePersister(InMemoryPersister(of size 0))",
        (new SecurePersister(new InMemoryPersister(), 1L)).getType());
    assertEquals("SecurePersister(SecurePersister(InMemoryPersister(of size 0)))",
        (new SecurePersister(new SecurePersister(new InMemoryPersister(), 1L), 1L)).getType());
  }

  /**
   * Method under test: {@link SecurePersister#SecurePersister(IPersister, long)}
   */
  @Test
  public void testNewSecurePersister() {
    // Arrange, Act and Assert
    assertEquals("SecurePersister(InMemoryPersister(of size 0))",
        (new SecurePersister(new InMemoryPersister(), 1L)).getType());
  }

  /**
   * Method under test: {@link SecurePersister#retrieve(byte[])}
   */
  @Test
  public void testRetrieve() throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    SecurePersister securePersister = new SecurePersister(new InMemoryPersister(), 1L);

    // Act and Assert
    assertNull(securePersister.retrieve("AXAXAXAX".getBytes("UTF-8")));
  }

  /**
   * Method under test: {@link SecurePersister#retrieve(byte[])}
   */
  @Test
  public void testRetrieve2() throws SymphonyEncryptionException, SymphonyInputException, UnsupportedEncodingException {
    // Arrange
    SecurePersister securePersister = new SecurePersister(new SecurePersister(new InMemoryPersister(), 1L), 1L);

    // Act and Assert
    assertNull(securePersister.retrieve("AXAXAXAX".getBytes("UTF-8")));
  }
}
