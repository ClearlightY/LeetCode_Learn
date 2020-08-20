import java.util.LinkedList;
import java.util.List;

public class NoRepetStringLength_03 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        // String s = "pwwkew";
        // String s = "acdbamnqbqb";
        // String s = "bbbbb";
        // String s = " ";
        int length = lengthOfLongestSubString(s);
        System.out.println(length);
    }

    public static int lengthOfLongestSubString(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        LinkedList list = new LinkedList();
        // 存储最长字符串
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!list.contains(ch)) {
                list.add(s.charAt(i));
            } else {
                list.add(s.charAt(i));
                int re_index = list.indexOf(ch);
                System.out.println("re_index:" + re_index);
                for (int j = 0; j < re_index + 1; j++) {
                    list.poll();
                }
            }
            maxLength = Integer.max(maxLength, list.size());
        }
        return maxLength;
    }
}
