package objetc;

public class Parcelas {

	private Double value;
	private Integer quantity;
	protected Double parcFinal;

	public Parcelas() {

	}

	public Parcelas(Double value, Integer quantity, Double parcFinal) {
		this.value = value;
		this.quantity = quantity;
		this.setParcFinal(parcFinal);
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double parcInitial() {
		return getValue() / getQuantity();
	}

	public Double getParcFinal() {
		return parcFinal;
	}

	public void setParcFinal(Double parcFinal) {
		this.parcFinal = parcFinal;
	}

}
