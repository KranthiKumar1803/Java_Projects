package SnippetCodes.practice;


public class Student {
    int id;
    String name;
    String emailId;
    String phone;

    public Student(){

    }

    public Student(int id, String name, String emailId, String phone) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phone=" + phone +
                '}';
    }
}
