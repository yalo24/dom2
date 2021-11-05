import java.util.Scanner;
public class home11 {
    public static void main(String[] args) {
        int k = 3;
        int n = 12;
        int[] mas = new int[n];
        int[] mas1 = new int[n + k];
        System.out.println();
        System.out.println("Заполняем первый массив случайными числами");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 30);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("Смещаем массив вправо на k элементов");
        for (int i = 0; i < mas.length; i++) {
            mas1[i + k] = mas[i];
            mas[i] = mas1[i];
            System.out.print(mas[i] + " ");

        }
        System.out.println();
System.out.println("Смещаем массив влево на k элементов");
        for (int i = mas.length -1; i >= 0; i--){
            if(i-k>=0)
                mas1 [i+k] = mas[i];
            mas[i] = mas1[i];
            System.out.print(mas [i]+" ");
        }
    }
}


