package max.com.java;

public class TreeGenerator implements iTree {

    private int height;

    public TreeGenerator(int height) {
        this.height = height;
    }

    @Override
    public void growUp(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i+i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    @Override
    public void growDown(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2*height-i-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    @Override
    public void growLeft(int height) {

        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("X");
            }
            System.out.println();

            if (i == height) {
                for (int j = 1; j < height; j++) {
                    for (int k = 0; k < j; k++) {
                        System.out.print(" ");
                    }
                    for (int k = height; k > j; k--) {
                        System.out.print("X");
                    }
                    System.out.println();
                }
            }
        }
    }
    @Override
    public void growRight(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("X");
            }
            System.out.println();
            if (i == height) {
                for (int j = 1; j <= height; j++) {
                    for (int k = height; k > j; k--) {
                        System.out.print("X");
                    }
                    System.out.println();
                }

            }
        }
    }
    @Override
    public void makeTree(int direction, int height) {
        TreeGenerator tr = new TreeGenerator(height);
        switch(direction) {
            case 1:
                tr.growUp(height);
                break;
            case 2:
                tr.growDown(height);
                break;
            case 3:
                tr.growLeft(height);
                break;
            case 4:
                tr.growRight(height);
                break;
        }

    }


}
