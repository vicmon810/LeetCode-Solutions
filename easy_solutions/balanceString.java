class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int flag = 0;

        for (char c : s.toCharArray()){
            if (c == 'R') flag++;
            else if (c =='L') flag --;

            if (flag == 0) count ++;


        }
        return count;
    }
    
}
