package homeworks.lecture5;

import java.util.*;
public class fifthExerciseLecture05 {

    public static void main(String[] args) {
        reverseOrderOfLinkedList();
    }
    public static void reverseOrderOfLinkedList(){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("Normal order: " + cars);
        for (int i = cars.size() - 1; i >= 0; i--) {
            System.out.print(cars.get(i) + " ");
        }
    }
    }
