package ma.enset.CabinetMedical.repositories;

import ma.enset.CabinetMedical.entities.Consultation;
import ma.enset.CabinetMedical.entities.Medecin;
import ma.enset.CabinetMedical.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
    static List<Consultation> findConsultationsByMedecin(String valueOf) {
        return null;
    }

    static List<Consultation> findConsultationsByPatient(String mc) {
        return null;
    }

    static List<Consultation> findConsultationByPatient(Patient patient) {
        return null;
    }

    List<Consultation> findByMedecin(Medecin medecin);

    List<Consultation> findByPatient(Patient patient);

    List<Consultation> findByMedecinNomContaining(String medecin_nom);

    //static List<Consultation> findConsultationsByMedecin(String Medecin_nom){
    //return ConsultationRepository.findByMedecinNomContaining(Medecin_nom);
}


//List<Consultation> findConsultationByPatient(Patient patient);

//List<Consultation> findConsultationsByMedecinContainsOrPatientContains(String query, String query1, String query2);

//List<Consultation> findConsultationByMedecin(Medecin medecin);
// List<Consultation> findConsultationByPatient(Patient patient);
// List<Consultation> findConsultationByMedecin(Medecin medecin);


