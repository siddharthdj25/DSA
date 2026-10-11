public class Solution{
    public static int[] runningSum(int arr[]){
        int ans[]=new int[arr.length];
       int sum=0;
       int n= arr.length;
       for(int i=0;i<=n-1;i++){
        sum=sum+arr[i];
        ans[i]=sum;
       }
       return ans;
    }  
    
  
    
}