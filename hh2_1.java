public class hh2_1 {
    public static void main(String[] args) {
        int k = 3;
        int n = 12;
        int j;
        int[] mas = new int[n];

        System.out.println();
        System.out.println("Заполняем массив случайными числами");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 8 + 1);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            if (i + k < n) j = mas[i + k];
            else j = 0;
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (i - k >= 0) j = mas[i - k];
            else j = 0;
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            for (j = 0; j < mas.length; j++)
                if (mas[i] == mas[j] && i != j)
                    break;
            if (j == mas.length) System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println();

        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
    }
}

