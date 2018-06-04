import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Patient> hs = new HashSet<Patient>();
		
		Patient patient1 = new Patient(1110,"James","Fever");
		Patient patient2 = new Patient(1120,"Marry", "EarInfection");
		Patient patient3 = new Patient(1130, "Sachin", "Fracture");
		
		//********Addition of patient object into HashSet******
		hs.add(patient1);
		hs.add(patient2);
		hs.add(patient3);
		
		System.out.println(hs);
		
		//*******Remove patient from the HashSet********
		hs.remove(patient1);
		System.out.println(hs);
		
		//****Retrieve patient from the list
		System.out.println("List contains Patient1 or not? " +hs.contains(patient1));
		System.out.println("List contains Patient2 or not? " +hs.contains(patient2));
		
		
	}

}
