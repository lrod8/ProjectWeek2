
public class ProjectWeek2 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub

		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
    	System.out.println(false || 1 < 5);
		System.out.println(5 >= 4 && 1 > 3);
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(12 >= 2 && 1 < 24);
		String greeting = "Hello";
		System.out.println(greeting.charAt(0) == 'h');
		
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
		
		double costOfMilk = 2.99;
		int moneyInWallet = 5;
		int thirstLevel = 2;
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (costOfMilk * 2);
		
		System.out.println(shouldBuyIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
	}


}
