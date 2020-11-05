package com.application.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PoDownload {

	private int po_number;
	private Date po_date;
	private String po_address;
	private int po_line_number;
	private int upc_number;
	private String upc_name;
	private int ordered_quantity;
}
