package Nobemver;

public class CalculateDeficitAmount {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = 0;

        for (int i = 1; i <= count; i++) {
            totalPrice += price * i;
        }
        answer = totalPrice - money;

        if (answer < 0) {
            return 0;
        }
        return answer;
    }
}
