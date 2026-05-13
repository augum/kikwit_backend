package bdom.kikwit.web;

import bdom.kikwit.Dto.EtablissementRequestDto;
import bdom.kikwit.Dto.EtablissementResponseDto;
import bdom.kikwit.Services.EtablissementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api")
@CrossOrigin("*")
public class EtablissementController {
    private EtablissementService service;
    // Enregistrement d'un etablissement
    @PostMapping(path = "/etablissements")
    public EtablissementResponseDto save(@RequestBody EtablissementRequestDto requestDto){
        return service.save(requestDto);
    }
    // Recupère la liste des etablissements
    @GetMapping(path = "/etablissements")
    public List<EtablissementResponseDto> list(){
        return  service.getAll();
    }
    /*
    * Recupère un seul etablissement
    * */
    @GetMapping(path = "/etablissements/{id}")
    public EtablissementResponseDto getOne(@PathVariable Long id){
        return service.getOne(id);
    }
    /*
    *Modification d'un etablissement
    * */
    @PatchMapping(path = "/etablissement/{id}")
    public EtablissementResponseDto update(@PathVariable Long id,@RequestBody EtablissementRequestDto requestDto){
        return  service.update(id,requestDto);
    }
}
