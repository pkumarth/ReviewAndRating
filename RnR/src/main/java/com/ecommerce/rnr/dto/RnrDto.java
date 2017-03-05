package com.ecommerce.rnr.dto;

import javax.validation.constraints.NotNull;

public class RnrDto {

	@NotNull
	private Long verticalId;
	@NotNull
	private String verticalName;
	@NotNull
	private String itemName;
	@NotNull
	private Long itemId;

	@NotNull
	private Long customerId;
	@NotNull
	private String customerName;

	private String feedbackTitle;
	private String feedbackDetails;
	private String feedbackDesc;

	private Double overallAvgRating;

	private Boolean isUpvote;
	private Boolean isDownvote;

	public RnrDto() {
		super();
	}

	public RnrDto(Long verticalId, String verticalName, String itemName, Long itemId, Long customerId,
			String customerName, String feedbackTitle, String feedbackDetails, String feedbackDesc,
			Double overallAvgRating, Boolean isUpvote, Boolean isDownvote) {
		super();
		this.verticalId = verticalId;
		this.verticalName = verticalName;
		this.itemName = itemName;
		this.itemId = itemId;
		this.customerId = customerId;
		this.customerName = customerName;
		this.feedbackTitle = feedbackTitle;
		this.feedbackDetails = feedbackDetails;
		this.feedbackDesc = feedbackDesc;
		this.overallAvgRating = overallAvgRating;
		this.isUpvote = isUpvote;
		this.isDownvote = isDownvote;
	}

	public Long getVerticalId() {
		return verticalId;
	}

	public void setVerticalId(Long verticalId) {
		this.verticalId = verticalId;
	}

	public String getVerticalName() {
		return verticalName;
	}

	public void setVerticalName(String verticalName) {
		this.verticalName = verticalName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
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

}
