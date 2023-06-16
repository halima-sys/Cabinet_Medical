package ma.enset.CabinetMedical.service;

import ma.enset.CabinetMedical.entities.Consultation;
import ma.enset.CabinetMedical.entities.Medecin;
import ma.enset.CabinetMedical.entities.Patient;

import java.util.List;

public interface ICabinetService {
    List<Patient> getAllPatients();

    ///**
    //* @param Query
    // * @return
    //*/
    List<Consultation> searchConsultationsByQuery(Medecin Query);

    ///**
    //* @param query
    // * @return
    //*/
    List<Consultation> searchConsultationsByQuery(String query);

    List<Patient> searchPatientsByQuery(String query);

    void addPatient(Patient patient);

    void deletePatientById(Long id);

    void addMedecin(Medecin medecin);

    List<Medecin> getAllMedecins();

    List<Medecin> searchMedecinsByQuery(String query);

    void deleteMedecinById(Long id);

    void addConsultation(Consultation consultation);

    void deleteConsultationById(Long id);

    Medecin getMedecinById(Long id);

    Patient getPatientById(Long id);

    List<Consultation> searchConsultationsByMedecin(String mc);

    //


    // List<Consultation> getConsultationsByPatient(Patient patient);

    //List<Consultation> getConsultationsByMedecin(Medecin medecin);

    //List<Consultation> getAllConsultations();

    //void deleteConsultation(Consultation consultation);

    // List<Medecin> getAllMedecin();

    ///**
    // * @param medecin
    //* @return
    // */
    //List<Consultation> getConsultationsByMedecin(Medecin medecin);

    ///**
    // * @param medecin
    //* @return
    // */
    List<Consultation> getConsultationsByMedecin(Medecin medecin);

    ///**
    //* @return
    // */
    List<Consultation> getAllConsultations();

    ///**
    //* @param consultation
    //*/
    void deleteConsultation(Consultation consultation);

    Consultation getConsultationById(Long id);

    ///**
    // * @param patient
    //* @return
    //*/
    List<Consultation> getConsultationsByPatient(Patient patient);

    List<Consultation> searchConsultationsByPatient(String co);

    ///**
    //* @param query
    //* @return
    //*/
    List<Consultation> searchConsultationsById(String query);


    // List<Consultation> searchConsultationsByQuery(Medecin Query);

    //List<Consultation> searchConsultationsByQuery(String query);

    // List<Consultation> searchConsultationsByPatient(String co);

    //List<Consultation> searchConsultationsById(String query);

    // List<Consultation> searchConsultationsByPatient(String mc);
}


