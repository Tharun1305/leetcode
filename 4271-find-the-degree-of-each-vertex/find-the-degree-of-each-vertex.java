class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] nums=new int[matrix[0].length];
        for(int i=0;i<matrix.length;++i){
            int count=0;
            for(int j=0;j<matrix[i].length;++j){
                if(matrix[i][j]==1) ++count;
            }
            nums[i]=count;
        }
        return nums;
    }
}