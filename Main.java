public class Main {
    public static void main(String[] args) {
        // Step 1: Test Patient Records
        System.out.println("=== Testing Patient Records ===");
        PatientRecords patientRecords = new PatientRecords();
        
        // Add patients
        patientRecords.addPatient(new PatientRecord(101, "Omar", 25, "123456789"));
        patientRecords.addPatient(new PatientRecord(102, "Mohammad", 40, "234567891"));
        
        // Display all patients
        patientRecords.displayAllPatients();
        
        // Update a patient
        patientRecords.updatePatient(101, "Omar Saleh", 26, "123456789");
        System.out.println("\nAfter updating Omar's record:");
        patientRecords.displayAllPatients();
        
        // Step 2: Test Emergency Queue
        System.out.println("\n=== Testing Emergency Queue ===");
        EmergencyQueue emergencyQueue = new EmergencyQueue();
        
        // Add patients to emergency queue with priorities
        PatientRecord Omar = patientRecords.findPatient(101);
        PatientRecord Mohammad = patientRecords.findPatient(102);
        
        emergencyQueue.enqueue(Omar, EmergencyQueue.Priority.LOW);
        emergencyQueue.enqueue(Mohammad, EmergencyQueue.Priority.HIGH);
        
        // Display emergency queue
        emergencyQueue.displayQueue();
        
        // Treat the highest priority patient
        System.out.println("\nTreating the highest priority patient:");
        PatientRecord nextPatient = emergencyQueue.dequeue();
        System.out.println("Treating: " + nextPatient.getName());
        
        // Step 3: Test Treatment History
        System.out.println("\n=== Testing Treatment History ===");
        TreatmentHistory treatmentHistory = Omar.getTreatmentHistory();
        
        // Add treatments
        treatmentHistory.addTreatment("Surgery on 2025-02-01");
        treatmentHistory.addTreatment("Prescribed Antibiotics");
        treatmentHistory.addTreatment("Annual Checkup");
        
        // Display full treatment history
        treatmentHistory.displayFullHistory();
        
        // Get last treatment
        System.out.println("\nLast treatment performed: " + treatmentHistory.getLastTreatment());
        
        // Step 4: Test Doctor Assignments
        System.out.println("\n=== Testing Doctor Assignments ===");
        DoctorAssignments doctorAssignments = new DoctorAssignments();
        
        // Add doctors
        doctorAssignments.addDoctor(new Doctor(201, "Dr. Abdul Hamid", "Cardiology", "9AM-5PM"));
        doctorAssignments.addDoctor(new Doctor(202, "Dr. Mariam", "Neurology", "10AM-6PM"));
        
        // Display all doctors
        doctorAssignments.displayAllDoctors();
        
        // Display doctors by department
        System.out.println("\nDisplaying doctors in Cardiology department:");
        doctorAssignments.displayDoctorsByDepartment("Cardiology");

    }
}

























