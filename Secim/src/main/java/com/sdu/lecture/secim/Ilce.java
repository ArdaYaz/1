/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdu.lecture.secim;

import lombok.Data;



/**
 *
 * @author ecirk
 */
@Data
public class Ilce {
    private int ilId;
    private String name;

    public Ilce(int ilId, String name) {
        this.ilId = ilId;
        this.name = name;
    }
    
    
}
