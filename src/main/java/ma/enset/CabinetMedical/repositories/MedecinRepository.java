package ma.enset.CabinetMedical.repositories;

import ma.enset.CabinetMedical.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    List<Medecin> findMedecinsByNomContainsOrPrenomContainsOrEmailContains(String mc1, String mc2, String mc3);
}
