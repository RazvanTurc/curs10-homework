package ro.fasttrackit.curs10.homework10.ex3;

public class Ex3Main {
    public static void main(String[] args) {
        Person razvan = new Person("Razvan", 25,"manager");
        Person razvan1 = new Person("Razvan2", 22,"manager");

        Company company = new Company();

        company.employ(razvan);
        company.employ(new Person("dragos",21, "plummer"));
        company.employ(new Person("miron",27, "plummer"));
        company.employ(new Person("pablo",31, "plummer"));
        System.out.println(company.getManager());
        System.out.println(company.getPersons("plummer"));
        company.employ(razvan1);
        System.out.println(company.getManager());
        System.out.println(company.getPerson("miron"));
        System.out.println(company.getPersonsOlder(24));

        company.employ(new Person("minor", 17, "manager"));
    }
}
