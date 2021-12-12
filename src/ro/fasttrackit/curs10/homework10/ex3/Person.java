package ro.fasttrackit.curs10.homework10.ex3;

import static ro.fasttrackit.curs10.homework10.ex1.Ex1Utils.ensureNotEmpty;
import static ro.fasttrackit.curs10.homework10.ex1.Ex1Utils.makeFirstLetterCapital;

public class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = (makeFirstLetterCapital(ensureNotEmpty(name)));
        this.age = Math.max(age, 1);
        this.profession = (makeFirstLetterCapital(ensureNotEmpty(profession)));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    @Override
    public String toString() {
        return
                "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Profession: " + profession + "\n";
    }
}
