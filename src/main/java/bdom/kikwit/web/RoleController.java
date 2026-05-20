package bdom.kikwit.web;

import bdom.kikwit.Dto.RoleRequestDto;
import bdom.kikwit.Dto.RoleResponseDto;
import bdom.kikwit.Services.RoleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api")
@CrossOrigin("*")
@Tag(name = "Role", description = "Gestion des roles")

public class RoleController {
    private RoleService service;

    @PostMapping(path = "/roles")
    @Operation(summary = "Insertion des roles")
    public RoleResponseDto save(@RequestBody RoleRequestDto requestDto){
       return service.save(requestDto);
    }
}
