package com.ecommerce.rnr.endpoints;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.rnr.service.RnrService;
import com.ecommerce.rnr.sql.model.RnrDetailInfo;
import com.ecommerce.rnr.sql.model.RnrInfo;

@RestController
@RequestMapping("/{userId}/rnr")
public class RnREndPoints {
	private static final Logger logger = LoggerFactory.getLogger(RnREndPoints.class);

	@Autowired
	private RnrService rnrService;

	@RequestMapping(method = RequestMethod.GET, value = "/fetchAllRnrInfo")
	@ResponseBody
	public List<RnrInfo> getAllRnrInfo() {
		logger.info("Calling getRnrInfoByItemId for ItemId:-");
		return rnrService.getAllRnrInfo();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/fetchVeticalsByPopularity")
	@ResponseBody
	public List<RnrInfo> getRnrInfoByVerticalPopularity() {
		logger.info("Calling getRnrInfoByPopularity for Date:-");
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/fetchItemsByPopularity")
	@ResponseBody
	public List<RnrInfo> getRnrInfoByItemsPopularity() {
		logger.info("Calling getRnrInfoByPopularity for Date:-");
		return rnrService.getRnrInfoByPopularity(new Date());
	}

	@RequestMapping(method = RequestMethod.GET, value = "/fetchByItemId/{id}")
	@ResponseBody
	public RnrInfo getRnrInfoByItemId(@PathVariable("id") Long ItemId) {
		logger.info("Calling getRnrInfoByItemId for ItemId:-" + ItemId);
		return rnrService.getRnrInfoByItemId(ItemId);
	}

	// fetch all publishers
	@RequestMapping(method = RequestMethod.GET, value = "/fetchByItemName")
	@ResponseBody
	public RnrInfo getRnrInfoByItemName(long ItemName) {
		return rnrService.getRnrInfoByItemName(ItemName);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/fetchByVerticalId")
	@ResponseBody
	public List<RnrInfo> getRnrInfoByVerticalId(long verticalId) {
		return rnrService.getRnrInfoByVerticalId(verticalId);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/fetchByVerticalName")
	@ResponseBody
	public List<RnrInfo> getRnrInfoByVerticalName(long verticalName) {
		return rnrService.getRnrInfoByVerticalName(verticalName);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addRnrInfo")
	@ResponseBody
	public String addRnrInfo(@RequestBody RnrInfo rnrInfo) {
		logger.info("Calling addRnrInfo with Rnrinfo:-" + rnrInfo);
		String message = null;
		try {
			rnrService.addRnrInfo1(rnrInfo);
			message = "succesfully Create!";
		} catch (Exception ex) {
			logger.error(ex.toString());
			return "Error in craetion : " + ex.toString();
		}
		return message;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/updateRnrInfo/{itemId}")
	public ResponseEntity<?> updateRnrInfoByItemId(@PathVariable Long itemId, @RequestBody RnrInfo rnrInfo) {

		logger.info("Calling updateRnrInfo with Rnrinfo:-" + rnrInfo);
		try {
			rnrService.updateRnrInfoByItemId(itemId, rnrInfo);
		} catch (Exception ex) {
			logger.error(ex.toString());
			return new ResponseEntity("No RnrInfo  found for ItemId: " + itemId, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(rnrInfo, HttpStatus.OK);

	}

	// ============================Rnr DeatilInfo==============================

	@RequestMapping(method = RequestMethod.GET, value = "/fetchAllRnrDetailInfo")
	@ResponseBody
	public List<RnrDetailInfo> fetchAllRnrDetailInfo() {
		logger.info("Calling getRnrInfoByItemId for ItemId:-");
		return rnrService.fetchAllRnrDetailInfo();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/fetchAllRnrDetailInfoByCustomerId")
	@ResponseBody
	public List<RnrInfo> fetchAllRnrDetailInfoByCustomerId(long customerId) {
		return rnrService.fetchAllRnrDetailInfoByCustomerId(customerId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addRnrDetailInfo")
	@ResponseBody
	public String addRnrDetailInfo(@RequestBody RnrDetailInfo rnrdetailInfo) {
		logger.info("Calling addRnrDetailInfo with rnrdetailInfo:-" + rnrdetailInfo);
		String message = null;
		try {
			rnrService.addRnrDetailInfo(rnrdetailInfo);
			message = "succesfully Create!";
		} catch (Exception ex) {
			logger.error(ex.toString());
			return "Error in craetion : " + ex.toString();
		}
		return message;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/updateRnrDetailInfo/{customerId}")
	public ResponseEntity<?> updateRnrInfoByCustomerId(@PathVariable Long customerId,
			@RequestBody RnrDetailInfo rnrdetailInfo) {

		logger.info("Calling updateRnrInfoByCustomerId with rnrdetailInfo:-" + rnrdetailInfo);
		try {
			rnrService.updateRnrInfoByCustomerId(customerId, rnrdetailInfo);
		} catch (Exception ex) {
			logger.error(ex.toString());
			return new ResponseEntity("No RnrInfo  found for customerId: " + customerId, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(rnrdetailInfo, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/savePublisher")
	@ResponseBody
	public String savePublisher() {

		try {
			// save a couple of publishers
			/*
			 * Book bookA = new Book("Book A"); Book bookB = new Book("Book B");
			 * 
			 * publisherDao.save(new HashSet<Publisher>() { { add(new
			 * Publisher("Publisher A", new HashSet<Book>() { { add(bookA);
			 * add(bookB); } }));
			 * 
			 * add(new Publisher("Publisher B", new HashSet<Book>() { {
			 * add(bookA); add(bookB); } })); } });
			 */
		} catch (Exception ex) {
			logger.error(ex.toString());
			return "Error in savePublisher : " + ex.toString();
		}
		return "Publisher Added succesfully";
	}

	/*
	 * // fetch all publishers
	 * 
	 * @RequestMapping(method = RequestMethod.GET, value = "/fetchAllPublisher")
	 * public @ResponseBody List<Publisher> fetchAllPub(@PathVariable String
	 * userId) { logger.info("Calling fetchAllPub a"); List<Publisher>
	 * publishers = null; try { publishers = publisherDao.findAll(); } catch
	 * (Exception ex) { logger.error(ex.toString());
	 * 
	 * } return publishers;
	 * 
	 * }
	 * 
	 * // fetch all books
	 * 
	 * @RequestMapping(method = RequestMethod.GET, value = "/fetchAllBook")
	 * public @ResponseBody List<Book> readBookmarks(@PathVariable String
	 * userId) { logger.info("Calling BookMarks a"); List<Book> books = null;
	 * try { books = bookDao.findAll(); } catch (Exception ex) {
	 * logger.error(ex.toString());
	 * 
	 * } return books;
	 * 
	 * }
	 * 
	 *//**
		 * GET /addBook --> Update the email and the name for the user in the
		 * database having the passed id.
		 */
	/*
	 * @RequestMapping(method = RequestMethod.POST, value = "/saveBook")
	 * 
	 * @ResponseBody public String saveBook() { try { // save a couple of books
	 * 
	 * Publisher publisherA = new Publisher("Publisher Aaa"); Publisher
	 * publisherB = new Publisher("Publisher Bbb"); Publisher publisherC = new
	 * Publisher("Publisher Ccc"); bookDao.save(new HashSet<Book>() { { add(new
	 * Book("Book A", new HashSet<Publisher>() { { add(publisherA);
	 * add(publisherB); } }));
	 * 
	 * add(new Book("Book B", new HashSet<Publisher>() { { add(publisherA);
	 * add(publisherC); } })); } });
	 * 
	 * } catch (Exception ex) { logger.error(ex.toString()); return
	 * "Error in Adding Book : " + ex.toString(); } return
	 * "Books Added succesfully"; }
	 * 
	 *//**
		 * GET /addBook --> Update the email and the name for the user in the
		 * database having the passed id.
		 *//*
		 * @RequestMapping(method = RequestMethod.POST, value =
		 * "/savePublisher")
		 * 
		 * @ResponseBody public String savePublisher() { try { // save a couple
		 * of publishers Book bookA = new Book("Book A"); Book bookB = new
		 * Book("Book B");
		 * 
		 * publisherDao.save(new HashSet<Publisher>() { { add(new
		 * Publisher("Publisher A", new HashSet<Book>() { { add(bookA);
		 * add(bookB); } }));
		 * 
		 * add(new Publisher("Publisher B", new HashSet<Book>() { { add(bookA);
		 * add(bookB); } })); } });
		 * 
		 * } catch (Exception ex) { logger.error(ex.toString()); return
		 * "Error in savePublisher : " + ex.toString(); } return
		 * "Publisher Added succesfully"; }
		 */

}
