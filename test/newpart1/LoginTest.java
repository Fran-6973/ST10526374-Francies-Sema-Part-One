/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package newpart1;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {
    
    
    
     Login login = new Login();

    // ---------------------------------------------------------
    // USERNAME TESTS
    // ---------------------------------------------------------

    @Test
    public void testUsernameCorrectlyFormatted() {

        boolean result = login.checkUserName("Fran_");

        assertTrue(result);
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {

        boolean result = login.checkUserName("Francies");

        assertFalse(result);
    }


    // ---------------------------------------------------------
    // PASSWORD TESTS
    // ---------------------------------------------------------

    @Test
    public void testPasswordMeetsComplexityRequirements() {

        boolean result =
                login.checkPasswordComplexity("Threepumpchump6$");

        assertTrue(result);
    }

    @Test
    public void testPasswordDoesNotMeetComplexityRequirements() {

        boolean result =
                login.checkPasswordComplexity("password");

        assertFalse(result);
    }


    // ---------------------------------------------------------
    // CELL PHONE NUMBER TESTS
    // ---------------------------------------------------------

    @Test
    public void testCellPhoneNumberCorrectlyFormatted() {

        boolean result =
                login.checkCellPhoneNumber("+27766113666");

        assertTrue(result);
    }

    @Test
    public void testCellPhoneNumberIncorrectlyFormatted() {

        boolean result =
                login.checkCellPhoneNumber("0766113666");

        assertFalse(result);
    }


    // ---------------------------------------------------------
    // REGISTRATION TEST
    // ---------------------------------------------------------

    @Test
    public void testUserRegistrationSuccessful() {

        String result =
                login.registerUser(true, true, true);

        assertEquals(
                "User registered successfully.",
                result
        );
    }


    // ---------------------------------------------------------
    // LOGIN TESTS
    // ---------------------------------------------------------

    @Test
    public void testLoginSuccessful() {

        boolean result = login.loginUser(
                "Fran_",
                "Threepumpchump6$",
                "Fran_",
                "Threepumpchump6$"
        );

        assertTrue(result);
    }

    @Test
    public void testLoginFailedIncorrectPassword() {

        boolean result = login.loginUser(
                "Fran_",
                "Threepumpchump6$",
                "Fran_",
                "WrongPassword1!"
        );

        assertFalse(result);
    }

    @Test
    public void testLoginFailedIncorrectUsername() {

        boolean result = login.loginUser(
                "Fran_",
                "Threepumpchump6$",
                "Wrong_",
                "Threepumpchump6$"
        );

        assertFalse(result);
    }


    // ---------------------------------------------------------
    // LOGIN STATUS TESTS
    // ---------------------------------------------------------

    @Test
    public void testSuccessfulLoginStatusMessage() {

        String result = login.returnLoginStatus(
                true,
                "Francies",
                "Sema"
        );

        assertEquals(
                "Welcome Francies Sema, it is great to see you again.",
                result
        );
    }

    @Test
    public void testFailedLoginStatusMessage() {

        String result = login.returnLoginStatus(
                false,
                "Francies",
                "Sema"
        );

        assertEquals(
                "Username or password incorrect, please try again.",
                result
        );
    }
}

    
