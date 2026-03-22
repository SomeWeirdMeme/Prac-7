import java.util.HashMap;

public class MapTest
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> phonebook;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTest()
    {
        phonebook = new HashMap<>();
    }

    public void enterNumber(String name, String number){
        phonebook.put(name, number);
    }
    
    public String lookupNumber(String name){
        return phonebook.get(name);
    }
}