package question7;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine().trim();
        Solution7 sol7 = new Solution7(val);
        System.out.println(sol7.display());
    }
}

class Solution7 {
    private String str;

    Solution7(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int display() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count += (int) (str.charAt(i));
        }
        return count;
    }
}