import java.util.*;

class Solution {
    public String[] createGrid(int m, int n) {
        char[][] board=new char[m][n];
        for(int i=0;i<m;++i) Arrays.fill(board[i],'#');
        
        for(int i=0;i<n;++i) board[0][i]='.';
        for(int i=0;i<m;++i) board[i][n-1]='.';

        String[] result=new String[m];
        for(int i=0;i<m;++i) result[i]=new String(board[i]);
        
        return result;
    }
}
