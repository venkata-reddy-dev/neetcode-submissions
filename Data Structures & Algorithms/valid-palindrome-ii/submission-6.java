class Solution {
    private boolean isPalindrome(char[] c, int l, int r) {
        while (l < r) {
            if (c[l] != c[r]) return false;
            l++;
            r--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        var c = s.toCharArray();
        var l = 0; var r = c.length - 1;

        while (l < r) {
            if (c[l] != c[r]) {
                return isPalindrome(c, l + 1, r) || isPalindrome(c, l, r - 1);
            }
            l++;
            r--;
        }

        return true;
    }
}