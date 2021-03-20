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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
   
       
        if (l1.next == null){
            l1.next = l2.next;
        }
        while (l1.next!= null){
            
        }

        for ( int i = 0; i <l1.size();i++){
            if (l1[i]> l1[i+1]){
                int temp = l1[i];
                int num1 = l1[i+1];
                int num2=temp;              
           }
        }
        return l1;
    } 
}
