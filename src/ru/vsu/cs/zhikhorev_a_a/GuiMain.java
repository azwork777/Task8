package ru.vsu.cs.zhikhorev_a_a;

import java.util.Locale;


public class GuiMain {
    public static void main(String[] args) throws Exception {
        winMain();
    }

    public static void winMain() {
        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
}




