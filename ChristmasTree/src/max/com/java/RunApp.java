package max.com.java;

public class RunApp {

    public RunApp() {}
    public static void run() {
        int direction = Menu.selectDirection();
        int height = Menu.selectHeight();
        TreeGenerator tg = new TreeGenerator(height);
        tg.makeTree(direction, height);
    }
}
