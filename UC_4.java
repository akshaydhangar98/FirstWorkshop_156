package GamblerSimulation;

public class UC_4 {
	
	 public static final int dailyStake=100;
	    public static final int bet=1;
	    public static final int percentage=50;

	    public static void main(String[] args) {

	        int day = 1;
	        int totalMoney=dailyStake;

	        while(day<=20){
	            UC_4 ran = new UC_4();
	            int dailyGamePlayed = ran.nextInt(10);

	            for (int i=0; i<dailyGamePlayed ;i++) {

	                if (winLoose() == 1)            //for win
	                    totalMoney = totalMoney + 1;

	                else                            //for loss
	                    totalMoney = totalMoney - 1;

	            }
	            day++;
	        }
	        if (totalMoney<dailyStake)
	            System.out.println("After 20 days you have lost "+ (dailyStake - totalMoney)+ " Dollar");
	        else
	            System.out.println("After 20 days you have won "+ (totalMoney - dailyStake)+ " Dollar");
	    }

	    public static double StakePercent(){
	        double percentStake = percentage/100.0;
	        return percentStake;
	    }
	    public static int winLoose(){
	        UC_4 ran = new UC_4();
	        int result = ran.nextInt(2);
	        return result;
	    }

		private int nextInt(int i) {
			return 0;
		}


}
