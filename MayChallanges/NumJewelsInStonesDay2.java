package MayChallanges;

import java.util.HashMap;

/**
 * Leetcode Challenge - May - Day2
 * <p>
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
 * so "a" is considered a different type of stone from "A".
 * <p>
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * <p>
 * Input: J = "z", S = "ZZ"
 * Output: 0
 */
public class NumJewelsInStonesDay2 {

    public static void main(String[] args) {
        String J = "bce";
        String S = "eea";
        System.out.println("Number of stones in jewels are: " + numJewelsInStones(J, S));
    }

    public static int numJewelsInStones(String J, String S) {

        int count = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {

            if (hashMap.containsKey(S.charAt(i))) {
                hashMap.put(S.charAt(i), (hashMap.get(S.charAt(i))) + 1);
            } else {
                hashMap.put(S.charAt(i), 1);
            }
        }

        for (int j = 0; j < J.length(); j++) {
            if (hashMap.containsKey(J.charAt(j))) {
                count = count + hashMap.get(J.charAt(j));
            }
        }

        return count;
    }
}
