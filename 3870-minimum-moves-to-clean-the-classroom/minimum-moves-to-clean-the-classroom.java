class Solution {
    public int minMoves(String[] classroom,int energy) {
        int m=classroom.length,n=classroom[0].length();
        int sr=-1,sc=-1,cnt=0;

        int[][] id=new int[m][n];

        for(int[] row:id){
            Arrays.fill(row,-1);
        }

        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(classroom[i].charAt(j)=='S'){
                    sr=i;
                    sc=j;
                }

                if(classroom[i].charAt(j)=='L'){
                    id[i][j]=cnt++;
                }
            }
        }

        int masks=1<<cnt;
        int full=masks-1;

        int[][][] best=new int[m][n][masks];

        for(int[][] layer:best){
            for(int[] row:layer){
                Arrays.fill(row,-1);
            }
        }

        class State{
            int r,c,mask,en,dist;

            State(int r,int c,int mask,int en,int dist){
                this.r=r;
                this.c=c;
                this.mask=mask;
                this.en=en;
                this.dist=dist;
            }
        }

        Queue<State> q=new LinkedList<>();
        q.add(new State(sr,sc,0,energy,0));
        best[sr][sc][0]=energy;

        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        while(!q.isEmpty()){
            State cur=q.poll();

            int r=cur.r,c=cur.c;
            int mask=cur.mask,en=cur.en,dist=cur.dist;

            if(mask==full){
                return dist;
            }

            if(en==0){
                continue;
            }

            for(int d=0;d<4;++d){
                int nr=r+dr[d],nc=c+dc[d];

                if(nr<0||nr>=m||nc<0||nc>=n){
                    continue;
                }

                if(classroom[nr].charAt(nc)=='X'){
                    continue;
                }

                int ne=en-1,nm=mask;

                if(classroom[nr].charAt(nc)=='L'){
                    nm|=1<<id[nr][nc];
                }

                if(classroom[nr].charAt(nc)=='R'){
                    ne=energy;
                }

                if(best[nr][nc][nm]>=ne){
                    continue;
                }

                best[nr][nc][nm]=ne;
                q.add(new State(nr,nc,nm,ne,dist+1));
            }
        }

        return -1;
    }
}