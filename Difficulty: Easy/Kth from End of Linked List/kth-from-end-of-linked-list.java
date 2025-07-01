/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {
    int getKthFromLast(Node head, int k) {
        int length=0;
        Node curr=head;
        while(curr!=null){
            curr=curr.next;
            length++;
        }
        while(length < k){
            return -1;
        }
         curr=head;
        for(int i=0;i<length-k;i++){
            curr=curr.next;
        }
        return curr.data;
        
    }
}