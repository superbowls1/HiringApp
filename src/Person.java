

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String major;
    private List<String> skills;

    public Person(String name, String major, String[] skills) {
        this.name = name;
        this.major = major;
        this.skills = new ArrayList<>();
        for (String skill : skills) {
            this.skills.add(skill);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String Major) {
        this.major = major;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Person" + name + " major" + major + " skillList " + skills;
    }


}
    //new applicants, current employees, past employees

    //Item 3. in Assign 4 Document.

    //define data fields: name, degree, skill list ("Java, C#, C++", etc.)
    //  skill list: must be array list or linked list


    //define the constructor with given name, degree, and skill list

    //define getters

    //define setters

    //define toString()


