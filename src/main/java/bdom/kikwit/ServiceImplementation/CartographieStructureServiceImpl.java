package bdom.kikwit.ServiceImplementation;

import bdom.kikwit.Dto.CartographieStructureRequestDto;
import bdom.kikwit.Dto.CartographieStructureResponseDto;
import bdom.kikwit.Dto.CategorieRequestDto;
import bdom.kikwit.Services.CartographieStructureService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@AllArgsConstructor
@Transactional
public class CartographieStructureServiceImpl implements CartographieStructureService {
    @Override
    public CartographieStructureResponseDto save(CategorieRequestDto requestDto) {
        return null;
    }

    @Override
    public CartographieStructureResponseDto update(Long id, CartographieStructureRequestDto requestDto) {
        return null;
    }

    @Override
    public CartographieStructureResponseDto getOne(Long id) {
        return null;
    }

    @Override
    public List<CartographieStructureResponseDto> liste() {
        return List.of();
    }
}
