package application;

public class HealthRecord {
	int HealthRecordId;
	double Weight;
	double Temperature;
	double BloodPressure;
	String Note;
	int PersonId; // Foreign Key for a person
}
