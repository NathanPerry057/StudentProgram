package ie.atu;

import java.util.Scanner;

public class student {
    private String name;
    private String email;
    private String course;

    Scanner s = new Scanner(System.in);

    public static void main(String [] args) {


    }

    public void setName() {
        System.out.println("Enter a name:");
        name = s.next();
    }
    public String getName() {
        return name;
    }
    public void setEmail() {
        System.out.println("Enter student email: ");
        email = s.next();
    }
    public String getEmail() {
        return email;
    }
    public void setCourse() {
        System.out.println("Enter student course");
        course = s.next();
    }
    public String getCourse() {
        return course;
    }

}
