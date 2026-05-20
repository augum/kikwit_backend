package bdom.kikwit.ServiceImplementation;

import bdom.kikwit.Dto.IndicateurTechniqueRequestDto;
import bdom.kikwit.Dto.IndicateurTechniqueResponseDto;
import bdom.kikwit.Entities.Etablissement;
import bdom.kikwit.Entities.IndicateurTechnique;
import bdom.kikwit.Mappers.IndicateurTechniqueMapper;
import bdom.kikwit.Repositories.EtablissementRepository;
import bdom.kikwit.Repositories.IndicateurTechniqueRepository;
import bdom.kikwit.Services.IndicateurTechniqueService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service @Transactional @AllArgsConstructor
public class IndicateurTechniqueServiceImpl implements IndicateurTechniqueService {
    private IndicateurTechniqueMapper mapper;
    private IndicateurTechniqueRepository repository;
    private EtablissementRepository etablissementRepository;

    //Insertion d'un indicateur
    @Override
    public IndicateurTechniqueResponseDto save(IndicateurTechniqueRequestDto requestDto) {
        IndicateurTechnique indicateurTechnique = mapper.fromIndicateurTechniqueRequestDto(requestDto);
        IndicateurTechnique save = repository.save(indicateurTechnique);
        return mapper.toIndicateurTechniqueResponseDto(save);
    }
//Modification d'un indicateur
    @Override
    public IndicateurTechniqueResponseDto update(Long id, IndicateurTechniqueRequestDto requestDto) {
        IndicateurTechnique technique = repository.findById(id).get();
        IndicateurTechnique fromDto = mapper.fromIndicateurTechniqueRequestDto(requestDto);
        technique.setId_ess(fromDto.getId_ess());
        technique.setNb_apa(fromDto.getNb_apa());
        technique.setNb_cpn1(fromDto.getNb_cpn1());
        technique.setNb_cpn1_16(fromDto.getNb_cpn1_16());
        technique.setNb_cpn4(fromDto.getNb_cpn4());
        technique.setNb_cesarienne(fromDto.getNb_cesarienne());
        technique.setNb_chirurgieMajeure(fromDto.getNb_chirurgieMajeure());
        technique.setNb_dc_ap48h(fromDto.getNb_dc_ap48h());
        technique.setNb_dc_av48h(fromDto.getNb_dc_av48h());
        technique.setNb_dc_maternel(fromDto.getNb_dc_maternel());
        technique.setNb_dc_neonat(fromDto.getNb_dc_neonat());
        technique.setNb_diabeteNotification(fromDto.getNb_diabeteNotification());
        technique.setNb_diarheSimple(fromDto.getNb_diarheSimple());
        technique.setNb_transfusion(fromDto.getNb_transfusion());
        technique.setNb_hospitalise(fromDto.getNb_hospitalise());
        technique.setNb_infePostOp(fromDto.getNb_infePostOp());
        technique.setNb_nv_acc_pf(fromDto.getNb_nv_acc_pf());
        technique.setNb_nv_casCuratif(fromDto.getNb_nv_casCuratif());
        technique.setNb_transfusionTeste4Marquer(fromDto.getNb_transfusionTeste4Marquer());
        technique.setPeriode(fromDto.getPeriode());
        repository.save(technique);
        return mapper.toIndicateurTechniqueResponseDto(technique);
    }
// Liste de tous les indicateurs
    @Override
    public List<IndicateurTechniqueResponseDto> getAll() {
        List<IndicateurTechnique> technique = repository.findAll();
        for(IndicateurTechnique it:technique){
            Etablissement etablissement = etablissementRepository.findById(it.getId_ess()).get();
            it.setEtablissement(etablissement);
        }
        return technique.stream()
                .map(indicateurTechnique -> mapper.toIndicateurTechniqueResponseDto(indicateurTechnique))
                .collect(Collectors.toList());
    }
}
