package LeetCode.M5_LongestPalindromic;


class Solution {
    public  String longestPalindrome(String s) {
        if (s.length() == 0 || s == null)
            return "";
        int center = 0;
        String res = "";
        for (int i = 0 ; i < s.length() ; i ++){
            String j = resolve(s,i);
            if( j.length() > res.length() )
                res = j;

        }
//        if (s.charAt(0) == s.charAt(1) )
//            res = s.charAt(0) + res;
        return res;
    }
    public String resolve(String s, int center){
        int i = center;
        int left = center;
        int right = center;
        int left2 = center;
        int right2 = center;

        boolean flag = false;
        boolean evenFlag = false;

        for (; left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ; left--, right ++ ){
            flag = true;
        }
        //偶数

        right2++;
        for ( ; left2 >= 0 && right2 < s.length() && s.charAt(left2) == s.charAt(right2)  ;  left2--, right2 ++){
            evenFlag = true;
        }

        if (flag) {
            left ++;
            right --;
        }


        StringBuilder stringBuilder = new StringBuilder();
        for(;left <= right ; left ++){
            stringBuilder.append( s.charAt(left) );
        }

        StringBuilder stringBuilder2 = new StringBuilder();

        if( evenFlag ){
            left2++;
            right2--;
            for(;left2 <= right2 ; left2 ++){
                stringBuilder2.append( s.charAt(left2) );
            }
        }

        return stringBuilder.toString().length() > stringBuilder2.toString().length() ? stringBuilder.toString() : stringBuilder2.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("ab: " + solution.longestPalindrome("ab"));
        System.out.println("a: " + solution.longestPalindrome("a"));
        System.out.println("aa: " + solution.longestPalindrome("aa"));
        System.out.println("acaa: " + solution.longestPalindrome("acaa"));
        System.out.println("acaaaa: " + solution.longestPalindrome("acaaaa"));

    }
}
