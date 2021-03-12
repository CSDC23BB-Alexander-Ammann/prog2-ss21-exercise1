import java.security.PrivateKey;

public class Password {


    private String password;

    public Password(String pw) {
        this.password = pw;
    }

    public String getPw() {
        return password;
    }

    public void setPw(String pw) {
        this.password = pw;
    }

    public boolean checkLength() {
    if (this.password.length() >=8 && this.password.length() <=25){
        return true;
    }
    return false;
    }

    public boolean checkPasswordForSpaces(){
        return false; }
    public boolean checkPasswordIfNumbersInOrder(){
        return false;
    }


    public boolean checkLetters() {
        char[] letters = this.password.toCharArray();
        boolean upperCase = false;
        boolean lowerCase = false;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] <= 122 && letters[i] >= 97) {
                lowerCase = true;
            }
            if (letters[i] <= 90 && letters[i] >= 65) {
                upperCase = true;
            }

            if (lowerCase == true && upperCase == true) {
                return true;
            }
        }
        return false;

    }

    public boolean checkPasswordForRepeatingNumbers() {
        //muss noch programmiert werden
        return  false;
    }

    public boolean checkNumber() {
        char[] pwd = this.password.toCharArray();
        for (int i = 0; i < pwd.length; i++) {
            if (Character.isDigit(pwd[i])) {
                return true;
            }
        }
        return false;

    }

    public boolean checkchars() {
       //muss noch programmiert werden
        return true;
    }
}
