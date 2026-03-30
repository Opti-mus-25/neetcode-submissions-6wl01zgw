
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false; 
        }

        char[] firstString = s.toCharArray();
        // string to an aaray of chracters
        char[] secondString = t.toCharArray();
        // second string to an Array of Characters
        Arrays.sort(firstString);

        Arrays.sort(secondString);

        return Arrays.equals(firstString, secondString);
         


    }
}
