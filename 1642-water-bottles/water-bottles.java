class Solution {
    public int numWaterBottles(int numbottles, int numexchange) {
        int total = numbottles;
        while(numbottles >= numexchange){
            total=total + numbottles/numexchange;
            numbottles = (numbottles / numexchange) + (numbottles % numexchange);
        }
        return total;
    }
}