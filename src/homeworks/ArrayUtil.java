package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, 3, 5, 8};
        //  Խնդիր 1 — Տպել զանգվածի բոլոր էլեմենտները
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");

        System.out.println();

        //Խնդիր 2 — Տպել առաջին էլեմենտը


        System.out.print("Առաջին թիվն է " + numbers[0]);

        System.out.println();

        //Խնդիր 3 — Տպել վերջին էլեմենտը

        System.out.print("վեջին թիվն է " + numbers[numbers.length - 1]);

        System.out.println();

        //զանգվածի էլեմենտների ընդհանուր քանակը։


        System.out.print("Array lenght =  " + numbers.length);

        System.out.println();

        // զանգվածի ամենափոքր թիվը։


        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.print("Minimum number = " + min);


        System.out.println();

        //Խնդիր 6 — Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները


        System.out.print("Middle element = " + numbers[numbers.length / 2]);


        System.out.println();

        //Խնդիր 7 — Հաշվել զույգ թվերի քանակը


        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print("Even numbers count = " + count);

        System.out.println();



        //Խնդիր 8 — Հաշվել կենտ թվերի քանակը



        int Odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                Odd++;
            }
        }
        System.out.print("odd numbers count = " + Odd);


        System.out.println();



        //Խնդիր 9 — Հաշվել զանգվածի էլեմենտների գումարը


        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.print("sum =  " + sum);

        System.out.println();


       // Խնդիր 10 — Հաշվել միջին թվաբանականը


        sum = 102;
        double Average = (double) sum / numbers.length;
        System.out.print("Average = " + Average);


    }
    // Եթե ամեն ինչ ճիշտ է, ապա կանցնեմ "բոնուսին"։

}













