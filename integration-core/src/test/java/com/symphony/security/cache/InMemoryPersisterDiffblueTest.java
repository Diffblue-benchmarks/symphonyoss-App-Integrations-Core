package com.symphony.security.cache;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.junit.Test;

public class InMemoryPersisterDiffblueTest {
  /**
   * Method under test: {@link InMemoryPersister#getType()}
   */
  @Test
  public void testGetType() {
    // Arrange, Act and Assert
    assertEquals("InMemoryPersister(of size 0)", (new InMemoryPersister()).getType());
  }

  /**
   * Method under test: default or parameterless constructor of
   * {@link InMemoryPersister}
   */
  @Test
  public void testNewInMemoryPersister() {
    // Arrange, Act and Assert
    assertTrue((new InMemoryPersister()).persister.isEmpty());
  }

  /**
   * Method under test: {@link InMemoryPersister#persist(byte[], byte[])}
   */
  @Test
  public void testPersist() throws UnsupportedEncodingException {
    // Arrange
    InMemoryPersister inMemoryPersister = new InMemoryPersister();
    byte[] bufId = "AXAXAXAX".getBytes("UTF-8");
    byte[] in = "AXAXAXAX".getBytes("UTF-8");

    // Act
    inMemoryPersister.persist(bufId, in);

    // Assert
    assertEquals("InMemoryPersister(of size 1)", inMemoryPersister.getType());
    Map<String, byte[]> stringByteArrayMap = inMemoryPersister.persister;
    assertEquals(1, stringByteArrayMap.size());
    assertSame(in, stringByteArrayMap.get("QVhBWEFYQVg="));
  }

  /**
   * Method under test: {@link InMemoryPersister#retrieve(byte[])}
   */
  @Test
  public void testRetrieve() throws UnsupportedEncodingException {
    // Arrange
    InMemoryPersister inMemoryPersister = new InMemoryPersister();

    // Act and Assert
    assertNull(inMemoryPersister.retrieve("AXAXAXAX".getBytes("UTF-8")));
  }
}
