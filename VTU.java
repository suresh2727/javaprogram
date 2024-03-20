
public class VTU {
	double fee = 65000;
	
}

	class College extends VTU{
		double fee = 20000;
		void admission() {
			double fee = 10000;
			System.out.println("College fee: " + this.fee );
			System.out.println("Placement Fee: "+ fee);
			System.out.println("VTU Fee: "+ super.fee);
			
		}
	}
