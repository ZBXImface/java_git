package com.gree.panel;

import javax.swing.*;

public class JPanelExample {
    private JPanel JpanelOne;
    private JButton JbuttonOne;
    private JWindow JwindowOne;
    public JPanelExample(JPanel JPanelTest,JButton JButtonTest,JWindow JWindowTest){
        this.JbuttonOne=JButtonTest;
        this.JpanelOne=JPanelTest;
        this.JwindowOne=JWindowTest;
    }

    public JPanel getJpanelOne() {
        return JpanelOne;
    }

    public JButton getJbuttonOne() {
        return JbuttonOne;
    }

    public JWindow getJwindowOne() {
        return JwindowOne;
    }

    public void setJpanelOne(JPanel jpanelOne) {
        JpanelOne = jpanelOne;
    }

    public void setJbuttonOne(JButton jbuttonOne) {
        JbuttonOne = jbuttonOne;
    }

    public void setJwindowOne(JWindow jwindowOne) {
        JwindowOne = jwindowOne;
    }
}
