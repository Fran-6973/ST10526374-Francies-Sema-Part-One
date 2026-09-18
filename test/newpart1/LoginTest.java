/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package newpart1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class LoginTest {
    
    Login login = new Login();
    
    
    
  
    
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String Password = "";
        boolean expResult = false;
        boolean result = Login.checkPasswordComplexity(Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String userName = "";
        boolean expResult = false;
        boolean result = Login.checkUserName(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String phoneNumber = "";
        boolean expResult = false;
        boolean result = Login.checkCellPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String registeredUserName = "";
        String registeredPassword = "";
        String loginUserName = "";
        String loginPassword = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(registeredUserName, registeredPassword, loginUserName, loginPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginSuccessful = false;
        String name = "";
        String userSurName = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(loginSuccessful, name, userSurName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        boolean usernameCorrect = false;
        boolean passwordCorrect = false;
        boolean phoneNumberCorrect = false;
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(usernameCorrect, passwordCorrect, phoneNumberCorrect);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     /**
     * Test of username method, of class Login.
     */
    @Test
    public void testUserNameFormattedCorrectly(){
        
      boolean result = login.checkUserName("Fran_");
      assertTrue(result);
      
    }
    
    @Test
    public void testUserNameIncorrectlyFormatted(){
     
        boolean result = login.checkUserName("Francies$$$$$$$$");
        assertFalse(result);
    }
    
    /**
     * Test of password method, of class Login.
     */
    
    @Test
    public void testPasswordCorrectlyFormatted(){
    
        boolean result = login.checkPasswordComplexity("Threepumpchump6$");
        assertTrue(result);
    }
    
    @Test
    public void testPasswordComplexityFormattedIncorrectly(){
    
    boolean result = login.checkPasswordComplexity("ThreeAK");
    assertFalse(result);
    }
    
    /**
     * Test of cellphone number method, of class Login.
     */
    
    @Test
    public void testCellPhoneNumberFormattedCorrectly(){
    
      boolean result = login.checkCellPhoneNumber("+27766113666");
      assertTrue(result);
    }
    
    @Test
    public void testCellPhoneNumberFormattedIncorrectly(){
    
    boolean result = login.checkCellPhoneNumber("0766113666");
    assertFalse(result);
    }
    
     @Test
    public void testLoginSuccessful() {

        boolean result = login.loginUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "kyl_1",
                "Ch&&sec@ke99!"
        );

        assertTrue(result);
    }
    
    @Test
    public void testLoginFailed() {

        boolean result = login.loginUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "kyl_1",
                "password"
        );

        assertFalse(result);
    }
    
}
