package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCoupon<M extends BaseCoupon<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setPrefix(java.lang.String prefix) {
		set("prefix", prefix);
	}

	public java.lang.String getPrefix() {
		return get("prefix");
	}

	public void setIntroduction(java.lang.String introduction) {
		set("introduction", introduction);
	}

	public java.lang.String getIntroduction() {
		return get("introduction");
	}

	public void setBeginDate(java.util.Date beginDate) {
		set("begin_date", beginDate);
	}

	public java.util.Date getBeginDate() {
		return get("begin_date");
	}

	public void setEndDate(java.util.Date endDate) {
		set("end_date", endDate);
	}

	public java.util.Date getEndDate() {
		return get("end_date");
	}

	public void setIsEnabled(java.lang.Boolean isEnabled) {
		set("is_enabled", isEnabled);
	}

	public java.lang.Boolean getIsEnabled() {
		return get("is_enabled");
	}

	public void setIsExchange(java.lang.Boolean isExchange) {
		set("is_exchange", isExchange);
	}

	public java.lang.Boolean getIsExchange() {
		return get("is_exchange");
	}

	public void setMaximumPrice(java.math.BigDecimal maximumPrice) {
		set("maximum_price", maximumPrice);
	}

	public java.math.BigDecimal getMaximumPrice() {
		return get("maximum_price");
	}

	public void setMaximumQuantity(java.lang.Integer maximumQuantity) {
		set("maximum_quantity", maximumQuantity);
	}

	public java.lang.Integer getMaximumQuantity() {
		return get("maximum_quantity");
	}

	public void setMinimumPrice(java.math.BigDecimal minimumPrice) {
		set("minimum_price", minimumPrice);
	}

	public java.math.BigDecimal getMinimumPrice() {
		return get("minimum_price");
	}

	public void setMinimumQuantity(java.lang.Integer minimumQuantity) {
		set("minimum_quantity", minimumQuantity);
	}

	public java.lang.Integer getMinimumQuantity() {
		return get("minimum_quantity");
	}

	public void setPoint(java.lang.Long point) {
		set("point", point);
	}

	public java.lang.Long getPoint() {
		return get("point");
	}

	public void setPriceExpression(java.lang.String priceExpression) {
		set("price_expression", priceExpression);
	}

	public java.lang.String getPriceExpression() {
		return get("price_expression");
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
