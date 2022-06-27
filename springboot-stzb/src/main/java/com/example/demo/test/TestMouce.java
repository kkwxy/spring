package com.example.demo.test;

import com.example.demo.dao.MouseDao;
import com.example.demo.mouse.MouseUtil;

public class TestMouce {
    public static void main(String[] args) throws Exception {
        Thread.sleep(100);
        MouseDao mouseDao = MouseUtil.printMousePlace();
        System.out.println("    /**\n" +
                "     * 打开战报详情\n" +
                "     */\n" +
                "public static final MouseDao ZB_XQ_P = new MouseDao(" + mouseDao.getX() + "," +  mouseDao.getY() + ");");

    }
}
