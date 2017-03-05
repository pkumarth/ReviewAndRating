package com.ecommerce.rnr.sql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class RnrInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long rnrInfoId;
	@NotNull
	private Long verticalId;
	@NotNull
	private String verticalName;
	@NotNull
	@Column(nullable = false, unique = false)
	private String itemName;
	@NotNull
	@Column(nullable = false, unique = true)
	private Long itemId;
	private Long totalNoOfRating;
	private Double totalAvgRating;
	private Long totalReview;
	private Long totalFeedback;
	private Long totalUpvote;
	private Long totalDownVote;

	public RnrInfo() {
	}

	public RnrInfo(Long rnrInfoId, Long verticalId, String verticalName, String itemName, Long itemId,
			Long totalNoOfRating, Double totalAvgRating,  Long totalReview, Long totalFeedback,
			Long totalUpvote, Long totalDownVote) {
		super();
		this.rnrInfoId = rnrInfoId;
		this.verticalId = verticalId;
		this.verticalName = verticalName;
		this.itemName = itemName;
		this.itemId = itemId;
		this.totalNoOfRating = totalNoOfRating;
		this.totalAvgRating = totalAvgRating;
		this.totalReview = totalReview;
		this.totalFeedback = totalFeedback;
		this.totalUpvote = totalUpvote;
		this.totalDownVote = totalDownVote;
	}

	public Long getRnrInfoId() {
		return rnrInfoId;
	}

	public void setRnrInfoId(Long rnrInfoId) {
		this.rnrInfoId = rnrInfoId;
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

	public Long getTotalNoOfRating() {
		return totalNoOfRating;
	}

	public void setTotalNoOfRating(Long totalNoOfRating) {
		this.totalNoOfRating = totalNoOfRating;
	}

	public Double getTotalAvgRating() {
		return totalAvgRating;
	}

	public void setTotalAvgRating(Double totalAvgRating) {
		this.totalAvgRating = totalAvgRating;
	}

	public Long getTotalReview() {
		return totalReview;
	}

	public void setTotalReview(Long totalReview) {
		this.totalReview = totalReview;
	}

	public Long getTotalFeedback() {
		return totalFeedback;
	}

	public void setTotalFeedback(Long totalFeedback) {
		this.totalFeedback = totalFeedback;
	}

	public Long getTotalUpvote() {
		return totalUpvote;
	}

	public void setTotalUpvote(Long totalUpvote) {
		this.totalUpvote = totalUpvote;
	}

	public Long getTotalDownVote() {
		return totalDownVote;
	}

	public void setTotalDownVote(Long totalDownVote) {
		this.totalDownVote = totalDownVote;
	}

}
