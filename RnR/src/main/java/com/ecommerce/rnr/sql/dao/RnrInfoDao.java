package com.ecommerce.rnr.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.rnr.sql.model.RnrInfo;

@Repository
public interface RnrInfoDao extends JpaRepository<RnrInfo, Long> {
	// public RnrInfo findByItemId(Long ItemId);

	@Modifying
	@Query("update RnrInfo rnr set rnr.totalNoOfRating = ?1, rnr.totalAvgRating = ?2 ,  rnr.totalReview = ?3 , rnr.totalFeedback = ?4,   rnr.totalUpvote = ?5  ,  rnr.totalDownVote = ?6  where rnr.itemId = ?7")
	public void setUserInfoById(Long totalNoOfRating, Double totalAvgRating, Long totalReview, Long totalFeedback,
			Long totalUpvote, Long totalDownVote, Long itemId);

}
