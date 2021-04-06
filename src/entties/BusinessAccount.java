package entties;

public class BusinessAccount extends Account{
	
	private Double loanLimit ;
	
	public BusinessAccount(){
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLlimit) {
		super(number, holder, balance);
		this.loanLimit = loanLlimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLlimit(Double loanLlimit) {
		this.loanLimit = loanLimit;
	}
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance =+amount -10;
		}
	}
	
	@Override
	public void withDraw(double amount) {
		super.withDraw(amount);
		balance -= 2.0 ;
	}
}
