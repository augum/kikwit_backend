package bdom.kikwit.Dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@JsonRootName(value="cartographie")
public class CartographieStructureRequestDto {
    private Long id;
    private Long id_ess;
    private String distance_bdom;
    private String population_cible;
    private Long id_se;
    private boolean presence_blocop;
    private boolean capacite_transfusion;
    private String electricite;
    private String eau;
    private String reabilitation;
    private String forage;
    private String incinerateur;
    private String equipement_biom;
}
