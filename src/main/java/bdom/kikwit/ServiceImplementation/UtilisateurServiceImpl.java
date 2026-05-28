package bdom.kikwit.ServiceImplementation;

import bdom.kikwit.Dto.UtilisateurRequestDto;
import bdom.kikwit.Dto.UtilisateurResponseDto;
import bdom.kikwit.Entities.Etablissement;
import bdom.kikwit.Entities.Role;
import bdom.kikwit.Entities.Utilisateur;
import bdom.kikwit.Mappers.UtilisateurMapper;
import bdom.kikwit.Repositories.EtablissementRepository;
import bdom.kikwit.Repositories.Rolerepository;
import bdom.kikwit.Repositories.UtilisateurRepository;
import bdom.kikwit.Services.UtilisateurService;
import lombok.AllArgsConstructor;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
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
    private Rolerepository rolerepository;
    private EtablissementRepository etablissementRepository;
//    private JavaMailSender mailSender;
    /**
     * @param requestDto
     * @return
     */
    @Override
    public UtilisateurResponseDto save(UtilisateurRequestDto requestDto) {
        Utilisateur utilisateur = mapper.fromUtilisateurRequestDto(requestDto);
        Utilisateur saveUtilisateur = repository.save(utilisateur);
        /*SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom("augumakuma@gmail.com");
        mail.setTo(saveUtilisateur.getEmail());
        mail.setSubject("Bienvenu sur Sclinik");
        mail.setText("Bienvenu sur Sclinik, un compte a été crée pour vous et voici les informations pour vous connecter" +
                "cliquer sur le lien: " + "http://localhost:8081/login" +
                " Login: " + saveUtilisateur.getLogin() + " Mot de passe: " + saveUtilisateur.getPassword());
        mailSender.send(mail);*/
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

        for (Utilisateur it : utilisateurList) {

            if (it.getId_role() != null) {
                Role role = rolerepository.findById(it.getId_role()).orElse(null);
                it.setRole(role);
            } else {
                it.setRole(null);
            }

            if (it.getId_ess() != null) {
                Etablissement etablissement = etablissementRepository.findById(it.getId_ess()).orElse(null);
                it.setEtablissement(etablissement);
            } else {
                it.setEtablissement(null);
            }
        }
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
