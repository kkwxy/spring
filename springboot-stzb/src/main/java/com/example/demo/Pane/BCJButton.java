package com.example.demo.Pane;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.Util.CoreJsonFileUtil;
import com.example.demo.dao.PlaceDao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class BCJButton extends JButton {

    private static int x, y;

    public BCJButton(JFrame jFrame, PlaceDao placeDao) {
        //设置按钮大小
        setBounds(0, 40, 50, 20);
        ImageIcon ico = new ImageIcon("src/images/bc.jpg");
        Image temp = ico.getImage().getScaledInstance(this.getWidth(), this.getHeight(), ico.getImage().SCALE_DEFAULT);
        ico = new ImageIcon(temp);
        setIcon(ico);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                CoreJsonFileUtil.writeUserCore(JSONObject.toJSONString(placeDao));
            }
        });
        jFrame.add(this);
        jFrame.repaint();
    }


}
