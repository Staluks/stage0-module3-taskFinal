package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int numberOne = number%10;

        int numberReminder = number/10;
        int numberTwo = numberReminder%10;

        int numberReminderTwo = numberReminder/10;
        int numberThree = numberReminderTwo%10;

        int numberReminderThird = numberReminderTwo/10;
        int numberFour = numberReminderThird%10;

        System.out.println(numberOne+numberTwo+numberThree+numberFour);
    }
}
