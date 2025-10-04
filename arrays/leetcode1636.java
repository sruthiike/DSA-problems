class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
       List<Integer> bucket[]=new ArrayList[nums.length+1];
       for(int i=0;i<=nums.length;i++){
          bucket[i]=new ArrayList<>();
       }
       for(Map.Entry<Integer, Integer> entry:map.entrySet()){
        int key=entry.getKey();
        int value=entry.getValue();
        bucket[value].add(key);
       }
       List<Integer> result=new ArrayList<>();
       for(int i=0;i<=bucket.length-1;i++){
        if(!bucket[i].isEmpty()){
            Collections.sort(bucket[i],Collections.reverseOrder());
            for(int num:bucket[i]){
                for(int j=0;j<i;j++){
                    result.add(num);
                }
            }
        }
       }
       int ans[]=new int[nums.length];
       for(int i=0;i<result.size();i++){
           ans[i]=result.get(i);
    }
     return ans;
    }
}