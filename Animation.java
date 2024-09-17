import java.awt.Graphics;
import java.awt.Color;
import java.util.Timer;
import java.awt.Insets;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Animation extends JFrame {

    private static int DELAY = 50; //The speed on which the animation will run

    Insets animate_insets;

    Color colors[] = {Color.PINK, Color.GREEN, Color.ORANGE, Color.BLACK,
            Color.WHITE, Color.MAGENTA};

    public static void main(String args[]) {
        Animation Demo_Animation = new Animation();
        Demo_Animation.setSize(400, 400);
        Demo_Animation.show();
        Demo_Animation.go();
    }

    public void paint(Graphics demo) {
        super.paint(demo);
        if (animate_insets == null) {
            animate_insets = getInsets();
        }
        int a = animate_insets.left;
        int b = animate_insets.top;
        int animation_width = getWidth() - animate_insets.left - animate_insets.right;
        int animation_height = getHeight() - animate_insets.top - animate_insets.bottom;
        int animation_start = 0;
        int animation_steps = colors.length;
        int animation_stepSize = 720 / animation_steps;
        synchronized (colors) {
            for (int i = 0; i < animation_steps; i++) {
                demo.setColor(colors[i]);
                demo.fillArc(a, b, animation_width, animation_height, animation_start, animation_stepSize);
                animation_start += animation_stepSize;
            }
        }
    }

    public void go() {
        TimerTask animation_task = new TimerTask() {
            public void run() {
                Color animation_color = colors[0];
                synchronized (colors) {
                    System.arraycopy(colors, 1, colors, 0, colors.length - 1);
                    colors[colors.length - 1] = animation_color;
                }
                repaint();
            }
        };
        Timer animation_timer = new Timer();
        animation_timer.schedule(animation_task, 0, DELAY);
    }
}
