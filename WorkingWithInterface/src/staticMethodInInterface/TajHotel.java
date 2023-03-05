package staticMethodInInterface;

public class TajHotel implements Hotel {

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("Chicken Biryani From TajHotel");
		
	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("Masala Dosa From TajHotel");
		
	}
	
	//specific method of TajHotel class
		public void paneerMasalaDosa() {
			
			System.out.println("paneer masala dosa from Taj Hotel");
		}

}
