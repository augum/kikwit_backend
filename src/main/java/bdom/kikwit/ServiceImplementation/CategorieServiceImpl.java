package bdom.kikwit.ServiceImplementation;

import bdom.kikwit.Dto.CategorieRequestDto;
import bdom.kikwit.Dto.CategorieResponseDto;
import bdom.kikwit.Services.CategorieService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service @AllArgsConstructor @Transactional
public class CategorieServiceImpl implements CategorieService {
    @Override
    public CategorieResponseDto save(CategorieRequestDto requestDto) {
        return null;
    }

    @Override
    public CategorieResponseDto update(Long id, CategorieRequestDto requestDto) {
        return null;
    }

    @Override
    public CategorieResponseDto getOne(Long id) {
        return null;
    }

    @Override
    public List<CategorieResponseDto> getAll() {
        return List.of();
    }
}
