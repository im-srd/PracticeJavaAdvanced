import java.util.*;

public class Strings {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // shyam ranjan dubey
        System.out.println("name --> "+name); // name = shyam
        sc.nextLine(); // rest of the "ranjan dubey" is stored in this buffer.
        String fullname = sc.nextLine(); // shyam ranjan dubey
        System.out.println("name --> "+fullname); // fullname = shyam ranjan dubey
    }
}
