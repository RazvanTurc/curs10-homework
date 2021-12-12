package ro.fasttrackit.curs10.homework10.ex2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static ro.fasttrackit.curs10.homework10.ex1.Ex1Utils.ensureNotEmpty;
import static ro.fasttrackit.curs10.homework10.ex1.Ex1Utils.makeFirstLetterCapital;

public class Bouquet {

    Set<String> bouquet = new HashSet<>();

    public void add(String flower) {
        bouquet.add(makeFirstLetterCapital(ensureNotEmpty(flower)));
    }

    public Collection<String> getAll() {
        return bouquet;
    }

    public void remove(String flower) {
        bouquet.remove(makeFirstLetterCapital(ensureNotEmpty(flower)));
    }
}
