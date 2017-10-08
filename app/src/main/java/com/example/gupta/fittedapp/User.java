package com.example.gupta.fittedapp;

import android.support.v7.app.AppCompatActivity;

import java.io.Serializable;

/**
 * Created by Gupta on 10/7/2017.
 */

public class User implements Serializable {
    public static int tone, height, chest, waist, face, hair;

    public User(int tone, int height, int chest, int waist, int face, int hair){
        this.tone = tone;
        this.height = height;
        this.chest = chest;
        this.waist = waist;
        this.face = face;
        this.hair = hair;
    }

    public int getTone() {
        return tone;
    }

    public void setTone(int tone) {
        this.tone = tone;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public int getHair() {
        return hair;
    }

    public void setHair(int hair) {
        this.hair = hair;
    }



}
