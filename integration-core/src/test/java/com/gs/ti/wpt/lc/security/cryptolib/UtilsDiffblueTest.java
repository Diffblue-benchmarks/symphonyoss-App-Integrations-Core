package com.gs.ti.wpt.lc.security.cryptolib;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.junit.Test;

public class UtilsDiffblueTest {
  /**
   * Method under test: {@link Utils#bytesToHex(byte[])}
   */
  @Test
  public void testBytesToHex() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertEquals("0x4158415841584158", Utils.bytesToHex("AXAXAXAX".getBytes("UTF-8")));
  }

  /**
   * Method under test: {@link Utils#getDynamicPathToJniLib()}
   */
  @Test
  public void testGetDynamicPathToJniLib() throws IOException {
    // Arrange, Act and Assert
    assertEquals("cryptolibs/linux/x86_64/libsymphonycryptolibjni.so", Utils.getDynamicPathToJniLib());
  }
}
