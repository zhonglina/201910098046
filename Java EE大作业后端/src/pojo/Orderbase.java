package pojo;

import java.util.Date;

public class Orderbase {//订单基本表
private Integer id;//订单编号
private Integer user_account;//用户账号
private Integer amount;//金额
private Integer state;//订单状态（0为已付款，1为未付款,2已取消订单）
private Date ordertime;//下单时间
private Integer receive;//配送状态（0商家已接单，1正在配送中，2已收货）
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getUser_account() {
	return user_account;
}
public void setUser_account(Integer user_account) {
	this.user_account = user_account;
}
public Integer getAmount() {
	return amount;
}
public void setAmount(Integer amount) {
	this.amount = amount;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
public Date getOrdertime() {
	return ordertime;
}
public void setOrdertime(Date ordertime) {
	this.ordertime = ordertime;
}
public Integer getReceive() {
	return receive;
}
public void setReceive(Integer receive) {
	this.receive = receive;
}

}
