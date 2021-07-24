package pojo;

public class Carttable {//购物车表
private Integer id;//购物车ID
private String user_account;//用户账号
private Integer goodstable_id;//商品编号
private Integer shoppingnum;//购买数量
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUser_account() {
	return user_account;
}
public void setUser_account(String user_account) {
	this.user_account = user_account;
}
public Integer getGoodstable_id() {
	return goodstable_id;
}
public void setGoodstable_id(Integer goodstable_id) {
	this.goodstable_id = goodstable_id;
}
public Integer getShoppingnum() {
	return shoppingnum;
}
public void setShoppingnum(Integer shoppingnum) {
	this.shoppingnum = shoppingnum;
}

}
