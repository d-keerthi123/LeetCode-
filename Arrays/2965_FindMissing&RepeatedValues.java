//Time Complexity: O(n²)
//Space Complexity: O(n²) (because of the frequency array which depends on input size n*n+1)
//If extra space depends on input size → it’s NOT O(1).

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        int freq[]=new int[size+1];  // indices: 0 1 2 3 4

        //count freq of each number
        for(int i=0;i<grid.length;i++){//row
            for(int j=0;j<grid.length;j++){ //column
                freq[grid[i][j]]++;
            }
        }
        
        int repeated=-1; 
        int missing=-1;

        for(int i=1;i<=size;i++){
            if(freq[i]==2){ // repeated number found
                repeated=i;
            }
            if(freq[i]==0){
                missing=i; // missing number found
            }
        }
        return new int[]{repeated,missing};
    }
}
