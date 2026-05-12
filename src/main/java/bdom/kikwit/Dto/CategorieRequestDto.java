package bdom.kikwit.Dto;

import bdom.kikwit.Entities.Etablissement;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
@JsonRootName(value="categorie")
public class CategorieRequestDto {

    private Long id;
    private String libelle;

}
