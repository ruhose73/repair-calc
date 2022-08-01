//Работа с базой данных (модель)

package com.example.repaircalc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String layout;
    private String room;
    private Float firstWallWidth;
    private Float firstWallHeight;
    private Float secondWallWidth;
    private Float secondWallHeight;
    private Boolean roughFinish;
    private Boolean fineFinish;
    private Boolean electricity;


    public RoomEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Float getFirstWallWidth() {
        return firstWallWidth;
    }

    public void setFirstWallWidth(Float firstWallWidth) {
        this.firstWallWidth = firstWallWidth;
    }

    public Float getFirstWallHeight() {
        return firstWallHeight;
    }

    public void setFirstWallHeight(Float firstWallHeight) {
        this.firstWallHeight = firstWallHeight;
    }

    public Float getSecondWallWidth() {
        return secondWallWidth;
    }

    public void setSecondWallWidth(Float secondWallWidth) {
        this.secondWallWidth = secondWallWidth;
    }

    public Float getSecondWallHeight() {
        return secondWallHeight;
    }

    public void setSecondWallHeight(Float secondWallHeight) {
        this.secondWallHeight = secondWallHeight;
    }

    public Boolean getRoughFinish() {
        return roughFinish;
    }

    public void setRoughFinish(Boolean roughFinish) {
        this.roughFinish = roughFinish;
    }

    public Boolean getFineFinish() {
        return fineFinish;
    }

    public void setFineFinish(Boolean fineFinish) {
        this.fineFinish = fineFinish;
    }

    public Boolean getElectricity() {
        return electricity;
    }

    public void setElectricity(Boolean electricity) {
        this.electricity = electricity;
    }
}


