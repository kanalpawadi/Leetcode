class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(k==n){
            int max=Integer.MIN_VALUE;
            for(int i:nums){
               max= Math.max(max,i);
            }
            return max;
        }
        if(k==1){
            Map<Integer,Integer> map=new HashMap<>();
            for(int num:nums){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            int ans=-1;
            for(Map.Entry<Integer ,Integer > entry:map.entrySet()){
                if(entry.getValue()==1){
                    ans=Math.max(ans,entry.getKey());
                }
            }
            return ans;

        }
        Map< Integer , Integer > freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int first=nums[0];
        int last=nums[nums.length-1];
        if( freq.get(first) == 1 && freq.get(last) == 1 ){
            return Math.max(first,last);
        }
        else if(freq.get(first) == 1) return first;
        else if(freq.get(last)==1 ) return last;
        else return -1;
        
    }
}