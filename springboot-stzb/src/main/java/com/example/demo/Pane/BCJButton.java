package com.example.demo.Pane;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.PlaceDao;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class BCJButton extends JButton {

    private static int x, y;

    public BCJButton(JFrame jFrame, PlaceDao placeDao) {
        setText("BC");
        //设置按钮大小
        setBounds(0, 40, 50, 20);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.out.println(JSONObject.toJSONString(placeDao));
            }
        });
        jFrame.add(this);
        jFrame.repaint();
    }


}
