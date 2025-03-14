package com.symphony.security.clientsdk.search;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
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
   * Test {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When empty array of {@code byte}.</li>
   *   <li>Then return contains {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}
   */
  @Test
  @MethodsUnderTest({"Set ClientTokenizer_v2.getHashedTokens(Collection, byte[], long)"})
  public void testGetHashedTokens_givenFoo_whenEmptyArrayOfByte_thenReturnContainsNull()
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
   * Test {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return contains {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}
   */
  @Test
  @MethodsUnderTest({"Set ClientTokenizer_v2.getHashedTokens(Collection, byte[], long)"})
  public void testGetHashedTokens_givenFoo_whenNull_thenReturnContainsNull()
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
   * Test {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}.
   * <ul>
   *   <li>Given {@code HmacSHA256}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}
   */
  @Test
  @MethodsUnderTest({"Set ClientTokenizer_v2.getHashedTokens(Collection, byte[], long)"})
  public void testGetHashedTokens_givenHmacSHA256_thenReturnSizeIsTwo()
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
   * Test {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}.
   * <ul>
   *   <li>Then return contains {@code 1nrb9IUj53PZTBPzgRh+eQJijQnrM8r7thjawqky2e8=}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}
   */
  @Test
  @MethodsUnderTest({"Set ClientTokenizer_v2.getHashedTokens(Collection, byte[], long)"})
  public void testGetHashedTokens_thenReturnContains1nrb9IUj53PZTBPzgRhEQJijQnrM8r7thjawqky2e8()
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
   * Test {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}
   */
  @Test
  @MethodsUnderTest({"Set ClientTokenizer_v2.getHashedTokens(Collection, byte[], long)"})
  public void testGetHashedTokens_whenArrayList_thenReturnEmpty()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange
    ClientTokenizer_v2 clientTokenizer_v2 = new ClientTokenizer_v2();
    ArrayList<String> plainTokens = new ArrayList<>();

    // Act and Assert
    assertTrue(clientTokenizer_v2.getHashedTokens(plainTokens, "AXAXAXAX".getBytes("UTF-8"), 1L).isEmpty());
  }

  /**
   * Test {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#getHashedTokens(Collection, byte[], long)}
   */
  @Test
  @MethodsUnderTest({"Set ClientTokenizer_v2.getHashedTokens(Collection, byte[], long)"})
  public void testGetHashedTokens_whenZero_thenReturnEmpty()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange, Act and Assert
    assertTrue((new ClientTokenizer_v2()).getHashedTokens(null, null, 0L).isEmpty());
  }

  /**
   * Test {@link ClientTokenizer_v2#getPlainTokens(String)}.
   * <ul>
   *   <li>When {@code Input}.</li>
   *   <li>Then return contains {@code input}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#getPlainTokens(String)}
   */
  @Test
  @MethodsUnderTest({"Set ClientTokenizer_v2.getPlainTokens(String)"})
  public void testGetPlainTokens_whenInput_thenReturnContainsInput() {
    // Arrange and Act
    Set<String> actualPlainTokens = (new ClientTokenizer_v2()).getPlainTokens("Input");

    // Assert
    assertEquals(1, actualPlainTokens.size());
    assertTrue(actualPlainTokens.contains("input"));
  }

  /**
   * Test {@link ClientTokenizer_v2#getPlainTokens(String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#getPlainTokens(String)}
   */
  @Test
  @MethodsUnderTest({"Set ClientTokenizer_v2.getPlainTokens(String)"})
  public void testGetPlainTokens_whenNull_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue((new ClientTokenizer_v2()).getPlainTokens(null).isEmpty());
  }

  /**
   * Test {@link ClientTokenizer_v2#getPlainTokens(String)}.
   * <ul>
   *   <li>When {@code \s+}.</li>
   *   <li>Then return contains {@code s}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#getPlainTokens(String)}
   */
  @Test
  @MethodsUnderTest({"Set ClientTokenizer_v2.getPlainTokens(String)"})
  public void testGetPlainTokens_whenS_thenReturnContainsS() {
    // Arrange and Act
    Set<String> actualPlainTokens = (new ClientTokenizer_v2()).getPlainTokens("\\s+");

    // Assert
    assertEquals(1, actualPlainTokens.size());
    assertTrue(actualPlainTokens.contains("s"));
  }

  /**
   * Test {@link ClientTokenizer_v2#getSalt(byte[])}.
   * <p>
   * Method under test: {@link ClientTokenizer_v2#getSalt(byte[])}
   */
  @Test
  @MethodsUnderTest({"byte[] ClientTokenizer_v2.getSalt(byte[])"})
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
   * Test {@link ClientTokenizer_v2#hashHMAC256B64(String, byte[])}.
   * <ul>
   *   <li>Then return {@code WJ7PfnhLIQxcpO5XWIgSLJMpyMHKL54NmVkrkQ6E/UQ=}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#hashHMAC256B64(String, byte[])}
   */
  @Test
  @MethodsUnderTest({"String ClientTokenizer_v2.hashHMAC256B64(String, byte[])"})
  public void testHashHMAC256B64_thenReturnWJ7PfnhLIQxcpO5XWIgSLJMpyMHKL54NmVkrkQ6EUq()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange, Act and Assert
    assertEquals("WJ7PfnhLIQxcpO5XWIgSLJMpyMHKL54NmVkrkQ6E/UQ=",
        ClientTokenizer_v2.hashHMAC256B64("ABC123", "AXAXAXAX".getBytes("UTF-8")));
  }

  /**
   * Test {@link ClientTokenizer_v2#hashHMAC256B64(String, byte[])}.
   * <ul>
   *   <li>When empty array of {@code byte}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#hashHMAC256B64(String, byte[])}
   */
  @Test
  @MethodsUnderTest({"String ClientTokenizer_v2.hashHMAC256B64(String, byte[])"})
  public void testHashHMAC256B64_whenEmptyArrayOfByte_thenReturnNull()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange, Act and Assert
    assertNull(ClientTokenizer_v2.hashHMAC256B64("ABC123", new byte[]{}));
  }

  /**
   * Test {@link ClientTokenizer_v2#hashHMAC256B64(String, byte[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#hashHMAC256B64(String, byte[])}
   */
  @Test
  @MethodsUnderTest({"String ClientTokenizer_v2.hashHMAC256B64(String, byte[])"})
  public void testHashHMAC256B64_whenNull_thenReturnNull()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange, Act and Assert
    assertNull(ClientTokenizer_v2.hashHMAC256B64("ABC123", null));
  }

  /**
   * Test {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}.
   * <ul>
   *   <li>Given {@code SHA-256}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code SHA-256}.</li>
   *   <li>Then return size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}
   */
  @Test
  @MethodsUnderTest({"List ClientTokenizer_v2.tokenize(String, Collection, byte[], byte[], long)"})
  public void testTokenize_givenSha256_whenArrayListAddSha256_thenReturnSizeIsThree()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
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

  /**
   * Test {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}.
   * <ul>
   *   <li>Given space.</li>
   *   <li>When {@link ArrayList#ArrayList()} add space.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}
   */
  @Test
  @MethodsUnderTest({"List ClientTokenizer_v2.tokenize(String, Collection, byte[], byte[], long)"})
  public void testTokenize_givenSpace_whenArrayListAddSpace_thenReturnSizeIsTwo()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
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
   * Test {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}.
   * <ul>
   *   <li>Then return first is {@code /pOW9U5Tmo9VVm/d1jtjbmAM9Zl5Kh8wKNAH6SrdaF8=}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}
   */
  @Test
  @MethodsUnderTest({"List ClientTokenizer_v2.tokenize(String, Collection, byte[], byte[], long)"})
  public void testTokenize_thenReturnFirstIsPOW9U5Tmo9VVmD1jtjbmAM9Zl5Kh8wKNAH6SrdaF8()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange
    ClientTokenizer_v2 clientTokenizer_v2 = new ClientTokenizer_v2();
    ArrayList<String> hashtags = new ArrayList<>();
    byte[] privateContentKey = "AXAXAXAX".getBytes("UTF-8");

    // Act
    List<String> actualTokenizeResult = clientTokenizer_v2.tokenize("Text", hashtags, privateContentKey,
        "AXAXAXAX".getBytes("UTF-8"), 1L);

    // Assert
    assertEquals(1, actualTokenizeResult.size());
    assertEquals("/pOW9U5Tmo9VVm/d1jtjbmAM9Zl5Kh8wKNAH6SrdaF8=", actualTokenizeResult.get(0));
  }

  /**
   * Test {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}.
   * <ul>
   *   <li>When {@code A}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}
   */
  @Test
  @MethodsUnderTest({"List ClientTokenizer_v2.tokenize(String, Collection, byte[], byte[], long)"})
  public void testTokenize_whenA_thenReturnEmpty()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
    // Arrange, Act and Assert
    assertTrue(
        (new ClientTokenizer_v2())
            .tokenize(null, null, new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'},
                new byte[]{'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'}, 0L)
            .isEmpty());
  }

  /**
   * Test {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}.
   * <ul>
   *   <li>When {@code \s+}.</li>
   *   <li>Then return first is {@code gHHZpvVa1mz6z8rSH5VQbJGuwqmUfsoD25aGzd3ypwI=}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ClientTokenizer_v2#tokenize(String, Collection, byte[], byte[], long)}
   */
  @Test
  @MethodsUnderTest({"List ClientTokenizer_v2.tokenize(String, Collection, byte[], byte[], long)"})
  public void testTokenize_whenS_thenReturnFirstIsGHHZpvVa1mz6z8rSH5VQbJGuwqmUfsoD25aGzd3ypwI()
      throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {
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
}
