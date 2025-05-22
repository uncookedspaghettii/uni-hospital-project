import java.util.HashMap;
import java.util.Map;

public class DoctorAssignments {
    private Map<Integer, Doctor> doctors;

    public DoctorAssignments() {
        doctors = new HashMap<>();
    }

    // Add a new doctor
    public void addDoctor(Doctor doctor) {
        doctors.put(doctor.getDoctorId(), doctor);
    }

    // Retrieve a doctor by ID
    public Doctor getDoctor(int doctorId) {
        return doctors.get(doctorId);
    }

    // Display all doctors
    public void displayAllDoctors() {
        System.out.println("\n=== Doctor Assignments ===");
        for (Doctor doctor : doctors.values()) {
            System.out.println(doctor);
            System.out.println("-------------------");
        }
    }

    // Get all doctors in a specific department
    public void displayDoctorsByDepartment(String department) {
        System.out.println("\n=== Doctors in " + department + " Department ===");
        for (Doctor doctor : doctors.values()) {
            if (doctor.getDepartment().equalsIgnoreCase(department)) {
                System.out.println(doctor);
                System.out.println("-------------------");
            }
        }
    }
}