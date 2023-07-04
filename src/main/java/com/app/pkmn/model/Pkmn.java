package com.app.pkmn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Pkmn {


    @Id
    private int number;
    private String name;
    private String type1;
    private String type2;
    private int total;
    private int hp;
    private int attack;
    private int defense;
     private int sp_att;
     private int sp_def;
    private int speed;
    private int generation;
    private String isLegendary;









    public Pkmn() {
    }

    public Pkmn(int number, String name, String type1, String type2, int total, int hp, int attack, int defense, int sp_att, int sp_def, int speed, int generation, String isLegendary) {
        this.number = number;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.sp_att = sp_att;
        this.sp_def = sp_def;
        this.speed = speed;
        this.generation = generation;
        this.isLegendary = isLegendary;
    }

    public int getNumber() {
        return number;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSp_att() {
        return sp_att;
    }

    public void setSp_att(int sp_att) {
        this.sp_att = sp_att;
    }

    public int getSp_def() {
        return sp_def;
    }

    public void setSp_def(int sp_def) {
        this.sp_def = sp_def;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public String getIsLegendary() {
        return isLegendary;
    }

    public void setIsLegendary(String isLegendary) {
        this.isLegendary = isLegendary;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

