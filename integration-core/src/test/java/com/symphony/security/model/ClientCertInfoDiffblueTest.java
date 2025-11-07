package com.symphony.security.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.symphony.security.exceptions.ClientCertException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.junit.Test;

public class ClientCertInfoDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ClientCertInfo#getCertStatus()}
   *   <li>{@link ClientCertInfo#getClientCert()}
   *   <li>{@link ClientCertInfo#getNotAfter()}
   *   <li>{@link ClientCertInfo#getNotBefore()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() throws ClientCertException, UnsupportedEncodingException {
    // Arrange
    byte[] clientCert = "AXAXAXAX".getBytes("UTF-8");
    ClientCert clientCert2 = new ClientCert(1L, 1L, 1, clientCert, "AXAXAXAX".getBytes("UTF-8"));

    CertStatus certStatus = new CertStatus(BigInteger.valueOf(1L), 1L, 1, 1L);

    ClientCertInfo clientCertInfo = new ClientCertInfo(clientCert2, certStatus, 1L, 1L);

    // Act
    CertStatus actualCertStatus = clientCertInfo.getCertStatus();
    ClientCert actualClientCert = clientCertInfo.getClientCert();
    long actualNotAfter = clientCertInfo.getNotAfter();

    // Assert
    assertEquals(1L, actualNotAfter);
    assertEquals(1L, clientCertInfo.getNotBefore());
    assertSame(certStatus, actualCertStatus);
    assertSame(clientCert2, actualClientCert);
  }

  /**
   * Method under test:
   * {@link ClientCertInfo#ClientCertInfo(ClientCert, CertStatus, long, long)}
   */
  @Test
  public void testNewClientCertInfo() throws ClientCertException, UnsupportedEncodingException {
    // Arrange
    byte[] clientCert = "AXAXAXAX".getBytes("UTF-8");
    ClientCert clientCert2 = new ClientCert(1L, 1L, 1, clientCert, "AXAXAXAX".getBytes("UTF-8"));

    CertStatus certStatus = new CertStatus(BigInteger.valueOf(1L), 1L, 1, 1L);

    // Act
    ClientCertInfo actualClientCertInfo = new ClientCertInfo(clientCert2, certStatus, 1L, 1L);

    // Assert
    assertEquals(1L, actualClientCertInfo.getNotAfter());
    assertEquals(1L, actualClientCertInfo.getNotBefore());
    assertSame(certStatus, actualClientCertInfo.getCertStatus());
    assertSame(clientCert2, actualClientCertInfo.getClientCert());
  }
}
