package com.gs.ti.wpt.lc.security.cryptolib;

import com.diffblue.cover.annotations.InterestingTestFactory;
import com.symphony.security.exceptions.SymphonyExtensionException;
import com.symphony.security.exceptions.SymphonyRevokedCertException;

/**
 * Factory class for creating valid RevokedCert instances for testing.
 */
public class RevokedCertFactory {

  /**
   * Creates a valid RevokedCert instance with non-null, non-empty extensions.
   *
   * @return a valid RevokedCert instance
   * @throws SymphonyRevokedCertException if construction fails
   * @throws SymphonyExtensionException if extension creation fails
   */
  @InterestingTestFactory
  public static RevokedCert createRevokedCert()
      throws SymphonyRevokedCertException, SymphonyExtensionException {
    RevokedCert revokedCert = new RevokedCert();

    // Create non-empty Extensions as required
    Extensions extensions = new Extensions();
    extensions.addBasicConstraints(true, true, 3);

    // Set the extensions to avoid "Entry extensions can not be null or empty" error
    revokedCert.setExtensions(extensions);

    return revokedCert;
  }
}
