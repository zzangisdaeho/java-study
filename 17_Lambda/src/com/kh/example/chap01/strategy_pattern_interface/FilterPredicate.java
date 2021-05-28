package com.kh.example.chap01.strategy_pattern_interface;

import com.kh.example.chap01.model.Product;

public interface FilterPredicate {

	public abstract boolean filter(Product product);
}
