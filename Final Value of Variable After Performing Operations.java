class Solution {
    public int finalValueAfterOperations(String[] a) {
        int n=a.length;
        int x=0;
        for(int i=0;i<n;i++)
            if(a[i].equals("--X")||a[i].equals("X--")){
                 x--;
               }
                else if(a[i].equals("++X")||a[i].equals("X++")){
                    x++;
                }
            return x;
    }
}
