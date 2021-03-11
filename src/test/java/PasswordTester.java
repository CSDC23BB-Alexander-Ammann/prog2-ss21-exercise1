import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class PasswordTester {
    @BeforeAll
    static void init(){}

    @BeforeEach
    void setUp() {}

    Password testPass;

    @DisplayName("Test if length too short")
    @Test
    public void testLenght_TooShort(){
        testPass = new Password("abc");
        assertFalse(testPass.checkLength());
    }

    @DisplayName("Test if length is too long")
    @Test
    public void testLenght_TooLong(){
        testPass = new Password("abcasdjhasdüojasdaöjasdfsdfsd");
        assertFalse(testPass.checkLength());
    }

    @DisplayName("Test if length suits")
    @Test
    public void testLength_ok(){
        testPass = new Password("abcabcabcab");
        assertFalse(testPass.checkLength());

    }
    @DisplayName("Check for uppercase and lowercase")
    @Test
    public void testLetters_ForUpperCaseAndLowerCase() {
        testPass = new Password("asaskFGhAad");
        Boolean actual = testPass.checkLetters();
        assertFalse(actual);
    }
    @DisplayName("Check letters if lowercase")
    @Test
    public void testLetters_ForLowerCase() {
        testPass = new Password("aasdasdaad");
        assertFalse(testPass.checkLetters());
    }
    @DisplayName("Check letters if Uppercase")
    @Test
    public void testLetters_ForUpperCase() {
        testPass = new Password("ASDOJADASD");
        assertFalse(testPass.checkLetters());
    }
    @DisplayName("Check if numbers only")
    @Test
    public void test_IfNumbersOnly() {
        testPass = new Password("12343242351");
        assertTrue(testPass.testNumbers());
    }
    @DisplayName("Blank")
    @Test
    public void test_IfBlank() {
        testPass = new Password("");
        assertFalse(testPass.checkLetters());
    }
    @DisplayName("Check if Password has Space in it")
    @Test
    public void check_PasswordForSpaces(){
        testPass = new Password("Asads sdfdfa");
        assertFalse(testPass.checkPasswordForSpaces());
    }
    @DisplayName("Check when password with 3 numbers in order")
    @Test
    public void check_PasswordIfNumbersInOrder(){
        testPass = new Password("123adaAA");
        assertFalse(testPass.checkPasswordIfNumbersInOrder());
    }
    @DisplayName("Check Password if a number is written 4 times in a row")
    @Test
    public void check_PasswordNumberRepeating(){
        testPass = new Password("1111");
        assertFalse(testPass.checkPasswordForRepeatingNumbers());
    }

}
