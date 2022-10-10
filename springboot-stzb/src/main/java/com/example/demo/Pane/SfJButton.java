package com.example.demo.Pane;

import com.example.demo.dao.PlaceDao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class SfJButton extends JButton {

    private static int px, py, w, h;

    public SfJButton(JFrame jFrame, PlaceDao.MainPanelDao mainPanelDao) {
        //设置按钮大小
        setBounds(0, 0, 50, 20);
        ImageIcon ico = new ImageIcon("src/images/sf.jpg");
        Image temp = ico.getImage().getScaledInstance(this.getWidth(), this.getHeight(), ico.getImage().SCALE_DEFAULT);
        ico = new ImageIcon(temp);
        setIcon(ico);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Point point = MouseInfo.getPointerInfo().getLocation();
                px = (int) point.getX();
                py = (int) point.getY();
                Rectangle re = jFrame.getBounds();
                int mw = (int) re.getWidth();
                int mh = (int) re.getHeight();
                w = mw;
                h = mh;
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point point = MouseInfo.getPointerInfo().getLocation();
                int newH = h + py - (int) point.getY();
                int newW = w + px - (int) point.getX();
                //重置窗口大小
                jFrame.setBounds((int) point.getX(), (int) point.getY(), newW, newH);
                mainPanelDao.setH(newH);
                mainPanelDao.setW(newW);
            }
        });
        jFrame.add(this);
        jFrame.repaint();
    }


}
