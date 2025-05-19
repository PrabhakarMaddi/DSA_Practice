class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int i=0 ; i<nums.length - 1 ; i++){
            int compliment = target - nums[i]; 
            if(mp.containsKey(compliment)){
                ans[0] = mp.get(compliment);
                ans[1] = i;
                return ans;
            }
                mp.put(nums[i],i);
        }
        return ans;
        
    }
}
