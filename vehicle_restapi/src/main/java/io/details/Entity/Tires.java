package io.details.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Tires {


//    @Id
//    @Column(columnDefinition = "VARCHAR(36)")
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    private Long id;


    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    private Integer frontLeft;
    private Integer frontRight;
    private Integer rearLeft;
    private Integer rearRight;


    @JoinColumn(name = "tires_id", referencedColumnName = "tires_id", nullable = true)
    @OneToOne(optional = true)
    private Readings readings;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Readings getReadings() {
        return readings;
    }

    public void setReadings(Readings readings) {
        this.readings = readings;
    }

    public Integer getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(Integer frontLeft) {
        this.frontLeft = frontLeft;
    }

    public Integer getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(Integer frontRight) {
        this.frontRight = frontRight;
    }

    public Integer getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(Integer rearLeft) {
        this.rearLeft = rearLeft;
    }

    public Integer getRearRight() {
        return rearRight;
    }

    public void setRearRight(Integer rearRight) {
        this.rearRight = rearRight;
    }
}
