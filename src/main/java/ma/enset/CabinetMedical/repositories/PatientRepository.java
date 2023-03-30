package ma.enset.CabinetMedical.repositories;

import ma.enset.CabinetMedical.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
//List<Patient> findPatientsByNomContainsOrPrenomContainsOrEmailContainsOrCinContains(String Query);


}
