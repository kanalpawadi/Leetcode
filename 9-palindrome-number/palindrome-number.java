class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int digit=0;
        int origitnal=x;
        while(x>0){
          rev=x%10;
          digit=digit*10+rev;
          x=x/10;
        }
         return origitnal==digit;
        
    }
}