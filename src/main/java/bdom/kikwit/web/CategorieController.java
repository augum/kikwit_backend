package bdom.kikwit.web;

import bdom.kikwit.Dto.CategorieRequestDto;
import bdom.kikwit.Dto.CategorieResponseDto;
import bdom.kikwit.Services.CategorieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api")
@CrossOrigin("*")
public class CategorieController {
    CategorieService service;
  /*
  * Cette fonction sert à enregistrer des categories
  * */
    @PostMapping(path = "/categories")
    public CategorieResponseDto save(@RequestBody CategorieRequestDto requestDto){
     return service.save(requestDto);
    }
    /*
    * Recuperation de la liste de toutes les categories
    * */
    @GetMapping(path = "/categories")
    public List<CategorieResponseDto> list(){
        return service.getAll();
    }
    /*
    * Recupération d'une seule catégorie
    * */
    @GetMapping(path = "/categories/{id}")
    public CategorieResponseDto getOne(@PathVariable Long id){
        return service.getOne(id);
    }
    /*
    * Assure la modification d'une categorie
    * */
    @PutMapping(path = "/categories/{id}")
    public CategorieResponseDto update(@PathVariable Long id,@RequestBody CategorieRequestDto requestDto){
        return  service.update(id,requestDto);
    }
}
