package objetc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import objetc.tax.TaxSystem;

public class Contract {
	
	private Integer number;
	private LocalDate date;
	private Double contractValue;
	private Integer parcNum;
	private List<Parcelas> parcela = new ArrayList<>();
	
	
	private TaxSystem taxSystem;
	
	public Contract() {
		
	}

	public Contract(Integer number, LocalDate date, Double contractValue, Integer parcNum) {
		this.number = number;
		this.date = date;
		this.contractValue = contractValue;
		this.parcNum = parcNum;
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

	public Double getContractValue() {
		return contractValue;
	}

	public void setContractValue(Double contractValue) {
		this.contractValue = contractValue;
	}

	public Integer getParcNum() {
		return parcNum;
	}

	public void setParcNum(Integer parcNum) {
		this.parcNum = parcNum;
	}
	
	public void parcValue(Double parcela) {
		double parcInitiaPrice = getContractValue()/getParcNum();
		double parcSimpleTax, parcPayTax, parcFinal;
		for (int i=1; i<getParcNum(); i++) {
			parcSimpleTax = taxSystem.SimpleTax(parcInitiaPrice)*i;
			parcPayTax = taxSystem.PayTax(parcSimpleTax);
			parcFinal = parcInitiaPrice+parcPayTax;
			parcela.add(parcFinal);
		}
	}

	public List<Parcelas> getParcela() {
		return parcela;
	}

	

}
