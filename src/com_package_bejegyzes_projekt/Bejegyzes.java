package com_package_bejegyzes_projekt;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDate letrejott;
    private LocalDate szerkesztve;
    private boolean isChanged;

    Bejegyzes(String szerzo, String tartalom){
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDate.now();
        this.szerkesztve = LocalDate.now();
        this.isChanged = false;
    }

    public String getSzerzo(){
        return this.szerzo;
    }
    public String getTartalom(){
        return this.tartalom;
    }
    public void setTartalom(){
        this.szerkesztve = LocalDate.now();
        this.isChanged = true;
        this.tartalom = tartalom;
    }
    public int getLikeok(){
        return this.likeok = likeok;
    }
    public LocalDate getLetrejott(){
        return this.letrejott;
    }
}
