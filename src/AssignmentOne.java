// Part 3 – Using classes and objects
// AssignmentOne.java
// A simple appointment system for a health service

import java.util.ArrayList;

public class AssignmentOne {

    // ------------------------------
    // Main Method
    // ------------------------------
    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");

        // Create General Practitioners
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Smith", "General Medicine", "08:00 - 16:00");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Brown", "Family Practice", "09:00 - 17:00");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Lee", "Community Health", "10:00 - 18:00");

        // Create Radiologists
        Radiologist r1 = new Radiologist(201, "Dr. Allen", "Radiology", "MRI");
        Radiologist r2 = new Radiologist(202, "Dr. Chen", "Radiology", "CT Scanner");

        // Print details
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");
        r1.printDetails();
        System.out.println("------------------------------");
        r2.printDetails();

        System.out.println("------------------------------");

        // -------------------------------------------------
        // Part 5 – Collection of appointments
        // -------------------------------------------------
        System.out.println("// Part 5 – Collection of appointments");

        // Create a list to store Appointment objects
        ArrayList<Appointment> appointments = new ArrayList<>();

        // Create and add new appointments
        createAppointment(appointments, "Alice", "0411111111", "09:00", gp1);
        createAppointment(appointments, "Bob", "0422222222", "10:30", gp2);
        createAppointment(appointments, "Charlie", "0433333333", "13:00", r1);
        createAppointment(appointments, "Diana", "0444444444", "15:30", r2);

        // Print all existing appointments
        System.out.println("\n--- Existing Appointments ---");
        printExistingAppointments(appointments);

        System.out.println("------------------------------");

        // Cancel one appointment (by mobile number)
        cancelBooking(appointments, "0433333333"); // Cancels Charlie’s appointment

        System.out.println("\n--- Updated Appointments After Cancellation ---");
        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }

    // ------------------------------
    // Method: createAppointment
    // ------------------------------
    public static void createAppointment(ArrayList<Appointment> list, String name, String mobile, String timeSlot, HealthProfessional doctor) {
        if (name == null || name.isEmpty() || mobile == null || mobile.isEmpty() || doctor == null) {
            System.out.println("Error: Missing required appointment information. Appointment not created.");
            return;
        }

        Appointment newAppointment = new Appointment(name, mobile, timeSlot, doctor);
        list.add(newAppointment);
        System.out.println("Appointment created successfully for " + name + " (" + mobile + ")");
    }

    // ------------------------------
    // Method: printExistingAppointments
    // ------------------------------
    public static void printExistingAppointments(ArrayList<Appointment> list) {
        if (list.isEmpty()) {
            System.out.println("No existing appointments found.");
            return;
        }

        for (Appointment a : list) {
            a.printAppointmentDetails();
            System.out.println("------------------------------");
        }
    }

    // ------------------------------
    // Method: cancelBooking
    // ------------------------------
    public static void cancelBooking(ArrayList<Appointment> list, String mobile) {
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            Appointment a = list.get(i);
            if (a.getPatientMobile().equals(mobile)) {
                list.remove(i);
                System.out.println("Appointment for mobile " + mobile + " has been successfully cancelled.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Error: No appointment found for mobile number " + mobile);
        }
    }
}