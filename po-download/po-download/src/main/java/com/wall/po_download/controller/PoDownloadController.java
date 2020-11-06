package com.wall.po_download.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wall.po_download.exception.PoNumberNotFound;
import com.wall.po_download.model.PoDownload;
import com.wall.po_download.service.PoDownloadService;

@RestController
@RequestMapping("/po_download")
public class PoDownloadController {

	@Autowired
	private PoDownloadService service;

	@GetMapping("/search/{po_number}")
	@ResponseBody
	public ResponseEntity<PoDownload> searchPoDownload(@PathVariable("po_number") int po_number) throws PoNumberNotFound  {

		return ResponseEntity.ok(service.searchPoDownload(po_number));
	}

	/*
	 * @PostMapping("/add")
	 * 
	 * @ResponseBody
	 */
	public ResponseEntity<PoDownload> addDc_Slot(@RequestBody PoDownload pd) {
		return ResponseEntity.ok(service.addPoDownload(pd));
	}

	/*
	 * @PutMapping("/update")
	 * 
	 * @ResponseBody public ResponseEntity<PoDownload> updateDc_Slot(@RequestBody
	 * PoDownload pd) { return ResponseEntity.ok(service.updatePoDownload(pd)); }
	 * 
	 * @DeleteMapping("/delete/{po_number}")
	 * 
	 * @ResponseBody public ResponseEntity<PoDownload>
	 * deletDc_Slot(@PathVariable("dc_number") int po_number) { return
	 * ResponseEntity.ok(service.deletePoDownload(po_number)); }
	 */
}
