package com.gs.ti.wpt.lc.security.cryptolib;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.junit.Test;

public class UtilsDiffblueTest {
  /**
   * Test {@link Utils#bytesToHex(byte[])}.
   * <p>
   * Method under test: {@link Utils#bytesToHex(byte[])}
   */
  @Test
  @MethodsUnderTest({"java.lang.String Utils.bytesToHex(byte[])"})
  public void testBytesToHex() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertEquals("0x4158415841584158", Utils.bytesToHex("AXAXAXAX".getBytes("UTF-8")));
  }

  /**
   * Test {@link Utils#getDynamicPathToJniLib()}.
   * <p>
   * Method under test: {@link Utils#getDynamicPathToJniLib()}
   */
  @Test
  @MethodsUnderTest({"java.lang.String Utils.getDynamicPathToJniLib()"})
  public void testGetDynamicPathToJniLib() throws IOException {
    // Arrange, Act and Assert
    assertEquals("cryptolibs/linux/x86_64/libsymphonycryptolibjni.so", Utils.getDynamicPathToJniLib());
  }
}
