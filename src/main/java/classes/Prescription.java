package classes;

public class Prescription {

    private String physicianName;
    private String patientName;
    private String date;
    private String medicines;
    
    public Prescription() {
    }

    public String getPhysicianName() {
        return this.physicianName;
    }
    public void setPhysicianName(String pshysicianName) {
        this.physicianName = pshysicianName;
    }
    
    public String getPatientName() {
        return this.patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getMedicines() {
        return this.medicines;
    }
    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

}