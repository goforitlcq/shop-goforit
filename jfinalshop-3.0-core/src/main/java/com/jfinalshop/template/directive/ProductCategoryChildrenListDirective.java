/*
 * 
 * 
 * 
 */
package com.jfinalshop.template.directive;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jfinalshop.model.ProductCategory;
import com.jfinalshop.service.ProductCategoryService;
import com.jfinalshop.utils.FreemarkerUtils;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * 模板指令 - 下级商品分类列表
 * 
 * 
 * 
 */
public class ProductCategoryChildrenListDirective extends BaseDirective {

	/** "商品分类ID"参数名称 */
	private static final String PRODUCT_CATEGORY_ID_PARAMETER_NAME = "productCategoryId";

	/** 变量名称 */
	private static final String VARIABLE_NAME = "productCategories";

	private ProductCategoryService productCategoryService = new ProductCategoryService();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
		Long productCategoryId = FreemarkerUtils.getParameter(PRODUCT_CATEGORY_ID_PARAMETER_NAME, Long.class, params);

		ProductCategory productCategory = productCategoryService.find(productCategoryId);

		List<ProductCategory> productCategories;
		if (productCategoryId != null && productCategory == null) {
			productCategories = new ArrayList<ProductCategory>();
		} else {
			boolean useCache = useCache(env, params);
			String cacheRegion = getCacheRegion(env, params);
			Integer count = getCount(params);
			if (useCache) {
				productCategories = productCategoryService.findChildren(productCategory, count, cacheRegion);
			} else {
				productCategories = productCategoryService.findChildren(productCategory, count);
			}
		}
		setLocalVariable(VARIABLE_NAME, productCategories, env, body);
	}

}