package bdom.kikwit.ServiceImplementation;

import bdom.kikwit.Dto.UtilisateurRequestDto;
import bdom.kikwit.Dto.UtilisateurResponseDto;
import bdom.kikwit.Entities.Role;
import bdom.kikwit.Entities.Utilisateur;
import bdom.kikwit.Mappers.UtilisateurMapper;
import bdom.kikwit.Repositories.UtilisateurRepository;
import bdom.kikwit.Services.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {
    private UtilisateurRepository repository;
    private UtilisateurMapper mapper;
    /**
     * @param requestDto
     * @return
     */
    @Override
    public UtilisateurResponseDto save(UtilisateurRequestDto requestDto) {
        Utilisateur utilisateur = mapper.fromUtilisateurRequestDto(requestDto);
        Utilisateur saveUtilisateur = repository.save(utilisateur);
        return mapper.toUtilisateurResponseDto(saveUtilisateur);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public UtilisateurResponseDto getOne(Long id) {
        Utilisateur role = repository.findById(id).get();
        return mapper.toUtilisateurResponseDto(role);
    }

    /**
     * @return
     */
    @Override
    public List<UtilisateurResponseDto> list() {

        List<Utilisateur> utilisateurList = repository.findAll();
        return utilisateurList.stream()
                .map(utilisateur -> mapper.toUtilisateurResponseDto(utilisateur))
                .collect(Collectors.toList());
    }

    /**
     * @param id
     * @param requestDto
     * @return
     */
    @Override
    public UtilisateurResponseDto update(Long id, UtilisateurRequestDto requestDto) {
        Utilisateur utilisateur = mapper.fromUtilisateurRequestDto(requestDto);
        Utilisateur getUtilisateur = repository.findById(id).get();
        getUtilisateur.setLogin(utilisateur.getLogin());
        getUtilisateur.setPassword(utilisateur.getPassword());
        getUtilisateur.setId_role(utilisateur.getId_role());
        getUtilisateur.setId_ess(utilisateur.getId_ess());
        Utilisateur save = repository.save(getUtilisateur);
        return mapper.toUtilisateurResponseDto(save);
    }

    /**
     * @param id
     */
    @Override
    public String delete(Long id) {
        Optional<Utilisateur> utilisateur = repository.findById(id);
        if (utilisateur.isPresent()){
            repository.deleteById(id);
            return " Utilisateur supprimé avec succes";
        }
        return "Aucun utilisateur trouvé";

    }
}
