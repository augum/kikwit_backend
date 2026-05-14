package bdom.kikwit.ServiceImplementation;

import bdom.kikwit.Dto.PersonnelRequestDto;
import bdom.kikwit.Dto.PersonnelResponseDto;
import bdom.kikwit.Entities.Personnel;
import bdom.kikwit.Mappers.PersonnelMapper;
import bdom.kikwit.Repositories.PersonnelRepository;
import bdom.kikwit.Services.PersonnalService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service @AllArgsConstructor @Transactional
public class PersonnalServiceImpl implements PersonnalService {
    private PersonnelRepository repository;
    private PersonnelMapper mapper;

    //Enregistrement des informations sur les personnels
    @Override
    public PersonnelResponseDto save(PersonnelRequestDto requestDto) {
        Personnel personnel = mapper.fromPersonnelRequestDto(requestDto);
        Personnel save = repository.save(personnel);
        return mapper.toPersonnelResponseDto(save);
    }
// Modification de l'enregistrement du personnel
    @Override
    public PersonnelResponseDto update(Long id, PersonnelRequestDto requestDto) {
        Personnel personnel = mapper.fromPersonnelRequestDto(requestDto);
        Personnel save = repository.findById(id).get();
        save.setId_ess(personnel.getId_ess());
        save.setNb_agent_matricule(personnel.getNb_agent_matricule());
        save.setNb_agent_nu(personnel.getNb_agent_nu());
        save.setNb_agent_primeLocale(personnel.getNb_agent_primeLocale());
        save.setNb_nv_agent_matricule(personnel.getNb_nv_agent_matricule());
        save.setNb_nv_agent_primeEtat(personnel.getNb_nv_agent_primeEtat());
        save.setNb_nv_agent_salaireEtat(personnel.getNb_nv_agent_salaireEtat());
        repository.save(save);
        return mapper.toPersonnelResponseDto(save);
    }
// Liste de toutes les informations du personnel
    @Override
    public List<PersonnelResponseDto> getAll() {
       List<Personnel>  list = repository.findAll();
        return list.stream()
                .map(personnel -> mapper.toPersonnelResponseDto(personnel))
                .collect(Collectors.toList());
    }
}
