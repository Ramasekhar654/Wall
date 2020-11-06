package com.wall.po_download.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wall.po_download.Repository.PoDownloadRopository;
import com.wall.po_download.exception.PoNumberNotFound;
import com.wall.po_download.model.PoDownload;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PoDownloadService {

	@Autowired
	private PoDownloadRopository repository;

	public PoDownload addPoDownload(PoDownload pd) {
		log.info("Inside addPoDownload()......");

		return repository.save(pd);
	}
	
	public PoDownload searchPoDownload(int po_number) throws PoNumberNotFound {
		log.info("Inside searcPoDownload()......");
		
		if(repository.findById(po_number)==null) {
			
			throw new PoNumberNotFound("Po number not found");
		}

		return repository.findById(po_number).get();
	}

	/*
	 * public PoDownload deletePoDownload(int po_number) {
	 * log.info("Inside deletePoDownload()......");
	 * 
	 * PoDownload pd = repository.findById(po_number).get();
	 * repository.deleteById(po_number); return pd; }
	 */

	

	/*
	 * public PoDownload updatePoDownload(PoDownload pd) {
	 * log.info("Inside updatePoDownload......"); if
	 * (repository.findById(pd.getPo_number()).isPresent()) { PoDownload pd_db =
	 * repository.findById(pd.getPo_number()).get(); pd_db = pd; return
	 * repository.save(pd_db); } return repository.save(pd); }
	 */
}
