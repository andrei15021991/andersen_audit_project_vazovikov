package com.andersen.imagechart.repository;

import com.andersen.imagechart.entity.ImageChart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageChartRepo extends JpaRepository<ImageChart, Long> {
}
