class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int num = x;
        int[] array = new int[10];
        int count = 0;
        int temp = 1000000000;
        for(int i = 0; i < 10; i++) {
            int r = num / temp;
            if(r != 0) {
                array[i] = r;
                num %= temp;
                count = count == 0 ? 10 - i : count;
            }
            temp /= 10;
        }
        for (int i = 0; i < count / 2; i++) {
            if(array[10 - count + i] != array[10 - i - 1])
                return false;
        }
        return true;
    }
}