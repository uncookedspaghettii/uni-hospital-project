public class Doctor {
    private int doctorId;
    private String name;
    private String department;
    private String schedule;

    public Doctor(int doctorId, String name, String department, String schedule) {
        this.doctorId = doctorId;
        this.name = name;
        this.department = department;
        this.schedule = schedule;
    }

    // Getters
    public int getDoctorId() { return doctorId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getSchedule() { return schedule; }

    @Override
    public String toString() {
        return "Doctor ID: " + doctorId + 
               "\nName: " + name + 
               "\nDepartment: " + department + 
               "\nSchedule: " + schedule;
    }
}