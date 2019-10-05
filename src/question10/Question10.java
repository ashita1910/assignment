package question10;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val1 = scanner.nextLine().trim();
        char val2 = scanner.next().trim().charAt(0);
        Solution10 sol10 = new Solution10(val1, val2);
        System.out.println(sol10.indexDisplay());
    }
}

class Solution10 {
    private String str;
    private char ch;

    Solution10(String str, char ch) {
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

    public int indexDisplay() {
        return str.indexOf(ch);
    }
}