package com.example.demo.core;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class MouseInfoPoint {
    public static void main(String[] args) throws Exception{
        Point point=MouseInfo.getPointerInfo().getLocation();
        System.out.println("x="+point.x+",y="+point.y);
        //x=32,y=195
        //机器人
        Robot robot = new Robot();
        //robot.delay(5000);
        //按键
        // robot.keyPress(KeyEvent.VK_A);
        //移动鼠标
        // robot.mouseMove(460, 490);
        String fileName = "test" + System.currentTimeMillis() + ".png";
        File file = new File("/图像识别/" + fileName);
        BufferedImage bufferedImage= robot.createScreenCapture(new Rectangle(29,191,9,9));
        ImageIO.write(bufferedImage,"png",file);
    }
}
