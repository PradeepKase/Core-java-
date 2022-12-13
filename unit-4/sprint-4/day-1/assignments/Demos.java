package day1;

public class Demos {
		public Hotel provideFood(int amount) {
			if(amount>1000){
				Hotel t = new TajHotel();
				return t;
			}
			else if(amount>200 && amount<1000) {
				Hotel rs=new RoadSideHotel();
				return rs;
			}else {
				return null;
			}
		}
		
	public static void main(String[] args) {
		Demos d= new Demos();
		Hotel res =d.provideFood(1250);
		if(res instanceof TajHotel) {
			TajHotel h=new TajHotel();
			h.chickenBiryani();
			h.masalaDosa();
			h.welcomeDrink();
		}
		else if(res instanceof RoadSideHotel) {
			RoadSideHotel r= new RoadSideHotel();
			r.chickenBiryani();
			r.masalaDosa();
		}
		else if(res==null){
			System.out.println("Please Enter a valid amount;");
		}
		
	}
}
	interface Hotel{
		void chickenBiryani();
		void masalaDosa();
	}
	class TajHotel implements Hotel{
		public void chickenBiryani() {
			System.out.println("overriden chicken biriyani taj hotel");
		}
		public void masalaDosa() {
			System.out.println("overriden masala dosa taj hotel");
		}
		public void welcomeDrink(){
			System.out.println("Welcome Drink from the TajHotel");
			}
	}
	class RoadSideHotel implements Hotel{
		public void chickenBiryani() {
			System.out.println("overriden chicken biriyani in roadside hotel");
		}
		public void masalaDosa() {
			System.out.println("overriden masala dosa in roadside hotel");
		}
	}

