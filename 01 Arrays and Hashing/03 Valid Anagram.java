// https://leetcode.com/problems/valid-anagram/description/

// time: O(n*logn+m*logm)
// space: O(n+m)

class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n != m) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < n; i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }

        return true;
    }
}

// time: O(n)
// space: O(n)

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> cnt = new HashMap<>();

        for (char ch : s.toCharArray()) {
            cnt.put(ch, cnt.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            cnt.put(ch, cnt.getOrDefault(ch, 0) - 1);
        }

        for (int val : cnt.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}

// time: O(n)
// space: O(1)

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] cnt = new int[26];

        for (char ch : s.toCharArray()) {
            cnt[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            cnt[ch - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (cnt[i] != 0) {
                return false;
            }
        }

        return true;
    }
}