package pojo;

public class Goodstable {//商品表
private Integer id;//商品ID
private String gname;//商品名称
private Double goprice;//原价
private Double grprice;//现价
private Integer gstore;//库存
private String gpicture;//图片
private Integer goodstype_id;//类型
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public Double getGoprice() {
	return goprice;
}
public void setGoprice(Double goprice) {
	this.goprice = goprice;
}
public Double getGrprice() {
	return grprice;
}
public void setGrprice(Double grprice) {
	this.grprice = grprice;
}
public Integer getGstore() {
	return gstore;
}
public void setGstore(Integer gstore) {
	this.gstore = gstore;
}
public String getGpicture() {
	return gpicture;
}
public void setGpicture(String gpicture) {
	this.gpicture = gpicture;
}
public Integer getGoodstype_id() {
	return goodstype_id;
}
public void setGoodstype_id(Integer goodstype_id) {
	this.goodstype_id = goodstype_id;
}

}
