public class PatientRecords {
    private Node head;
    private int size;

    private class Node {
        PatientRecord data;
        Node next;

        Node(PatientRecord data) {
            this.data = data;
            this.next = null;
        }
    }

    public PatientRecords() {
        head = null;
        size = 0;
    }

    // Add a new patient to the list
    public void addPatient(PatientRecord patient) {
        Node newNode = new Node(patient);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Remove a patient by ID
    public boolean removePatient(int patientId) {
        if (head == null) return false;

        if (head.data.getPatientId() == patientId) {
            head = head.next;
            size--;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.getPatientId() == patientId) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Find a patient by ID
    public PatientRecord findPatient(int patientId) {
        Node current = head;
        while (current != null) {
            if (current.data.getPatientId() == patientId) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    // Update patient details
    public boolean updatePatient(int patientId, String name, int age, String contactInfo) {
        PatientRecord patient = findPatient(patientId);
        if (patient != null) {
            patient.setName(name);
            patient.setAge(age);
            patient.setContactInfo(contactInfo);
            return true;
        }
        return false;
    }

    // Display all patients
    public void displayAllPatients() {
        Node current = head;
        System.out.println("\n=== Patient Records ===");
        while (current != null) {
            System.out.println(current.data);
            System.out.println("-------------------");
            current = current.next;
        }
    }

    public int getSize() {
        return size;
    }
}