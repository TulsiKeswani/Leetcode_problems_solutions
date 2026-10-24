class MyLinkedList {

    private class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;
    public int size = 0;
    
    public int get(int idx) {
        if(idx >= size || idx < 0) return -1;

        Node temp = head;

        for(int i = 0; i <= idx-1; i++){
            temp = temp.next;
        }

        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    
    public void addAtIndex(int idx, int val) {
        if(idx < 0 || idx > size) return;

        if(idx == 0){
            addAtHead(val);
            return;
        }

        if(idx == size){
            addAtTail(val);
            return;
        }

        Node temp = head;
        Node newNode = new Node(val);
        size++;
        for(int i = 0; i < idx-1;i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void deleteAtIndex(int idx) {
        if(idx < 0 || idx >= size) return;
        

        if(size == 1){
            head = tail = null;
            size--;
            return;
        }

        if(idx == 0){
            head = head.next;
            size--;
            return;
        }

        Node temp = head;

        for(int i = 0; i < idx-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        if(temp.next == null){
            tail = temp;
        }

        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */