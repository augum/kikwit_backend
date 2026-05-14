package bdom.kikwit.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class IndicateurTechnique {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate periode;
    private Long id_ess;
    private int nb_nv_casCuratif;
    private int nb_cpn1;
    private int nb_cpn1_16;
    private int nb_cpn4;
    private int nb_apa;
    private int nb_nv_acc_pf;
    private int nb_diabeteNotification;
    private int nb_transfusion;
    private int nb_transfusionTeste4Marquer;
    private int nb_dc_neonat;
    private int nb_dc_maternel;
    private int nb_chirurgieMajeure;
    private int nb_cesarienne;
    private int nb_hospitalise;
    private int nb_dc_av48h;
    private int nb_dc_ap48h;
    private int nb_infePostOp;
    private int nb_diarheSimple;


}
