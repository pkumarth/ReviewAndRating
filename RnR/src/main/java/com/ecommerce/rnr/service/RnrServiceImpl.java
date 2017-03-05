package com.ecommerce.rnr.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.rnr.dto.RnrDto;
import com.ecommerce.rnr.sql.dao.RnrDetailInfoDao;
import com.ecommerce.rnr.sql.dao.RnrInfoDao;
import com.ecommerce.rnr.sql.model.RnrDetailInfo;
import com.ecommerce.rnr.sql.model.RnrInfo;

@Service
@Transactional
public class RnrServiceImpl implements RnrService {
	@Autowired
	private RnrInfoDao rnrInfoDao = null;
	@Autowired
	private RnrDetailInfoDao rnrDetailInfoDao = null;

	public List<RnrInfo> getAllRnrInfo() {
		return rnrInfoDao.findAll();
	}

	@Override
	public RnrInfo getRnrInfoByItemId(long ItemId) {

		return rnrInfoDao.findOne(ItemId);
	}

	@Override
	public RnrInfo getRnrInfoByItemName(long ItemName) {
		return null;
	}

	@Override
	public List<RnrInfo> getRnrInfoByVerticalId(long verticalId) {
		return null;
	}

	@Override
	public List<RnrInfo> getRnrInfoByVerticalName(long verticalName) {
		return null;
	}

	@Override
	public List<RnrInfo> getRnrInfoByPopularity(Date date) {
		return null;
	}

	@Override
	public void addRnrInfo(RnrDto rnrDto) {
		RnrDetailInfo rnrdetailInfo = new RnrDetailInfo();
		rnrdetailInfo.setCustomerId(rnrDto.getCustomerId());
		rnrdetailInfo.setCustomerName(rnrDto.getCustomerName());
		rnrdetailInfo.setOverallAvgRating(rnrDto.getOverallAvgRating());
		rnrdetailInfo.setIsUpvote(rnrDto.getIsUpvote());
		rnrdetailInfo.setIsDownvote(rnrDto.getIsDownvote());
		rnrdetailInfo.setFeedbackTitle(rnrDto.getFeedbackTitle());
		rnrdetailInfo.setFeedbackDesc(rnrDto.getFeedbackDesc());
		rnrdetailInfo.setFeedbackDetails(rnrDto.getFeedbackDetails());
		rnrDetailInfoDao.save(rnrdetailInfo);
		RnrInfo rnrInfo = new RnrInfo();
		rnrInfo.setItemId(rnrDto.getItemId());
		rnrInfo.setItemName(rnrDto.getItemName());
		rnrInfo.setVerticalId(rnrDto.getVerticalId());
		rnrInfo.setVerticalName(rnrDto.getVerticalName());
		rnrInfoDao.save(rnrInfo);

	}
	public void addRnrInfo1(RnrInfo rnrInfo)
	{
		rnrInfoDao.save(rnrInfo);
	}
	public void updateRnrInfoByItemId(Long itemId, RnrInfo rnrInfo) {

		rnrInfoDao.setUserInfoById(rnrInfo.getTotalNoOfRating(), rnrInfo.getTotalAvgRating(), rnrInfo.getTotalReview(),
				rnrInfo.getTotalFeedback(), rnrInfo.getTotalUpvote(), rnrInfo.getTotalDownVote(), itemId);
	}

	// Rnr Details Info
	@Override
	public List<RnrDetailInfo> fetchAllRnrDetailInfo() {
		return rnrDetailInfoDao.findAll();
	}

	@Override
	public List<RnrInfo> fetchAllRnrDetailInfoByCustomerId(long customerId) {
		return null;
	}

	@Override
	public void addRnrDetailInfo(RnrDetailInfo rnrdetailInfo) {
		rnrDetailInfoDao.save(rnrdetailInfo);
	}

	@Override
	public void updateRnrInfoByCustomerId(Long customerId, RnrDetailInfo rnrdetailInfo) {
		// TODO Auto-generated method stub

	}

}
