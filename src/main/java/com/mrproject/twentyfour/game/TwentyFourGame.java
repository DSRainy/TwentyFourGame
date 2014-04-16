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
    private int score = 0;

    public TwentyFourGame() {
        this.count = 0;
        this.score = 0;
        this.setGame();
    }
    public void setGame() {

        for (int i = 0; i < 9; i++) {
            this.number[i] = i + 1;
        }
        this.count = 0;

    }
    
    public void addScorePlayer()
    {
        this.score += 1;
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

    private boolean checkTwentyFour(int numb1, int numb2, int numb3, int numb4) {
        int checkNumber[] = {numb1,numb2,numb3,numb4};
        if (checkNumber[0] == 0 || checkNumber[1] == 0 || checkNumber[2] == 0 || checkNumber[3] == 0) {
            return false;
        }
        
        return true;

    }

}
