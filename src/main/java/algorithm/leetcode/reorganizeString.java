package algorithm.leetcode;

import java.util.PriorityQueue;

/**
 * 767 重构字符串，看是否能把相同的字符串隔离开
 *
 * @Author: evilhex
 * @Date: 2019-04-08 18:19
 */
class reorganizeString {
    public String reorganizeString(String S) {
        int N = S.length();
        int[] count = new int[26];
        for (char c : S.toCharArray()) count[c - 'a']++;
        PriorityQueue<MultiChar> pq = new PriorityQueue<MultiChar>((a, b) ->
                a.count == b.count ? a.letter - b.letter : b.count - a.count);

        for (int i = 0; i < 26; ++i)
            if (count[i] > 0) {
                if (count[i] > (N + 1) / 2) return "";
                pq.add(new MultiChar(count[i], (char) ('a' + i)));
            }

        StringBuilder ans = new StringBuilder();
        while (pq.size() >= 2) {
            MultiChar mc1 = pq.poll();
            MultiChar mc2 = pq.poll();
            /*This code turns out to be superfluous, but explains what is happening
            if (ans.length() == 0 || mc1.letter != ans.charAt(ans.length() - 1)) {
                ans.append(mc1.letter);
                ans.append(mc2.letter);
            } else {
                ans.append(mc2.letter);
                ans.append(mc1.letter);
            }*/
            ans.append(mc1.letter);
            ans.append(mc2.letter);
            if (--mc1.count > 0) pq.add(mc1);
            if (--mc2.count > 0) pq.add(mc2);
        }
        if (pq.size() > 0) ans.append(pq.poll().letter);
        return ans.toString();
    }
}

class MultiChar {
    int count;
    char letter;

    MultiChar(int ct, char ch) {
        count = ct;
        letter = ch;
    }

    public static void main(String[] args) {
        reorganizeString reorganizeString = new reorganizeString();
        reorganizeString.reorganizeString("ababab");
    }
}