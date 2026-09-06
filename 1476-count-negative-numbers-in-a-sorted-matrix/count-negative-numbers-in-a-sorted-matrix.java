class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;++i){
            for(int j=0;j<grid[i].length;++j){
                if(0>grid[i][j]) ++c;
            }
        }
        return c;
    }
}