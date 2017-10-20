package com.uangteman.service;

import org.springframework.stereotype.Service;

@Service("hitungService")
public class HitungService {
	public int add(int a, int b) {
		return a+b;
	}
	
	public long multiple(long a, long b) {
		return Math.multiplyExact(a, b);
	}
	
	public long divideBy(long a, long b) {
		return Math.floorDiv(a, b);
	}
	
	public double countSqrt(int a) {
		return Math.sqrt(a);
	}
	
	public int subtraction(int a, int b) {
		return Math.subtractExact(a, b);
	}
}
