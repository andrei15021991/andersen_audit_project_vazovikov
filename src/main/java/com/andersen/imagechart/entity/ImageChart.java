package com.andersen.imagechart.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class ImageChart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String infoUrl;

    private String title;

    private String description;

    private String reportUrl;

    private String demoUrl;

    private String imageUrl;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imageChart")
    private List<Legend> legends;

    public ImageChart() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getDemoUrl() {
        return demoUrl;
    }

    public void setDemoUrl(String demoUrl) {
        this.demoUrl = demoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Legend> getLegends() {
        return legends;
    }

    public void setLegends(List<Legend> legends) {
        this.legends = legends;
    }
}
