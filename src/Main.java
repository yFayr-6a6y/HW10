//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] money = new int[4];
        money[0] = 1231;
        money[1] = 12313;
        money[2] = 1232;
        money[3] = 1299;
        int sum = 0;
        for (int element : money) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //
        int[] spend = new int[4];
        spend[0] = 3331;
        spend[1] = 11313;
        spend[2] = 1632;
        spend[3] = 1859;
        int minSpend = Integer.MAX_VALUE;
        int maxSpend = Integer.MIN_VALUE;
        for (int i = 0; i < spend.length; i++) {
            if (spend[i] > maxSpend) {
                maxSpend = spend[i];
            }
        }
        for (int i = 0; i < spend.length; i++) {
            if (spend[i] < minSpend) {
                minSpend = spend[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpend + " рублей. Максимальная сумма трат за неделю составила " + maxSpend + " рублей");

        //
        int[] average = new int[4];
        average[0] = 3091;
        average[1] = 1543;
        average[2] = 16323;
        average[3] = 1499;
        int sumSecond = 0;
        for (int element : money) {
            sumSecond = sumSecond + element;
        }
        double averageCount = sumSecond / average.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCount + " рублей");


        //
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };
        int left = 0;
        int right = reverseFullName.length - 1;
        while (left < right) {
            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;
            left++;
            right--;

        }
        System.out.println(String.valueOf(reverseFullName));


    }
}