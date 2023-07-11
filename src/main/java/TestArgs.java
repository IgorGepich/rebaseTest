import java.util.Arrays;

/**
 * @project Duck
 */
public class TestArgs {
    public static void main(String[] args) {
        System.out.println("Hello " + args.length);

        for (int i = 0; i < args.length; i++){
            System.out.println("AGRS " + i + ":" + args[i]);
        }

//        try {
//            int first = Integer.parseInt(args[0]);
//            int second = Integer.parseInt(args[1]);
//            int rez = first + second;
//            System.out.println("sum = " + rez);
//        } catch (NullPointerException e) {
//
//        }

//        System.out.println("rez " + args[0] + args[1]);

        int a = 10;
        System.out.println("a = " + a);
        float b = 1f;
        System.out.println(b);


//        int [] c = new int[] {1, 2, 4, 6};
//        for (int j : c) {
//            System.out.println(j);
//        }
        int[] d = {10, 32, 5, 6};
            Arrays.sort(d);
            System.out.println(Arrays.toString(d));
    }
}
