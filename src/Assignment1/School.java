package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Person> members;

    public School() {
        members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Person p : members) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }

    public List<Person> getMembers() {
        return members;
    }
}

