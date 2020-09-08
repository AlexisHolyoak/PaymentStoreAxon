package com.dcs.order.messages.commands;

import java.util.Date;
import java.util.List;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import com.dcs.order.query.OrderDetailView;
import com.dcs.order.query.ProductView;

public class RegisterOrderCommand {
	@TargetAggregateIdentifier
	private String orderId;
	private String customerId;
	private List<OrderDetailView> products;
	private Date registerDate;
	
	public RegisterOrderCommand(String orderId, String customerId, List<OrderDetailView> products, Date registerDate) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.products = products;
		this.registerDate = registerDate;
	}
	public String getOrderId() {
		return orderId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public List<OrderDetailView> getProducts() {
		return products;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	
}
