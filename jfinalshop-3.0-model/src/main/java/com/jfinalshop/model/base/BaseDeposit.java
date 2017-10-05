package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDeposit<M extends BaseDeposit<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}

	public java.lang.Integer getType() {
		return get("type");
	}

	public void setMemberId(java.lang.Long memberId) {
		set("member_id", memberId);
	}

	public java.lang.Long getMemberId() {
		return get("member_id");
	}

	public void setOperator(java.lang.String operator) {
		set("operator", operator);
	}

	public java.lang.String getOperator() {
		return get("operator");
	}

	public void setPayment(java.lang.Long payment) {
		set("payment", payment);
	}

	public java.lang.Long getPayment() {
		return get("payment");
	}

	public void setCredit(java.math.BigDecimal credit) {
		set("credit", credit);
	}

	public java.math.BigDecimal getCredit() {
		return get("credit");
	}

	public void setDebit(java.math.BigDecimal debit) {
		set("debit", debit);
	}

	public java.math.BigDecimal getDebit() {
		return get("debit");
	}

	public void setBalance(java.math.BigDecimal balance) {
		set("balance", balance);
	}

	public java.math.BigDecimal getBalance() {
		return get("balance");
	}

	public void setOrderId(java.lang.Long orderId) {
		set("order_id", orderId);
	}

	public java.lang.Long getOrderId() {
		return get("order_id");
	}

	public void setMemo(java.lang.String memo) {
		set("memo", memo);
	}

	public java.lang.String getMemo() {
		return get("memo");
	}

	public void setCreateBy(java.lang.String createBy) {
		set("create_by", createBy);
	}

	public java.lang.String getCreateBy() {
		return get("create_by");
	}

	public void setCreationDate(java.util.Date creationDate) {
		set("creation_date", creationDate);
	}

	public java.util.Date getCreationDate() {
		return get("creation_date");
	}

	public void setLastUpdatedBy(java.lang.String lastUpdatedBy) {
		set("last_updated_by", lastUpdatedBy);
	}

	public java.lang.String getLastUpdatedBy() {
		return get("last_updated_by");
	}

	public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
		set("last_updated_date", lastUpdatedDate);
	}

	public java.util.Date getLastUpdatedDate() {
		return get("last_updated_date");
	}

	public void setDeleteFlag(java.lang.Boolean deleteFlag) {
		set("delete_flag", deleteFlag);
	}

	public java.lang.Boolean getDeleteFlag() {
		return get("delete_flag");
	}

}