package com.wall.dc_slot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dc_Slot {

	@Id
	private int DC_number;
	private String DC_timeslots;

}
