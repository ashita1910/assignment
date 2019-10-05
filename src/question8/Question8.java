package question8;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine().trim();
        Solution8 sol8 = new Solution8(val);
        System.out.println(sol8.display());
    }
}

class Solution8 {
    private String str;

    Solution8(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int display() {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                c += (int) (str.charAt(i));
            }
        }
        return c;
    }
}