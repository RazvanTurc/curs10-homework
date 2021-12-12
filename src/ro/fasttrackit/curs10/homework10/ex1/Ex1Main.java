package ro.fasttrackit.curs10.homework10.ex1;

public class Ex1Main {
    public static void main(String[] args) {
        FullBasket fruitBasket = new Basket();

        fruitBasket.add("aPplE");
        fruitBasket.add("KIWI");
        System.out.println(fruitBasket.count());
        System.out.println(fruitBasket.customCount());
        fruitBasket.showBasket();

        System.out.println(fruitBasket.find("kiWi"));
        System.out.println(fruitBasket.find("apple"));
        System.out.println(fruitBasket.position("kiwi"));
        System.out.println(fruitBasket.remove("aPPLE"));

        System.out.println(fruitBasket.count());
        System.out.println(fruitBasket.customCount());
        fruitBasket.showBasket();


        fruitBasket.add("kiwi");
        fruitBasket.add("kiwi");
        fruitBasket.add("kiwi");
        fruitBasket.add("apple");
        fruitBasket.add("pear");
        fruitBasket.add("blueberry");

        System.out.println(fruitBasket.distinct());

    }
}
