package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class OddEventList {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 3 -> 5 -> 2 -> 9 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println("Original Linked List:");
        printList(head);

        // Call oddEvenList to rearrange the linked list
        head = oddEvenList(head);

        System.out.println("\nLinked List After oddEvenList:");
        printList(head);
    }

    public static ListNode oddEvenList(ListNode head) {
        // Create a linked list: 1 -> 3 -> 5 -> 2 -> 9 -> 4
        if (head != null) {
            ListNode odd = head, even = head.next, evenHead = even;

            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }

            odd.next = evenHead;
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
