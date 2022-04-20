package com.training.model;
@FunctionalInterface
public interface Converter<T,R>{
	public R convert(T value);

}
