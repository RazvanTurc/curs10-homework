package ro.fasttrackit.curs10.homework10.ex3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static ro.fasttrackit.curs10.homework10.ex1.Ex1Utils.ensureNotEmpty;
import static ro.fasttrackit.curs10.homework10.ex1.Ex1Utils.makeFirstLetterCapital;

public class Company {

    private List<Person> company = new ArrayList<>();
    private Person person;
    private static Person manager;

    public Person getManager() {
        return manager;
    }

    public List<Person> getPersons(String profession) {
        System.out.println("----------- Filter Profession -------------");
        List<Person> persons = new LinkedList<>();

        for (Person i : company) {
            if (i.getProfession().equals(makeFirstLetterCapital(ensureNotEmpty(profession)))) {
                persons.add(i);
            }
        }
        return persons;
    }

    public List<Person> getPersonsOlder(int age) {
        System.out.println("----------- Filter Age -------------");
        List<Person> persons = new LinkedList<>();

        for (Person i : company) {
            if (i.getAge() > age) {
                persons.add(i);
            }
        }
        return persons;
    }

    public List<Person> getPerson(String filterName) {
        System.out.println("----------- Filter Name -------------");
        List<Person> persons = new LinkedList<>();

        for (Person i : company) {
            if (i.getName().equals(makeFirstLetterCapital(ensureNotEmpty(filterName)))) {
                persons.add(i);
            }
        }
        return persons;
    }

    public void employ(Person person) {
        if (person.getAge() < 18) {
            System.out.println("I'm sorry " + person.getName() + " you're too young. I don't want to be the next R. Kelly");
        } else {
            if (company.size() == 0) {
                if(person.getProfession().equals("Manager")) {
                    manager = person;
                    company.add(manager);
                }
            } else if (person.getProfession().equals(("Manager"))) {
                manager = person;
            } else {
                company.add(person);
            }
        }
    }
}
