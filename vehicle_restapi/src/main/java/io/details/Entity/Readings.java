package io.details.Entity;

import javax.persistence.*;

@Entity
@Table(name = "readings")
public class Readings {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String vin;
    private Float latitude;
    private Float longitude;
    private String timestamp;
    private Float fuelVolume;
    private Float speed;
    private Float engineHp;
    private boolean checkEngineLightOn;
    private boolean engineCoolantLow;
    private boolean cruiseControlOn;
    private Integer engineRpm;

    @OneToOne(cascade = CascadeType.ALL)
    private Tires tires;


    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }




    public Readings( ) {

    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Float getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(Float fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Float getEngineHp() {
        return engineHp;
    }

    public void setEngineHp(Float engineHp) {
        this.engineHp = engineHp;
    }

    public boolean isCheckEngineLightOn() {
        return checkEngineLightOn;
    }

    public void setCheckEngineLightOn(boolean checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    public boolean isEngineCoolantLow() {
        return engineCoolantLow;
    }

    public void setEngineCoolantLow(boolean engineCoolantLow) {
        this.engineCoolantLow = engineCoolantLow;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    public void setCruiseControlOn(boolean cruiseControlOn) {
        this.cruiseControlOn = cruiseControlOn;
    }

    public Integer getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(Integer engineRpm) {
        this.engineRpm = engineRpm;
    }



    @Override
    public String toString(){
        return "Readings{" +
                "vin='" + vin + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", fuelVolume='" + fuelVolume + '\'' +
                ", speed='" + speed + '\'' +
                ", engineHp='" + engineHp + '\'' +
                ", checkEngineLightOn='" + checkEngineLightOn + '\'' +
                ", engineCoolantLow='" + engineCoolantLow + '\'' +
                ", cruiseControlOn='" + cruiseControlOn + '\'' +

                ", engineRpm='" + engineRpm + '\'' +
                ", tires='" + tires + '\''+
                '}';
    }

}
