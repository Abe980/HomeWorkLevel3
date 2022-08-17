package hw3_1.task3;

import java.util.ArrayList;
import java.util.Collections;

public class Box<T extends Fruit> {
    ArrayList<T> fruit = new ArrayList();


    public static float getWeight(Box<? extends Fruit> b) {
        if (b.fruit.size()==0) {
            return 0.0f;
        } else {
            return ((float) b.fruit.size()*b.fruit.get(0).getWt());
        }
    }


    public boolean compare(Box<? extends Fruit> b) {
        return getWeight(this) == getWeight(b);
    }


    public void pour(Box<T> b) {
        b.fruit.addAll(this.fruit);
        this.fruit.clear();
    }


    public  void addFruit(T... fr) {
        Collections.addAll(fruit, fr);
    }

}
