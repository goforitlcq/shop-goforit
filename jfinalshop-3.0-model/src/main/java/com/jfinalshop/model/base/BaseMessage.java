package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMessage<M extends BaseMessage<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}

	public java.lang.String getContent() {
		return get("content");
	}

	public void setSenderId(java.lang.Long senderId) {
		set("sender_id", senderId);
	}

	public java.lang.Long getSenderId() {
		return get("sender_id");
	}

	public void setReceiverId(java.lang.Long receiverId) {
		set("receiver_id", receiverId);
	}

	public java.lang.Long getReceiverId() {
		return get("receiver_id");
	}

	public void setForMessage(java.lang.Long forMessage) {
		set("for_message", forMessage);
	}

	public java.lang.Long getForMessage() {
		return get("for_message");
	}

	public void setReceiverRead(java.lang.Boolean receiverRead) {
		set("receiver_read", receiverRead);
	}

	public java.lang.Boolean getReceiverRead() {
		return get("receiver_read");
	}

	public void setReceiverDelete(java.lang.Boolean receiverDelete) {
		set("receiver_delete", receiverDelete);
	}

	public java.lang.Boolean getReceiverDelete() {
		return get("receiver_delete");
	}

	public void setSenderRead(java.lang.Boolean senderRead) {
		set("sender_read", senderRead);
	}

	public java.lang.Boolean getSenderRead() {
		return get("sender_read");
	}

	public void setSenderDelete(java.lang.Boolean senderDelete) {
		set("sender_delete", senderDelete);
	}

	public java.lang.Boolean getSenderDelete() {
		return get("sender_delete");
	}

	public void setIsDraft(java.lang.Boolean isDraft) {
		set("is_draft", isDraft);
	}

	public java.lang.Boolean getIsDraft() {
		return get("is_draft");
	}

	public void setIp(java.lang.String ip) {
		set("ip", ip);
	}

	public java.lang.String getIp() {
		return get("ip");
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
