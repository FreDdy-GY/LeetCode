class Solution {
    public String intToRoman(int num) {
        String result = "";
        int sum = num;
        int[] numArray = new int[]{1000, 500, 100, 50, 10, 5, 1};
        char[] charArray = new char[]{'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        for (int i = 0;i< numArray.length; i++){
            int t = sum / numArray[i];
            for(int j = 0; j < t; j++)
                result += charArray[i];
            sum -= t * numArray[i];
            for(int k = i + 1; k < numArray.length; k++){
                int temp = numArray[i] - numArray[k];
                if((sum + numArray[k]) / numArray[i] == 1 && sum - numArray[k] > numArray[i] - sum && temp != numArray[k]){
                    result += charArray[k];
                    result += charArray[i];
                    sum -= numArray[i] - numArray[k];
                }
            }
        }
        return result;
    }
}