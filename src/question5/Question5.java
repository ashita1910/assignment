package question5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val1 = scanner.nextLine().trim();
        String val2 = scanner.nextLine().trim();
        String val3 = scanner.nextLine().trim();
        Solution5 sol5 = new Solution5(val1, val2, val3);
        System.out.println(sol5.display());
    }
}

class Solution5 {
    private String str1;
    private String str2;
    private String str3;

    Solution5(String str1, String str2, String str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    public String display() {
        str1 = str1.replaceAll(str2, str3);
        return str1;
    }
}