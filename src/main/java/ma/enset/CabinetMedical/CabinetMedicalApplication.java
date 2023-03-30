package ma.enset.CabinetMedical;

import ma.enset.CabinetMedical.entities.Consultation;
import ma.enset.CabinetMedical.entities.Medecin;
import ma.enset.CabinetMedical.entities.Patient;
import ma.enset.CabinetMedical.service.ICabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CabinetMedicalApplication implements CommandLineRunner {
	@Autowired
	private ICabinetService cabinetService;

	/*@Autowired
	private PatientRepository patientRepository;
	@Autowired
	private MedecinRepository medecinRepository;
	@Autowired
	private MedecinRepository consultationRepository;*/
	public static void main(String[] args) {
		SpringApplication.run(CabinetMedicalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Medecin m1 = cabinetService.getMedecinById(5L);
		Patient p1 = cabinetService.getPatientById(2L);

		/*Consultation c1=new Consultation();
		c1.setDateConsultation(new Date());
		c1.setDescription("description de consultation");
		c1.setMedecin(m1);
		c1.setPatient(p1);
		cabinetService.addConsultation(c1);*/

		Consultation c2 = cabinetService.getConsultationById(7L);
		System.out.println(c2.getDescription() + " " + c2.getMedecin().getNom() + " " + c2.getMedecin().getPrenom() + " " + c2.getPatient().getNom() + " " + c2.getPatient().getPrenom());

		//Medecin m1=new Medecin(null,"skalli","amine","skalli@gmail.com","066115930",null);
		//cabinetService.addMedecin(m1);

		/*Patient p1=new Patient();
		p1.setNom("Halim");
		p1.setPrenom("halima");
		p1.setTel("07654387");
		p1.setEmail("halim@gmail.com");
		p1.setDateNaissance(new Date());
		cabinetService.addPatient(p1);*/

		//Patient p1=new Patient(null,"hell","evil","T145444","066784330","Hell@gmail.com",new Date(),null);
		//cabinetService.addPatient(p1);
		//patientRepository.save(p1);

		//Patient p2=new Patient(null,"malih","aziz","T1433234","066782630","Malih@gmail.com",new Date(),null);
		//patientRepository.save(p2);

		//Medecin m2=new Medecin(null,"Berrada","Mohammed","Berrada@gmail.com","066765930",null);
		//cabinetService.addMedecin(m2);
		//medecinRepository.save(m2);

		/*List<Patient> patients = patientRepository.findAll(); //affichage
		for (Patient p:patients) {
			System.out.println(p.getNom()+" "+p.getPrenom()+" "+p.getEmail());
		}*/

		/*Patient p=patientRepository.findById(2l).get(); //modification
		p.setPrenom("alaa");
		patientRepository.save(p);*/
		/*patientRepository.deleteById(2l); // suppression*/
	}
}
