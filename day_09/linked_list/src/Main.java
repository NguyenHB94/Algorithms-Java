public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;
        Node n4 = null;

//        print(n1);
//        print(n4);
//        print(n2);
        n1 = addToTail(n1,5);
        print(n1);
        System.out.println();




    }
    public static void print(Node headNode) {
        if (headNode == null) {
            System.out.println("list is empty!");
        } else {
            Node temp = headNode;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }

        }
    }

    public static Node addTohead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return  newNode;
    }

    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode == null) {
            return newNode;
        } else {
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return headNode;

    }

    public static Node addToIndex(int value, Node headNode, int index) {
        if (index == 0) {
            return addTohead(headNode, value);
        }else {
            Node newNode = new Node(value);
            Node currentNode = headNode;
            int count = 0;
            while (currentNode != null) {
                count++;
                if (count == index) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                }
                currentNode = currentNode.next;
            }
        }
        return headNode;
    }
}
