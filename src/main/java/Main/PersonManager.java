package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonManager {
    private List<Person> people = new ArrayList<>();

    public boolean addPerson(Person person) {
        return this.people.add(person);
    }

    public boolean removePerson(Person person) {
        return this.people.remove(person);
    }

    public void printAll() {
        for (Person p : this.people) {
            System.out.println(p);
        }
    }

    public List<Person> findByName(String name) {
        return this.people.stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList());
    }
}