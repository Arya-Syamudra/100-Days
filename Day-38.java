import java.util.HashSet;
import java.util.Set;

class Dcoder {
    public static void main(String[] args) {
        Set<String> manusia = new HashSet<>();
        manusia.add("Jojo");
        manusia.add("Joro");
        manusia.add("Jono");
        manusia.add("Joko");
        manusia.add("Asep");
        
        System.out.println(manusia);
        System.out.println(manusia.contains("Joko"));
        manusia.remove("Joko");
        System.out.println(manusia.contains("Joko"));
        System.out.println(manusia);     
    }
}
