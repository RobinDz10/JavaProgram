package edu.iu.c212.programs;

import javax.swing.*;
import java.awt.*;

public class StoreMap extends JComponent {
    private final int aisleNum;
    public StoreMap(int aisleNumberToHighlight) {
        this.aisleNum = aisleNumberToHighlight;
    }

    public void paintComponent(Graphics g) {
        int canvasWidth = StoreMapDisplay.WIDTH - 10;
        int canvasHeight = StoreMapDisplay.HEIGHT - 37;
        int aisleWidth = 200;
        int aisleHeight = 40;
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, canvasWidth, 10);
        g.fillRect(0, canvasHeight-10, canvasWidth, 10);
        g.fillRect(0, 0, 10, canvasHeight-10);
        g.fillRect(canvasWidth-13, 0, 10, canvasHeight-10);
        g.fillRect(450, 0, 10, canvasHeight/2);
        g.fillRect(450, canvasHeight/2-10, canvasHeight/2, 10);
        g.setColor(Color.BLUE);
        for (int i = 0; i < 7; i++) {
            g.fillRect(30, 30 + 60 * i, aisleWidth, aisleHeight);
            if (i > 3) g.fillRect(450, 30 + 60 * i, aisleWidth, aisleHeight);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                g.fillRect(490 + 60 * i, 30 + 60 * j, 40, 40);
            }
        }
        g.setColor(Color.BLACK);
        for (int i = 0; i < 12; i++) {
            if (i < 8) {
                g.drawString("Aisle " + (i+1), 110, 25 + 60 * i);
            } else {
                g.drawString("Aisle " + (i+1), 530, 25 + 60 * (i-4));
            }
        }
        g.setColor(Color.WHITE);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                g.drawString("A " + (12 + (i+1) + 3 * j), 500 + i * 60, 60 + 60 * j);
            }
        }
        g.setColor(Color.GREEN);
        if(aisleNum<9){
            g.drawRect(30,10+60*(aisleNum-1),200,20);
        }else if(aisleNum<13){
            g.drawRect(450,10+60*(aisleNum-5),200,20);
        }else {
            g.drawRect(490+60*((aisleNum-12)%3-1),30+60*((aisleNum-12)/3),40,40);
        }
    }

}
