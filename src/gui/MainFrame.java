package gui;

import javax.swing.*;
import java.awt.*;

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class MainFrame extends JFrame {
    Color backgroundColor = Color.decode("#fff");
    Color primaryColor = Color.decode("00D186");
    Color secondaryColor = Color.decode("#FF5A67");
    Color thirdColor = Color.decode("#5AD7FF");
    protected String fontName = "Arial";

    public MainFrame(String title, int width, int height){
        setTitle(title);
        setSize(width, height);
        setBackground(backgroundColor);
        setLayout(null);
        setLocation(500,250);


    }

    protected abstract void component();

    protected abstract void event();

    protected void boundedAdd(Component comp, int x, int y, int width, int height){
        comp.setBounds(x,y,width,height);
        add(comp);
    }

    protected ImageIcon loadImage(String imagePat){
        return loadImage(imagePat, 150, 150);
    }

    protected ImageIcon loadImage(String imagePath, int width, int height){
        try {
            BufferedImage bImage;
            Image imgResize;
            ImageIcon imgIcon = null;

            bImage = ImageIO.read(new File(imagePath));

            imgResize = bImage.getScaledInstance(width,height,Image.SCALE_SMOOTH);

            imgIcon = new ImageIcon(imgResize);
            return imgIcon;
        }catch (IOException ex){
            return null;
        }
    }

    protected void setFontSize(Component comp, int size){
        comp.setFont(new Font(fontName, size,comp.getFont().getStyle()));
    }

    protected void setFontStyle(Component comp, int style){
        comp.setFont(new Font(fontName, style, comp.getFont().getSize()));
    }

}
