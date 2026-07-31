class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int current=0;
        for(int i=0;i<arr.length;i++){
            current+=arr[i];
            if(current==k){
                count++;
            }
            if(map.containsKey(current-k)){
                count+=map.get(current-k);
            }
            map.put(current,map.getOrDefault(current,0)+1);
        }
        return count;
    }
}