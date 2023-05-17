package com.example.demo.mypkg;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode
public class CompositeID implements Serializable{

	private Integer EmplId;
	
	private Integer DeptId;
}
