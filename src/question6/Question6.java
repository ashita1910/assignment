package question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine().trim();
        Solution6 sol6 = new Solution6(val);
        System.out.println(sol6.toUpper());
    }
}

class Solution6 {
    private String str;

    Solution6(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String toUpper() {
        return str.toUpperCase();
    }
}