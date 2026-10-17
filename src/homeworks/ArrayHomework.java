package homeworks;

public class ArrayHomework {
    public static void main(String[] args) {

        int[] numbers = {6, 3, 3, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;

        //  Խնդիր 1 — Հաշվել տվյալ թվի հանդիպումների քանակ

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 6) {
                count++;
            }
        }
        System.out.print("Count of 6 " + count);


        System.out.println();

        // Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը


        for (int i = numbers.length - 1; i > 0; i--) {
            System.out.print(numbers[i] + " ");

        }


        System.out.println();

        // Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը

        int Repeated = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean found = false;


            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    found = true;
                    break;
                }

            }


            if (found)
                continue;


            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    Repeated++;
                    break;
                }

            }

        }

        System.out.println("Repeated numbers count: " + Repeated);


        // Խնդիր 4 — Հաշվել ձայնավորների քանակը


        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};


        int Vowels = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'ա' || chars[i] == 'ե' ||
                    chars[i] == 'է' || chars[i] == 'ը' ||
                    chars[i] == 'ի' || chars[i] == 'ո' ||
                    chars[i] == 'օ') {
                Vowels++;
            }

        }

        System.out.print("Vowels count: " +  Vowels);

        System.out.println();

        //Bonus 2 — Հեռացնել կրկնվող թվերը

        int poxos = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean repeated = false;

            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
