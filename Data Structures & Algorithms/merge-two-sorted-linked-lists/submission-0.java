/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
         if(list1 == null && list2 == null){
            return null;
        }
        
        if(list1==null){
            return list2;
        }

        if(list2==null){
            return list1;
        }

        ListNode list1CurrentNode=list1;
        ListNode list2CurrentNode=list2;
        ListNode head=null;
        ListNode currentHead=null;

        while(list1CurrentNode!=null && list2CurrentNode!=null){

            if(list1CurrentNode.val<list2CurrentNode.val){
                if(head==null){
                    head=list1CurrentNode;
                    currentHead=head;
                }else{
                currentHead.next=list1CurrentNode;
                currentHead=currentHead.next;
                }
                list1CurrentNode=list1CurrentNode.next;
                
            }else{
                if(head==null){
                    head=list2CurrentNode;
                    currentHead=head;
                }else{
                currentHead.next=list2CurrentNode;
                currentHead=currentHead.next;
                }
                list2CurrentNode=list2CurrentNode.next;
            }


        }

        if(list1CurrentNode==null && list2CurrentNode!=null){
             if(head==null){
                    head=list2CurrentNode;
                    currentHead=head;
                }else{
                currentHead.next=list2CurrentNode;
                }
        }

         if(list2CurrentNode==null && list1CurrentNode!=null){
             if(head==null){
                    head=list1CurrentNode;
                    currentHead=head;
                }else{
                currentHead.next=list1CurrentNode;
                }
        }


        return head;

       
    }
}