package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;


public class Corolla implements Car {
	
	@Autowired
//	@Qualifier("V6Engine")
	Engine V8Engine;
    
	
	public String specs() {
		String specs = "Sedan from Toyota with engine type " + V8Engine.type();
		return specs;
	}



}
