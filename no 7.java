package tugas06;
import java.util.Arrays;
public class Tugas06 {

    
    public static void main(String[] args) {
        double[][] data = {
            {3.2, 9.1, 2.0, 4.2},
            {8.6, 2.6, 7.3, 8.1},
            {9.5, 4.1, 3.8, 4.9},
            {6.1, 2.8, 4.9, 8.3}
         };
        for (int i = 0; i < data.length; i++){
        System.out.println(Arrays.toString(data[i]));  
        }
    }
}
