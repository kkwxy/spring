package com.example.demo.Pane;

import com.example.demo.Pane.ZB.GJJButton;
import com.example.demo.Util.CoreJsonFileUtil;
import com.example.demo.dao.PlaceDao;
import com.sun.awt.AWTUtilities;

import javax.swing.*;
import java.io.File;

/**
 * 主页面
 */
public class MainPanel extends JFrame {

    public MainPanel(PlaceDao.MainPanelDao mainPanelDao) {
        //设置窗口大小
        setBounds(mainPanelDao.getX(), mainPanelDao.getY(), mainPanelDao.getW(), mainPanelDao.getH());
        //setLocationRelativeTo(null);
        setUndecorated(true);
        //加入这代码即可解决按钮占整个框的问题
        setLayout(null);//设置布局(绝对定位)
        AWTUtilities.setWindowOpacity(this, 0.7f);
        //设置关闭模式(窗口关闭即结束程序运行)
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public static void main(String[] args) {
        PlaceDao placeDao = CoreJsonFileUtil.readFileContext();
        MainPanel mainPanel = new MainPanel(placeDao.getMainPanelDao());
        new MvJButton(mainPanel, placeDao.getMainPanelDao());
        new SfJButton(mainPanel, placeDao.getMainPanelDao());
        new ZBJButton(mainPanel, placeDao.getZbJButtion());
        new BCJButton(mainPanel, placeDao);
        new GJJButton(mainPanel, placeDao.getGjjButtion());
    }
}