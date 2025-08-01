import java.util.function.Predicate;
import java.util.*;
import java.util.Arrays;


class LmbdaEx{

    public static void main(String[] args) {
        
        Predicate<String> str = name -> (name.length()) > 4;

        System.out.println(str.test("Gayathri"));
    }

}

class Test{

      public static void main(String[] args) {
        
        List<String> ele =  Arrays.asList("John", "Alice", "Bob", "Jennifer", "Tom");
        Predicate<String> names = naming -> naming.length() > 3;

        List<String> result = new ArrayList<>();

        for(String obj : ele){

            if(names.test(obj));
            result.add(obj);
        

        }

        System.out.println(result);
      }   
}