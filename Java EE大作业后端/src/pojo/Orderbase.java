package pojo;

import java.util.Date;

public class Orderbase {//����������
private Integer id;//�������
private Integer user_account;//�û��˺�
private Integer amount;//���
private Integer state;//����״̬��0Ϊ�Ѹ��1Ϊδ����,2��ȡ��������
private Date ordertime;//�µ�ʱ��
private Integer receive;//����״̬��0�̼��ѽӵ���1���������У�2���ջ���
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
