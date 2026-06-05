package day5;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++) {
            char ch = s.charAt(i);
            if(('a' <= ch && 'z' >= ch) || ('0' <= ch && '9' >= ch)) {
                sb.append(ch);
            }
        }
        for(int i = 0;i < sb.length()/2;i++) {
            if(sb.charAt(i) != sb.charAt(sb.length()-1-i)) {
                return false;
            }
        }
    return true;
    }
}