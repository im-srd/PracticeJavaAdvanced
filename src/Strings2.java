public class Strings2 {
    public static void main(String args[]){
//        char name[] = {'t','o','n','y','@','s','t','a','r','k'};
//        for (int i : name){
//            System.out.print(i+"-->"); // this convert each character to its ASCII value.
//            System.out.print((char)i+"\t"); // this will print the exact value
//        }
//
//        String name2 = "\ntony@stark";
//        for (int i = 0; i<name2.length(); i++){
////            System.out.println(name2[i]); // aise kaam ni krta string me
//            System.out.print(name2.charAt(i));
//        }
//
        String n1 = "Shyam";
        String n2 = "Shyam";
        String n3 = n1;

        if (n1 == n2){
            System.out.println("n1 and n2 equal");
        }
        if (n1 == n3){
            System.out.println("n1 and n3 equal");
        }

        // n1 > n2 --> +ve
        // n1 == n2 --> 0
        // n1 < n2 --> -ve

        if (n1.compareTo(n2) == 0){
            System.out.println("n1 equal to n2");
        }
        if (n1.compareTo(n3) == 0){
            System.out.println("n1 equal to n3");
        }
    }
}
