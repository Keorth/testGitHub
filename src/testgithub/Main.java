/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgithub;

import entity.City;

/**
 *
 * @author chaillou
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City paris = new City ("Paris",2,"France");
        
        System.out.println(hello() + " from " + paris.toString());
    }
    private static String hello() {
        return "Hello on GitHub";
    }
}
