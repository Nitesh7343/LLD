package FacadeDP;

public class LoyaltyPointService {
    public void addPoints(int accountID, int points) {
        System.out.printf("%d loyalty points added to account %d %n",points,accountID);
    }
}
