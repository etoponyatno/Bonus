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
        System.out.println(bonus);


    }
}
