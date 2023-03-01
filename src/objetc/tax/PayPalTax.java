package objetc.tax;

public class PayPalTax implements TaxSystem {
	public double PayTax(double amount) {
		return amount*0.01;
	}
	public double SimpleTax(double amount) {
		return amount*0.02;
	}
}
