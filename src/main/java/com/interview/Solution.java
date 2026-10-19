package com.interview;

import java.io.PrintStream;

public class Solution {

    public int check() {
        return 1;
    }

    public static void main(String[] args) {
        run(System.out);
    }

    static void run(PrintStream out) {
        out.println("check() = " + new Solution().check());
    }
}
