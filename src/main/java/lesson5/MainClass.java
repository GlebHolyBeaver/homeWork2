package lesson5;

public class MainClass {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1(){
        System.out.println("Метод первый");
        final int size = 10000000;
        float[] arr = new float[size];
        for ( int index = 0; index < arr.length; index++){
            arr[index] = 1.0f;
        }
        long a = System.currentTimeMillis();
        System.out.println(a);
        // Если делать расчет формулы не через foreach то врем работы будет 4157, что примерно в 5,5 раз дольше
//        for ( int i = 0; i < arr.length; i++){
//            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//        }
        for ( float i : arr){
            arr[(int)i] = (float)(arr[(int)i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis() - a;
        System.out.println("После расчетов в массиве, разница с первым значением: " + b);
        System.out.println();
    }

    private static void method2(){
        System.out.println("Метод второй");
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        for ( int index = 0; index < arr.length; index++){
            arr[index] = 1.0f;
        }
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        long a = System.currentTimeMillis();
        System.out.println("После разбивки массива на 2: " + a);

        for ( float i : arr){
            a1[(int)i] = (float)(a1[(int)i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        for ( float i : arr){
            a2[(int)i] = (float)(a2[(int)i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis() - a;
        System.out.println("После расчетов в каждом из 2 массивов отдельно, разница с первым значением: " + b);

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        long c = System.currentTimeMillis() - a;
        System.out.println("После склейки 2 массивов обратно, разница с первым значением: " + c);
        System.out.println();
    }
}
