package com.example.demo.Util;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

/**
 * 图像进行二值化处理，二值化就是给变成黑白照，我们可以在得到灰度值了以后，然后让灰度值跟127进行比较
 * 注：这是二值处理中一个最简单的方法
 * 这里就使用之前的魔板进行处理和显示
 */
public class ImageBinary extends Canvas {
    JFrame jframe = new JFrame("图像二值处理");
    BufferedImage bufferedImage, bufferedImage_end;
    Image image, image_end;
    int r = 0;

    public ImageBinary() {
        try {
            bufferedImage = ImageIO.read(new File("D:\\office\\Tesseract\\xl\\n1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        jframe.setLayout(null);
        // 定义位置
        jframe.setBounds(200, 200, 800, 600);
        this.setBounds(0, 0, 800, 600);
        jframe.add(this);
        jframe.setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        image = (Image) bufferedImage;
        image_end = (Image) gray(bufferedImage);
        try{
            ImageIO.write((RenderedImage) image_end, "jpg", new File("D:\\office\\Tesseract\\xl\\n2222.jpg"));
        }catch (Exception e){
            e.printStackTrace();
        }
//        g.drawImage(image, 0, 0, null);  // 显示原图
//        g.drawLine(350, 10, 350, 600);    // 中间的线
//        g.drawImage(image_end, 370, 0, null);  // 显示灰度图片
    }

    // 灰度处理,把原图传进去，传出来为修改后的图
    public BufferedImage gray(BufferedImage b) {
        int width = b.getWidth();
        int height = b.getHeight();
        // 下面这个别忘了定义，不然会出错
        bufferedImage_end = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        // 双层循环更改图片的RGB值，把得到的灰度值存到bufferedImage_end中，然后返回bufferedImage_end
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // 获取到（x，y）此像素点的Colo，转化为灰度
                Color color = new Color(bufferedImage.getRGB(x, y));
                int gray = (int) (color.getRed() * 0.299 + color.getGreen() * 0.587 + color.getBlue() * 0.114);
                // 这里我给调小了一些，让图片显示的更清楚
                if (gray <= 110) {
                    r = 0;
                } else {
                    r = 255;
                }
                Color color_end = new Color(r, r, r);
                bufferedImage_end.setRGB(x, y, color_end.getRGB());
            }
        }
        return bufferedImage_end;
    }

    public static void main(String[] args) {
        new ImageBinary();
    }
}
