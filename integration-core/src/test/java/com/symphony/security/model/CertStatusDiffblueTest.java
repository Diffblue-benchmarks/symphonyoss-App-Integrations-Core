package com.symphony.security.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.math.BigInteger;
import org.junit.Test;

public class CertStatusDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CertStatus#getDate()}
   *   <li>{@link CertStatus#getInvalidity()}
   *   <li>{@link CertStatus#getReason()}
   *   <li>{@link CertStatus#getSerialNumber()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "long CertStatus.getDate()",
    "long CertStatus.getInvalidity()",
    "int CertStatus.getReason()",
    "BigInteger CertStatus.getSerialNumber()"
  })
  public void testGettersAndSetters() {
    // Arrange
    CertStatus certStatus = new CertStatus(BigInteger.valueOf(1L), 1L, 1, 1L);

    // Act
    long actualDate = certStatus.getDate();
    long actualInvalidity = certStatus.getInvalidity();
    int actualReason = certStatus.getReason();
    BigInteger actualSerialNumber = certStatus.getSerialNumber();

    // Assert
    assertEquals(1, actualReason);
    assertEquals(1L, actualDate);
    assertEquals(1L, actualInvalidity);
    assertSame(actualSerialNumber.ONE, actualSerialNumber);
  }

  /**
   * Test {@link CertStatus#CertStatus(BigInteger, long, int, long)}.
   *
   * <p>Method under test: {@link CertStatus#CertStatus(BigInteger, long, int, long)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void CertStatus.<init>(BigInteger, long, int, long)"})
  public void testNewCertStatus() {
    // Arrange
    BigInteger serialNumber = BigInteger.valueOf(1L);

    // Act
    CertStatus actualCertStatus = new CertStatus(serialNumber, 1L, 1, 1L);

    // Assert
    assertEquals(1, actualCertStatus.getReason());
    assertEquals(1L, actualCertStatus.getDate());
    assertEquals(1L, actualCertStatus.getInvalidity());
    BigInteger expectedSerialNumber = serialNumber.ONE;
    assertSame(expectedSerialNumber, actualCertStatus.getSerialNumber());
  }
}
