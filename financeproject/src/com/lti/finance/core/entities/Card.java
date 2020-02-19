package com.lti.finance.core.entities;

import java.time.LocalDate;
import java.util.Enumeration;

import org.springframework.beans.factory.annotation.Autowired;

public class Card {
	
	private int cardId;
	private String cardType;
	private String cardHolder;
	private int cvv;
	private LocalDate issueDate;
	private LocalDate expiryDate;
	private int limit;
	private Enumeration<Status> status; 
	
	@Autowired
	private User user;
    public Card() {
		// TODO Auto-generated constructor stub
	}
	public Card(int cardId, String cardType, String cardHolder, int cvv, LocalDate issueDate, LocalDate expiryDate,
			int limit, Enumeration<Status> status, User user) {
		super();
		this.cardId = cardId;
		this.cardType = cardType;
		this.cardHolder = cardHolder;
		this.cvv = cvv;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.limit = limit;
		this.status = status;
		this.user = user;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardHolder() {
		return cardHolder;
	}
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public Enumeration<Status> getStatus() {
		return status;
	}
	public void setStatus(Enumeration<Status> status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", cardType=" + cardType + ", cardHolder=" + cardHolder + ", cvv=" + cvv
				+ ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + ", limit=" + limit + ", status=" + status
				+ ", user=" + user + "]";
	}
	
    
}
