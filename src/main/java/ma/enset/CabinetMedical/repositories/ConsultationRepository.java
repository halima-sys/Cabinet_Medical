package ma.enset.CabinetMedical.repositories;

import ma.enset.CabinetMedical.entities.Consultation;
import ma.enset.CabinetMedical.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
    List<Consultation> findConsultationsByMedecinContainsOrPatientContains(String mc1, String mc2);

    List<Consultation> findConsultationByPatient(Patient patient);

    List<Consultation> findConsultationsByMedecin(String query);

    //List<Consultation> findConsultationByPatient(Patient patient);

    //List<Consultation> findConsultationsByMedecinContainsOrPatientContains(String query, String query1, String query2);

    //List<Consultation> findConsultationByMedecin(Medecin medecin);
    // List<Consultation> findConsultationByPatient(Patient patient);
    // List<Consultation> findConsultationByMedecin(Medecin medecin);

}
