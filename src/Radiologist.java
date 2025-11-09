// Part 2 - Child class
// Radiologist.java
// Description: Represents a Radiologist, a specific type of health professional
public class Radiologist extends HealthProfessional {
    private String equipmentType; // e.g., MRI, X-Ray, CT Scanner

    // Default Constructor
    public Radiologist() {
        super();
        this.equipmentType = "General Imaging Equipment";
    }

    // Constructor with Parameters
    public Radiologist(int id, String name, String department, String equipmentType) {
        super(id, name, department);
        this.equipmentType = equipmentType;
    }

    // Getters and Setters
    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    // Overridden Method to Print Details
    @Override
    public void printDetails() {
        System.out.println("=== Radiologist ===");
        super.printDetails();
        System.out.println("Equipment Type: " + equipmentType);
    }
}