package question11;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val1 = scanner.nextLine().trim();
        char val2 = scanner.next().charAt(0);
        Solution11 sol11 = new Solution11(val1, val2);
        sol11.display();
    }
}

class Solution11 {
    private String str;
    private char ch;

    Solution11(String str, char ch) {
        this.str = str;
        this.ch = ch;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public void display() {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println(i);
            }
        }
    }
}