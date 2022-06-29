package com.example.demo.Pane;

import com.example.demo.dao.PlaceDao;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MvJButton extends JButton {

    private static int x, y;

    public MvJButton(JFrame jFrame, PlaceDao.MainPanelDao mainPanelDao) {
        setText("YD");
        //设置按钮大小
        setBounds(0, 20, 50, 20);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                int left = jFrame.getLocation().x;
                int top = jFrame.getLocation().y;
                jFrame.setLocation(left + e.getX() - x, top + e.getY() - y);
                mainPanelDao.setY(jFrame.getLocation().x);
                mainPanelDao.setY(jFrame.getLocation().y);
            }
        });
        jFrame.add(this);
        jFrame.repaint();
    }


}
