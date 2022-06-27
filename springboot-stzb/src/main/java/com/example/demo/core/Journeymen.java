package com.example.demo.core;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Journeymen {


    public static void main(String[] args) throws Exception {
        //机器人
        Robot robot = new Robot();
        //robot.delay(5000);
        //按键
        // robot.keyPress(KeyEvent.VK_A);
        //移动鼠标
        // robot.mouseMove(460, 490);
        List<String> xxTP = new ArrayList<>();
        int x = 19;
        for (int i = 0; i < 5; i++) {
            String fileName = "test" + System.currentTimeMillis() + ".png";
            File file = new File("D:/图像识别/" + fileName);
            BufferedImage bufferedImage = robot.createScreenCapture(new Rectangle(x, 191, 9, 9));
            ImageIO.write(bufferedImage, "png", file);
            x += 10;
            xxTP.add(fileName);
        }
        int sum = 0;
        for (String str : xxTP) {
            sum += new ClothingColorController().recognition("D:/图像识别/" + str);
        }
        System.out.println("红度：" + sum + "红");
    }
}

