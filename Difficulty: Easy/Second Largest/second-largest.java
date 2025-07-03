class Solution {
    public int getSecondLargest(int[] arr) {
       int largest=1;
       for(int i=0;i<arr.length;i++){
           if(arr[i] > largest){
               largest=arr[i];
           }
       }
       int secondlargest=-1;
       for(int i=0;i<arr.length;i++){
           if(arr[i] > secondlargest && arr[i]!=largest){
               secondlargest=arr[i];
           }
       }
       return secondlargest;
       
    }
}