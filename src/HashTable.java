/*
 * Ability to find frequency of words in a sentence like “To be or not to be”
 * Use LinkedList to do the Hash Table Operation To do this we create MyMapNode
 * with Key Value Pair and create LinkedList of MyMapNode
 */

public class HashTable {

    private HashNode Array[];
    private int noOfArrays;
    int size;

    /*
     * /Create HashTable custom array Constructor
     */

    public HashTable(int x) {
        this.noOfArrays = x;
        this.Array = new HashNode[noOfArrays];
        this.size = 0;
    }

    public HashTable() {
        this(10);
    }

    /*
     * Create HashNode like Linked list one link and two data types
     */
    public class HashNode {
        private Integer key;
        private String value;
        private HashNode next;

        // Create HashNode like Linked list Constructor
        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    /*
     * Fix the index depending on the key value for reducing the no of searching
     * iterations
     */
    public int getArrayIndex(Integer key) {
        int index = key % noOfArrays;
        return index;
    }

    /*
     * Put data in Hash Table using linked Node
     */

    public void putData(Integer key, String value) {
        if (key == null || value == null) {
            System.out.println("key or value are null");
        }
        int arrayIndex = getArrayIndex(key);
        HashNode head = Array[arrayIndex];

        /*
         * / check existing node in hash table
         */
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = Array[arrayIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        Array[arrayIndex] = node;

    }

    /*
     * Checking given string no.of times in Hash Table
     */

    public int freqChecker(String value) {
        HashNode node = Array[0];
        int wordCount = 0;
        while (node != null) {
            if (node.value.equals(value)) {
                wordCount++;
            }
            node = node.next;
        }
        return wordCount;
    }

}