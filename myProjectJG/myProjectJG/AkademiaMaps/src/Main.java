import java.util.ArrayList;
import java.util.HashMap;

public class Mapa {
//    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Jakub");
//        names.add("Barbora");
//        names.add("Charlotte");
//
//        for (String name : names){
//            System.out.println(name);
//        }
//        System.out.println(names.contains("Jakub"));
//        System.out.println(names.contains("Jakubko"));
//        System.out.println(names.contains("Charlotte"));
//    }

    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Jablko", "Ovocie, ktore je okruhle");
        dictionary.put("Cucoriedky", "Ovocie, ktore rastie na krikoch");
        System.out.println(dictionary);


    }

    public static void printSumAndAvg(int start, int stop) {

        if (stop < start){
            System.out.println("Sucet " + 0);
            System.out.println("Priemer " + 0);
        } else if (stop == start){
            System.out.println("Sucet " + stop);
            System.out.println("Primer " + stop);
        }else {
            double sum = 0;
            for (int i = start; i <= stop; i++){
                sum += i;
            }
            System.out.println("Sucet " + sum);
            double avg = (double) sum / (stop - start + 1);
            System.out.println("Priemer " + avg);
        }

    }

}
