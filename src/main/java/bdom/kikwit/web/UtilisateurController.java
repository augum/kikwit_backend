package bdom.kikwit.web;

import bdom.kikwit.Dto.UtilisateurRequestDto;
import bdom.kikwit.Dto.UtilisateurResponseDto;
import bdom.kikwit.Services.UtilisateurService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api")
@CrossOrigin("*")
@Tag(name = "Utilisateur", description = "Gestion des utilisateurs")

public class UtilisateurController {
    private UtilisateurService service;

    @PostMapping(path = "/utilisateurs")
    @Operation(summary = "Creation des utilisateurs")
    public UtilisateurResponseDto save(@RequestBody UtilisateurRequestDto requestDto){
        return service.save((requestDto));
    }
}
