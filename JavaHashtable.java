import java.util.Hashtable;

public class JavaHashtable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(201, "To Kill A Mockingbird");
        ht.put(202, "The Hunger Games");
        ht.put(203, "Water for Elephants");
        ht.put(204, "Lord of the Flies");
        ht.put(205, "The Da Vinci Code");

        ht.forEach((key, value) -> {
            System.out.println(key + " "
                                + value);
        });

    }
}
