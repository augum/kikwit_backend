package bdom.kikwit.Dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor
@JsonRootName(value="medoc")
public class GestionMedicamentRequestDto {
    private Long id;
    private Long id_ess;
    private Date periode;
    private double capital_depart;
    private double capital_fin_moi;
    private String croissance;
    private String benefice;
}
