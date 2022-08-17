package hw3_1.task3;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        GoldenApple goldenApple = new GoldenApple();

        Box<Apple> boxA1 = new Box<>();
        Box<Apple> boxA2 = new Box<>();
        Box<Orange> boxO1 = new Box<>();
        Box<GoldenApple> boxG1 = new Box<>();

        boxA1.addFruit(apple, apple, apple);
        boxA2.addFruit(apple, apple, apple, apple, apple, apple);
        boxO1.addFruit(orange, orange);
        boxG1.addFruit(goldenApple, goldenApple, goldenApple);
        System.out.println(boxG1.fruit);

        System.out.println("\n" + Box.getWeight(boxG1));
        System.out.println("\n" + boxG1.compare(boxA2));
        System.out.println(boxG1.compare(boxO1));

        System.out.println("\n" + boxA1.fruit.size() + "   " + boxA2.fruit.size());
        boxA1.pour(boxA2);
        System.out.println("\n" + boxA1.fruit.size() + "   " + boxA2.fruit.size());



    }

}