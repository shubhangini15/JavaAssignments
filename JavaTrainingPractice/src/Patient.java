
public class Patient {

	int patientId;
	String patientName;
	String disease;
	
	Patient(int patientId, String patientName, String disease){
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.disease = disease;
	}
	
	public String toString() {
		return (this.patientId +" "+ this.patientName +" "+ this.disease);
	}
}
