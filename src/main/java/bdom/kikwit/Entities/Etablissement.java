package bdom.kikwit.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Etablissement {

    private Long id;
    private String nom;
    private String zone;
    @ManyToOne()
    @JoinColumn(name = "categorie_id", nullable = false)
    private Categorie categorie;
}
