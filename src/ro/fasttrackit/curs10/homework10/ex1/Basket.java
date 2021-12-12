package ro.fasttrackit.curs10.homework10.ex1;

import java.util.*;

import static ro.fasttrackit.curs10.homework10.ex1.Ex1Utils.makeFirstLetterCapital;
import static ro.fasttrackit.curs10.homework10.ex1.Ex1Utils.ensureNotEmpty;

public class Basket implements FullBasket{
    private List<String> items = new LinkedList<>();
    Iterator<String> iterator = items.iterator();

    @Override
    public void add(String item) {
        items.add(makeFirstLetterCapital(ensureNotEmpty(item)));
    }

    @Override
    public boolean find(String item) {
        return items.contains(makeFirstLetterCapital(ensureNotEmpty(item)));
    }

    @Override
    public boolean remove(String item) {
        return items.remove(makeFirstLetterCapital(ensureNotEmpty(item)));
    }

    @Override
    public int position(String item) {
        return items.indexOf(makeFirstLetterCapital(ensureNotEmpty(item)));
    }

    @Override
    public Collection<String> distinct() {
        return new TreeSet<>(items);
    }

    @Override
    public int count() {
        return items.size();
    }

    @Override
    public int customCount() {
        int count = 0;

//        for(int i = 0; i < items.size(); i++) {
//            count++;
//        }

        while (iterator.hasNext() && count < items.size()) // nu inteleg de ce merge in infinite loop daca nu pun conditia de count...
            count++;
        return count;
    }
    @Override
    public void showBasket(){
        System.out.println(items);
    }
}
