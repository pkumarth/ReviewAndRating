package com.ecommerce.rnr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.rnr.dto.RnrDto;
import com.ecommerce.rnr.service.RnrService;
import com.ecommerce.rnr.sql.model.RnrInfo;

@Controller
public class RnrController {
	/*
	 * @Autowired private MailService mailService;
	 */
	private static final Logger logger = LoggerFactory.getLogger(RnrController.class);
	@Autowired
	private RnrService rnrService;

	@RequestMapping("/")
	public String index() {
		return "welcome";
	}

	@RequestMapping("/rnr")
	public String getAllRnrInfo(@RequestParam(value = "rnrInfo", required = false, defaultValue = "RnR") String rnrInfo,
			Model model) {
		model.addAttribute("rnrInfo", rnrService.getAllRnrInfo());
		// mailService.prepareAndSend("pktnitk50@gmail.com", "Hi Pkt");
		return "rnrblog";
	}

	// @RequestMapping("/greeting")
	@RequestMapping(method = RequestMethod.GET, value = "/fetchRnrForm")
	public String fetchRnrForm(Model model) {
		model.addAttribute("rnrInfo", new RnrInfo());
		return "rnrblogForm";
	}

	// @PostMapping("/greeting")
	@RequestMapping(method = RequestMethod.POST, value = "/postRnr")
	public String RnrSubmit(@ModelAttribute RnrDto rnrdto) {
		logger.info("Item Name :=" + rnrdto.getItemName());
		try {
			rnrService.addRnrInfo(rnrdto);
		} catch (Exception ex) {
			logger.error("Error" + ex);
			return "error";
		}
		return "result";
	}

	@RequestMapping("/getAllRnrDetailInfo")
	public String getAllRnrDetailInfo(
			@RequestParam(value = "rnrdetailInfos", required = false, defaultValue = "RnRDetails") String rnrdetailInfos,
			Model model) {
		model.addAttribute("rnrdetailInfos", rnrService.fetchAllRnrDetailInfo());
		model.addAttribute("rnrInfo", rnrService.getAllRnrInfo());
		// mailService.prepareAndSend("pktnitk50@gmail.com", "Hi Pkt");
		return "rnrDetails";
	}

}
