// User function Template for Java

class Solution {
    int findOnce(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
          ans ^=arr[i];
    }
    return ans;
}
}