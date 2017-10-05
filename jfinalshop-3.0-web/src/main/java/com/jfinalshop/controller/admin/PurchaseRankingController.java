package com.jfinalshop.controller.admin;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import com.jfinal.ext.route.ControllerBind;
import com.jfinalshop.service.MemberService;

/**
 * Controller - 消费排行
 * 
 * 
 * 
 */
@ControllerBind(controllerKey = "/admin/purchaseRanking")
public class PurchaseRankingController extends BaseAdminController {

	/** 默认数量 */
	private static final int DEFAULT_COUNT = 20;

	private MemberService memberService = enhance(MemberService.class);

	/**
	 * 列表
	 */
	public void list() {
		Date beginDate = getParaToDate("beginDate");
		Date endDate = getParaToDate("endDate");
		Integer count = getParaToInt("count");
		if (beginDate != null) {
			Calendar calendar = DateUtils.toCalendar(beginDate);
			calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMinimum(Calendar.HOUR_OF_DAY));
			calendar.set(Calendar.MINUTE, calendar.getActualMinimum(Calendar.MINUTE));
			calendar.set(Calendar.SECOND, calendar.getActualMinimum(Calendar.SECOND));
			beginDate = calendar.getTime();
		}
		if (endDate != null) {
			Calendar calendar = DateUtils.toCalendar(endDate);
			calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMaximum(Calendar.HOUR_OF_DAY));
			calendar.set(Calendar.MINUTE, calendar.getActualMaximum(Calendar.MINUTE));
			calendar.set(Calendar.SECOND, calendar.getActualMaximum(Calendar.SECOND));
			endDate = calendar.getTime();
		}
		if (count == null || count <= 0) {
			count = DEFAULT_COUNT;
		}
		setAttr("beginDate", beginDate);
		setAttr("endDate", endDate);
		setAttr("count", count);
		setAttr("data", memberService.findPurchaseList(beginDate, endDate, count));
		render("/admin/purchase_ranking/list.html");
	}

}