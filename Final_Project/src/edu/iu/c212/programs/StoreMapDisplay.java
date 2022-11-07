package edu.iu.c212.programs;

import edu.iu.c212.models.Item;

import javax.swing.*;

public class StoreMapDisplay {

    static int WIDTH = 700;
    static int HEIGHT = 500;

    public static void display(Item product){
        JFrame window = new JFrame();
        window.setSize(700,500);
        window.setTitle(product.getName());
        StoreMap chart = new StoreMap(product.getAisleNum());
        chart.setSize(WIDTH,HEIGHT);
        window.getContentPane().add(chart);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setVisible(true);
    }

}
