package ma.enset.CabinetMedical.service;

import ma.enset.CabinetMedical.entities.Consultation;
import ma.enset.CabinetMedical.entities.Medecin;
import ma.enset.CabinetMedical.entities.Patient;

import java.util.List;

public interface ICabinetService {
    List<Patient> getAllPatients();

    List<Patient> searchPatientsByQuery(String Query);

    void addPatient(Patient patient);

    void deletePatientById(Long id);

    List<Consultation> getConsultationsByPatient(Patient patient);

    void addMedecin(Medecin medecin);

    List<Medecin> getAllMedecin();

    void deleteMedecinById(Long id);

    List<Consultation> getConsultationsByMedecin(Medecin medecin);

    void addConsultation(Consultation consultation);

    List<Consultation> getAllConsultations();

    void deleteConsultation(Consultation consultation);

    Medecin getMedecinById(Long id);

    Patient getPatientById(Long id);

    Consultation getConsultationById(Long id);

    List<Medecin> searchMedecinsByQuery(String mc);

    void deleteConsultationById(Long id);

    List<Consultation> searchConsultationsByQuery(String mc);

    List<Consultation> searchConsultationsByMedecin(String mc);

    List<Consultation> searchConsultationsByPatient(String mc);
}


