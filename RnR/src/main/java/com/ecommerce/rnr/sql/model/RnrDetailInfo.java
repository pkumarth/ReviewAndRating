package com.ecommerce.rnr.sql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class RnrDetailInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long rnrDetailInfoId;
	@NotNull
	@Column(nullable = false, unique = true)
	private Long customerId;
	@NotNull
	private String customerName;

	private String feedbackTitle;
	private String feedbackDetails;
	private String feedbackDesc;

	private Byte moderationStatus;
	private String moderationSComment;

	private Boolean isfeedbackAdminApproved;
	private Boolean isfeedbackActive;

	private Double overallAvgRating;

	private Boolean isUpvote;
	private Boolean isDownvote;

	public RnrDetailInfo() {
		super();
	}

	public RnrDetailInfo(Long rnrDetailInfoId, Long customerId, String customerName, String feedbackTitle,
			String feedbackDetails, String feedbackDesc, Byte moderationStatus, String moderationSComment,
			Boolean isfeedbackAdminApproved, Boolean isfeedbackActive, Double overallAvgRating, Boolean isUpvote,
			Boolean isDownvote) {
		super();
		this.rnrDetailInfoId = rnrDetailInfoId;
		this.customerId = customerId;
		this.customerName = customerName;
		this.feedbackTitle = feedbackTitle;
		this.feedbackDetails = feedbackDetails;
		this.feedbackDesc = feedbackDesc;
		this.moderationStatus = moderationStatus;
		this.moderationSComment = moderationSComment;
		this.isfeedbackAdminApproved = isfeedbackAdminApproved;
		this.isfeedbackActive = isfeedbackActive;
		this.overallAvgRating = overallAvgRating;
		this.isUpvote = isUpvote;
		this.isDownvote = isDownvote;
	}

	public Long getRnrDetailInfoId() {
		return rnrDetailInfoId;
	}

	public void setRnrDetailInfoId(Long rnrDetailInfoId) {
		this.rnrDetailInfoId = rnrDetailInfoId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFeedbackTitle() {
		return feedbackTitle;
	}

	public void setFeedbackTitle(String feedbackTitle) {
		this.feedbackTitle = feedbackTitle;
	}

	public String getFeedbackDetails() {
		return feedbackDetails;
	}

	public void setFeedbackDetails(String feedbackDetails) {
		this.feedbackDetails = feedbackDetails;
	}

	public String getFeedbackDesc() {
		return feedbackDesc;
	}

	public void setFeedbackDesc(String feedbackDesc) {
		this.feedbackDesc = feedbackDesc;
	}

	public Byte getModerationStatus() {
		return moderationStatus;
	}

	public void setModerationStatus(Byte moderationStatus) {
		this.moderationStatus = moderationStatus;
	}

	public String getModerationSComment() {
		return moderationSComment;
	}

	public void setModerationSComment(String moderationSComment) {
		this.moderationSComment = moderationSComment;
	}

	public Boolean getIsfeedbackAdminApproved() {
		return isfeedbackAdminApproved;
	}

	public void setIsfeedbackAdminApproved(Boolean isfeedbackAdminApproved) {
		this.isfeedbackAdminApproved = isfeedbackAdminApproved;
	}

	public Boolean getIsfeedbackActive() {
		return isfeedbackActive;
	}

	public void setIsfeedbackActive(Boolean isfeedbackActive) {
		this.isfeedbackActive = isfeedbackActive;
	}

	public Double getOverallAvgRating() {
		return overallAvgRating;
	}

	public void setOverallAvgRating(Double overallAvgRating) {
		this.overallAvgRating = overallAvgRating;
	}

	public Boolean getIsUpvote() {
		return isUpvote;
	}

	public void setIsUpvote(Boolean isUpvote) {
		this.isUpvote = isUpvote;
	}

	public Boolean getIsDownvote() {
		return isDownvote;
	}

	public void setIsDownvote(Boolean isDownvote) {
		this.isDownvote = isDownvote;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
