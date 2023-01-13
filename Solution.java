class Solution {
    public static int romanToInt(String s) {

        int value = 0 , result = 0;

        for (int i = 0 ; i< s.length(); i++) {
            switch(s.charAt(i)) {
                case 'I': value = 1; break;
                case 'V': value = 5; break;
                case 'X': value = 10; break;
                case 'L': value = 50; break;
                case 'C': value = 100; break;
                case 'D': value = 500; break;
                case 'M': value = 1000; break;
            }
            if (i < s.length()-1) {
                if (s.charAt(i) == 'I' && (s.charAt(i + 1) == 'X' || s.charAt(i + 1) == 'V')) value -= 2;
                if (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) value -= 20;
                if (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) value -= 200;
            }
            result += value;

        }
        return result;
    }


}
