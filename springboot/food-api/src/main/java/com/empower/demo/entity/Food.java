package com.empower.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="FOOD")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {
	@Id					//marks the field as primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "NAME")
	private String name;
	private String category;
	private Double price;
//	@Transient
//	private SimpleDateFormat sdf;
	
}
