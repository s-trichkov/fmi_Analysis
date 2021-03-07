package screenmodels;

import services.CreateService;

public class CreateScreenModel {
	
	private String physicianName;
    private String patientName;
    private String date;
    private String medicines;
    private String message;
    
    public void navigateToMe()
	{
		System.out.println("Отворен е прозорецът за създаване на рецепта.");
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
    
    public void clickCreateButton() 
	{
		message = CreateService.create(physicianName, patientName, date, medicines);
	}

	public String getCreateMessage() {
		return message;
	}

}
