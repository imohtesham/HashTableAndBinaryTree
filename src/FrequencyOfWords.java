
public class FrequencyOfWords {


    public static void main(String[] args) {

        //Create obj hashTable and HashNode like Linked list by using HashTable class
        HashTable hashTable = new HashTable();
        hashTable.putData(10, "To");
        hashTable.putData(20, "be");
        hashTable.putData(30, "or");
        hashTable.putData(40, "not");
        hashTable.putData(50, "to");
        hashTable.putData(60, "be");

        //Checking "To", "be", "or", "not" no.of times in HashTable
        System.out.println("Frequency of To : "+hashTable.freqChecker("To"));
        System.out.println("Frequency of be : "+hashTable.freqChecker("be"));
        System.out.println("Frequency of or : "+hashTable.freqChecker("or"));
        System.out.println("Frequency of not : "+hashTable.freqChecker("not"));

        //Checking size of the HashTable
        System.out.println("The size of hash table : " + hashTable.size);


        //Checking the values of the key
        System.out.println("Finding Given key value : "+hashTable.getKeyValue(20));

        String paraString = "paranoids are not paranoids because they are paranoid but they keep putting themselves deliberately into paranoid avoidable situation";
        System.out.println("Given Para String : " + paraString);
        hashTable.freqOfWords(paraString);
    }


}