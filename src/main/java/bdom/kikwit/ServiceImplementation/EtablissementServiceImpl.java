package bdom.kikwit.ServiceImplementation;

import bdom.kikwit.Dto.EtablissementRequestDto;
import bdom.kikwit.Dto.EtablissementResponseDto;
import bdom.kikwit.Services.EtablissementService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service @AllArgsConstructor @Transactional
public class EtablissementServiceImpl implements EtablissementService {
    @Override
    public EtablissementResponseDto save(EtablissementRequestDto requestDto) {
        return null;
    }

    @Override
    public EtablissementResponseDto update(Long id, EtablissementRequestDto requestDto) {
        return null;
    }

    @Override
    public EtablissementResponseDto getOne(Long id) {
        return null;
    }

    @Override
    public List<EtablissementResponseDto> getAll() {
        return List.of();
    }
}
