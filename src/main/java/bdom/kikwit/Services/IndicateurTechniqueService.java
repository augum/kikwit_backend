package bdom.kikwit.Services;

import bdom.kikwit.Dto.IndicateurTechniqueRequestDto;
import bdom.kikwit.Dto.IndicateurTechniqueResponseDto;

import java.util.List;

public interface IndicateurTechniqueService {
    IndicateurTechniqueResponseDto save(IndicateurTechniqueRequestDto requestDto);
    IndicateurTechniqueResponseDto update(Long id, IndicateurTechniqueRequestDto requestDto);
    List<IndicateurTechniqueResponseDto> getAll();
}
