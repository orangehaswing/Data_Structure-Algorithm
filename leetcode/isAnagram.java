package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class isAnagram {
    public boolean isAnagram_1(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if(c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }
}
