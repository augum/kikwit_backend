package bdom.kikwit.Dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@JsonRootName(value="utilisateur")
public class UtilisateurResponseDto {

    private Long id;
    private String login;
    private String password;
    private Long id_role;
    private Long id_ess;
}
