package com.epicdevs.wordcloud;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class CloudViewer extends JPanel {
    private static final long serialVersionUID = 1L;
    private BufferedImage bi;
    
    public CloudViewer(BufferedImage bi) {
        this.bi = bi;
    }
    
    public void paint(Graphics g) {
        g.drawImage(bi, 0, 0, null);
    }
}
