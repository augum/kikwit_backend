package bdom.kikwit.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class GestionMedicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_ess;
    private Date periode;
    private double capital_depart;
    private double capital_fin_moi;
    private String croissance;
    private String benefice;
}
