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
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        return loop(head,null);
    }

    public ListNode loop(ListNode node,ListNode previousNode){
        /**
        String msg= "";
        if(node!=null){
            msg = "current value :"+node.val;  
        }

         if(previousNode!=null){
             msg = msg + " prvious value :"+previousNode.val;
            
        }

        System.out.println(msg);
         **/
          if(node.next!=null){
            ListNode temp=node.next;
            node.next=previousNode;
            return loop(temp,node);
              
          }else{
              node.next=previousNode;
              return node;
          }
    }


   

   
}
