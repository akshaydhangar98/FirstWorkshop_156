package GamblerSimulation;

public class UC_2 {

	
	public static final int dailyStake=100;
	public static final int bet=1;
	
	
	public static void maim (String[] agrs) {
	
		int totalMoney;
		if (winLoose()==1) {  // for win
			totalMoney = dailyStake +1;
	System.out.println("Congratulations you won");
		
		}
		else {
			totalMoney = dailyStake - 1;
			System.out.println("Unfortunately you loose, Better luck next time");
		}
	}


	public static int winLoose() {
		UC_2 ran = new UC_2();
		int result = ran.nextInt(2);
		return result;
	}


	private int nextInt(int i) {
	
		return 0;
	}
}