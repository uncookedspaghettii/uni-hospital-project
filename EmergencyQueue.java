import java.util.PriorityQueue;

public class EmergencyQueue {
    private PriorityQueue<EmergencyPatient> queue;

    public enum Priority {
        HIGH(1), MID(2), LOW(3);

        private final int value;

        Priority(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private static class EmergencyPatient implements Comparable<EmergencyPatient> {
        PatientRecord patient;
        Priority priority;

        EmergencyPatient(PatientRecord patient, Priority priority) {
            this.patient = patient;
            this.priority = priority;
        }

        @Override
        public int compareTo(EmergencyPatient other) {
            return Integer.compare(this.priority.getValue(), other.priority.getValue());
        }
    }

    public EmergencyQueue() {
        queue = new PriorityQueue<>();
    }

    // Add a patient to the emergency queue with a priority
    public void enqueue(PatientRecord patient, Priority priority) {
        queue.add(new EmergencyPatient(patient, priority));
    }

    // Remove and return the highest priority patient
    public PatientRecord dequeue() {
        EmergencyPatient ep = queue.poll();
        return ep != null ? ep.patient : null;
    }

    // Peek at the highest priority patient without removing
    public PatientRecord peek() {
        EmergencyPatient ep = queue.peek();
        return ep != null ? ep.patient : null;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Display the current emergency queue
    public void displayQueue() {
        System.out.println("\n=== Emergency Queue ===");
        for (EmergencyPatient ep : queue) {
            System.out.println("Patient: " + ep.patient.getName() + 
                             " | Priority: " + ep.priority);
        }
    }
}