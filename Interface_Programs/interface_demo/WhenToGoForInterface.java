package interface_demo;

interface Actor1 {
	abstract void actorName();

	abstract void films_Actor_Acted();
}

interface Doctor {
	abstract void doctorName();

	abstract void doctorSpecialization();
}

interface Director1 {
	abstract void directorName();
}

interface Engineer {
	abstract void engineerName();
}

class Puneeth1 implements Actor1, Director {
	public void actorName() {
		System.out.println("Actor name is PUNEETH");
	}

	public void films_Actor_Acted() {
		System.out.println("The films are : A, B, C.....");
	}

	public void directorName() {
		System.out.println("The director name is : PUNEETH");
	}

	@Override
	public void directorname() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nooffilmsdir() {
		// TODO Auto-generated method stub
		
	}
}

class Doctors implements Doctor {
	public void doctorName() {
		System.out.println("Docotr name is : Dr. Modi");
	}

	public void doctorSpecialization() {
		System.out.println("He is specilized in Dental and Neurolozy");
	}
}

public class WhenToGoForInterface {
	public static void main(String[] args) {
		Puneeth1 pu = new Puneeth1();
		pu.actorName();
		pu.films_Actor_Acted();
		pu.directorName();
		// ==============================
		System.out.println("***********************");
		Doctors dt = new Doctors();
		dt.doctorName();
		dt.doctorSpecialization();
	}
}