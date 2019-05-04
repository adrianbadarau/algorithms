package linked_list_contruction;

import org.jetbrains.annotations.Nullable;

// Feel free to add new properties and methods to the class.
class Program {
    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            // Write your code here.
            if (head == null) {
                head = node;
                tail = node;
                return;
            }
            insertBefore(head, node);
        }

        public void setTail(Node node) {
            // Write your code here.
            if (tail == null) {
                setHead(node);
                return;
            }
            insertAfter(tail, node);
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            // Write your code here.
            if (nodeToInsert == tail && nodeToInsert == head) {
                return;
            }
            remove(nodeToInsert);
            nodeToInsert.prev = node.prev;
            nodeToInsert.next = node;

            if (node.prev == null) {
                head = nodeToInsert;
            } else {
                node.prev.next = nodeToInsert;
            }
            node.prev = nodeToInsert;
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            // Write your code here.
            if (nodeToInsert == head && nodeToInsert == tail) {
                return;
            }
            remove(nodeToInsert);
            nodeToInsert.prev = node;
            nodeToInsert.next = node.next;

            if (node.next == null) {
                tail = nodeToInsert;
            } else {
                node.next.prev = nodeToInsert;
            }
            node.next = nodeToInsert;
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            // Write your code here.
            if (position == 1) {
                setHead(nodeToInsert);
                return;
            }
            var node = head;
            int i = 1;
            while (node != null && i != position) {
                node = node.next;
                i++;
            }
            if (node != null) {
                insertBefore(node, nodeToInsert);
            } else {
                setTail(nodeToInsert);
            }
        }

        public void removeNodesWithValue(int value) {
            // Write your code here.
            var node = head;
            while (node != null) {
                var temp = node;
                node = node.next;
                if (temp.value == value) {
                    remove(temp);
                }
            }
        }

        public @Nullable Node findNodeAtPosition(int position) {
            var pos = 1;
            var node = head;
            while (node != null) {
                if (pos == position) {
                    return node;
                }
                pos++;
                node = node.next;
            }
            return null;
        }

        public @Nullable Node findNodeByValue(int value) {
            var node = head;
            while (node != null) {
                if (node.value == value) {
                    return node;
                }
                node = node.next;
            }
            return null;
        }

        public void remove(Node node) {
            // Write your code here.
            if (node == head) {
                head = head.next;
            }
            if (node == tail) {
                tail = tail.prev;
            }
            removeNodeBindings(node);
        }

        public void removeNodeBindings(Node node) {
            if (node.prev != null) {
                node.prev.next = node.next;
            }
            if (node.next != null) {
                node.next.prev = node.prev;
            }
            node.prev = null;
            node.next = null;
        }

        public boolean containsNodeWithValue(int value) {
            // Write your code here.
            return findNodeByValue(value) != null;
        }
    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
