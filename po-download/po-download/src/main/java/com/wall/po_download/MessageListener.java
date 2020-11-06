package com.wall.po_download;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Service;

import com.wall.po_download.controller.PoDownloadController;
import com.wall.po_download.model.PoDownload;

@Service
public class MessageListener {

	@Autowired
	PoDownloadController controller;

	@StreamListener(Processor.INPUT)
	public void  consumerMessage(PoDownload pd) {
		System.out.println(pd);
		 controller.addDc_Slot(pd);
	}
}
