//Time Complexity O(n logn) bcz of sorting and loop
//Space Complexity O(logn) sorting space [Arrays.sort() Uses TimSort . Requires O(log n) stack space internally]

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int minInterval=0;
        Arrays.sort(intervals,Comparator.comparingDouble(o -> o[1]));

        int lastEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] < lastEnd ){
                minInterval++;
             }else{
                lastEnd=intervals[i][1];
             }
        }
        
        return minInterval;
    }
}
