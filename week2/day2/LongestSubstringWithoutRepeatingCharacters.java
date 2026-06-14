package day2;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")) {
            return 0;
        }
        int ll = 0;
        StringBuilder s1 = new StringBuilder();
        s1.append(s.charAt(0));
        for(int i = 1;i < s.length();i++) {
            for(int j = 0;j < s1.length();j++) {
                if(s1.charAt(j) == s.charAt(i)) {
                    ll = ll < s1.length()? s1.length() : ll;
                    s1.delete(0, j+1);
                    break;
                }
            }
            s1.append(s.charAt(i));
        }
        return ll < s1.length()? s1.length() : ll;
    }
}