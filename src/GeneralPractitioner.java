// Part 2 - Child class
// GeneralPractitioner.java
// Description: Represents a General Practitioner (GP) who extends HealthProfessional
public class GeneralPractitioner extends HealthProfessional {
    private String clinicHours; // e.g., "08:00 - 16:00"

    // Default Constructor
    public GeneralPractitioner() {
        super();
        this.clinicHours = "08:00 - 16:00"; // Default working hours
    }

    // Constructor with Parameters
    public GeneralPractitioner(int id, String name, String department, String clinicHours) {
        super(id, name, department);
        this.clinicHours = clinicHours;
    }

    // Getters and Setters
    public String getClinicHours() {
        return clinicHours;
    }

    public void setClinicHours(String clinicHours) {
        this.clinicHours = clinicHours;
    }

    // Overridden Method to Print Details
    @Override
    public void printDetails() {
        System.out.println("=== General Practitioner ===");
        super.printDetails();
        System.out.println("Clinic Hours: " + clinicHours);
    }
}