package ma.enset.CabinetMedical.repositories;

import ma.enset.CabinetMedical.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    List<Patient> findPatientsByNomContainsOrPrenomContainsOrEmailContainsOrCinContains(String mc1, String mc2, String mc3, String mc4);

    // List<Patient> findPatientsByNomContains(String query);
}
