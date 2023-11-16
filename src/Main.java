// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void number(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        }
        else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        number("Chukanov", 985123, bookPhone);
        number("Ivanov", 9681234, bookPhone);
        number("Petrov", 546661235, bookPhone);
        number("Sidorov", 9908123, bookPhone);
        number("Pomidorov", 9996233, bookPhone);
        number("Ogurcov", 9777897, bookPhone);
        printBook(bookPhone);
    }
}
