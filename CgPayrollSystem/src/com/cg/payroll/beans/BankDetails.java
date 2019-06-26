package com.cg.payroll.beans;

public class BankDetails {
	int accountNo;
	String IFSCode, bankName;
	public BankDetails() {}
	public BankDetails(int accountNo, String iFSCode, String bankName) {
		super();
		this.accountNo = accountNo;
		IFSCode = iFSCode;
		this.bankName = bankName;
		
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getIFSCode() {
		return IFSCode;
	}
	public void setIFSCode(String iFSCode) {
		IFSCode = iFSCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
}
