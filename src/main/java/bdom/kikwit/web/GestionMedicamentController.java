package bdom.kikwit.web;

import bdom.kikwit.Dto.GestionMedicamentRequestDto;
import bdom.kikwit.Dto.GestionMedicamentResponseDto;
import bdom.kikwit.Services.GestionMedicamenService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    /*
    * liste gestion des medicaments
    * */
    @GetMapping(path = "/medicaments")
    public List<GestionMedicamentResponseDto> list(){
        return service.getAll();
    }
    /*
    * Recupera d'une ligne de gestion par son Id
    * */
    @GetMapping(path = "/medicament/{id}")
    public GestionMedicamentResponseDto getOne(@PathVariable Long id){
        return service.getOne(id);
    }
    /*
    Modification d'une ligne de gestion medicament
    * */
    @PatchMapping(path = "/medicaments/{id}")
    public GestionMedicamentResponseDto update(@PathVariable Long id,@RequestBody GestionMedicamentRequestDto requestDto){
        return service.update(id,requestDto);
    }

}
