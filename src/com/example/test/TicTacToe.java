package com.example.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener
{

   Random random = new Random();
   JFrame frame = new JFrame();
   JPanel titlePanel = new JPanel();
   JPanel buttonPanel = new JPanel();
   JLabel textField = new JLabel();
   JButton[] buttons = new JButton[16];
   boolean playerOne_turn;
   int firstClick = 0;
   int count = 0;

   public TicTacToe()
   {

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
      textField.setText("Game Start");
      textField.setOpaque(true);

      //Set title position
      titlePanel.setLayout(new BorderLayout());
      titlePanel.setBounds(0,0,800,100);
      titlePanel.add(textField);

      //Set Buttons
      buttonPanel.setLayout(new GridLayout(4,4));
      buttonPanel.setBackground(new Color(150,150,150));

      for(int i = 0; i < buttons.length; i++)
      {
         buttons[i] = new JButton();
         buttonPanel.add(buttons[i]);
         buttons[i].setFont(new Font("MV Boli", Font.BOLD,120));
         buttons[i].setFocusable(false);
         buttons[i].addActionListener(this);
         buttons[i].setBackground(new Color(255, 255, 255));
      }

      //Adding elements to the Frame
      frame.add(titlePanel,BorderLayout.NORTH);
      frame.add(buttonPanel);
      
      initialize();
      firstTurn();
      
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
   
      // Set font and color to players
      if (playerOne_turn)
      {
      
         //Player X
         for (int j = 0; j < 16; j++)
            buttons[j].setBackground(new Color(255, 255, 255));
         textField.setText("O turn");
         
         for (int i = 0; i < 16; i++)
         {
            if (e.getSource() == buttons[i])
            {
               if (buttons[i].getText() == "X")
                  textField.setText("Where To Move");
               else if (buttons[i].getText() == "")
               {
                  buttons[i].setText("X");
                  buttons[i].setForeground(new Color(255, 0, 0));
                  buttons[firstClick].setText("");
               }
               firstClick = i;
            }         
         }
         
         if(count % 2 == 1)
            playerOne_turn = false;
            
         count++;
         
         for(int j = 0; j < 16; j++)
            buttons[j].setEnabled(true);
            
         if (count % 2 == 0)
         {
            for(int j = 0; j < 16; j++)
            {
               if (buttons[j].getText() != "O")
                  buttons[j].setEnabled(false);
            }
         }
         else if (count % 2 == 1)
         {
            for(int j = 0; j < 16; j++)
            {
               buttons[j].setEnabled(false);
                  if (firstClick == 0)
                  {
                     if (buttons[1].getText() == "")
                     {
                        buttons[1].setBackground(new Color(0, 255, 255));
                        buttons[1].setEnabled(true);
                     }
                     if (buttons[4].getText() == "")
                     {
                        buttons[4].setBackground(new Color(0, 255, 255));
                        buttons[4].setEnabled(true);
                     }
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                  }
                  if (firstClick == 1)
                  {
                     if (buttons[0].getText() == "")
                     {
                        buttons[0].setBackground(new Color(0, 255, 255));
                        buttons[0].setEnabled(true);
                     }
                     if (buttons[2].getText() == "")
                     {
                        buttons[2].setBackground(new Color(0, 255, 255));
                        buttons[2].setEnabled(true);
                     }

                     if (buttons[4].getText() == "")
                     {
                        buttons[4].setBackground(new Color(0, 255, 255));
                        buttons[4].setEnabled(true);
                     }
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                  }
                  if (firstClick == 2)
                  {
                     if (buttons[1].getText() == "")
                     {
                        buttons[1].setBackground(new Color(0, 255, 255));
                        buttons[1].setEnabled(true);
                     }
                     if (buttons[3].getText() == "")
                     {
                        buttons[3].setBackground(new Color(0, 255, 255));
                        buttons[3].setEnabled(true);
                     }

                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[7].getText() == "")
                     {
                        buttons[7].setBackground(new Color(0, 255, 255));
                        buttons[7].setEnabled(true);
                     }
                  }
                  if (firstClick == 3)
                  {
                     if (buttons[2].getText() == "")
                     {
                        buttons[2].setBackground(new Color(0, 255, 255));
                        buttons[2].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[7].getText() == "")
                     {
                        buttons[7].setBackground(new Color(0, 255, 255));
                        buttons[7].setEnabled(true);
                     }
                  }
                  if (firstClick == 4)
                  {
                     if (buttons[0].getText() == "")
                     {
                        buttons[0].setBackground(new Color(0, 255, 255));
                        buttons[0].setEnabled(true);
                     }
                     if (buttons[1].getText() == "")
                     {
                        buttons[1].setBackground(new Color(0, 255, 255));
                        buttons[1].setEnabled(true);
                     }
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[8].getText() == "")
                     {
                        buttons[8].setBackground(new Color(0, 255, 255));
                        buttons[8].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                  }
                  if (firstClick == 5)
                  {
                     if (buttons[0].getText() == "")
                     {
                        buttons[0].setBackground(new Color(0, 255, 255));
                        buttons[0].setEnabled(true);
                     }
                     if (buttons[1].getText() == "")
                     {
                        buttons[1].setBackground(new Color(0, 255, 255));
                        buttons[1].setEnabled(true);
                     }
                     if (buttons[2].getText() == "")
                     {
                        buttons[2].setBackground(new Color(0, 255, 255));
                        buttons[2].setEnabled(true);
                     }
                     if (buttons[4].getText() == "")
                     {
                        buttons[4].setBackground(new Color(0, 255, 255));
                        buttons[4].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[8].getText() == "")
                     {
                        buttons[8].setBackground(new Color(0, 255, 255));
                        buttons[8].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                  }
                  if (firstClick == 6)
                  {
                     if (buttons[1].getText() == "")
                     {
                        buttons[1].setBackground(new Color(0, 255, 255));
                        buttons[1].setEnabled(true);
                     }
                     if (buttons[2].getText() == "")
                     {
                        buttons[2].setBackground(new Color(0, 255, 255));
                        buttons[2].setEnabled(true);
                     }
                     if (buttons[3].getText() == "")
                     {
                        buttons[3].setBackground(new Color(0, 255, 255));
                        buttons[3].setEnabled(true);
                     }
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[7].getText() == "")
                     {
                        buttons[7].setBackground(new Color(0, 255, 255));
                        buttons[7].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[11].getText() == "")
                     {
                        buttons[11].setBackground(new Color(0, 255, 255));
                        buttons[11].setEnabled(true);
                     }
                  }
                  if (firstClick == 7)
                  {
                     if (buttons[2].getText() == "")
                     {
                        buttons[2].setBackground(new Color(0, 255, 255));
                        buttons[2].setEnabled(true);
                     }
                     if (buttons[3].getText() == "")
                     {
                        buttons[3].setBackground(new Color(0, 255, 255));
                        buttons[3].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[11].getText() == "")
                     {
                        buttons[11].setBackground(new Color(0, 255, 255));
                        buttons[11].setEnabled(true);
                     }
                  }
                  if (firstClick == 8)
                  {
                     if (buttons[4].getText() == "")
                     {
                        buttons[4].setBackground(new Color(0, 255, 255));
                        buttons[4].setEnabled(true);
                     }
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[12].getText() == "")
                     {
                        buttons[12].setBackground(new Color(0, 255, 255));
                        buttons[12].setEnabled(true);
                     }
                     if (buttons[13].getText() == "")
                     {
                        buttons[13].setBackground(new Color(0, 255, 255));
                        buttons[13].setEnabled(true);
                     }
                  }
                  if (firstClick == 9)
                  {
                     if (buttons[4].getText() == "")
                     {
                        buttons[4].setBackground(new Color(0, 255, 255));
                        buttons[4].setEnabled(true);
                     }
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[8].getText() == "")
                     {
                        buttons[8].setBackground(new Color(0, 255, 255));
                        buttons[8].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[12].getText() == "")
                     {
                        buttons[12].setBackground(new Color(0, 255, 255));
                        buttons[12].setEnabled(true);
                     }
                     if (buttons[13].getText() == "")
                     {
                        buttons[13].setBackground(new Color(0, 255, 255));
                        buttons[13].setEnabled(true);
                     }
                     if (buttons[14].getText() == "")
                     {
                        buttons[14].setBackground(new Color(0, 255, 255));
                        buttons[14].setEnabled(true);
                     }
                  }
                  if (firstClick == 10)
                  {
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[7].getText() == "")
                     {
                        buttons[7].setBackground(new Color(0, 255, 255));
                        buttons[7].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[11].getText() == "")
                     {
                        buttons[11].setBackground(new Color(0, 255, 255));
                        buttons[11].setEnabled(true);
                     }
                     if (buttons[13].getText() == "")
                     {
                        buttons[13].setBackground(new Color(0, 255, 255));
                        buttons[13].setEnabled(true);
                     }
                     if (buttons[14].getText() == "")
                     {
                        buttons[14].setBackground(new Color(0, 255, 255));
                        buttons[14].setEnabled(true);
                     }
                     if (buttons[15].getText() == "")
                     {
                        buttons[15].setBackground(new Color(0, 255, 255));
                        buttons[15].setEnabled(true);
                     }
                  }
                  if (firstClick == 11)
                  {
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[7].getText() == "")
                     {
                        buttons[7].setBackground(new Color(0, 255, 255));
                        buttons[7].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[14].getText() == "")
                     {
                        buttons[14].setBackground(new Color(0, 255, 255));
                        buttons[14].setEnabled(true);
                     }
                     if (buttons[15].getText() == "")
                     {
                        buttons[15].setBackground(new Color(0, 255, 255));
                        buttons[15].setEnabled(true);
                     }
                  }
                  if (firstClick == 12)
                  {
                     if (buttons[8].getText() == "")
                     {
                        buttons[8].setBackground(new Color(0, 255, 255));
                        buttons[8].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[13].getText() == "")
                     {
                        buttons[13].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                  }
                  if (firstClick == 13)
                  {
                     if (buttons[8].getText() == "")
                     {
                        buttons[8].setBackground(new Color(0, 255, 255));
                        buttons[8].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[12].getText() == "")
                     {
                        buttons[12].setBackground(new Color(0, 255, 255));
                        buttons[12].setEnabled(true);
                     }
                     if (buttons[14].getText() == "")
                     {
                        buttons[14].setBackground(new Color(0, 255, 255));
                        buttons[14].setEnabled(true);
                     }
                  }
                  if (firstClick == 14)
                  {
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[11].getText() == "")
                     {
                        buttons[11].setBackground(new Color(0, 255, 255));
                        buttons[11].setEnabled(true);
                     }
                     if (buttons[13].getText() == "")
                     {
                        buttons[13].setBackground(new Color(0, 255, 255));
                        buttons[13].setEnabled(true);
                     }
                     if (buttons[15].getText() == "")
                     {
                        buttons[15].setBackground(new Color(0, 255, 255));
                        buttons[15].setEnabled(true);
                     }
                  }
                  if (firstClick == 15)
                  {
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[11].getText() == "")
                     {
                        buttons[11].setBackground(new Color(0, 255, 255));
                        buttons[11].setEnabled(true);
                     }
                     if (buttons[14].getText() == "")
                     {
                        buttons[14].setBackground(new Color(0, 255, 255));
                        buttons[14].setEnabled(true);
                     }
                  }
            } 
         }
         check();
      }
      
      else
      {
      
         //Player O
         for (int j = 0; j < 16; j++)
            buttons[j].setBackground(new Color(255, 255, 255));
            
         if (count % 2 == 0)
         {
            for(int j = 0; j < 16; j++)
            {
               if (buttons[j].getText() != "O")
                  buttons[j].setEnabled(false);
            }
         }
         if (count % 2 == 1)
         {
            for(int j = 0; j < 16; j++)
            {
               if (buttons[j].getText() != "")
                  buttons[j].setEnabled(false);
            }
         }
         textField.setText("X turn");
         
         for (int i = 0; i < 16; i++)
         {
            if (e.getSource() == buttons[i])
            {
               if (buttons[i].getText() == "O")
                  textField.setText("Where To Move");
               else if (buttons[i].getText() == "")
               {
                  buttons[i].setText("O");
                  buttons[i].setForeground(new Color(0, 0, 255));
                  buttons[firstClick].setText("");
               }
               firstClick = i;
            }         
         }
         if (count % 2 == 1)
            playerOne_turn = true;
            
         count ++;
         
         for(int j = 0; j < 16; j++)
            buttons[j].setEnabled(true);
            
         if (count % 2 == 0)
         {
            for(int j = 0; j < 16; j++)
            {
               if (buttons[j].getText() != "X")
                  buttons[j].setEnabled(false);
            }
         }
         else if (count % 2 == 1)
         {
            for(int j = 0; j < 16; j++)
            {
               buttons[j].setEnabled(false);
                  if (firstClick == 0)
                  {
                     if (buttons[1].getText() == "")
                     {
                        buttons[1].setBackground(new Color(0, 255, 255));
                        buttons[1].setEnabled(true);
                     }
                     if (buttons[4].getText() == "")
                     {
                        buttons[4].setBackground(new Color(0, 255, 255));
                        buttons[4].setEnabled(true);
                     }
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                  }
                  if (firstClick == 1)
                  {
                     if (buttons[0].getText() == "")
                     {
                        buttons[0].setBackground(new Color(0, 255, 255));
                        buttons[0].setEnabled(true);
                     }
                     if (buttons[2].getText() == "")
                     {
                        buttons[2].setBackground(new Color(0, 255, 255));
                        buttons[2].setEnabled(true);
                     }

                     if (buttons[4].getText() == "")
                     {
                        buttons[4].setBackground(new Color(0, 255, 255));
                        buttons[4].setEnabled(true);
                     }
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                  }
                  if (firstClick == 2)
                  {
                     if (buttons[1].getText() == "")
                     {
                        buttons[1].setBackground(new Color(0, 255, 255));
                        buttons[1].setEnabled(true);
                     }
                     if (buttons[3].getText() == "")
                     {
                        buttons[3].setBackground(new Color(0, 255, 255));
                        buttons[3].setEnabled(true);
                     }

                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[7].getText() == "")
                     {
                        buttons[7].setBackground(new Color(0, 255, 255));
                        buttons[7].setEnabled(true);
                     }
                  }
                  if (firstClick == 3)
                  {
                     if (buttons[2].getText() == "")
                     {
                        buttons[2].setBackground(new Color(0, 255, 255));
                        buttons[2].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[7].getText() == "")
                     {
                        buttons[7].setBackground(new Color(0, 255, 255));
                        buttons[7].setEnabled(true);
                     }
                  }
                  if (firstClick == 4)
                  {
                     if (buttons[0].getText() == "")
                     {
                        buttons[0].setBackground(new Color(0, 255, 255));
                        buttons[0].setEnabled(true);
                     }
                     if (buttons[1].getText() == "")
                     {
                        buttons[1].setBackground(new Color(0, 255, 255));
                        buttons[1].setEnabled(true);
                     }
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[8].getText() == "")
                     {
                        buttons[8].setBackground(new Color(0, 255, 255));
                        buttons[8].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                  }
                  if (firstClick == 5)
                  {
                     if (buttons[0].getText() == "")
                     {
                        buttons[0].setBackground(new Color(0, 255, 255));
                        buttons[0].setEnabled(true);
                     }
                     if (buttons[1].getText() == "")
                     {
                        buttons[1].setBackground(new Color(0, 255, 255));
                        buttons[1].setEnabled(true);
                     }
                     if (buttons[2].getText() == "")
                     {
                        buttons[2].setBackground(new Color(0, 255, 255));
                        buttons[2].setEnabled(true);
                     }
                     if (buttons[4].getText() == "")
                     {
                        buttons[4].setBackground(new Color(0, 255, 255));
                        buttons[4].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[8].getText() == "")
                     {
                        buttons[8].setBackground(new Color(0, 255, 255));
                        buttons[8].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                  }
                  if (firstClick == 6)
                  {
                     if (buttons[1].getText() == "")
                     {
                        buttons[1].setBackground(new Color(0, 255, 255));
                        buttons[1].setEnabled(true);
                     }
                     if (buttons[2].getText() == "")
                     {
                        buttons[2].setBackground(new Color(0, 255, 255));
                        buttons[2].setEnabled(true);
                     }
                     if (buttons[3].getText() == "")
                     {
                        buttons[3].setBackground(new Color(0, 255, 255));
                        buttons[3].setEnabled(true);
                     }
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[7].getText() == "")
                     {
                        buttons[7].setBackground(new Color(0, 255, 255));
                        buttons[7].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[11].getText() == "")
                     {
                        buttons[11].setBackground(new Color(0, 255, 255));
                        buttons[11].setEnabled(true);
                     }
                  }
                  if (firstClick == 7)
                  {
                     if (buttons[2].getText() == "")
                     {
                        buttons[2].setBackground(new Color(0, 255, 255));
                        buttons[2].setEnabled(true);
                     }
                     if (buttons[3].getText() == "")
                     {
                        buttons[3].setBackground(new Color(0, 255, 255));
                        buttons[3].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[11].getText() == "")
                     {
                        buttons[11].setBackground(new Color(0, 255, 255));
                        buttons[11].setEnabled(true);
                     }
                  }
                  if (firstClick == 8)
                  {
                     if (buttons[4].getText() == "")
                     {
                        buttons[4].setBackground(new Color(0, 255, 255));
                        buttons[4].setEnabled(true);
                     }
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[12].getText() == "")
                     {
                        buttons[12].setBackground(new Color(0, 255, 255));
                        buttons[12].setEnabled(true);
                     }
                     if (buttons[13].getText() == "")
                     {
                        buttons[13].setBackground(new Color(0, 255, 255));
                        buttons[13].setEnabled(true);
                     }
                  }
                  if (firstClick == 9)
                  {
                     if (buttons[4].getText() == "")
                     {
                        buttons[4].setBackground(new Color(0, 255, 255));
                        buttons[4].setEnabled(true);
                     }
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[8].getText() == "")
                     {
                        buttons[8].setBackground(new Color(0, 255, 255));
                        buttons[8].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[12].getText() == "")
                     {
                        buttons[12].setBackground(new Color(0, 255, 255));
                        buttons[12].setEnabled(true);
                     }
                     if (buttons[13].getText() == "")
                     {
                        buttons[13].setBackground(new Color(0, 255, 255));
                        buttons[13].setEnabled(true);
                     }
                     if (buttons[14].getText() == "")
                     {
                        buttons[14].setBackground(new Color(0, 255, 255));
                        buttons[14].setEnabled(true);
                     }
                  }
                  if (firstClick == 10)
                  {
                     if (buttons[5].getText() == "")
                     {
                        buttons[5].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[7].getText() == "")
                     {
                        buttons[7].setBackground(new Color(0, 255, 255));
                        buttons[7].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[11].getText() == "")
                     {
                        buttons[11].setBackground(new Color(0, 255, 255));
                        buttons[11].setEnabled(true);
                     }
                     if (buttons[13].getText() == "")
                     {
                        buttons[13].setBackground(new Color(0, 255, 255));
                        buttons[13].setEnabled(true);
                     }
                     if (buttons[14].getText() == "")
                     {
                        buttons[14].setBackground(new Color(0, 255, 255));
                        buttons[14].setEnabled(true);
                     }
                     if (buttons[15].getText() == "")
                     {
                        buttons[15].setBackground(new Color(0, 255, 255));
                        buttons[15].setEnabled(true);
                     }
                  }
                  if (firstClick == 11)
                  {
                     if (buttons[6].getText() == "")
                     {
                        buttons[6].setBackground(new Color(0, 255, 255));
                        buttons[6].setEnabled(true);
                     }
                     if (buttons[7].getText() == "")
                     {
                        buttons[7].setBackground(new Color(0, 255, 255));
                        buttons[7].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[14].getText() == "")
                     {
                        buttons[14].setBackground(new Color(0, 255, 255));
                        buttons[14].setEnabled(true);
                     }
                     if (buttons[15].getText() == "")
                     {
                        buttons[15].setBackground(new Color(0, 255, 255));
                        buttons[15].setEnabled(true);
                     }
                  }
                  if (firstClick == 12)
                  {
                     if (buttons[8].getText() == "")
                     {
                        buttons[8].setBackground(new Color(0, 255, 255));
                        buttons[8].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[13].getText() == "")
                     {
                        buttons[13].setBackground(new Color(0, 255, 255));
                        buttons[5].setEnabled(true);
                     }
                  }
                  if (firstClick == 13)
                  {
                     if (buttons[8].getText() == "")
                     {
                        buttons[8].setBackground(new Color(0, 255, 255));
                        buttons[8].setEnabled(true);
                     }
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[12].getText() == "")
                     {
                        buttons[12].setBackground(new Color(0, 255, 255));
                        buttons[12].setEnabled(true);
                     }
                     if (buttons[14].getText() == "")
                     {
                        buttons[14].setBackground(new Color(0, 255, 255));
                        buttons[14].setEnabled(true);
                     }
                  }
                  if (firstClick == 14)
                  {
                     if (buttons[9].getText() == "")
                     {
                        buttons[9].setBackground(new Color(0, 255, 255));
                        buttons[9].setEnabled(true);
                     }
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[11].getText() == "")
                     {
                        buttons[11].setBackground(new Color(0, 255, 255));
                        buttons[11].setEnabled(true);
                     }
                     if (buttons[13].getText() == "")
                     {
                        buttons[13].setBackground(new Color(0, 255, 255));
                        buttons[13].setEnabled(true);
                     }
                     if (buttons[15].getText() == "")
                     {
                        buttons[15].setBackground(new Color(0, 255, 255));
                        buttons[15].setEnabled(true);
                     }
                  }
                  if (firstClick == 15)
                  {
                     if (buttons[10].getText() == "")
                     {
                        buttons[10].setBackground(new Color(0, 255, 255));
                        buttons[10].setEnabled(true);
                     }
                     if (buttons[11].getText() == "")
                     {
                        buttons[11].setBackground(new Color(0, 255, 255));
                        buttons[11].setEnabled(true);
                     }
                     if (buttons[14].getText() == "")
                     {
                        buttons[14].setBackground(new Color(0, 255, 255));
                        buttons[14].setEnabled(true);
                     }
                  }
            }
         }
      }
      check();
   }

   public void initialize(){
      //Set Starting Token
      buttons[0].setForeground(new Color(255, 0, 0));
      buttons[0].setText("X");
      buttons[2].setForeground(new Color(255, 0, 0));
      buttons[2].setText("X");
      buttons[13].setForeground(new Color(255, 0, 0));
      buttons[13].setText("X");
      buttons[15].setForeground(new Color(255, 0, 0));
      buttons[15].setText("X");
      buttons[1].setForeground(new Color(0, 0, 255));
      buttons[1].setText("O");
      buttons[3].setForeground(new Color(0, 0, 255));
      buttons[3].setText("O");
      buttons[12].setForeground(new Color(0, 0, 255));
      buttons[12].setText("O");
      buttons[14].setForeground(new Color(0, 0, 255));
      buttons[14].setText("O");
   }

   public void firstTurn()

   {
   
        for(int j = 0; j < 16; j++)
            buttons[j].setEnabled(false);    
        try 
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        
        for(int j = 0; j < 16; j++)
            buttons[j].setEnabled(true);

        if(random.nextInt(2 ) == 0)
        {
            playerOne_turn = true;
            textField.setText("X turn");
            
            for(int j = 0; j < 16; j++)
            {
               if (buttons[j].getText() != "X")
                  buttons[j].setEnabled(false);
            }
        }
        else
        {
            playerOne_turn = false;
            textField.setText("O turn");
            
            for(int j = 0; j < 16; j++)
            {
               if (buttons[j].getText() != "O")
                  buttons[j].setEnabled(false);
            }
        }
   }

   public void resetgame(){

      for(int i = 0; i < buttons.length; i++)
      {
         buttons[i].setBackground(new Color(255, 255, 255));
         buttons[i].setText("");
      }
      
      initialize();
      firstTurn();
   }

   public void check()
   {

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
            oWins(0, 1, 2);
        }
        else if(
                        (buttons[1].getText() == "O") &&
                        (buttons[2].getText() == "O") &&
                        (buttons[3].getText() == "O")) {
            oWins(1, 2, 3);
        }
        else if(
                        (buttons[4].getText() == "O") &&
                        (buttons[5].getText() == "O") &&
                        (buttons[6].getText() == "O")) {
            oWins(4, 5, 6);
        }
        else if(
                        (buttons[5].getText() == "O") &&
                        (buttons[6].getText() == "O") &&
                        (buttons[7].getText() == "O")) {
            oWins(5, 6, 7);
        }
        else if (
                        (buttons[8].getText() == "O") &&
                        (buttons[9].getText() == "O") &&
                        (buttons[10].getText() == "O")){
            oWins(8, 9, 10);
        }
        else if(
                        (buttons[9].getText() == "O") &&
                        (buttons[10].getText() == "O") &&
                        (buttons[11].getText() == "O")) {
            oWins(9, 10, 11);
        }
        else if(
                        (buttons[12].getText() == "O") &&
                        (buttons[13].getText() == "O") &&
                        (buttons[14].getText() == "O")) {
            oWins(12, 13, 14);
        }
        else if(
                        (buttons[13].getText() == "O") &&
                        (buttons[14].getText() == "O") &&
                        (buttons[15].getText() == "O")) {
            oWins(13, 14, 15);
        }
        else if(
                        (buttons[0].getText() == "O") &&
                        (buttons[4].getText() == "O") &&
                        (buttons[8].getText() == "O")) {
            oWins(0, 4, 8);
        }
        else if(
                        (buttons[4].getText() == "O") &&
                        (buttons[8].getText() == "O") &&
                        (buttons[12].getText() == "O")) {
            oWins(4, 8, 12);
        }
        else if (
                        (buttons[1].getText() == "O") &&
                        (buttons[5].getText() == "O") &&
                        (buttons[9].getText() == "O")){
            oWins(1, 5, 9);
        }
        else if(
                        (buttons[5].getText() == "O") &&
                        (buttons[9].getText() == "O") &&
                        (buttons[13].getText() == "O")) {
            oWins(5, 9, 13);
        }
        else if(
                        (buttons[2].getText() == "O") &&
                        (buttons[6].getText() == "O") &&
                        (buttons[10].getText() == "O")) {
            oWins(2, 6, 10);
        }
        else if(
                        (buttons[6].getText() == "O") &&
                        (buttons[10].getText() == "O") &&
                        (buttons[14].getText() == "O")) {
            oWins(6, 10, 14);
        }
        else if(
                        (buttons[3].getText() == "O") &&
                        (buttons[7].getText() == "O") &&
                        (buttons[11].getText() == "O")) {
            oWins(3, 7, 11);
        }
        else if(
                        (buttons[7].getText() == "O") &&
                        (buttons[11].getText() == "O") &&
                        (buttons[15].getText() == "O")) {
            oWins(7, 11, 15);
        }
        else if (
                        (buttons[0].getText() == "O") &&
                        (buttons[5].getText() == "O") &&
                        (buttons[10].getText() == "O")){
            oWins(0, 5, 10);
        }
        else if(
                        (buttons[1].getText() == "O") &&
                        (buttons[6].getText() == "O") &&
                        (buttons[11].getText() == "O")) {
            oWins(1, 6, 11);
        }
        else if(
                        (buttons[2].getText() == "O") &&
                        (buttons[5].getText() == "O") &&
                        (buttons[8].getText() == "O")) {
            oWins(2, 5, 8);
        }

        else if (
                        (buttons[3].getText() == "O") &&
                        (buttons[6].getText() == "O") &&
                        (buttons[9].getText() == "O")){
            oWins(3, 6, 9);
        }
        else if(
                        (buttons[4].getText() == "O") &&
                        (buttons[9].getText() == "O") &&
                        (buttons[14].getText() == "O")) {
            oWins(4, 9, 14);
        }
        else if(
                        (buttons[5].getText() == "O") &&
                        (buttons[10].getText() == "O") &&
                        (buttons[15].getText() == "O")) {
            oWins(5, 10, 15);
        }
        else if(
                        (buttons[6].getText() == "O") &&
                        (buttons[9].getText() == "O") &&
                        (buttons[12].getText() == "O")) {
            oWins(6, 9, 12);
        }
        else if(
                        (buttons[7].getText() == "O") &&
                        (buttons[10].getText() == "O") &&
                        (buttons[13].getText() == "O")) {
            oWins(7, 10, 13);
        }

   }

   public void xWins(int a, int b, int c)
   {

   //Set winner X background to green color
      buttons[a].setBackground(Color.GREEN);
      buttons[b].setBackground(Color.GREEN);
      buttons[c].setBackground(Color.GREEN);

      for(int i = 0; i < buttons.length; i++)
      {
         buttons[i].setEnabled(false);
      }

      textField.setText("X wins");

      // Restart or Quit
      JOptionPane pane = new JOptionPane();
      int dialogResult = JOptionPane.showConfirmDialog(pane, "X wins! Would you like to play again?","Play Again?", JOptionPane.YES_NO_OPTION);
            
      if(dialogResult == JOptionPane.YES_OPTION)
         resetgame();
      else System.exit(0);
   
   }
      

    public void oWins(int a, int b, int c)
    {

    //Set winner O background to green color
      buttons[a].setBackground(Color.GREEN);
      buttons[b].setBackground(Color.GREEN);
      buttons[c].setBackground(Color.GREEN);

      for(int i = 0; i < buttons.length; i++)
      {
         buttons[i].setEnabled(false);
      }

      textField.setText("O wins");

      // Restart or Quit
      JOptionPane pane = new JOptionPane();
      int dialogResult = JOptionPane.showConfirmDialog(pane, "O wins! Would you like to play again?","Play Again?", JOptionPane.YES_NO_OPTION);
               
      if(dialogResult == JOptionPane.YES_OPTION)
         resetgame();
      else System.exit(0);

    }
    
}
