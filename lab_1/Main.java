import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        // Находим количество нечетных чисел между 5 и 25 включительно
        short count = 0;
        for (short i = 5; i <= 25; i++){
            if (i % 2 != 0) {
                count += 1;
            }
        }
        // Создаем и заполняем массив числами между 5 и 25 включительно
        short[] a = new short[count];
        int index = 0;
        for (short i = 25; i >= 5; i--){
            if (i % 2 != 0) {
                a[index] = i;
                index += 1;
            }
        }

        // Создаем и заполняем массив рандомными числами типа float в диапазоне от -3.0 до 11.0
        float[] x = new float[16];
        for (int i = 0; i < x.length; i++){
            float rand = (float) (Math.random() * 14) - 3;
            x[i] = rand;
        }

        // Создаем и заполняем двумерный массив по формулам
        float[][] c = new float[11][16];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 16; j++) {
                if (a[i] == 15) {
                    c[i][j] = (float)Math.cos(Math.tan(Math.asin((x[j] + 4) / 14)));
                } else if (a[i] == 7 || a[i] == 11 || a[i] == 13 || a[i] == 21 || a[i] == 23) {
                    c[i][j] = (float)Math.sin(Math.pow(Math.pow(x[j], 0.5 / (1 - x[j])), Math.pow(Math.E, x[j]) * (Math.pow(Math.E, x[j]) + 1)));
                } else {
                    c[i][j] = (float)Math.pow(Math.E, Math.pow( 2 / (Math.asin(0.5 * (x[j] + 4)/(14)) - 1), Math.cos(Math.pow(x[j], 2 * x[j]))));
                }
            }
        }

        // Выводим через printf
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.printf("%-10.4f", c[i][j]);
            }
            System.out.println();
        }
    }
}