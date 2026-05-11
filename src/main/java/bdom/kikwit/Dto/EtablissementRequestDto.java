package bdom.kikwit.Dto;

import bdom.kikwit.Entities.Categorie;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@JsonRootName(value="etablissement")
public class EtablissementRequestDto {
    private Long id;
    private String nom;
    private String zone;
    @ManyToOne()
    @JoinColumn(name = "categorie_id", nullable = false)
    private Categorie categorie;
}
