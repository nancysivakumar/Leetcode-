class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[n+n];
        int k=0;
        for(int i=0,j=n;i<n && j<2*n;i++,j++){
              a[k]=nums[i];
              a[k+1]=nums[j];
              k+=2;
             }
         return a;
        }
       
    }
