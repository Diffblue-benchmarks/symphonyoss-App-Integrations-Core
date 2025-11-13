package com.symphony.security.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.ClientCertException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.junit.Test;

public class ClientCertInfoDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ClientCertInfo#getCertStatus()}
   *   <li>{@link ClientCertInfo#getClientCert()}
   *   <li>{@link ClientCertInfo#getNotAfter()}
   *   <li>{@link ClientCertInfo#getNotBefore()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CertStatus ClientCertInfo.getCertStatus()",
    "ClientCert ClientCertInfo.getClientCert()",
    "long ClientCertInfo.getNotAfter()",
    "long ClientCertInfo.getNotBefore()"
  })
  public void testGettersAndSetters() throws ClientCertException, UnsupportedEncodingException {
    // Arrange
    ClientCert clientCert =
        new ClientCert(1L, 1L, 1, "AXAXAXAX".getBytes("UTF-8"), "AXAXAXAX".getBytes("UTF-8"));
    BigInteger serialNumber = BigInteger.valueOf(1L);
    CertStatus certStatus = new CertStatus(serialNumber, 1L, 1, 1L);

    ClientCertInfo clientCertInfo = new ClientCertInfo(clientCert, certStatus, 1L, 1L);

    // Act
    CertStatus actualCertStatus = clientCertInfo.getCertStatus();
    ClientCert actualClientCert = clientCertInfo.getClientCert();
    long actualNotAfter = clientCertInfo.getNotAfter();

    // Assert
    assertEquals(1L, actualNotAfter);
    assertEquals(1L, clientCertInfo.getNotBefore());
    assertSame(certStatus, actualCertStatus);
    assertSame(clientCert, actualClientCert);
  }

  /**
   * Test {@link ClientCertInfo#ClientCertInfo(ClientCert, CertStatus, long, long)}.
   *
   * <p>Method under test: {@link ClientCertInfo#ClientCertInfo(ClientCert, CertStatus, long, long)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ClientCertInfo.<init>(ClientCert, CertStatus, long, long)"})
  public void testNewClientCertInfo() throws ClientCertException, UnsupportedEncodingException {
    // Arrange
    ClientCert clientCert =
        new ClientCert(1L, 1L, 1, "AXAXAXAX".getBytes("UTF-8"), "AXAXAXAX".getBytes("UTF-8"));
    BigInteger serialNumber = BigInteger.valueOf(1L);
    CertStatus certStatus = new CertStatus(serialNumber, 1L, 1, 1L);

    // Act
    ClientCertInfo actualClientCertInfo = new ClientCertInfo(clientCert, certStatus, 1L, 1L);

    // Assert
    assertEquals(1L, actualClientCertInfo.getNotAfter());
    assertEquals(1L, actualClientCertInfo.getNotBefore());
    assertSame(certStatus, actualClientCertInfo.getCertStatus());
    assertSame(clientCert, actualClientCertInfo.getClientCert());
  }
}
