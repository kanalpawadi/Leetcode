class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr=new int[2];
        int n1=-1;
        int n2=-1;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    n1=i;
                    n2=j;
                      break;
                }
            }
        }
        arr[0]=n1;
        arr[1]=n2;
        return arr;
    }
}