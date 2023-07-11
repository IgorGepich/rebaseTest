/**
 * @project Duck
 */
public class ParamPassing {
    public static void main(String[] args) {
        int data = 10;
        System.out.println("Data before " + data);
        processData(data);
        System.out.println("Data after " + data);
    }
    private static void processData(int data){
        data = data * 10;
    }
}
