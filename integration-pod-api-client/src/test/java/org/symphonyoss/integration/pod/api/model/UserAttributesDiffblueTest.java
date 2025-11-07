package org.symphonyoss.integration.pod.api.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class UserAttributesDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserAttributes}
   *   <li>{@link UserAttributes#setAccountType(UserAttributes.AccountTypeEnum)}
   *   <li>{@link UserAttributes#setAssetClasses(List)}
   *   <li>{@link UserAttributes#setDepartment(String)}
   *   <li>{@link UserAttributes#setDisplayName(String)}
   *   <li>{@link UserAttributes#setDivision(String)}
   *   <li>{@link UserAttributes#setEmailAddress(String)}
   *   <li>{@link UserAttributes#setFirstName(String)}
   *   <li>{@link UserAttributes#setIndustries(List)}
   *   <li>{@link UserAttributes#setJobFunction(String)}
   *   <li>{@link UserAttributes#setLastName(String)}
   *   <li>{@link UserAttributes#setLocation(String)}
   *   <li>{@link UserAttributes#setMobilePhoneNumber(String)}
   *   <li>{@link UserAttributes#setSmsNumber(String)}
   *   <li>{@link UserAttributes#setTitle(String)}
   *   <li>{@link UserAttributes#setUserName(String)}
   *   <li>{@link UserAttributes#setWorkPhoneNumber(String)}
   *   <li>{@link UserAttributes#getAccountType()}
   *   <li>{@link UserAttributes#getAssetClasses()}
   *   <li>{@link UserAttributes#getDepartment()}
   *   <li>{@link UserAttributes#getDisplayName()}
   *   <li>{@link UserAttributes#getDivision()}
   *   <li>{@link UserAttributes#getEmailAddress()}
   *   <li>{@link UserAttributes#getFirstName()}
   *   <li>{@link UserAttributes#getIndustries()}
   *   <li>{@link UserAttributes#getJobFunction()}
   *   <li>{@link UserAttributes#getLastName()}
   *   <li>{@link UserAttributes#getLocation()}
   *   <li>{@link UserAttributes#getMobilePhoneNumber()}
   *   <li>{@link UserAttributes#getSmsNumber()}
   *   <li>{@link UserAttributes#getTitle()}
   *   <li>{@link UserAttributes#getUserName()}
   *   <li>{@link UserAttributes#getWorkPhoneNumber()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    UserAttributes actualUserAttributes = new UserAttributes();
    actualUserAttributes.setAccountType(UserAttributes.AccountTypeEnum.NORMAL);
    ArrayList<String> assetClasses = new ArrayList<>();
    actualUserAttributes.setAssetClasses(assetClasses);
    actualUserAttributes.setDepartment("Department");
    actualUserAttributes.setDisplayName("Display Name");
    actualUserAttributes.setDivision("Division");
    actualUserAttributes.setEmailAddress("42 Main St");
    actualUserAttributes.setFirstName("Jane");
    ArrayList<String> industries = new ArrayList<>();
    actualUserAttributes.setIndustries(industries);
    actualUserAttributes.setJobFunction("Job Function");
    actualUserAttributes.setLastName("Doe");
    actualUserAttributes.setLocation("Location");
    actualUserAttributes.setMobilePhoneNumber("6625550144");
    actualUserAttributes.setSmsNumber("42");
    actualUserAttributes.setTitle("Dr");
    actualUserAttributes.setUserName("janedoe");
    actualUserAttributes.setWorkPhoneNumber("6625550144");
    UserAttributes.AccountTypeEnum actualAccountType = actualUserAttributes.getAccountType();
    List<String> actualAssetClasses = actualUserAttributes.getAssetClasses();
    String actualDepartment = actualUserAttributes.getDepartment();
    String actualDisplayName = actualUserAttributes.getDisplayName();
    String actualDivision = actualUserAttributes.getDivision();
    String actualEmailAddress = actualUserAttributes.getEmailAddress();
    String actualFirstName = actualUserAttributes.getFirstName();
    List<String> actualIndustries = actualUserAttributes.getIndustries();
    String actualJobFunction = actualUserAttributes.getJobFunction();
    String actualLastName = actualUserAttributes.getLastName();
    String actualLocation = actualUserAttributes.getLocation();
    String actualMobilePhoneNumber = actualUserAttributes.getMobilePhoneNumber();
    String actualSmsNumber = actualUserAttributes.getSmsNumber();
    String actualTitle = actualUserAttributes.getTitle();
    String actualUserName = actualUserAttributes.getUserName();

    // Assert that nothing has changed
    assertEquals("42 Main St", actualEmailAddress);
    assertEquals("42", actualSmsNumber);
    assertEquals("6625550144", actualMobilePhoneNumber);
    assertEquals("6625550144", actualUserAttributes.getWorkPhoneNumber());
    assertEquals("Department", actualDepartment);
    assertEquals("Display Name", actualDisplayName);
    assertEquals("Division", actualDivision);
    assertEquals("Doe", actualLastName);
    assertEquals("Dr", actualTitle);
    assertEquals("Jane", actualFirstName);
    assertEquals("Job Function", actualJobFunction);
    assertEquals("Location", actualLocation);
    assertEquals("janedoe", actualUserName);
    assertEquals(UserAttributes.AccountTypeEnum.NORMAL, actualAccountType);
    assertTrue(actualAssetClasses.isEmpty());
    assertTrue(actualIndustries.isEmpty());
    assertSame(assetClasses, actualAssetClasses);
    assertSame(industries, actualIndustries);
  }
}
