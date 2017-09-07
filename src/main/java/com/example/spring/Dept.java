package com.example.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
	int deptno;
	String dname;
	String loc;
	
	public void print() {
		System.out.println("#####1 " + toString());
	}
	public void print2() {
		System.out.println("#####2 " + toString());
	}
	
}
