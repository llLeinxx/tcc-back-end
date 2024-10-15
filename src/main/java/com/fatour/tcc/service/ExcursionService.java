package com.fatour.tcc.service;

import com.fatour.tcc.dto.ExcursionDTO;
import com.fatour.tcc.entity.Excursion;
import com.fatour.tcc.reporitory.ExcursionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class ExcursionService {

    @Autowired
    private ExcursionRepository excursionRepository;

    public Excursion insert(ExcursionDTO excursionDTO) {
        Excursion excursion = new Excursion();
        excursion.setDescription(excursionDTO.getDescription());
        excursion.setLocation(excursionDTO.getLocation());
        excursion.setGoing(excursionDTO.getGoing());
        excursion.setBack(excursionDTO.getBack());

        String base64Image = excursionDTO.getImage();
        int paddingCount = 4 - (base64Image.length() % 4);
        if (paddingCount < 4) {
            for (int i = 0; i < paddingCount; i++) {
                base64Image += "=";
            }
        }
        excursion.setImage(Base64.getDecoder().decode(excursionDTO.getImage()));
        excursion.setNumberOfSeats(excursionDTO.getNumberOfSeats());
        excursion.setQuantitySold(excursionDTO.getQuantitySold());

        return excursionRepository.save(excursion);
    }
}
