package com.wall.po_download.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wall.po_download.model.PoDownload;
@Repository
public interface PoDownloadRopository extends JpaRepository<PoDownload, Integer> {

}
