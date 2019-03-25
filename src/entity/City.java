/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author chaillou
 */
public class City {
    
    private String _name;
    private int _nbOfLiving;
    private String _country;

    public City(String name, int nbOfLiving, String country) {
        this._name = name;
        this._nbOfLiving = nbOfLiving;
        this._country = country;
    }
    
    @Override
    public String toString () {
        return "" + _name + " ,a city with " + _nbOfLiving + " million people in " + _country ; 
    }
    
}
