public class Bonus {
    public static void main(String[] args) {
        int currentAccount = 100;
        int income = 1100;
        int bonus;
        if (income > 1000) {
            bonus = income / 100;
        } else {
            bonus = 0;
        }
        int total = currentAccount + income + bonus;
//      Из задания я не сильно понял что должно в итоге выводиться, в итоге вывожу бонус и общую сумму)
        System.out.println("Состояние счета: "+total);
        System.out.println("Бонусных баллов: "+bonus);

    }
}
