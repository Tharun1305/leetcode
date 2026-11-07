import java.util.*;

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        PriorityQueue<int[]> free=new PriorityQueue<>((a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
        for(int i=0;i<servers.length;++i) free.offer(new int[]{servers[i],i});
        
        PriorityQueue<long[]> busy=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]) return Long.compare(a[0],b[0]);
            if(a[1]!=b[1]) return Long.compare(a[1],b[1]);
            return Long.compare(a[2],b[2]);
        });
        
        int m=tasks.length;
        int[] ans=new int[m];
        long time=0;

        for(int j=0;j<m;++j){
            time=Math.max(time,(long)j);
            while(!busy.isEmpty()&&busy.peek()[0]<=time){
                long[] cur=busy.poll();
                free.offer(new int[]{(int)cur[1],(int)cur[2]});
            }
            if(free.isEmpty()&&!busy.isEmpty()){
                time=busy.peek()[0];
                while(!busy.isEmpty()&&busy.peek()[0]<=time){
                    long[] cur=busy.poll();
                    free.offer(new int[]{(int)cur[1],(int)cur[2]});
                }
            }
            int[] s=free.poll();
            ans[j]=s[1];
            busy.offer(new long[]{time+tasks[j],s[0],s[1]});
        }
        return ans;
    }
}
