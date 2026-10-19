package Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapPrectice {
    public static void main(String [] args){

          String str =  "Programer";
          HashMap<Character,Integer>  hashmap = new HashMap<>();
             char [] ch2 = new char[str.length()];


        for (char c : str.toCharArray()) {


              // System.out.println(c);
            hashmap.put(c, hashmap.getOrDefault(c,0)+1);

        }
        for(Map.Entry<Character,Integer> entry : hashmap.entrySet()){

            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }


     System.out.println(str.toCharArray());

    }
}
