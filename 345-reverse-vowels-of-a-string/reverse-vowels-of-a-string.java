class Solution {
    public String reverseVowels(String s) {
        Set<Character> v = new HashSet<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'));
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;

        while (l < r) {
            while (l < r && !v.contains(arr[l])) l++;
            while (l < r && !v.contains(arr[r])) r--;
            char t = arr[l]; arr[l] = arr[r]; arr[r] = t;
            l++; r--;
        }
        return new String(arr);
    }
}
