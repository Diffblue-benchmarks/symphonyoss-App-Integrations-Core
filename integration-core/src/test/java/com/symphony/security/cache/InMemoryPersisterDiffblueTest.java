package com.symphony.security.cache;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.junit.Test;

public class InMemoryPersisterDiffblueTest {
  /**
   * Test {@link InMemoryPersister#getType()}.
   *
   * <p>Method under test: {@link InMemoryPersister#getType()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String InMemoryPersister.getType()"})
  public void testGetType() {
    // Arrange, Act and Assert
    assertEquals("InMemoryPersister(of size 0)", new InMemoryPersister().getType());
  }

  /**
   * Test new {@link InMemoryPersister} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link InMemoryPersister}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void InMemoryPersister.<init>()"})
  public void testNewInMemoryPersister() {
    // Arrange, Act and Assert
    assertTrue(new InMemoryPersister().persister.isEmpty());
  }

  /**
   * Test {@link InMemoryPersister#persist(byte[], byte[])}.
   *
   * <p>Method under test: {@link InMemoryPersister#persist(byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void InMemoryPersister.persist(byte[], byte[])"})
  public void testPersist() throws UnsupportedEncodingException {
    // Arrange
    InMemoryPersister inMemoryPersister = new InMemoryPersister();
    byte[] bufId = "AXAXAXAX".getBytes("UTF-8");

    // Act
    inMemoryPersister.persist(bufId, "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals("InMemoryPersister(of size 1)", inMemoryPersister.getType());
    Map<String, byte[]> stringByteArrayMap = inMemoryPersister.persister;
    assertEquals(1, stringByteArrayMap.size());
    byte[] expectedGetResult = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedGetResult, stringByteArrayMap.get("QVhBWEFYQVg="));
  }

  /**
   * Test {@link InMemoryPersister#retrieve(byte[])}.
   *
   * <p>Method under test: {@link InMemoryPersister#retrieve(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] InMemoryPersister.retrieve(byte[])"})
  public void testRetrieve() throws UnsupportedEncodingException {
    // Arrange
    InMemoryPersister inMemoryPersister = new InMemoryPersister();

    // Act and Assert
    assertNull(inMemoryPersister.retrieve("AXAXAXAX".getBytes("UTF-8")));
  }
}
