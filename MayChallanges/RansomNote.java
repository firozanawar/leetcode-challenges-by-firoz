package MayChallanges;

/**
 * Leetcode Challenge - May - Day3
 *
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 *
 * Each letter in the magazine string can only be used once in your ransom note.
 *
 * Note:
 * You may assume that both strings contain only lowercase letters.
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */
public class RansomNote {

    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            int index = ransomNote.indexOf(c);
            //System.out.println("c: "+c+ " , index: "+index);
            if (index != -1) {
                //System.out.println("ransomNote.substring(0, index) : "+ransomNote.substring(0, index));
                //System.out.println("ransomNote.substring(index + 1) : "+ransomNote.substring(index + 1));
                ransomNote = ransomNote.substring(0, index) + ransomNote.substring(index + 1);
            }
        }
        return ransomNote.isEmpty();
    }
}
