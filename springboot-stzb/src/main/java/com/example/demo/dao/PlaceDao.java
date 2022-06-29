package com.example.demo.dao;

public class PlaceDao {

    private MainPanelDao mainPanelDao = new MainPanelDao();
    private ZBJButtion zbJButtion = new ZBJButtion();

    public ZBJButtion getZbJButtion() {
        return zbJButtion;
    }

    public void setZbJButtion(ZBJButtion zbJButtion) {
        this.zbJButtion = zbJButtion;
    }

    public MainPanelDao getMainPanelDao() {
        return mainPanelDao;
    }

    public void setMainPanelDao(MainPanelDao mainPanelDao) {
        this.mainPanelDao = mainPanelDao;
    }

    public class ZBJButtion {
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public class MainPanelDao {
        private int x;
        private int y;
        private int w;
        private int h;

        public MainPanelDao() {
        }

        public MainPanelDao(int x, int y, int w, int h) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getW() {
            return w;
        }

        public void setW(int w) {
            this.w = w;
        }

        public int getH() {
            return h;
        }

        public void setH(int h) {
            this.h = h;
        }
    }
}
