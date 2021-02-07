package com.andersen.imagechart.repository;

import com.andersen.imagechart.entity.Legend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegendRepo extends JpaRepository<Legend, Long> {
}
