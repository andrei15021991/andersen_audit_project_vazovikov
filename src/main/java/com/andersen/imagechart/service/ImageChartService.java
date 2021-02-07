package com.andersen.imagechart.service;

import com.andersen.imagechart.entity.ImageChart;
import com.andersen.imagechart.repository.ImageChartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageChartService {

    @Autowired
    private ImageChartRepo imageChartRepo;

    public Page<ImageChart> getAllImageCharts(int page, int size) {
        //validation here
        Pageable pageable = PageRequest.of(page, size);
        return imageChartRepo.findAll(pageable);
    }

    public ImageChart getImageChartById(long id) {
        return imageChartRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    public ImageChart addNewImageChart(ImageChart imageChart) {
        //validation here
        return imageChartRepo.save(imageChart);
    }

    public ImageChart updateImageChart(ImageChart imageChart) {
        //validation here
        return imageChartRepo.save(imageChart);
    }

    public void deleteImageChartById(long id) {
        imageChartRepo.deleteById(id);
    }


}
