package ro.fasttrackit.curs10.homework10.ex2;

public class Ex2Main {

    public static void main(String[] args) {

        Bouquet flower = new Bouquet();

        flower.add("tranDaFIr");
        flower.add("tranDaFIr");
        flower.add("ghiOcEl");
        flower.add("tranDaFIr");
        flower.add(null);
        flower.add("");
        flower.add("LACRIMIOARA");
        System.out.println(flower.getAll());

        flower.remove(null);
        System.out.println(flower.getAll());
    }


}
