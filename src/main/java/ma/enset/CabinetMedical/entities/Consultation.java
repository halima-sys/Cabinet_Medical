package ma.enset.CabinetMedical.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; //Auto incrèment
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)
    private Date dateConsultation;
    private String description;

    @ManyToOne
    private Medecin medecin;

    @ManyToOne
    private Patient patient;
}