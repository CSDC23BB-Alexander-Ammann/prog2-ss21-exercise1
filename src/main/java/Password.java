public class Password {


    String pw;

    public Password(String pw) {
        this.pw = pw;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public boolean checkLength() {

        return false;
    }

    public boolean testNumbers() {
        char[] pwd = this.pw.toCharArray();
        for (int i = 0; i < pwd.length; i++) {
            if (pwd[i] >= 0 && pwd[i] <=9) {
                return true;
            }
        }
        return false;
    }

    public boolean checkPasswordForSpaces(){
        return false; }
    public boolean checkPasswordIfNumbersInOrder(){
        return false;
    }


    public boolean checkLetters() {
        char[] letters = this.pw.toCharArray();
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
}
