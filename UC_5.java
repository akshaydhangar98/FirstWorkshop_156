package GamblerSimulation;

public class UC_5 {
	
    public static final int dailyStake=100;
    public static final int bet=1;
    public static final int percentage=50;

    public static void main(String[] args) {

        int day = 1;
        int month =1;
        int totalMoney=dailyStake;
        while (month<=12) {
            System.out.println("\n\tFor month  " + month + "\n");
            day=1;
            while (day <= 30) {
                UC_5 ran = new UC_5();
                totalMoney=dailyStake;
                int dailyGamePlayed = ran.nextInt(10);

                for (int i = 0; i < dailyGamePlayed; i++) {

                    if (winLoose() == 1)            //for win
                        totalMoney = totalMoney + 1;

                    else                            //for loss
                        totalMoney = totalMoney - 1;

                }
                if (totalMoney < dailyStake)
                    System.out.println("Day " + day + " Lost by :- " + (dailyStake - totalMoney) + " Dollar");
                else
                    System.out.println("Day " + day + " won by :- " + (totalMoney - dailyStake) + " Dollar");
                day++;
            }
            month++;
        }
    }

    public static double StakePercent(){
        double percentStake = percentage/100.0;
        return percentStake;
    }
    public static int winLoose(){
        UC_5 ran = new UC_5();
        int result = ran.nextInt(2);
        return result;
    }

	private int nextInt(int i) {
		return 0;
	}

}


