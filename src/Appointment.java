// Part 4 - Appointment class
// Appointment.java
// Description: Represents an appointment made by a patient with a health professional
public class Appointment {
    private String patientName;        // Patient's name
    private String patientMobile;      // Patient's mobile phone number
    private String timeSlot;           // Preferred time slot (e.g., 08:00, 10:30)
    private HealthProfessional doctor; // The selected doctor (can be GP or Radiologist)

    // Default Constructor
    public Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "0000000000";
        this.timeSlot = "00:00";
        this.doctor = null; // No doctor assigned yet
    }

    // Constructor with Parameters
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Getters and Setters
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientMobile() {
        return patientMobile;
    }

    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }

    // Method to Print Appointment Details
    public void printAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Assigned Doctor:");
        doctor.printDetails();
    }
}