/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrproject.twentyfour.game;

/**
 *
 * @author Rain
 */
public class TwentyFourGame {

    private Integer[] number = new Integer[10];
    private int count = 0;

    public void setGame() {
        
        for (int i = 0; i < 9; i++) {
            this.number[i] = i + 1;
        }
        this.count = 0;
        
    }

    public int showRandomNumber() {

        Integer randomNumber;
        int i;
        this.count++;
        do {
            randomNumber = (int) (Math.random() * 9 + 1);
            for (i = 0; i < 9; i++) {
                if (this.number[i].equals(randomNumber)) {
                    this.number[i] = null;
                    return randomNumber;
                }
            }
            count++;
        } while (i == 10 && count == 10);
        return 0;
    }
}
