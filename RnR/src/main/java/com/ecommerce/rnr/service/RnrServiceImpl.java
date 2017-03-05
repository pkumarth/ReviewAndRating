package com.ecommerce.rnr.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public void addRnrInfo(RnrInfo rnrInfo) {
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
