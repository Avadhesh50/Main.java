import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.*;
public class Testclass {
    public static void main(String[] args) {
        String str = "Hellodata";

      Character ch =   str.chars()
                .mapToObj(m -> (char)m)
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                                .entrySet()
                                        .stream()
                                                .filter(entry -> entry.getValue() == 1)
                                                        .map(Map.Entry :: getKey)
                                                                .findFirst()
                                                                        .orElse(null);





        System.out.println("Hello0");
    }
}
