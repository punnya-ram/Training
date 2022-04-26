package com.example.entity;

import java.sql.Date;
import java.time.LocalDate;

public class Member {
	
	private int memberId;
	private String memberName;
	private String memberAddress;
	private LocalDate accountOpenDate;
	private String memberShipType;
	private double feesPaid;
	private int maxBookAllowed;
	private double penaltyAmount;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public LocalDate getAccountOpenDate() {
		return accountOpenDate;
	}
	public void setAccountOpenDate(LocalDate accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}
	public String getMemberShipType() {
		return memberShipType;
	}
	public void setMemberShipType(String memberShipType) {
		this.memberShipType = memberShipType;
	}
	public double getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	public int getMaxBookAllowed() {
		return maxBookAllowed;
	}
	public void setMaxBookAllowed(int maxBookAllowed) {
		this.maxBookAllowed = maxBookAllowed;
	}
	public double getPenaltyAmount() {
		return penaltyAmount;
	}
	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberAddress=" + memberAddress
				+ ", accountOpenDate=" + accountOpenDate + ", memberShipType=" + memberShipType + ", feesPaid="
				+ feesPaid + ", maxBookAllowed=" + maxBookAllowed + ", penaltyAmount=" + penaltyAmount + "]";
	}
	public Member(int memberId, String memberName, String memberAddress, LocalDate accountOpenDate,
			String memberShipType, double feesPaid, int maxBookAllowed, double penaltyAmount) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.accountOpenDate = accountOpenDate;
		this.memberShipType = memberShipType;
		this.feesPaid = feesPaid;
		this.maxBookAllowed = maxBookAllowed;
		this.penaltyAmount = penaltyAmount;
	}
	public Member(int memberId2, String memberName2, String memberAddress2, String memberShipType2, int maxBookAllowed2,
			Date accountOpenDate2, double feespaid2, double penaltyAmountpaid) {
		// TODO Auto-generated constructor stub
	}
	public Member(int memberId2, String memberName2, String memberAddress2, String memberShipType2, int maxBookAllowed2,
			LocalDate accDate, double feespaid2, double penaltyAmountpaid) {
		// TODO Auto-generated constructor stub
	}

}
