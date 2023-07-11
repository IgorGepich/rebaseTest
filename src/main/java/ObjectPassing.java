import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project Duck
 */
public class ObjectPassing {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Mango", "Grapes"));
        System.out.println("List before " + Arrays.toString(fruits.toArray()));
//        processData(fruits);
        processDataSecond(fruits);
        System.out.println("List after " + Arrays.toString(fruits.toArray()));
    }

    private static void processData(List<String> fruitsRef){
        fruitsRef.add("Orange");
    }

    private static void processDataSecond(List<String> fruitsRef){
        fruitsRef = new ArrayList<>(fruitsRef);
        fruitsRef.add("Orange");
        System.out.println("From method " + Arrays.toString(fruitsRef.toArray()));
    }
}
