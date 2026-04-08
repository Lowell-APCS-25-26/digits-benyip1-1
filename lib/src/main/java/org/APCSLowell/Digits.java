package org.APCSLowell;

import java.util.ArrayList;

public class Digits {
    /** The list of digits from the number used to construct this object.
     *  The digits appear in the list in the same order in which they appear in the original number
     */
    public ArrayList<Integer> digits;

    /** Constructs a `Digits` object that represents `num`.
     *  *Precondition*: `num >= 0`
     */
    public Digits(int num) {
        digits = new ArrayList <Integer>();
        if(num == 0) digits.add(0);
        int n = num;
        while(n > 0){
            digits.add(0, n % 10);
            n = n/10;
        }
    }

    /** Returns `true` if the digits in this `Digits` object are in strictly increasing order;
     *      `false` otherwise.
     */
    public boolean isStrictlyIncreasing() {
        for(int i = 0; i < digits.size() - 1; i ++){
            if(digits.get(i + 1) <= digits.get(i)){
                return false;
            }
        }
        return true;
    }
}
