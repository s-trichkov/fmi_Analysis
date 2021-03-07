package services;

import classes.Prescription;

public class CreateService {
	public static String create(String physicianName, String patientName, String date, String medicines) {
	
		if (physicianName == null && patientName == null && date == null && medicines == null) {
			return "Не сте въвели данни!";
		}
		
		if (physicianName == null || physicianName.isEmpty()) {
			return "Моля, въведете име на лекар";
		}
		
		if (patientName == null || patientName.isEmpty()) {
			return "Моля, въведете име на пациент";
		}
		
		if (date == null || date.isEmpty()) {
			return "Моля, въведете дата";
		}
		
		if (medicines == null || medicines.isEmpty()) {
			return "Моля, въведете лекарство";
		}


		Prescription p = new Prescription();
		p.setPhysicianName(physicianName);
		p.setPatientName(patientName);
		p.setDate(date);
		p.setMedicines(medicines);
		
		return "Рецептата е създадена успешно";
	}
}
