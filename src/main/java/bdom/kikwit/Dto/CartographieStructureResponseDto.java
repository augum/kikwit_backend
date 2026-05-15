package bdom.kikwit.Dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@JsonRootName(value="cartographie")
public class CartographieStructureResponseDto {
    @Schema(description = "Identifiant de la structure de santé", example = "1")
    private Long id_ess;
    @Schema(description = "Distance de la structure avec le bdom", example = "10km")
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
