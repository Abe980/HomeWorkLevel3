package hw3_1.task1And2;

import java.util.ArrayList;
import java.util.Collections;

public class ModificationArray<E> {

    E[] item;

    public ModificationArray(E... item) {
        this.item = item;
    }

    public E[] getItem() {
        return item;
    }

    public static <E> E[] swap (E[] arr, int firstIndex, int secondIndex) {
        // если цель именно изменить...
        E temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;

        return arr;
    }

    public static <E> ArrayList<E> arrayToArrayList (E[] arr) {
        ArrayList<E> al = new ArrayList<>();
        Collections.addAll(al, arr);
        return al;
    }
}
