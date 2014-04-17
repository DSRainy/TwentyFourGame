/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrproject.twentyfour.game;

import java.util.Scanner;

/**
 *
 * @author Rain
 */
public class PlayTwentyFourGame {

    public static void main(String[] args) {
        TwentyFourGame player1 = new TwentyFourGame();
        TwentyFourGame player2 = new TwentyFourGame();
        TwentyFourGame player3 = new TwentyFourGame();
        TwentyFourGame player4 = new TwentyFourGame();

        Integer number[] = new Integer[4];

        number[0] = player1.showRandomNumber();
        number[1] = player2.showRandomNumber();
        number[2] = player3.showRandomNumber();
        number[3] = player4.showRandomNumber();
        showNumber(number);

        Scanner input = new Scanner(System.in);
        String answer;
        String[] calAnswer = null;
        answer = input.next();
        for (int i = 0; i < answer.length(); i++) {
            calAnswer[i] = answer.substring(i, i+1);
        }
    

     
        
        
        
        
        
    }

    public static void showNumber(Integer showNumber[]) {
        System.out.println(showNumber[0] + " " + showNumber[1] + " " + showNumber[2] + " " + showNumber[3]);
    }

    public static void addScore(TwentyFourGame player) {
        player.addScorePlayer();
    }
}
