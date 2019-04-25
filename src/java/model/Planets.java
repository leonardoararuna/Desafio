/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author leonardo
 */
public class Planets {

    private Integer id;

    private String name;

    private String climate;

    private String terrain;

    private int qtdFilmes;

    private int status;

    public Planets() {
    }

    public Planets(int id, String name, String climate, String terrain, int qtdFilmes, int status) {
        this.id = id;
        this.name = name;
        this.climate = climate;
        this.terrain = terrain;
        this.qtdFilmes = qtdFilmes;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public int getQtdFilmes() {
        return qtdFilmes;
    }

    public void setQtdFilmes(int qtdFilmes) {
        this.qtdFilmes = qtdFilmes;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
