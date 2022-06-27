package com.example.demo.mouse;

import com.example.demo.dao.MouseDao;

import java.awt.*;
import java.awt.event.InputEvent;

public class MouseUtil {

    private static Robot robot = null;

    static {
        if (robot == null) {
            try {
                robot = new Robot();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void mvMouseAndClickLeft(MouseDao mouseDao) {
        try {
            mvMouse(mouseDao);
            Thread.sleep(500);
            mouseClickLeft();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 输出鼠标位置
     */
    public static MouseDao printMousePlace() {
        Point point = MouseInfo.getPointerInfo().getLocation();
        MouseDao mouseDao = new MouseDao();
        mouseDao.setX(point.x);
        mouseDao.setY(point.y);
        return mouseDao;
    }

    /**
     * 移动鼠标
     */
    public static void mvMouse(MouseDao mouseDao) {
        robot.mouseMove(mouseDao.getX(), mouseDao.getY());
        return;
    }

    /**
     * 鼠标左键单机
     */
    public static void mouseClickLeft() {
        //模拟鼠标按下左键
        robot.mousePress(InputEvent.BUTTON1_MASK);
        //模拟鼠标松开左键
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    /**
     * 拖住滑动
     */
    public static void mouseSlip(int direction, int distance) throws Exception{
        //模拟鼠标按下左键
        //robot.mousePress(InputEvent.BUTTON1_MASK);
        //robot.delay(2000);
        //Point point = MouseInfo.getPointerInfo().getLocation();
        //MouseDao mouseDao = new MouseDao(point.x, point.y - distance);
        //robot.delay(1000);
        //mvMouse(mouseDao);
        robot.mouseWheel(2);
        robot.delay(2000);
        robot.mouseWheel(2);
        robot.delay(2000);
        robot.mouseWheel(2);
        robot.delay(2000);
        robot.mouseWheel(2);
        Point point = MouseInfo.getPointerInfo().getLocation();
        MouseDao mouseDao = new MouseDao(point.x, point.y + 100);
        robot.mouseMove(mouseDao.getX(), mouseDao.getY());
        robot.delay(2000);
        robot.mouseWheel(2);

        //模拟鼠标松开左键
        //robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

}
