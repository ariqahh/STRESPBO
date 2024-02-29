import java.util.ArrayList;
import java.util.Scanner;
public class number6 {
    public static void main(String[] args) {
        ArrayList<String> data =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String element;
        while (!(element = sc.nextLine()).equals("EOF")){
            data.add(element);
        }
        System.out.println("Data : "+data);
    }
}
