package question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine().trim();
        Solution9 sol9 = new Solution9(val);
        System.out.println(sol9.display());
    }
}

class Solution9 {
    private String str;

    Solution9(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int display() {
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                c1 += (int) (str.charAt(i));
            }
            if (Character.isLowerCase(str.charAt(i))) {
                c2 += (int) (str.charAt(i));
            }
        }
        if ((c1 - c2) >= 0) {
            return (c1 - c2);
        } else {
            return (c2 - c1);
        }
    }
}