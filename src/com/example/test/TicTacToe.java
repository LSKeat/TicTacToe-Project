package com.example.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel titlePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[16];
    boolean playerOne_turn;


    public TicTacToe() {

        // Set Frame parameters
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        // Set Label parameters (text)
        textField.setBackground(new Color(25,25,25));
        textField.setForeground(new Color(25,255,0));
        textField.setFont(new Font("Verdana", Font.BOLD,75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("TicTacToe");
        textField.setOpaque(true);

        //Set title position
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0,0,800,100);
        titlePanel.add(textField);

        //Set Buttons
        buttonPanel.setLayout(new GridLayout(4,4));
        buttonPanel.setBackground(new Color(150,150,150));

        for(int i = 0; i < buttons.length; i++){
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);

        }


        //Adding elements to the Frame
        frame.add(titlePanel,BorderLayout.NORTH);
        frame.add(buttonPanel);

        firstTurn();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 16; i++){
            if (e.getSource() == buttons[i]) {

            // Set font and color to players
                if (playerOne_turn) {
                    //Player X
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        playerOne_turn = false;
                        textField.setText("O turn");
                        check();


                    }
                } else {
                    //Player O
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(0, 0, 255));
                        buttons[i].setText("O");
                        playerOne_turn = true;
                        textField.setText("X turn");
                        check();

                    }
                }
            }
        }

    }

    public void firstTurn(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(random.nextInt(2 ) == 0) {
            playerOne_turn = true;
            textField.setText("X turn");
        }
        else {
            playerOne_turn = false;
            textField.setText("O Turn");
        }
    }

    public void check(){

        //X wins (win positions)
        if(     (buttons[0].getText() == "X") &&
                (buttons[1].getText() == "X") &&
                (buttons[2].getText() == "X")){
            xWins(0, 1, 2);
        }
        else if(
                        (buttons[1].getText() == "X") &&
                        (buttons[2].getText() == "X") &&
                        (buttons[3].getText() == "X")) {
            xWins(1, 2, 3);
        }
        else if(
                        (buttons[4].getText() == "X") &&
                        (buttons[5].getText() == "X") &&
                        (buttons[6].getText() == "X")) {
            xWins(4, 5, 6);
        }
        else if(
                        (buttons[5].getText() == "X") &&
                        (buttons[6].getText() == "X") &&
                        (buttons[7].getText() == "X")) {
            xWins(5, 6, 7);
        }
        else if (
                        (buttons[8].getText() == "X") &&
                        (buttons[9].getText() == "X") &&
                        (buttons[10].getText() == "X")){
            xWins(8, 9, 10);
        }
        else if(
                        (buttons[9].getText() == "X") &&
                        (buttons[10].getText() == "X") &&
                        (buttons[11].getText() == "X")) {
            xWins(9, 10, 11);
        }
        else if(
                        (buttons[12].getText() == "X") &&
                        (buttons[13].getText() == "X") &&
                        (buttons[14].getText() == "X")) {
            xWins(12, 13, 14);
        }
        else if(
                        (buttons[13].getText() == "X") &&
                        (buttons[14].getText() == "X") &&
                        (buttons[15].getText() == "X")) {
            xWins(13, 14, 15);
        }
        else if(
                        (buttons[0].getText() == "X") &&
                        (buttons[4].getText() == "X") &&
                        (buttons[8].getText() == "X")) {
            xWins(0, 4, 8);
        }
        else if(
                        (buttons[4].getText() == "X") &&
                        (buttons[8].getText() == "X") &&
                        (buttons[12].getText() == "X")) {
            xWins(4, 8, 12);
        }
        else if (
                        (buttons[1].getText() == "X") &&
                        (buttons[5].getText() == "X") &&
                        (buttons[9].getText() == "X")){
            xWins(1, 5, 9);
        }
        else if(
                        (buttons[5].getText() == "X") &&
                        (buttons[9].getText() == "X") &&
                        (buttons[13].getText() == "X")) {
            xWins(5, 9, 13);
        }
        else if(
                        (buttons[2].getText() == "X") &&
                        (buttons[6].getText() == "X") &&
                        (buttons[10].getText() == "X")) {
            xWins(2, 6, 10);
        }
        else if(
                        (buttons[6].getText() == "X") &&
                        (buttons[10].getText() == "X") &&
                        (buttons[14].getText() == "X")) {
            xWins(6, 10, 14);
        }
        else if(
                        (buttons[3].getText() == "X") &&
                        (buttons[7].getText() == "X") &&
                        (buttons[11].getText() == "X")) {
            xWins(3, 7, 11);
        }
        else if(
                        (buttons[7].getText() == "X") &&
                        (buttons[11].getText() == "X") &&
                        (buttons[15].getText() == "X")) {
            xWins(7, 11, 15);
        }
        else if (
                        (buttons[0].getText() == "X") &&
                        (buttons[5].getText() == "X") &&
                        (buttons[10].getText() == "X")){
            xWins(0, 5, 10);
        }
        else if(
                        (buttons[1].getText() == "X") &&
                        (buttons[6].getText() == "X") &&
                        (buttons[11].getText() == "X")) {
            xWins(1, 6, 11);
        }
        else if(
                        (buttons[2].getText() == "X") &&
                        (buttons[5].getText() == "X") &&
                        (buttons[8].getText() == "X")) {
            xWins(2, 5, 8);
        }

        else if (
                        (buttons[3].getText() == "X") &&
                        (buttons[6].getText() == "X") &&
                        (buttons[9].getText() == "X")){
            xWins(3, 6, 9);
        }
        else if(
                        (buttons[4].getText() == "X") &&
                        (buttons[9].getText() == "X") &&
                        (buttons[14].getText() == "X")) {
            xWins(4, 9, 14);
        }
        else if(
                        (buttons[5].getText() == "X") &&
                        (buttons[10].getText() == "X") &&
                        (buttons[15].getText() == "X")) {
            xWins(5, 10, 15);
        }
        else if(
                        (buttons[6].getText() == "X") &&
                        (buttons[9].getText() == "X") &&
                        (buttons[12].getText() == "X")) {
            xWins(6, 9, 12);
        }
        else if(
                        (buttons[7].getText() == "X") &&
                        (buttons[10].getText() == "X") &&
                        (buttons[13].getText() == "X")) {
            xWins(7, 10, 13);
        }

        //O Wins (win positions)
        if(     (buttons[0].getText() == "O") &&
                (buttons[1].getText() == "O") &&
                (buttons[2].getText() == "O")){
            xWins(0, 1, 2);
        }
        else if(
                        (buttons[1].getText() == "O") &&
                        (buttons[2].getText() == "O") &&
                        (buttons[3].getText() == "O")) {
            xWins(1, 2, 3);
        }
        else if(
                        (buttons[4].getText() == "O") &&
                        (buttons[5].getText() == "O") &&
                        (buttons[6].getText() == "O")) {
            xWins(4, 5, 6);
        }
        else if(
                        (buttons[5].getText() == "O") &&
                        (buttons[6].getText() == "O") &&
                        (buttons[7].getText() == "O")) {
            xWins(5, 6, 7);
        }
        else if (
                        (buttons[8].getText() == "O") &&
                        (buttons[9].getText() == "O") &&
                        (buttons[10].getText() == "O")){
            xWins(8, 9, 10);
        }
        else if(
                        (buttons[9].getText() == "O") &&
                        (buttons[10].getText() == "O") &&
                        (buttons[11].getText() == "O")) {
            xWins(9, 10, 11);
        }
        else if(
                        (buttons[12].getText() == "O") &&
                        (buttons[13].getText() == "O") &&
                        (buttons[14].getText() == "O")) {
            xWins(12, 13, 14);
        }
        else if(
                        (buttons[13].getText() == "O") &&
                        (buttons[14].getText() == "O") &&
                        (buttons[15].getText() == "O")) {
            xWins(13, 14, 15);
        }
        else if(
                        (buttons[0].getText() == "O") &&
                        (buttons[4].getText() == "O") &&
                        (buttons[8].getText() == "O")) {
            xWins(0, 4, 8);
        }
        else if(
                        (buttons[4].getText() == "O") &&
                        (buttons[8].getText() == "O") &&
                        (buttons[12].getText() == "O")) {
            xWins(4, 8, 12);
        }
        else if (
                        (buttons[1].getText() == "O") &&
                        (buttons[5].getText() == "O") &&
                        (buttons[9].getText() == "O")){
            xWins(1, 5, 9);
        }
        else if(
                        (buttons[5].getText() == "O") &&
                        (buttons[9].getText() == "O") &&
                        (buttons[13].getText() == "O")) {
            xWins(5, 9, 13);
        }
        else if(
                        (buttons[2].getText() == "O") &&
                        (buttons[6].getText() == "O") &&
                        (buttons[10].getText() == "O")) {
            xWins(2, 6, 10);
        }
        else if(
                        (buttons[6].getText() == "O") &&
                        (buttons[10].getText() == "O") &&
                        (buttons[14].getText() == "O")) {
            xWins(6, 10, 14);
        }
        else if(
                        (buttons[3].getText() == "O") &&
                        (buttons[7].getText() == "O") &&
                        (buttons[11].getText() == "O")) {
            xWins(3, 7, 11);
        }
        else if(
                        (buttons[7].getText() == "O") &&
                        (buttons[11].getText() == "O") &&
                        (buttons[15].getText() == "O")) {
            xWins(7, 11, 15);
        }
        else if (
                        (buttons[0].getText() == "O") &&
                        (buttons[5].getText() == "O") &&
                        (buttons[10].getText() == "O")){
            xWins(0, 5, 10);
        }
        else if(
                        (buttons[1].getText() == "O") &&
                        (buttons[6].getText() == "O") &&
                        (buttons[11].getText() == "O")) {
            xWins(1, 6, 11);
        }
        else if(
                        (buttons[2].getText() == "O") &&
                        (buttons[5].getText() == "O") &&
                        (buttons[8].getText() == "O")) {
            xWins(2, 5, 8);
        }

        else if (
                        (buttons[3].getText() == "O") &&
                        (buttons[6].getText() == "O") &&
                        (buttons[9].getText() == "O")){
            xWins(3, 6, 9);
        }
        else if(
                        (buttons[4].getText() == "O") &&
                        (buttons[9].getText() == "O") &&
                        (buttons[14].getText() == "O")) {
            xWins(4, 9, 14);
        }
        else if(
                        (buttons[5].getText() == "O") &&
                        (buttons[10].getText() == "O") &&
                        (buttons[15].getText() == "O")) {
            xWins(5, 10, 15);
        }
        else if(
                        (buttons[6].getText() == "O") &&
                        (buttons[9].getText() == "O") &&
                        (buttons[12].getText() == "O")) {
            xWins(6, 9, 12);
        }
        else if(
                        (buttons[7].getText() == "O") &&
                        (buttons[10].getText() == "O") &&
                        (buttons[13].getText() == "O")) {
            xWins(7, 10, 13);
        }

    }

    public void xWins(int a, int b, int c){

    //Set winner X background to green color
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for(int i = 0; i< buttons.length; i++){
            buttons[i].setEnabled(false);
        }

        textField.setText("X wins");



    }

    public void oWins(int a, int b, int c) {

    //Set winner O background to green color
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for(int i = 0; i< buttons.length; i++){
            buttons[i].setEnabled(false);
        }

        textField.setText("O wins");

    }
}
