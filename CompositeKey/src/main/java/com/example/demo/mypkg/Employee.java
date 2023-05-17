package com.example.demo.mypkg;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "__employee")
@Data @NoArgsConstructor @AllArgsConstructor
@Embeddable
public class Employee {
	@Id
	private CompositeID compositeID;
	
	private String name;
	private String email;

}
