package bdom.kikwit.web;

import bdom.kikwit.Dto.CartographieStructureRequestDto;
import bdom.kikwit.Dto.CartographieStructureResponseDto;
import bdom.kikwit.Services.CartographieStructureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api")
@CrossOrigin("*")
public class CartographieStructureServiceController {
    private CartographieStructureService service;
    /*
    * Insertion d'une cartographie des structures
    * */
    @PostMapping(path = "/cartographies")
    public CartographieStructureResponseDto save(@RequestBody CartographieStructureRequestDto requestDto){
        return  service.save(requestDto);
    }
    /* Liste des cartographies*/
    @GetMapping(path = "/cartographies")
    public List<CartographieStructureResponseDto> getAll(){
        return service.liste();
    }
    /* Modifier une cartographie*/
    @PatchMapping(path = "/cartographies/{id}")
    public CartographieStructureResponseDto update(@PathVariable Long id,@RequestBody CartographieStructureRequestDto requestDto){
        return  service.update(id,requestDto);
    }
    /*
    obtenir une seule ligne de cartographie
    * */
    @GetMapping(path = "/cartographies/{id}")
    public CartographieStructureResponseDto getOne(@PathVariable Long id){
        return  service.getOne(id);
    }
}
