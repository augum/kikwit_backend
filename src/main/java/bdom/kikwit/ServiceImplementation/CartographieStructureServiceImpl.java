package bdom.kikwit.ServiceImplementation;

import bdom.kikwit.Dto.CartographieStructureRequestDto;
import bdom.kikwit.Dto.CartographieStructureResponseDto;
import bdom.kikwit.Dto.CategorieRequestDto;
import bdom.kikwit.Entities.CartographieStructure;
import bdom.kikwit.Mappers.CartographieStructureMapper;
import bdom.kikwit.Repositories.CartographieStructureRepository;
import bdom.kikwit.Services.CartographieStructureService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class CartographieStructureServiceImpl implements CartographieStructureService {
    private CartographieStructureMapper mapper;
    private CartographieStructureRepository repository;
// enregistrement d'une cartographie de structure
    @Override
    public CartographieStructureResponseDto save(CartographieStructureRequestDto requestDto) {
        CartographieStructure cartographieStructure = mapper.fromCartographieStructureRequestDto(requestDto);
        CartographieStructure save = repository.save(cartographieStructure);
        return mapper.ToCartographieStructureResponseDto(save);
    }
// mis à jour d'une cartographie
    @Override
    public CartographieStructureResponseDto update(Long id, CartographieStructureRequestDto requestDto) {

        CartographieStructure fromEntity= repository.findById(id).get();
        CartographieStructure structure= mapper.fromCartographieStructureRequestDto(requestDto);
        fromEntity.setForage(structure.getForage());
        fromEntity.setId_ess(structure.getId_ess());
        fromEntity.setIncinerateur(structure.getIncinerateur());
        fromEntity.setDistance_bdom(structure.getDistance_bdom());
        fromEntity.setElectricite(structure.getElectricite());
        fromEntity.setCapacite_transfusion(structure.isCapacite_transfusion());
        fromEntity.setIncinerateur(structure.getIncinerateur());
        fromEntity.setEquipement_biom(structure.getEquipement_biom());
        fromEntity.setPopulation_cible(structure.getPopulation_cible());
        fromEntity.setPresence_blocop(structure.isPresence_blocop());
        fromEntity.setReabilitation(structure.getReabilitation());
        fromEntity.setEau(structure.getEau());
        repository.save(fromEntity);
        return mapper.ToCartographieStructureResponseDto(fromEntity);
    }
// Affichage d'une cartographie
    @Override
    public CartographieStructureResponseDto getOne(Long id) {
        CartographieStructure getOne= repository.findById(id).get();
        return mapper.ToCartographieStructureResponseDto(getOne);
    }
// Lister toutes les cartographie
    @Override
    public List<CartographieStructureResponseDto> liste() {
        List<CartographieStructure> structureList = repository.findAll();
        return structureList
                .stream()
                .map(cartographieStructur->mapper.ToCartographieStructureResponseDto(cartographieStructur))
                .collect(Collectors.toList());
    }
}
