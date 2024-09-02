public class StringBuilderClass {
    public static void main(String args[]){

        // Initialization of String Builder
        StringBuilder name = new StringBuilder();
        name.append("My");
        name.append(" name is ");
        name.append("Shyam.");
        System.out.println(name);

        // Chained appending
        StringBuilder names = new StringBuilder();
        names.append("Shyam").append(" Ranjan").append(" Dubey");
        System.out.println("Name : "+names);

        // Insertion at specific position
        StringBuilder nameInsert = new StringBuilder("Java");
        System.out.println(nameInsert);
        nameInsert.insert(2, " <-- is fun --> ");
        System.out.println(nameInsert);

        // How to check type of data ?
        System.out.println(name.getClass());
        System.out.println(name.toString().getClass());
    }
}
