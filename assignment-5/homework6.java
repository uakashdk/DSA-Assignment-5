class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {   
        
        vector<int> final;
        int ans=0;
        for(int i=0;i<nums.size();i++)
        {
            ans=ans^nums[i];
        }
        final.push_back(ans);
    
        // XOR n-1 ke liye
        for(int i=1;i<nums.size();i++)
        {
            ans=ans^i;
        }
        final.push_back(ans);
        return final;
    }
};