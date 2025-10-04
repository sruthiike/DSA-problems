class Solution {
    public int[] topKFrequent(int[] nums, int k) {
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
        for(int i=bucket.length-1;i>=0 && result.size()<k;i--){
            if(!bucket[i].isEmpty()){
                result.addAll(bucket[i]);
            }
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=result.get(i);
        }
        return res;
    }
}