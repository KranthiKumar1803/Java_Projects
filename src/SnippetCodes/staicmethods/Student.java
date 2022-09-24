package SnippetCodes.staicmethods;


import java.util.List;

public class Student {
    private int id;
    private String name;
    private String emailId;
    private List<String> phoneNumbers;

    public Student(int id, String name, String emailId, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.phoneNumbers = phoneNumbers;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}