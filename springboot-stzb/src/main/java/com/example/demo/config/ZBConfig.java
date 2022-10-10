package com.example.demo.config;

import com.example.demo.dao.MouseDao;

public class ZBConfig {
    /**
     * 战报
     */
    public static final MouseDao ZB_P = new MouseDao(195, 535);
    /**
     * 国家战报
     */
    public static final MouseDao ZB_GJ_P = new MouseDao(391, 130);
    /**
     * 战报筛选
     */
    public static final MouseDao ZB_SX_P = new MouseDao(1259, 375);
    /**
     * 城池守军
     */
    public static final MouseDao ZB_SX_CCSJ_P = new MouseDao(988, 323);
    /**
     * 展开战报位置
     */
    public static final MouseDao ZB_ZK_P = new MouseDao(1213, 330);
    /**
     * 打开战报详情
     */
    public static final MouseDao ZB_XQ_P = new MouseDao(665, 288);
    /**
     * 打开阵容详情
     */
    public static final MouseDao ZB_ZRXQ_P = new MouseDao(1155, 659);
    /**
     * 打开敌方阵容详情
     */
    public static final MouseDao ZB_DF_ZRXQ_P = new MouseDao(417, 178);
    /**
     * 关闭阵容详情
     */
    public static final MouseDao ZB_GB_ZRXQ_P = new MouseDao(1230, 161);
    /**
     * 关闭战报详情
     */
    public static final MouseDao ZB_GB_XQ_P = new MouseDao(1224, 86);

}
