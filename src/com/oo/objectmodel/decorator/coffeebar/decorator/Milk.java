package com.oo.objectmodel.decorator.coffeebar.decorator;

import com.oo.objectmodel.decorator.coffeebar.Drink;

public class Milk extends Decorator{

	public Milk(Drink obj) {
		super(obj);
		super.setDescription("Milk");
		super.setPrice(4.0f);
	}

}
