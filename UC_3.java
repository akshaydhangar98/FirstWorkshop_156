package GamblerSimulation;

public class UC_3 {
	
	 public static final int dailyStake=100;
	    public static final int bet=1;
	    public static final int percentage=50;

	    public static void main(String[] args) {

	        int totalMoney=dailyStake;
	        do {
	            if (winLoose() == 1) {            //for win
	                totalMoney = totalMoney + 1;
	                System.out.println("Congratulations you won" );
	            } else {                           //for loss
	                totalMoney = totalMoney - 1;
	                System.out.println("Unfortunately you loose, Better luck next time" );
	            }
	        }while(totalMoney> dailyStake - dailyStake*StakePercent() && totalMoney< dailyStake + dailyStake*StakePercent());

	        System.out.println("Resiging with "+totalMoney+ " money");
	    }
	    
	    public static double StakePercent(){
	        double percentStake = percentage/100.0;
	        return percentStake;
	    }
	    public static int winLoose(){
	        UC_3 ran = new UC_3();
	        int result = ran.nextInt(2);
	        return result;
	    }

		private int nextInt(int i) {
			return 0;
		}

	}

