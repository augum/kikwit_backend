package bdom.kikwit.ServiceImplementation;

import bdom.kikwit.Dto.SourceEnergieRequestDto;
import bdom.kikwit.Dto.SourceEnergieResponseDto;
import bdom.kikwit.Services.SourceEnergieService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service @AllArgsConstructor @Transactional
public class SourceEnergieServiceImpl implements SourceEnergieService {
    @Override
    public SourceEnergieResponseDto save(SourceEnergieRequestDto requestDto) {
        return null;
    }

    @Override
    public SourceEnergieResponseDto update(Long id, SourceEnergieRequestDto requestDto) {
        return null;
    }

    @Override
    public List<SourceEnergieResponseDto> getAll() {
        return List.of();
    }
}
