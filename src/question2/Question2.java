package question2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        int no = scanner.nextInt();
        Solution2 sol2 = new Solution2(str, no);
        System.out.println(sol2.subString());
    }
}

class Solution2 {
    private String name;
    private int index;

    Solution2(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String subString() {
        return name.substring(index);
    }
}