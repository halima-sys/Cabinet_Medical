package ma.enset.CabinetMedical.repositories;

import ma.enset.CabinetMedical.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
    // List<Consultation> findConsultationByPatient(Patient patient);
    // List<Consultation> findConsultationByMedecin(Medecin medecin);

}
