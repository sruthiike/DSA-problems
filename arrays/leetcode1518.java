class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int newFull=empty/numExchange;
            drunk+=newFull;
            empty=(empty%numExchange)+newFull;
        }
        return drunk;
    }
}