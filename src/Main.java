public class Main {
    public static void main(String[] args) {
        // Задание 1
        int[] weight = new int[20];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] heights = {1.57, 7.654, 9.986};
        short[] steps = {57, 86, 39, 67, 90};
        // Задание 2

        for (int v = 0; v < weight.length; v++) {
            System.out.print(weight[v]);
            if (v != weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int v = 0; v < heights.length; v++) {
            System.out.print(heights[v]);
            if (v != heights.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int v = 0; v < steps.length; v++) {
            System.out.print(steps[v]);
            if (v != steps.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задание 3
        for (int v = weight.length - 1; v >= 0; v--) {
            System.out.print(weight[v]);
            if (v != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int v = heights.length - 1; v >= 0; v--) {
            System.out.print(heights[v]);
            if (v != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int v = steps.length - 1; v >= 0; v--) {
            System.out.print(steps[v]);
            if (v != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Задание 4

        for (int v = 0; v < weight.length; v++) {
            if (weight[v] % 2 == 1) {
                weight[v] += 1;
            }
            System.out.print(weight[v]);
            if (v != weight.length - 1) {
                System.out.print(", ");
            }
        }
    }
}









