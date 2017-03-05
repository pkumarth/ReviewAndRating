package com.ecommerce.rnr.service;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.rnr.dto.RnrDto;
import com.ecommerce.rnr.sql.model.RnrDetailInfo;
import com.ecommerce.rnr.sql.model.RnrInfo;

public interface RnrService {
	public List<RnrInfo> getAllRnrInfo();

	public RnrInfo getRnrInfoByItemId(long ItemId);

	public RnrInfo getRnrInfoByItemName(long ItemName);

	public List<RnrInfo> getRnrInfoByVerticalId(long verticalId);

	public List<RnrInfo> getRnrInfoByVerticalName(long verticalName);

	public List<RnrInfo> getRnrInfoByPopularity(Date date);

	public void addRnrInfo(RnrDto rnrDto);

	public void addRnrInfo1(RnrInfo rnrInfo);

	public void updateRnrInfoByItemId(Long itemId, RnrInfo rnrInfo);

	// Rnr Details Info
	public List<RnrDetailInfo> fetchAllRnrDetailInfo();

	public List<RnrInfo> fetchAllRnrDetailInfoByCustomerId(long customerId);

	public void addRnrDetailInfo(@RequestBody RnrDetailInfo rnrdetailInfo);

	public void updateRnrInfoByCustomerId(Long customerId, RnrDetailInfo rnrdetailInfo);

}
