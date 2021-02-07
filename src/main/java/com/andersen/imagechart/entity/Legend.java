package com.andersen.imagechart.entity;

import javax.persistence.*;

@Entity
public class Legend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String color;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "ic_id")
    private ImageChart imageChart;

    public Legend() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ImageChart getImageChart() {
        return imageChart;
    }

    public void setImageChart(ImageChart imageChart) {
        this.imageChart = imageChart;
    }
}
