package bdom.kikwit.ServiceImplementation;

import bdom.kikwit.Dto.IndicateurTechniqueRequestDto;
import bdom.kikwit.Dto.IndicateurTechniqueResponseDto;
import bdom.kikwit.Services.IndicateurTechniqueService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service @Transactional @AllArgsConstructor
public class IndicateurTechniqueServiceImpl implements IndicateurTechniqueService {
    @Override
    public IndicateurTechniqueResponseDto save(IndicateurTechniqueRequestDto requestDto) {
        return null;
    }

    @Override
    public IndicateurTechniqueResponseDto update(Long id, IndicateurTechniqueRequestDto requestDto) {
        return null;
    }

    @Override
    public List<IndicateurTechniqueResponseDto> getAll() {
        return List.of();
    }
}
