import org.junit.jupiter.api.*;

//GITHUB Link
//https://github.com/CSDC23BB-Alexander-Ammann/prog2-ss21-exercise1


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
        assertTrue(testPass.checkLength());

    }
    @DisplayName("Check for uppercase and lowercase")
    @Test
    public void testLetters_ForUpperCaseAndLowerCase() {
        testPass = new Password("asaskFGhAad");
        Boolean actual = testPass.checkLetters();
        assertTrue(actual);
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
        assertFalse(testPass.checkLetters());
    }
    @DisplayName("Blank")
    @Test
    public void test_IfBlank() {
        testPass = new Password("");
        assertFalse(testPass.checkLetters());
    }

    @DisplayName("Check no numbers")
    @Test
    public void test_ifnonum() {
        testPass = new Password("asdijadADSA!!");
        assertFalse(testPass.checkNumber());
    }

    @DisplayName("Check if with numbers")
    @Test
    public void test_ifwithnum() {
        testPass = new Password("asdi1322jADSA!!");
        assertTrue(testPass.checkNumber());
    }
    @DisplayName("No Special Characters included")
    @Test
    public void test_ifcharsincluded() {
        testPass = new Password("asdi1322jADSA");
        assertFalse(testPass.checkchars());
    }

    @DisplayName("Wrong Character used")
    @Test
    public void test_ifwrongcharacterused() {
        testPass = new Password("asdi1322€jADSA");
        assertFalse(testPass.checkchars());
    }

    @DisplayName("Character used correctly")
    @Test
    public void test_ifcharscorrect() {
        testPass = new Password("asdi1322!!j?SA");
        assertTrue(testPass.checkchars());
    }
    /*  @DisplayName("Check if Password has Space in it")
    @Test
    public void check_PasswordForSpaces(){
        testPass = new Password("Asads sdfdfa");
        assertFalse(testPass.checkLetters());
    }*/
    @DisplayName("Check when password with 3 numbers in order")
    @Test
    public void check_PasswordIfNumbersInOrder(){
        testPass = new Password("123adaAA");
        assertFalse(testPass.checkPasswordIfNumbersInOrder());
    }

    @DisplayName("Check when password with 3 numbers in order ")
    @Test
    public void check_PasswordIfNumbersInOrder_backwards(){
        testPass = new Password("321adaAA");
        assertTrue(testPass.checkPasswordIfNumbersInOrder());
    }

    @DisplayName("Check when password with 3 numbers in order")
    @Test
    public void check_PasswordIfNumbersInOrder_2(){
        testPass = new Password("12adaAA");
        assertTrue(testPass.checkPasswordIfNumbersInOrder());
    }

    @DisplayName("Check Password if a number is written 4 times in a row")
    @Test
    public void check_PasswordNumberRepeating(){
        testPass = new Password("1111sdfsdfsdf");
        assertFalse(testPass.checkPasswordForRepeatingNumbers());
    }

    @DisplayName("Check Password if a number is written 4 times in a row")
    @Test
    public void check_PasswordNumberNotRepeating(){
        testPass = new Password("111sdfsdfsdf");
        assertTrue(testPass.checkPasswordForRepeatingNumbers());
    }
    @DisplayName("Check Password if a number is written 4 times in a row")
    @Test
    public void check_PasswordNumberNotRepeating_1(){
        testPass = new Password("sdfsdf11sdf1111");
        assertFalse(testPass.checkPasswordForRepeatingNumbers());
    }
}
