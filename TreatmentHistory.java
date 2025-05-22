import java.util.Stack;

public class TreatmentHistory {
    private Stack<String> treatments;

    public TreatmentHistory() {
        treatments = new Stack<>();
    }

    // Add a new treatment to the history
    public void addTreatment(String treatment) {
        treatments.push(treatment);
    }

    // Get the last treatment performed
    public String getLastTreatment() {
        return treatments.isEmpty() ? "No treatments recorded" : treatments.peek();
    }

    // Display all treatments in history
    public void displayFullHistory() {
        System.out.println("\n=== Treatment History ===");
        if (treatments.isEmpty()) {
            System.out.println("No treatments recorded");
            return;
        }

        // Need to iterate from bottom to top for chronological order
        for (int i = 0; i < treatments.size(); i++) {
            System.out.println((i+1) + ". " + treatments.get(i));
        }
    }
}