class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        // we are making an array
        int[] ans = new int[2 * n];

        // we are making a hashmap to simulate the storage 
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i, nums[i]);
            // length of ans which is an array get doubled
            ans[i] = map.get(i);
            ans[i + n] = map.get(i);
            
        }
        return ans;
    }
}