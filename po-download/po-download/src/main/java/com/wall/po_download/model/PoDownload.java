package com.wall.po_download.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "po_download")
public class PoDownload {
	@Id
	private int po_number;
	private Date po_date;
	private String po_address;
	private int po_line_number;
	private int upc_number;
	private String upc_name;
	private int ordered_quantity;
}
