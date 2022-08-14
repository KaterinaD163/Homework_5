public class Main {
    public static void main(String[] args) {
        // Задание 1
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] heights = {1.57, 7.654, 9.986};
        short[] steps = {57, 86, 39, 67, 90};
        // Задание 2
        int d = weight[0];
        int e = weight[1];
        int f = weight[2];
        System.out.println(d + ", " + e + ", " + f);
        double g = heights[0];
        double h = heights[1];
        double k = heights[2];
        System.out.println(g + ", " + h + ", " + k);
        short o = steps[0];
        short p = steps[1];
        short r = steps[2];
        short s = steps[3];
        short t = steps[4];
        System.out.println(o + ", " + p + ", " + r + ", " + s + ", " + t);
        // Задание 3
        int l = weight[0];
        int m = weight[1];
        int n = weight[2];
        System.out.println(n + ", " + m + ", " + l);
        double u = heights[0];
        double x = heights[1];
        double z = heights[2];
        System.out.println(z + ", " + x + ", " + u);
        short q = steps[0];
        short w = steps[1];
        short y = steps[2];
        short i = steps[3];
        short j = steps[4];
        System.out.println(j + ", " + i + ", " + y + ", " + w + ", " + q);
        // Задание 4
        int[] weights = new int[36];
        for (int v = 0; v < weights.length; v++)
            if (v % 2 == 0) {
                System.out.println(v++);
            } else {
                System.out.println(v);
            }
    }
}



