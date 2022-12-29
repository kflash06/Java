import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.Map.Entry;
import java.util.Map;

public class ArrayListZip {
    public static void main(String[] args) {
      List<String> names = new ArrayList<String>(3);
      List<Integer> ages = new ArrayList<Integer>(3);
      
      names.add("Ketan");
      names.add("Hrishikesh");
      names.add("Bhavesh");
      
      ages.add(21);
      ages.add(22);
      ages.add(20);
      
      // for(int i = 0; i < names.size(); ++i) {
      //   System.out.printf("%s | %d\n", names.get(i), ages.get(i));
      // }
      
      Map<String, Integer> result = IntStream.range(0, names.size())
                                    .boxed()
                                    .collect(Collectors.toMap(
                                      names::get,
                                      ages::get)
                                    );
      
      result.entrySet().forEach(System.out::println);    
      
      for ( Entry entry : result.entrySet() ) {
        System.out.printf("%s | %s\n", entry.getKey(), entry.getValue());
      }
      
      System.out.println(result.entrySet());
  }
}
