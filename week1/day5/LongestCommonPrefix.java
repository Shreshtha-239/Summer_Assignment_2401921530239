package day5;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        StringBuilder sb = new StringBuilder();
        int l;
        sb.append(strs[0]);
        for(int i = 1;i < strs.length;i++) {
            l = 0;
            for(int j = 0;j < Math.min(sb.length(), strs[i].length());j++) {
                if(sb.charAt(j) == strs[i].charAt(j)) {
                    l++;
                } else {
                    break;
                }
            }
            if(l == 0) return "";
            sb = sb.delete(l, sb.length());
        }
        return sb.toString();
    }
}