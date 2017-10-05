package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePromotionProductCategory<M extends BasePromotionProductCategory<M>> extends Model<M> implements IBean {

	public void setPromotions(java.lang.Long promotions) {
		set("promotions", promotions);
	}

	public java.lang.Long getPromotions() {
		return get("promotions");
	}

	public void setProductCategories(java.lang.Long productCategories) {
		set("product_categories", productCategories);
	}

	public java.lang.Long getProductCategories() {
		return get("product_categories");
	}

}
