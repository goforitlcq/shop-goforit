package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProductSpecification<M extends BaseProductSpecification<M>> extends Model<M> implements IBean {

	public void setProducts(java.lang.Long products) {
		set("products", products);
	}

	public java.lang.Long getProducts() {
		return get("products");
	}

	public void setSpecifications(java.lang.Long specifications) {
		set("specifications", specifications);
	}

	public java.lang.Long getSpecifications() {
		return get("specifications");
	}

}
