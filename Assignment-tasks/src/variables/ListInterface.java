package variables;

import java.util.List;

public class ListInterface {
    public static void removeEverySecond(List<Integer> list) {
        for (int i = 1; i < list.size(); i += 2) {
            list.remove(i);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        removeEverySecond(myList);
    }
}