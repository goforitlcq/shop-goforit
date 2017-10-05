package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseReceiver<M extends BaseReceiver<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setConsignee(java.lang.String consignee) {
		set("consignee", consignee);
	}

	public java.lang.String getConsignee() {
		return get("consignee");
	}

	public void setAreaName(java.lang.String areaName) {
		set("area_name", areaName);
	}

	public java.lang.String getAreaName() {
		return get("area_name");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}

	public java.lang.String getAddress() {
		return get("address");
	}

	public void setZipCode(java.lang.String zipCode) {
		set("zip_code", zipCode);
	}

	public java.lang.String getZipCode() {
		return get("zip_code");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}

	public java.lang.String getPhone() {
		return get("phone");
	}

	public void setIsDefault(java.lang.Boolean isDefault) {
		set("is_default", isDefault);
	}

	public java.lang.Boolean getIsDefault() {
		return get("is_default");
	}

	public void setAreaId(java.lang.Long areaId) {
		set("area_id", areaId);
	}

	public java.lang.Long getAreaId() {
		return get("area_id");
	}

	public void setMemberId(java.lang.Long memberId) {
		set("member_id", memberId);
	}

	public java.lang.Long getMemberId() {
		return get("member_id");
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