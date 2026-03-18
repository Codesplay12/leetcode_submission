class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int pile : piles){
            high = Math.max(high, pile);
        }

        int res = high;

        while(low <= high){
            int mid = low + (high - low)/2;
            long hours = calcHours(piles, mid); // ✅ long

            if(hours > h){
                low = mid + 1;
            }
            else{
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }

    long calcHours(int[] piles, int speed){ // ✅ returns long
        long hours = 0;
        for(int pile : piles){
            hours += (pile + speed - 1) / speed;
        }
        return hours;
    }
}
