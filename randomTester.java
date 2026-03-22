
import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class randomTester
{
    private Random generator;
    
    public randomTester()
    {
        generator = new Random();
    }

    public void printOneRandom(){
        System.out.println("one" + generator.nextInt());
    }
    
    public void printMultiRandom(int howMany){
        while( howMany > 0){
            System.out.println("multi" + " " + generator.nextInt(1000));
            howMany--;
        }
    }
    
    public int throwDice(){
        int dice =  generator.nextInt(6);
        return dice+1;
    }  
    
    public String getResponse(){
        ArrayList<String> responseList = new ArrayList<>();
         
        responseList.add("yes");
        responseList.add("no");
        responseList.add("maybe");
        
        int index = generator.nextInt(responseList.size());
        return responseList.get(index);
    }
}