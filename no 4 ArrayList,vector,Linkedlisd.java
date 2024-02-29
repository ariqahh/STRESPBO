package lat;
import java.util.*;
public class tugaspbo {
public static void main(String[] args) {
    LinkedList lingked =new LinkedList<>();
    Vector vec = new Vector<>();
    ArrayList <Integer > angka = new ArrayList<>();
    Scanner input = new Scanner (System.in);
    System.out.print("Masukan angka : ");
    int angka1 = input.nextInt();
    lingked.add(angka1);
    angka.add(angka1);
    vec.add(angka1);
    System.out.println(angka+" <--ini ArrayList\n"+lingked+" <--ini LinkedList\n"+vec+" <--ini Vect0r");
}
}
