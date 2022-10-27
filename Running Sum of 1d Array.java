class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
          int a[]=new int[n];
        int sum,k=0;
        for(int i=1;i<=n;i++)
        {
            sum=0;
            for(int j=0;j<i;j++){
                sum=sum+nums[j];
            }
            a[k]=sum;
            k++;
        }
        return a;
    }
}
