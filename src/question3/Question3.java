package question3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        Solution3 sol3 = new Solution3(str);
        System.out.println(sol3.display());
    }
}

class Solution3 {
    private String name;
    private String val = "AEIOUaeiou";

    Solution3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String display() {
        for (int i = 0; i < val.length(); i++) {
            for (int j = 0; j < name.length(); j++) {
                if (val.charAt(i) == name.charAt(j)) {
                    name = name.replace(name.charAt(j), '*');
                }
            }
        }
        return name;
    }
}