class MyCircularQueue {
    
    private int space;
    private ListNode head;
    private ListNode tail;

    public MyCircularQueue(int k) {
        this.space = k;
        this.head = new ListNode(0); // Dummy head node
        this.tail = new ListNode(0); // Dummy tail node
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        ListNode cur = new ListNode(value, tail.prev, tail);
        tail.prev.next = cur;
        tail.prev = cur;
        space--;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head.next = head.next.next;
        head.next.prev = head;
        space++;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return head.next.val;
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return tail.prev.val;
    }

    public boolean isEmpty() {
        return head.next == tail;
    }

    public boolean isFull() {
        return space == 0;
    }

    private class ListNode {
        int val;
        ListNode prev;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode prev, ListNode next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */