class Solution {
    public int mostFrequentEven(int[] nums) {
       HashMap<Integer, Integer> map=new HashMap<>();
       for(int num:nums){
        if(num%2==0){
            map.put(num,map.getOrDefault(num,0)+1);
        }
       }
      int maxfreq=0;
      int ans=-1;
      for(Map.Entry<Integer, Integer> entry:map.entrySet()){
        int key=entry.getKey();
        int value=entry.getValue();
           if(value>maxfreq || (value==maxfreq && key<ans)){
               maxfreq=value;
               ans=key;
           }
      }
      return ans;
    }
}