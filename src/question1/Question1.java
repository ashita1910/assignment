package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        Solution1 sol1 = new Solution1(str);
        System.out.print("index:\t");
        System.out.println(sol1.index());
        System.out.print("chars:\t");
        System.out.println(sol1.chars());
    }
}

class Solution1 {
    public String val1 = "";
    public String val2 = "";
    private String name;

    Solution1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String index() {
        for (int i = 0; i < name.length(); i++) {
            val1 = val1 + i + '\t';
        }
        return val1;
    }

    String chars() {
        for (int i = 0; i < name.length(); i++) {
            val2 = val2 + name.charAt(i) + '\t';
        }
        return val2;
    }

}