// Part 1 - Base class
// HealthProfessional.java
// Description: Base class representing a generic health professional
public class HealthProfessional {
    private int id;                 // Health professional's ID (numbers only)
    private String name;            // Health professional's name
    private String department;      // Common attribute: department or area of practice

    // Default Constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.department = "General";
    }

    // Constructor with Parameters
    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters and Setters
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to Print Details
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}