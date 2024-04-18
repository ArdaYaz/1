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
public class Il {
    private int id;
    private String name;

    public Il(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
}
