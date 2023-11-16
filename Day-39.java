import java.util.HashMap;

class Dcoder {
    public static void main(String[] args){
        HashMap<String, Integer> umur = new HashMap<>();

        umur.put("Jojo", 35);
        umur.put("Joro", 20);
        umur.put("Jono", 25);

        int umurJoro = umur.get("Joro");
        System.out.println("Umur umur Joro adalah " + umurJoro);

        umur.remove("Jono");

        
        for (String nama : umur.keySet()) {
            System.out.println(nama + " : " + umur.get(nama));
        }

        System.out.println(umur.containsKey("Jojo"));
    }
}
