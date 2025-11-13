package com.symphony.security.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.security.exceptions.SymphonyEncryptionException;
import com.symphony.security.utils.PropertyDecrypter.ConsoleUserInput;
import com.symphony.security.utils.PropertyDecrypter.UserInput;
import java.util.Properties;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

public class PropertyDecrypterDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test ConsoleUserInput {@link ConsoleUserInput#getSecret(String)}.
   *
   * <p>Method under test: {@link ConsoleUserInput#getSecret(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"char[] ConsoleUserInput.getSecret(String)"})
  public void testConsoleUserInputGetSecret() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    new ConsoleUserInput().getSecret("Prompt");
  }

  /**
   * Test {@link PropertyDecrypter#encryptPropertyViaPrompt(UserInput)} with {@code
   * passwordAndPropertyUserInput}.
   *
   * <p>Method under test: {@link PropertyDecrypter#encryptPropertyViaPrompt(UserInput)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PropertyDecrypter.encryptPropertyViaPrompt(UserInput)"})
  public void testEncryptPropertyViaPromptWithPasswordAndPropertyUserInput()
      throws SymphonyEncryptionException {
    // Arrange
    UserInput passwordAndPropertyUserInput = mock(UserInput.class);
    when(passwordAndPropertyUserInput.getSecret(Mockito.<String>any()))
        .thenReturn("AZAZ".toCharArray());

    // Act
    PropertyDecrypter.encryptPropertyViaPrompt(passwordAndPropertyUserInput);

    // Assert
    verify(passwordAndPropertyUserInput, atLeast(1)).getSecret(Mockito.<String>any());
  }

  /**
   * Test {@link PropertyDecrypter#encryptPropertyViaPrompt(UserInput)} with {@code
   * passwordAndPropertyUserInput}.
   *
   * <p>Method under test: {@link PropertyDecrypter#encryptPropertyViaPrompt(UserInput)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PropertyDecrypter.encryptPropertyViaPrompt(UserInput)"})
  public void testEncryptPropertyViaPromptWithPasswordAndPropertyUserInput2()
      throws SymphonyEncryptionException {
    // Arrange
    UserInput passwordAndPropertyUserInput = mock(UserInput.class);
    when(passwordAndPropertyUserInput.getSecret(Mockito.<String>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PropertyDecrypter.encryptPropertyViaPrompt(passwordAndPropertyUserInput);
    verify(passwordAndPropertyUserInput).getSecret(Mockito.<String>any());
  }

  /**
   * Test {@link PropertyDecrypter#encryptPropertyViaPrompt(UserInput, char[])} with {@code
   * propertyUserInput}, {@code pwd}.
   *
   * <p>Method under test: {@link PropertyDecrypter#encryptPropertyViaPrompt(UserInput, char[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PropertyDecrypter.encryptPropertyViaPrompt(UserInput, char[])"})
  public void testEncryptPropertyViaPromptWithPropertyUserInputPwd()
      throws SymphonyEncryptionException {
    // Arrange
    UserInput propertyUserInput = mock(UserInput.class);
    when(propertyUserInput.getSecret(Mockito.<String>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PropertyDecrypter.encryptPropertyViaPrompt(propertyUserInput, "AZAZ".toCharArray());
    verify(propertyUserInput).getSecret(Mockito.<String>any());
  }

  /**
   * Test {@link PropertyDecrypter#encryptPropertyViaPrompt(UserInput, char[])} with {@code
   * propertyUserInput}, {@code pwd}.
   *
   * <ul>
   *   <li>Then calls {@link UserInput#getSecret(String)}.
   * </ul>
   *
   * <p>Method under test: {@link PropertyDecrypter#encryptPropertyViaPrompt(UserInput, char[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PropertyDecrypter.encryptPropertyViaPrompt(UserInput, char[])"})
  public void testEncryptPropertyViaPromptWithPropertyUserInputPwd_thenCallsGetSecret()
      throws SymphonyEncryptionException {
    // Arrange
    UserInput propertyUserInput = mock(UserInput.class);
    when(propertyUserInput.getSecret(Mockito.<String>any())).thenReturn("AZAZ".toCharArray());

    // Act
    PropertyDecrypter.encryptPropertyViaPrompt(propertyUserInput, "AZAZ".toCharArray());

    // Assert
    verify(propertyUserInput).getSecret(Mockito.<String>any());
  }

  /**
   * Test {@link PropertyDecrypter#encryptPropertyWithPasswordFromEnvAndPropertyFromPrompt()}.
   *
   * <p>Method under test: {@link
   * PropertyDecrypter#encryptPropertyWithPasswordFromEnvAndPropertyFromPrompt()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String PropertyDecrypter.encryptPropertyWithPasswordFromEnvAndPropertyFromPrompt()"
  })
  public void testEncryptPropertyWithPasswordFromEnvAndPropertyFromPrompt()
      throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PropertyDecrypter.encryptPropertyWithPasswordFromEnvAndPropertyFromPrompt();
  }

  /**
   * Test {@link
   * PropertyDecrypter#encryptPropertyWithPasswordFromEnvAndPropertyFromPrompt(UserInput)} with
   * {@code UserInput}.
   *
   * <p>Method under test: {@link
   * PropertyDecrypter#encryptPropertyWithPasswordFromEnvAndPropertyFromPrompt(UserInput)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String PropertyDecrypter.encryptPropertyWithPasswordFromEnvAndPropertyFromPrompt(UserInput)"
  })
  public void testEncryptPropertyWithPasswordFromEnvAndPropertyFromPromptWithUserInput()
      throws SymphonyEncryptionException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PropertyDecrypter.encryptPropertyWithPasswordFromEnvAndPropertyFromPrompt(
        mock(UserInput.class));
  }

  /**
   * Test {@link PropertyDecrypter#getDecryptedProperties(Properties)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link Properties#Properties()} {@code 42} is {@code 42}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertyDecrypter#getDecryptedProperties(Properties)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Properties PropertyDecrypter.getDecryptedProperties(Properties)"})
  public void testGetDecryptedProperties_given42_whenProperties42Is42_thenReturnEmpty()
      throws SymphonyEncryptionException {
    // Arrange
    Properties source = new Properties();
    source.put("42", "42");

    // Act
    Properties actualDecryptedProperties = PropertyDecrypter.getDecryptedProperties(source);

    // Assert
    assertTrue(actualDecryptedProperties.isEmpty());
  }

  /**
   * Test {@link PropertyDecrypter#getDecryptedProperties(Properties)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link Properties#Properties()} {@code 42} is one.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertyDecrypter#getDecryptedProperties(Properties)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Properties PropertyDecrypter.getDecryptedProperties(Properties)"})
  public void testGetDecryptedProperties_givenOne_whenProperties42IsOne_thenReturnEmpty()
      throws SymphonyEncryptionException {
    // Arrange
    Properties source = new Properties();
    source.put("42", 1);

    // Act
    Properties actualDecryptedProperties = PropertyDecrypter.getDecryptedProperties(source);

    // Assert
    assertTrue(actualDecryptedProperties.isEmpty());
  }

  /**
   * Test {@link PropertyDecrypter#getDecryptedProperties(Properties)}.
   *
   * <ul>
   *   <li>Given {@link PropertyDecrypter#PREFIX}.
   *   <li>When {@link Properties#Properties()} {@code 42} is {@link PropertyDecrypter#PREFIX}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertyDecrypter#getDecryptedProperties(Properties)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Properties PropertyDecrypter.getDecryptedProperties(Properties)"})
  public void testGetDecryptedProperties_givenPrefix_whenProperties42IsPrefix_thenReturnEmpty()
      throws SymphonyEncryptionException {
    // Arrange
    Properties source = new Properties();
    source.put("42", PropertyDecrypter.PREFIX);

    // Act
    Properties actualDecryptedProperties = PropertyDecrypter.getDecryptedProperties(source);

    // Assert
    assertTrue(actualDecryptedProperties.isEmpty());
  }

  /**
   * Test {@link PropertyDecrypter#getDecryptedProperties(Properties)}.
   *
   * <ul>
   *   <li>When {@link Properties#Properties()}.
   *   <li>Then return {@link Properties#Properties()}.
   * </ul>
   *
   * <p>Method under test: {@link PropertyDecrypter#getDecryptedProperties(Properties)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Properties PropertyDecrypter.getDecryptedProperties(Properties)"})
  public void testGetDecryptedProperties_whenProperties_thenReturnProperties()
      throws SymphonyEncryptionException {
    // Arrange
    Properties source = new Properties();

    // Act
    Properties actualDecryptedProperties = PropertyDecrypter.getDecryptedProperties(source);

    // Assert
    assertEquals(source, actualDecryptedProperties);
  }

  /**
   * Test {@link PropertyDecrypter#getPassword()}.
   *
   * <p>Method under test: {@link PropertyDecrypter#getPassword()}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"char[] PropertyDecrypter.getPassword()"})
  public void testGetPassword() {
    // Arrange, Act and Assert
    assertNull(PropertyDecrypter.getPassword());
  }
}
