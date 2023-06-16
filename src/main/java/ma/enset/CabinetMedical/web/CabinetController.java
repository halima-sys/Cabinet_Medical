package ma.enset.CabinetMedical.web;

import ma.enset.CabinetMedical.entities.Consultation;
import ma.enset.CabinetMedical.entities.Medecin;
import ma.enset.CabinetMedical.entities.Patient;
import ma.enset.CabinetMedical.service.ICabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class CabinetController {
    @Autowired
    ICabinetService cabinetService;

    @GetMapping(path = "/")
    public String home() {
        return "index";
    }

    @GetMapping(path = "/patients")
    public String patients(Model model, @RequestParam(name = "mc", defaultValue = "") String mc) {
        List<Patient> patients = cabinetService.searchPatientsByQuery(mc);
        //Stocker une donnée dans le modèle
        model.addAttribute("patients", patients);
        return "patients_list";
    }

    @GetMapping(path = "deletePatient")
    public String deletePatient(@RequestParam(name = "id", defaultValue = "0") Long id) {
        cabinetService.deletePatientById(id);
        return "redirect:/patients";
    }

    @GetMapping(path = "/addPatient")
    public String patientForm(Model model) {
        Patient p = new Patient();
        model.addAttribute("patient", p);
        return "patient_new";
    }

    @PostMapping(path = "/savePatient")
    public String savePatient(@ModelAttribute Patient patient) {
        cabinetService.addPatient(patient);
        return "redirect:/patients";
    }

    @GetMapping(path = "/medecins")
    public String medecins(Model model, @RequestParam(name = "mc", defaultValue = "") String mc) {
        List<Medecin> medecins = cabinetService.searchMedecinsByQuery(mc);
        //Stocker une donnée dans le modèle
        model.addAttribute("medecin", medecins);
        return "medecin_list";
    }

    @GetMapping(path = "deleteMedecin")
    public String deleteMedecinById(@RequestParam(name = "id", defaultValue = "0") Long id) {
        cabinetService.deleteMedecinById(id);
        return "redirect:/medecins";
    }

    @GetMapping(path = "/addMedecin")
    public String medecinForm(Model model) {
        Medecin p = new Medecin();
        model.addAttribute("medecin", p);
        return "medecin_new";
    }

    @PostMapping(path = "/saveMedecin")
    public String saveMedecin(@ModelAttribute Medecin medecin) {
        cabinetService.addMedecin(medecin);
        return "redirect:/medecins";
    }


    @GetMapping(path = "/consultations")
    public String consultations(Model model, @RequestParam(name = "medecin_nom", defaultValue = "") String medecin_nom) {
        List<Consultation> consultations = cabinetService.searchConsultationsByMedecin(medecin_nom);
        //Stocker une donnée dans le modèle
        model.addAttribute("consultations", consultations);
        return "consultations_list";
    }

    @GetMapping(path = "deleteConsultation")
    public String deleteConsultation(@RequestParam(name = "id", defaultValue = "0") Long id) {
        cabinetService.deleteConsultationById(id);
        return "redirect:/consultations";
    }

    @GetMapping(path = "/addConsultation")
    public String consultationForm(Model model) {
        Consultation c = new Consultation();
        List<Medecin> medecins = cabinetService.getAllMedecins();
        List<Patient> patients = cabinetService.getAllPatients();

        model.addAttribute("consultation", c);
        model.addAttribute("medecins", medecins);
        model.addAttribute("patients", patients);
        return "consultation_new";
    }

    //
    //@GetMapping(path = "/consultations")
    //public String consultations(Model model, @RequestParam(name = "Querry", defaultValue = "") String Query) {
    // List<Consultation> consultations= cabinetService.searchConsultationsById(Query);
    //System.out.println("Consultations: " + consultations);
    //Stocker une donnée dans le modèle
    //model.addAttribute("consultations", consultations);
    //return "consultations_list";}

    //@GetMapping(path = "deleteConsultation")
    // public String deleteConsultation(@RequestParam(name = "id", defaultValue = "0") Long id) {
    //cabinetService.deleteConsultationById(id);
    //return "redirect:/consultations";}

    //@GetMapping(path = "/addConsultation")
    // public String consultationForm(Model model) {
    //Consultation c = new Consultation();
    // List<Medecin> medecins = cabinetService.getAllMedecins();
    // List<Patient> patients = cabinetService.getAllPatients();

    //model.addAttribute("consultation", c);
    //model.addAttribute("medecins", medecins);
    //model.addAttribute("patients", patients);
    //return "consultation_new";}

    @PostMapping(path = "/saveConsultation")
    public String saveConsultation(@ModelAttribute Consultation consultation, @RequestParam(name = "medecinId") Long medecinId,
                                   @RequestParam(name = "patientId") Long patientId) {
        Medecin medecin = cabinetService.getMedecinById(medecinId);
        Patient patient = cabinetService.getPatientById(patientId);

        consultation.setMedecin(medecin);
        consultation.setPatient(patient);
        cabinetService.addConsultation(consultation);
        return "redirect:/consultations";
    }

}