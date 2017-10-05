package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseArticleCategory<M extends BaseArticleCategory<M>> extends Model<M> implements IBean {

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

	public void setSeoTitle(java.lang.String seoTitle) {
		set("seo_title", seoTitle);
	}

	public java.lang.String getSeoTitle() {
		return get("seo_title");
	}

	public void setSeoDescription(java.lang.String seoDescription) {
		set("seo_description", seoDescription);
	}

	public java.lang.String getSeoDescription() {
		return get("seo_description");
	}

	public void setSeoKeywords(java.lang.String seoKeywords) {
		set("seo_keywords", seoKeywords);
	}

	public java.lang.String getSeoKeywords() {
		return get("seo_keywords");
	}

	public void setParentId(java.lang.Long parentId) {
		set("parent_id", parentId);
	}

	public java.lang.Long getParentId() {
		return get("parent_id");
	}

	public void setGrade(java.lang.Integer grade) {
		set("grade", grade);
	}

	public java.lang.Integer getGrade() {
		return get("grade");
	}

	public void setTreePath(java.lang.String treePath) {
		set("tree_path", treePath);
	}

	public java.lang.String getTreePath() {
		return get("tree_path");
	}

	public void setOrders(java.lang.Integer orders) {
		set("orders", orders);
	}

	public java.lang.Integer getOrders() {
		return get("orders");
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
