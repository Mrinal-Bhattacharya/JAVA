package com.interviewbit.greedy.bucket;

public class Seats {
    private static final long MOD = 10000003;

    private static final char OCCUPIED = 'x';

    public int seats(final String a) {
        int numLeft = 0;
        int numRight = 0;
        for (int i = 0; i < a.length(); ++i) {
            if (a.charAt(i) == OCCUPIED) {
                ++numRight;
            }
        }

        long moves = 0;
        for (int i = 0; i < a.length(); ++i) {
            if (numRight == 0) {
                break;
            } else if (a.charAt(i) == OCCUPIED) {
                ++numLeft;
                --numRight;
            } else {
                moves += Math.min(numLeft, numRight);
            }
        }
        return (int) (moves % MOD);
    }

}
