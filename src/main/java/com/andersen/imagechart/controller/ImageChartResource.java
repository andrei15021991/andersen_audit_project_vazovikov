package com.andersen.imagechart.controller;

import com.andersen.imagechart.entity.ImageChart;
import com.andersen.imagechart.service.ImageChartService;
import com.andersen.imagechart.service.LegendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/image_charts")
public class ImageChartResource {

    @Autowired
    private ImageChartService imageChartService;

    @Autowired
    private LegendService legendService;

    @GetMapping
    public Page<ImageChart> allImageCharts(@RequestParam int page, @RequestParam int size) {
        return imageChartService.getAllImageCharts(page, size);
    }

    @GetMapping("{id}")
    public ImageChart getById(@PathVariable long id) {
        return imageChartService.getImageChartById(id);
    }

    @PostMapping
    public ImageChart addNew(@RequestBody ImageChart imageChart) {
        return imageChartService.addNewImageChart(imageChart);
    }

    @PutMapping
    public ImageChart updateImageChart(@RequestBody ImageChart imageChart) {
        return imageChartService.updateImageChart(imageChart);
    }

    @DeleteMapping("{id}")
    public void deleteImageChart(@PathVariable long id) {
        imageChartService.deleteImageChartById(id);
    }

    @DeleteMapping("{ic_id}/legends/{id}")
    public ImageChart deleteLegend(@PathVariable("ic_id") long icId,
                                   @PathVariable("id") long legendId) {
        legendService.deleteLegendById(legendId);
        return imageChartService.getImageChartById(icId);
    }
}
