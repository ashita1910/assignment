package question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine().trim();
        Solution4 sol4 = new Solution4(val);
        sol4.display();
    }
}

class Solution4 {
    private String name;
    private String str1 = "";
    private String str2 = "";
    private String str3 = "";

    Solution4(String name) {
        str2 = name.toLowerCase();
        str3 = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void display() {
        int counter = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || str2.charAt(i) == 'o' || str2.charAt(i) == 'u') {
                counter += 1;
                if (counter % 3 == 1) {
                    str1 += '*';
                } else if (counter % 3 == 2) {
                    str1 += '^';
                } else {
                    str1 += '!';
                }
            } else {
                str1 += str3.charAt(i);
            }
        }
        System.out.println(str1);
    }
}