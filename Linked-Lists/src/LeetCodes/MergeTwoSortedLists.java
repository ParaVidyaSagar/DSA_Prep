package LeetCodes;

public class MergeTwoSortedLists {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }
            current.next = (list1 != null) ? list1 : list2;
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        // Create first sorted list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(5)));

        // Create second sorted list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(1, new ListNode(4, new ListNode(6)));

        // Merge the lists
        Solution sol = new Solution();
        ListNode merged = sol.mergeTwoLists(list1, list2);

        // Print the result
        printList(merged);
    }

    // Helper method to print a linked list
    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
