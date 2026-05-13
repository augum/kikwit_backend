package bdom.kikwit.web;

import bdom.kikwit.Dto.GestionMedicamentRequestDto;
import bdom.kikwit.Dto.GestionMedicamentResponseDto;
import bdom.kikwit.Services.GestionMedicamenService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api")
@CrossOrigin("*")
public class GestionMedicamentController {
    private GestionMedicamenService service;
    /*
    * Enregistrement de la gestion medicament
    * */
    @PostMapping(path = "/medicaments")
    public GestionMedicamentResponseDto save(@RequestBody GestionMedicamentRequestDto requestDto){
        return service.save(requestDto);
    }
}
