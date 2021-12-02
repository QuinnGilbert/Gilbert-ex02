/*
 *  UCF COP3330 Fall 2021 Exercise 2
 *  Copyright 2021 Quinn Gilbert
 */
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Challenge02 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JLabel counter = new JLabel();
        frame.getContentPane().add(counter);
        frame.setVisible(true);
        frame.addKeyListener(new KeyListener() {
            int count=0;
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                count++;
                counter.setText(Integer.toString(count));
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }

}
