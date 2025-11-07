package com.symphony.security.utils;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import java.util.Properties;
import java.util.function.BiFunction;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

public class PropertyDecrypterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Method under test:
   * {@link PropertyDecrypter.ConsoleUserInput#getSecret(String)}
   */
  @Test
  public void testConsoleUserInputGetSecret() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    (new PropertyDecrypter.ConsoleUserInput()).getSecret("Prompt");
  }

  /**
   * Method under test:
   * {@link PropertyDecrypter#encryptPropertyViaPrompt(PropertyDecrypter.UserInput)}
   */
  @Test
  public void testEncryptPropertyViaPrompt() throws SymphonyEncryptionException {
    // Arrange
    PropertyDecrypter.UserInput passwordAndPropertyUserInput = mock(PropertyDecrypter.UserInput.class);
    when(passwordAndPropertyUserInput.getSecret(Mockito.<String>any())).thenReturn("AZAZ".toCharArray());

    // Act
    PropertyDecrypter.encryptPropertyViaPrompt(passwordAndPropertyUserInput);

    // Assert
    verify(passwordAndPropertyUserInput, atLeast(1)).getSecret(Mockito.<String>any());
  }

  /**
   * Method under test:
   * {@link PropertyDecrypter#encryptPropertyViaPrompt(PropertyDecrypter.UserInput)}
   */
  @Test
  public void testEncryptPropertyViaPrompt2() throws SymphonyEncryptionException {
    // Arrange
    PropertyDecrypter.UserInput passwordAndPropertyUserInput = mock(PropertyDecrypter.UserInput.class);
    when(passwordAndPropertyUserInput.getSecret(Mockito.<String>any()))
        .thenThrow(new IllegalArgumentException(PropertyDecrypter.PASSWORD_PROMPT));

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PropertyDecrypter.encryptPropertyViaPrompt(passwordAndPropertyUserInput);
    verify(passwordAndPropertyUserInput).getSecret(Mockito.<String>any());
  }

  /**
   * Method under test:
   * {@link PropertyDecrypter#encryptPropertyViaPrompt(PropertyDecrypter.UserInput, char[])}
   */
  @Test
  public void testEncryptPropertyViaPrompt3() throws SymphonyEncryptionException {
    // Arrange
    PropertyDecrypter.UserInput propertyUserInput = mock(PropertyDecrypter.UserInput.class);
    when(propertyUserInput.getSecret(Mockito.<String>any())).thenReturn("AZAZ".toCharArray());

    // Act
    PropertyDecrypter.encryptPropertyViaPrompt(propertyUserInput, "AZAZ".toCharArray());

    // Assert
    verify(propertyUserInput).getSecret(Mockito.<String>any());
  }

  /**
   * Method under test:
   * {@link PropertyDecrypter#encryptPropertyViaPrompt(PropertyDecrypter.UserInput, char[])}
   */
  @Test
  public void testEncryptPropertyViaPrompt4() throws SymphonyEncryptionException {
    // Arrange
    PropertyDecrypter.UserInput propertyUserInput = mock(PropertyDecrypter.UserInput.class);
    when(propertyUserInput.getSecret(Mockito.<String>any()))
        .thenThrow(new IllegalArgumentException(PropertyDecrypter.PROPERTY_PROMPT));

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PropertyDecrypter.encryptPropertyViaPrompt(propertyUserInput, "AZAZ".toCharArray());
    verify(propertyUserInput).getSecret(Mockito.<String>any());
  }

  /**
   * Method under test:
   * {@link PropertyDecrypter#encryptPropertyWithPasswordFromEnvAndPropertyFromPrompt(PropertyDecrypter.UserInput)}
   */
  @Test
  public void testEncryptPropertyWithPasswordFromEnvAndPropertyFromPrompt() throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PropertyDecrypter.encryptPropertyWithPasswordFromEnvAndPropertyFromPrompt(mock(PropertyDecrypter.UserInput.class));
  }

  /**
   * Method under test:
   * {@link PropertyDecrypter#encryptPropertyWithPasswordFromEnvAndPropertyFromPrompt()}
   */
  @Test
  public void testEncryptPropertyWithPasswordFromEnvAndPropertyFromPrompt2() throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PropertyDecrypter.encryptPropertyWithPasswordFromEnvAndPropertyFromPrompt();
  }

  /**
   * Method under test:
   * {@link PropertyDecrypter#getDecryptedProperties(Properties)}
   */
  @Test
  public void testGetDecryptedProperties() throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    assertTrue(PropertyDecrypter.getDecryptedProperties(new Properties()).isEmpty());
  }

  /**
   * Method under test:
   * {@link PropertyDecrypter#getDecryptedProperties(Properties)}
   */
  @Test
  public void testGetDecryptedProperties2() throws SymphonyEncryptionException {
    // Arrange
    Properties source = new Properties();
    source.put("42", "42");

    // Act and Assert
    assertTrue(PropertyDecrypter.getDecryptedProperties(source).isEmpty());
  }

  /**
   * Method under test:
   * {@link PropertyDecrypter#getDecryptedProperties(Properties)}
   */
  @Test
  public void testGetDecryptedProperties3() throws SymphonyEncryptionException {
    // Arrange
    Properties source = new Properties();
    source.replaceAll(mock(BiFunction.class));
    source.put("42", "42");

    // Act and Assert
    assertTrue(PropertyDecrypter.getDecryptedProperties(source).isEmpty());
  }

  /**
   * Method under test:
   * {@link PropertyDecrypter#getDecryptedProperties(Properties)}
   */
  @Test
  public void testGetDecryptedProperties4() throws SymphonyEncryptionException {
    // Arrange
    Properties source = new Properties();
    source.put("42", PropertyDecrypter.PREFIX);

    // Act and Assert
    assertTrue(PropertyDecrypter.getDecryptedProperties(source).isEmpty());
  }

  /**
   * Method under test:
   * {@link PropertyDecrypter#getDecryptedProperties(Properties)}
   */
  @Test
  public void testGetDecryptedProperties5() throws SymphonyEncryptionException {
    // Arrange
    Properties source = new Properties();
    source.put("42", 1);

    // Act and Assert
    assertTrue(PropertyDecrypter.getDecryptedProperties(source).isEmpty());
  }

  /**
   * Method under test: {@link PropertyDecrypter#getPassword()}
   */
  @Test
  public void testGetPassword() {
    // Arrange, Act and Assert
    assertNull(PropertyDecrypter.getPassword());
  }
}
