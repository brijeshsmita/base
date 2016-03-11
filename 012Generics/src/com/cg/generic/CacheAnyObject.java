package com.cg.generic;
//generic class
public class CacheAnyObject <T> {
	//T stands for Type
	private T t;
	public void add(T t) {
		this.t=t;
	}
	public T get() {
		return this.t;
	}
}
