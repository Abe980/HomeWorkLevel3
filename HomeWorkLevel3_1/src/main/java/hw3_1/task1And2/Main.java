package hw3_1.task1And2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        ModificationArray<Integer> integ = new ModificationArray<>(1, 2, 3, 4, 5);
        ModificationArray<String> str = new ModificationArray<>("a", "b", "c", "d", "e");

        Integer[] e = ModificationArray.swap(integ.getItem(), 2, 3);
        for (int x : e) {
            System.out.print(x+" ");
        }

        ArrayList<Integer> aL = new ArrayList<>();
        aL = ModificationArray.arrayToArrayList(integ.getItem());
        System.out.println("\n"+aL);

        System.out.println(Arrays.toString(ModificationArray.swap(str.getItem(), 2, 3)));
        System.out.println(ModificationArray.arrayToArrayList(str.getItem()));
    }
}