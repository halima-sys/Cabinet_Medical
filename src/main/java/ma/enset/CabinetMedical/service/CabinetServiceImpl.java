package ma.enset.CabinetMedical.service;

import ma.enset.CabinetMedical.entities.Consultation;
import ma.enset.CabinetMedical.entities.Medecin;
import ma.enset.CabinetMedical.entities.Patient;
import ma.enset.CabinetMedical.repositories.ConsultationRepository;
import ma.enset.CabinetMedical.repositories.MedecinRepository;
import ma.enset.CabinetMedical.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CabinetServiceImpl implements ICabinetService {
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    ConsultationRepository consultationRepository;
    @Autowired
    MedecinRepository medecinRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
    // @Override
    // public List<Medecin> getAllMedecin() {
    // return medecinRepository.findAll();}

    ///**
    // * @param medecin
    //* @return
    // */
    @Override
    public List<Consultation> getConsultationsByMedecin(Medecin medecin) {
        return null;
    }

    ///**
    //* @return
    // */
    @Override
    public List<Consultation> getAllConsultations() {
        return null;
    }

    ///**
    //* @param consultation
    //*/
    @Override
    public void deleteConsultation(Consultation consultation) {

    }

    ///**
    //* @param id
    //* @return
    //*/
    @Override
    public Consultation getConsultationById(Long id) {
        return null;
    }

    ///**
    //* @param Query
    // * @return
    //*/
    @Override
    public List<Consultation> searchConsultationsByQuery(Medecin Query) {
        return null;
    }

    ///**
    //* @param query
    // * @return
    //*/
    @Override
    public List<Consultation> searchConsultationsByQuery(String query) {
        return null;
    }

    @Override
    public List<Patient> searchPatientsByQuery(String query) {
        return patientRepository.findPatientsByNomContainsOrPrenomContains(query, query);
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);

    }

    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);

    }

    @Override
    public void addMedecin(Medecin medecin) {
        medecinRepository.save(medecin);

    }

    ///**
    //* @return
    //*/
    @Override
    public List<Medecin> getAllMedecins() {
        return medecinRepository.findAll();
    }

    //
    @Override
    public List<Medecin> searchMedecinsByQuery(String query) {
        return medecinRepository.findMedecinsByNomContainsOrPrenomContains(query, query);
    }

    @Override
    public void deleteMedecinById(Long id) {
        medecinRepository.deleteById(id);

    }

    @Override
    public void addConsultation(Consultation consultation) {
        consultationRepository.save(consultation);

    }

    @Override
    public void deleteConsultationById(Long id) {
        consultationRepository.deleteById(id);

    }

    //
    @Override
    public Medecin getMedecinById(Long id) {
        return medecinRepository.findById(id).get();
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public List<Consultation> searchConsultationsByMedecin(String medecin_nom) {
        return consultationRepository.findByMedecinNomContaining(medecin_nom);
    }

    ///**
    // * @param patient
    //* @return
    //*/
    @Override
    public List<Consultation> getConsultationsByPatient(Patient patient) {
        return null;
    }

    //

    // @Override
    // public List<Consultation> getConsultationsByPatient(Patient patient) {
    //return ConsultationRepository.findConsultationByPatient(patient);}

    //@Override
    //public List<Consultation> getConsultationsByMedecin(Medecin medecin) {
    //return ConsultationRepository.findConsultationsByMedecin(String.valueOf(medecin));}


    //@Override
    //public List<Consultation> getAllConsultations() {
    //return consultationRepository.findAll();}

    //@Override
    //public void deleteConsultation(Consultation consultation) {
    //consultationRepository.delete(consultation);}


    //@Override
    //public Consultation getConsultationById(Long id) {
    //return consultationRepository.findById(id).get();}


    // /**
    //* @param Query
    //* @return
    // */
    //@Override
    //public List<Consultation> searchConsultationsByQuery(Medecin Query) {
    //return null;//return consultationRepository.findConsultationsByIdContainsOrDateConsultationContainsOrDescriptionContainsOrMedecinIdContainingOrPatientIdContaining(Query, Query, Query, Query,Query);}
    //@Override
    //public List<Consultation> searchConsultationsByMedecin(String mc) {
    // List<Medecin> medecins = medecinRepository.findMedecinsByIdContains(mc);
    // List<Consultation> consultations = new ArrayList<>();
    // for (Medecin medecin : medecins) {
    //consultations.addAll(consultationRepository.findByMedecin(medecin));}
    //return consultations;}

    //@Override
    //public List<Consultation> searchConsultationsByQuery(String Query) {
    //return ConsultationRepository.findConsultationsByMedecin(String.valueOf(Query));}


    //@Override
    //public List<Consultation> searchConsultationsByMedecin(String co) {
    //return null;


    @Override
    public List<Consultation> searchConsultationsByPatient(String co) {
        return null;
    }

    ///**
    //* @param query
    //* @return
    //*/
    @Override
    public List<Consultation> searchConsultationsById(String query) {
        return null;
    }


    //@Override
    //public List<Consultation> searchConsultationsById(String query) {
    // return ConsultationRepository.findConsultationsByMedecin(query);}


}
