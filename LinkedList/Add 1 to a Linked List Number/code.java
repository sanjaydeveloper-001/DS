class Solution {
    public Node addOne(Node head) {
        
        Node temp = head;
        Node nNode = null;
        
        // Find last node which is not 9
        while(temp != null){
            if(temp.data < 9) nNode = temp;
            temp = temp.next;
        }
        
        // If such node exists
        if(nNode != null){
            nNode.data += 1;
            nNode = nNode.next;
            
            // Set all following nodes to 0
            while(nNode != null){
                nNode.data = 0;
                nNode = nNode.next;
            }
        }
        else{
            // All nodes are 9
            Node nn = new Node(1);
            Node t = head;
            
            while(t != null){
                t.data = 0;
                t = t.next;
            }
            
            nn.next = head;
            return nn;
        }
        
        return head;
    }
}
