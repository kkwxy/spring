package com.example.demo.test;

import com.example.demo.config.MouseConfig;
import com.example.demo.config.ZBConfig;
import com.example.demo.dao.MouseDao;
import com.example.demo.mouse.MouseUtil;

public class Test {
    public static void main(String[] args) throws Exception {
          Thread.sleep(1000);
//        System.out.println("===点击战报==");
//        MouseUtil.mvMouseAndClickLeft(ZBConfig.ZB_P);
//        System.out.println("===点击国家战报==");
//        MouseUtil.mvMouseAndClickLeft(ZBConfig.ZB_GJ_P);
//        System.out.println("===点击战报筛选==");
//        MouseUtil.mvMouseAndClickLeft(ZBConfig.ZB_SX_P);
//        System.out.println("===去掉守军战报==");
//        MouseUtil.mvMouseAndClickLeft(ZBConfig.ZB_SX_CCSJ_P);
//        System.out.println("===关闭战报筛选==");
//        MouseUtil.mvMouseAndClickLeft(ZBConfig.ZB_SX_P);
//        System.out.println("===展开战报==");
//        MouseUtil.mvMouseAndClickLeft(ZBConfig.ZB_ZK_P);
//        System.out.println("===打开详情==");
//        MouseUtil.mvMouseAndClickLeft(ZBConfig.ZB_XQ_P);
//        System.out.println("===打开阵容详情==");
//        MouseUtil.mvMouseAndClickLeft(ZBConfig.ZB_ZRXQ_P);
//        System.out.println("===打开敌方阵容详情==");
//        MouseUtil.mvMouseAndClickLeft(ZBConfig.ZB_DF_ZRXQ_P);
//        System.out.println("===关闭阵容详情==");
//        MouseUtil.mvMouseAndClickLeft(ZBConfig.ZB_GB_ZRXQ_P);
//        System.out.println("===关闭战报详情==");
//        MouseUtil.mvMouseAndClickLeft(ZBConfig.ZB_GB_XQ_P);
//        System.out.println("===移动到战报列表==");
        MouseUtil.mvMouse(ZBConfig.ZB_XQ_P);
        MouseUtil.mouseSlip(MouseConfig.SLIP_UP, 100);
    }
}
