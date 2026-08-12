class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null) return null;
       ListNode temp=head;
       int c=0;
       while(temp!=null){
          ++c;
          temp=temp.next;
       } 
       int []arr=new int[c];
       temp=head;
       for(int i=0;i<c;++i){
         arr[i]=temp.val;
         temp=temp.next;
       }
       temp=head;
       Arrays.sort(arr);
       for(int i=0;i<c;++i){
        temp.val=arr[i];
        temp=temp.next;
       }
       return head;
    }
}
