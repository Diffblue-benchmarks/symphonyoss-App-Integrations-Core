package com.symphony.security.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.ClientCertException;
import java.io.UnsupportedEncodingException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClientCertDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ClientCert#toString()}
   *   <li>{@link ClientCert#getCertId()}
   *   <li>{@link ClientCert#getClientCert()}
   *   <li>{@link ClientCert#getClientCertPEM()}
   *   <li>{@link ClientCert#getUserId()}
   *   <li>{@link ClientCert#getVersion()}
   *   <li>{@link ClientCert#getWrappedRSAKey()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "long ClientCert.getCertId()",
    "byte[] ClientCert.getClientCert()",
    "String ClientCert.getClientCertPEM()",
    "Long ClientCert.getUserId()",
    "int ClientCert.getVersion()",
    "byte[] ClientCert.getWrappedRSAKey()",
    "String ClientCert.toString()"
  })
  public void testGettersAndSetters() throws ClientCertException, UnsupportedEncodingException {
    // Arrange
    byte[] clientCert = "AXAXAXAX".getBytes("UTF-8");
    ClientCert clientCert2 = new ClientCert(1L, 1L, 1, clientCert, "AXAXAXAX".getBytes("UTF-8"));

    // Act
    String actualToStringResult = clientCert2.toString();
    long actualCertId = clientCert2.getCertId();
    byte[] actualClientCert = clientCert2.getClientCert();
    String actualClientCertPEM = clientCert2.getClientCertPEM();
    Long actualUserId = clientCert2.getUserId();
    int actualVersion = clientCert2.getVersion();
    byte[] actualWrappedRSAKey = clientCert2.getWrappedRSAKey();

    // Assert
    assertEquals("AXAXAXAX", actualClientCertPEM);
    assertEquals("userId 1, certId 1, version 1", actualToStringResult);
    assertEquals(1, actualVersion);
    assertEquals(1L, actualCertId);
    assertEquals(1L, actualUserId.longValue());
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualClientCert);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualWrappedRSAKey);
  }

  /**
   * Test {@link ClientCert#ClientCert(Long, long, int, byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   *   <li>Then return ClientCertPEM is {@code AXAXAXAX}.
   * </ul>
   *
   * <p>Method under test: {@link ClientCert#ClientCert(Long, long, int, byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ClientCert.<init>(Long, long, int, byte[], byte[])"})
  public void testNewClientCert_whenAxaxaxaxBytesIsUtf8_thenReturnClientCertPEMIsAxaxaxax()
      throws ClientCertException, UnsupportedEncodingException {
    // Arrange
    byte[] clientCert = "AXAXAXAX".getBytes("UTF-8");

    // Act
    ClientCert actualClientCert =
        new ClientCert(1L, 1L, 1, clientCert, "AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals("AXAXAXAX", actualClientCert.getClientCertPEM());
    assertEquals(1, actualClientCert.getVersion());
    assertEquals(1L, actualClientCert.getCertId());
    assertEquals(1L, actualClientCert.getUserId().longValue());
    byte[] expectedClientCert = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedClientCert, actualClientCert.getClientCert());
    byte[] expectedWrappedRSAKey = "AXAXAXAX".getBytes("UTF-8");
    assertArrayEquals(expectedWrappedRSAKey, actualClientCert.getWrappedRSAKey());
  }

  /**
   * Test {@link ClientCert#ClientCert(Long, long, int, byte[], byte[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ClientCertException}.
   * </ul>
   *
   * <p>Method under test: {@link ClientCert#ClientCert(Long, long, int, byte[], byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ClientCert.<init>(Long, long, int, byte[], byte[])"})
  public void testNewClientCert_whenNull_thenThrowClientCertException()
      throws ClientCertException, UnsupportedEncodingException {
    // Arrange, Act and Assert
    thrown.expect(ClientCertException.class);

    new ClientCert(1L, 1L, 1, null, new byte[] {'A', 'X', 'A', 'X', 'A', 'X', 'A', 'X'});
  }

  /**
   * Test {@link ClientCert#setClientCertPEM(String)}.
   *
   * <p>Method under test: {@link ClientCert#setClientCertPEM(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ClientCert.setClientCertPEM(String)"})
  public void testSetClientCertPEM() throws ClientCertException, UnsupportedEncodingException {
    // Arrange
    byte[] clientCert = "AXAXAXAX".getBytes("UTF-8");
    ClientCert clientCert2 = new ClientCert(1L, 1L, 1, clientCert, "AXAXAXAX".getBytes("UTF-8"));

    // Act
    clientCert2.setClientCertPEM("Client Cert PEM");

    // Assert
    assertEquals("Client Cert PEM", clientCert2.getClientCertPEM());
    byte[] expectedClientCert = "Client Cert PEM".getBytes("UTF-8");
    assertArrayEquals(expectedClientCert, clientCert2.getClientCert());
  }
}
