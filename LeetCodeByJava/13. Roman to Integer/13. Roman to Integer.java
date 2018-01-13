class Solution {
    public int romanToInt(String s) {
        if(s == null)
            return 0;
        int sum = 0;
        int count = s.length();
        int lastNum = 0;
        for(int i = count - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int temp = 0;
            switch(c) {
                case 'M':
                    temp = 1000;
                    break;
                case 'D':
                    temp = 500;
                    break;
                case 'C':
                    temp = 100;
                    break;
                case 'L':
                    temp = 50;
                    break;
                case 'X':
                    temp = 10;
                    break;
                case 'V':
                    temp = 5;
                    break;
                case 'I':
                    temp = 1;
                    break;
            }
            if(temp < lastNum)
                sum -= temp;
            else
                sum += temp;
            lastNum = temp;
        }
        return sum;
    }
}