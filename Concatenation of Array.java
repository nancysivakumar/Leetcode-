class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int a[]=new int[n+n];
        for(int i=0;i<n;i++)
        {
            a[i]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            a[i+n]=a[i];
        }
        return a;     
    }
}
