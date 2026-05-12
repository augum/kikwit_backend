package bdom.kikwit.ServiceImplementation;

import bdom.kikwit.Dto.GestionMedicamentRequestDto;
import bdom.kikwit.Dto.GestionMedicamentResponseDto;
import bdom.kikwit.Services.GestionMedicamenService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service @AllArgsConstructor @Transactional
public class GestionMedicamenServiceImpl implements GestionMedicamenService {
    @Override
    public GestionMedicamentResponseDto save(GestionMedicamentRequestDto requestDto) {
        return null;
    }

    @Override
    public GestionMedicamentResponseDto update(Long id, GestionMedicamentRequestDto requestDto) {
        return null;
    }

    @Override
    public GestionMedicamentResponseDto getOne(Long id) {
        return null;
    }

    @Override
    public List<GestionMedicamentResponseDto> getAll() {
        return List.of();
    }
}
