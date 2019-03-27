package LeetCode.M206_ReverseLinkedList;


class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        //add virtual headnode
        ListNode tempHead = new ListNode(0);
        tempHead.next = head;
        ListNode curr = head;
        ListNode temp;
        ListNode  tail =  tempHead.next;
        while(curr != null){
            temp = curr.next;
            curr.next = tempHead.next;
            tempHead.next = curr;
            curr = temp;
        }
        tail.next = null;
        return tempHead.next;

    }
}


class Test{
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head = solution.reverseList(head);
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}