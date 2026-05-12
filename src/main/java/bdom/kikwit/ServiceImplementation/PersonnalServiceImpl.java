package bdom.kikwit.ServiceImplementation;

import bdom.kikwit.Dto.PersonnelRequestDto;
import bdom.kikwit.Dto.PersonnelResponseDto;
import bdom.kikwit.Services.PersonnalService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service @AllArgsConstructor @Transactional
public class PersonnalServiceImpl implements PersonnalService {
    @Override
    public PersonnelResponseDto save(PersonnelRequestDto requestDto) {
        return null;
    }

    @Override
    public PersonnelResponseDto update(Long id, PersonnelRequestDto requestDto) {
        return null;
    }

    @Override
    public List<PersonnelResponseDto> getAll() {
        return List.of();
    }
}
