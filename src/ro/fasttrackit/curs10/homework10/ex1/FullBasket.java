package ro.fasttrackit.curs10.homework10.ex1;

import java.util.Collection;

public interface FullBasket {
    void add(String item);
    void showBasket();

    boolean find(String item);
    boolean remove(String item);

    int position(String item);
    Collection<String> distinct();

    int count();
    int customCount();

}
