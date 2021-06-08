package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class lamdbda_01 {
    public static void main(String[] args) {
        Person[] arr = {
          new Person("ws",18),
          new Person("zh",20),
        };
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o2.getAge() - o1.getAge();
//            }
//        });
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o2.getAge() - o1.getAge();
        });
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
