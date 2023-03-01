package objetc;

import java.time.LocalDate;

import objetc.tax.TaxSystem;

public class Contract extends Parcelas {

	private Integer number;
	private LocalDate date;
	private TaxSystem taxSystem;

	public Contract() {

	}

	public Contract(Double value, Integer quantity, Double parcFinal, Integer number, LocalDate date,
			TaxSystem taxSystem) {
		super(value, quantity, parcFinal);
		this.number = number;
		this.date = date;
		this.taxSystem = taxSystem;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double parcValue(Parcelas p) {
		double parcInitiaPrice = p.parcInitial();
		double parcSimpleTax, parcPayTax, parcFinal = 0;
		for (int i = 1; i < p.getQuantity(); i++) {
			parcSimpleTax = taxSystem.SimpleTax(parcInitiaPrice) * i;
			parcPayTax = taxSystem.PayTax(parcSimpleTax);
			parcFinal = parcInitiaPrice + parcPayTax;
			p.setParcFinal(parcFinal);
		}
		return p.getParcFinal();
	}

}
