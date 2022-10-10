package com.example.demo.Pane;

import com.example.demo.dao.PlaceDao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class ZBJButton extends JButton {

    private static int x, y;

    public ZBJButton(JFrame jFrame, PlaceDao.ZBJButtion zbJButtion) {
        //设置按钮大小
        setBounds(zbJButtion.getX(), zbJButtion.getY(), 50, 50);
        ImageIcon ico = new ImageIcon("src/images/zb.jpg");
        Image temp = ico.getImage().getScaledInstance(this.getWidth(), this.getHeight(), ico.getImage().SCALE_DEFAULT);
        ico = new ImageIcon(temp);
        setIcon(ico);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                System.out.println(zbJButtion.getX() + "--" + zbJButtion.getY());
                double c = new Double(Math.round((zbJButtion.getX() / jFrame.getWidth()))/100.0);
                System.out.println(c);
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                int left = getLocation().x;
                int top = getLocation().y;
                setLocation(left + e.getX() - x, top + e.getY() - y);
                zbJButtion.setX(getLocation().x);
                zbJButtion.setY(getLocation().y);
            }
        });
        jFrame.add(this);
        jFrame.repaint();
    }


}
