package com.gs.ti.wpt.lc.security.cryptolib;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.utils.ValidateFactory;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.junit.Test;

public class UtilsDiffblueTest {
  /**
   * Test {@link Utils#bytesToHex(byte[])}.
   *
   * <p>Method under test: {@link Utils#bytesToHex(byte[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Utils.bytesToHex(byte[])"})
  public void testBytesToHex() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertEquals("0x4158415841584158", Utils.bytesToHex("AXAXAXAX".getBytes("UTF-8")));
  }

  /**
   * Test {@link Utils#getDynamicPathToJniLib()}.
   *
   * <p>Method under test: {@link Utils#getDynamicPathToJniLib()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Utils.getDynamicPathToJniLib()"})
  public void testGetDynamicPathToJniLib() throws IOException {
    // Arrange, Act and Assert
    assertEquals(
        "cryptolibs/linux/x86_64/libsymphonycryptolibjni.so", Utils.getDynamicPathToJniLib());
  }

  /**
   * Test {@link Utils#validateCString(String)}.
   *
   * <ul>
   *   <li>When createNonNullString.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Utils#validateCString(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Utils.validateCString(String)"})
  public void testValidateCString_whenCreateNonNullString_thenDoesNotThrow()
      throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    Utils.validateCString(ValidateFactory.createNonNullString());
  }
}
