package com.symphony.security.clientsdk.search;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class ClientTokenizer_v2DiffblueTest {
  /**
   * Method under test:
   * {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}
   */
  @Test
  public void testGetHashedTokens() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange
    ClientTokenizer_v2 clientTokenizer_v2 = new ClientTokenizer_v2();
    ArrayList<String> plainTokens = new ArrayList<>();

    // Act and Assert
    assertTrue(clientTokenizer_v2.getHashedTokens(plainTokens, "AXAXAXAX".getBytes("UTF-8"), 1L).isEmpty());
  }

  /**
   * Method under test:
   * {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}
   */
  @Test
  public void testGetHashedTokens2()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange, Act and Assert
    assertTrue((new ClientTokenizer_v2()).getHashedTokens(null, null, 0L).isEmpty());
  }

  /**
   * Method under test:
   * {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}
   */
  @Test
  public void testGetHashedTokens3()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange
    ClientTokenizer_v2 clientTokenizer_v2 = new ClientTokenizer_v2();

    ArrayList<String> plainTokens = new ArrayList<>();
    plainTokens.add("foo");

    // Act
    Set<String> actualHashedTokens = clientTokenizer_v2.getHashedTokens(plainTokens, "AXAXAXAX".getBytes("UTF-8"), 1L);

    // Assert
    assertEquals(1, actualHashedTokens.size());
    assertTrue(actualHashedTokens.contains("1nrb9IUj53PZTBPzgRh+eQJijQnrM8r7thjawqky2e8="));
  }

  /**
   * Method under test:
   * {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}
   */
  @Test
  public void testGetHashedTokens4()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange
    ClientTokenizer_v2 clientTokenizer_v2 = new ClientTokenizer_v2();

    ArrayList<String> plainTokens = new ArrayList<>();
    plainTokens.add("HmacSHA256");
    plainTokens.add("foo");

    // Act
    Set<String> actualHashedTokens = clientTokenizer_v2.getHashedTokens(plainTokens, "AXAXAXAX".getBytes("UTF-8"), 1L);

    // Assert
    assertEquals(2, actualHashedTokens.size());
    assertTrue(actualHashedTokens.contains("1nrb9IUj53PZTBPzgRh+eQJijQnrM8r7thjawqky2e8="));
    assertTrue(actualHashedTokens.contains("n1rBxLr4674yCo284SPjOpJNGL+QPFntSTHSQxuaDFQ="));
  }

  /**
   * Method under test:
   * {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}
   */
  @Test
  public void testGetHashedTokens5()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange
    ClientTokenizer_v2 clientTokenizer_v2 = new ClientTokenizer_v2();

    ArrayList<String> plainTokens = new ArrayList<>();
    plainTokens.add("foo");

    // Act
    Set<String> actualHashedTokens = clientTokenizer_v2.getHashedTokens(plainTokens, null, 1L);

    // Assert
    assertEquals(1, actualHashedTokens.size());
    assertTrue(actualHashedTokens.contains(null));
  }

  /**
   * Method under test:
   * {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}
   */
  @Test
  public void testGetHashedTokens6()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange
    ClientTokenizer_v2 clientTokenizer_v2 = new ClientTokenizer_v2();

    ArrayList<String> plainTokens = new ArrayList<>();
    plainTokens.add("foo");

    // Act
    Set<String> actualHashedTokens = clientTokenizer_v2.getHashedTokens(plainTokens, new byte[]{}, 1L);

    // Assert
    assertEquals(1, actualHashedTokens.size());
    assertTrue(actualHashedTokens.contains(null));
  }

  /**
   * Method under test: {@link ClientTokenizer_v2#getPlainTokens(String)}
   */
  @Test
  public void testGetPlainTokens() {
    // Arrange and Act
    Set<String> actualPlainTokens = (new ClientTokenizer_v2()).getPlainTokens("Input");

    // Assert
    assertEquals(1, actualPlainTokens.size());
    assertTrue(actualPlainTokens.contains("input"));
  }

  /**
   * Method under test: {@link ClientTokenizer_v2#getPlainTokens(String)}
   */
  @Test
  public void testGetPlainTokens2() {
    // Arrange, Act and Assert
    assertTrue((new ClientTokenizer_v2()).getPlainTokens(null).isEmpty());
  }

  /**
   * Method under test: {@link ClientTokenizer_v2#getPlainTokens(String)}
   */
  @Test
  public void testGetPlainTokens3() {
    // Arrange and Act
    Set<String> actualPlainTokens = (new ClientTokenizer_v2()).getPlainTokens("\\s+");

    // Assert
    assertEquals(1, actualPlainTokens.size());
    assertTrue(actualPlainTokens.contains("s"));
  }

  /**
   * Method under test: {@link ClientTokenizer_v2#getSalt(byte[])}
   */
  @Test
  public void testGetSalt() throws UnsupportedEncodingException, NoSuchAlgorithmException {
    // Arrange
    ClientTokenizer_v2 clientTokenizer_v2 = new ClientTokenizer_v2();

    // Act and Assert
    assertArrayEquals(
        new byte[]{'\\', '[', 'b', '\t', -40, 'g', -88, -64, ' ', -22, '\r', 'u', -94, '/', -77, -52, -10, 'l', -76,
            -40, -118, 'K', 'S', -32, 1, -31, '9', -113, 26, '`', -70, -36},
        clientTokenizer_v2.getSalt("AXAXAXAX".getBytes("UTF-8")));
  }

  /**
   * Method under test: {@link ClientTokenizer_v2#hashHMAC256B64(String, byte[])}
   */
  @Test
  public void testHashHMAC256B64() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange, Act and Assert
    assertEquals("WJ7PfnhLIQxcpO5XWIgSLJMpyMHKL54NmVkrkQ6E/UQ=",
        ClientTokenizer_v2.hashHMAC256B64("ABC123", "AXAXAXAX".getBytes("UTF-8")));
    assertNull(ClientTokenizer_v2.hashHMAC256B64("ABC123", null));
    assertNull(ClientTokenizer_v2.hashHMAC256B64("ABC123", new byte[]{}));
  }

  /**
   * Method under test:
   * {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}
   */
  @Test
  public void testTokenize() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange
    ClientTokenizer_v2 clientTokenizer_v2 = new ClientTokenizer_v2();
    ArrayList<String> hashtags = new ArrayList<>();
    byte[] privateContentKey = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    assertEquals(1,
        clientTokenizer_v2.tokenize("Text", hashtags, privateContentKey, "AXAXAXAX".getBytes("UTF-8"), 1L).size());
  }

  /**
   * Method under test:
   * {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}
   */
  @Test
  public void testTokenize2() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange, Act and Assert
    assertTrue(
        (new ClientTokenizer_v2())
            .tokenize(null, null, new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
                new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, 0L)
            .isEmpty());
  }

  /**
   * Method under test:
   * {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}
   */
  @Test
  public void testTokenize3() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange
    ClientTokenizer_v2 clientTokenizer_v2 = new ClientTokenizer_v2();
    ArrayList<String> hashtags = new ArrayList<>();
    byte[] privateContentKey = "AXAXAXAX".getBytes("UTF-8");

    // Act
    List<String> actualTokenizeResult = clientTokenizer_v2.tokenize("\\s+", hashtags, privateContentKey,
        "AXAXAXAX".getBytes("UTF-8"), 1L);

    // Assert
    assertEquals(1, actualTokenizeResult.size());
    assertEquals("gHHZpvVa1mz6z8rSH5VQbJGuwqmUfsoD25aGzd3ypwI=", actualTokenizeResult.get(0));
  }

  /**
   * Method under test:
   * {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}
   */
  @Test
  public void testTokenize4() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange
    ClientTokenizer_v2 clientTokenizer_v2 = new ClientTokenizer_v2();

    ArrayList<String> hashtags = new ArrayList<>();
    hashtags.add(" ");
    byte[] privateContentKey = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    assertEquals(2,
        clientTokenizer_v2.tokenize("Text", hashtags, privateContentKey, "AXAXAXAX".getBytes("UTF-8"), 1L).size());
  }

  /**
   * Method under test:
   * {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}
   */
  @Test
  public void testTokenize5() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange
    ClientTokenizer_v2 clientTokenizer_v2 = new ClientTokenizer_v2();

    ArrayList<String> hashtags = new ArrayList<>();
    hashtags.add("SHA-256");
    hashtags.add(" ");
    byte[] privateContentKey = "AXAXAXAX".getBytes("UTF-8");

    // Act and Assert
    assertEquals(3,
        clientTokenizer_v2.tokenize("Text", hashtags, privateContentKey, "AXAXAXAX".getBytes("UTF-8"), 1L).size());
  }
}
