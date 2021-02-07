package com.andersen.imagechart.service;

import com.andersen.imagechart.repository.LegendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LegendService {

    @Autowired
    private LegendRepo legendRepo;

    public void deleteLegendById(long id) {
        legendRepo.deleteById(id);
    }
}
