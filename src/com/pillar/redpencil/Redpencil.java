package com.pillar.redpencil;

public class Redpencil {

	public boolean isActivated(double lowEndReduction, double highEndReduction, double discountPrice, double orginalPrice) {
		if(discountPrice<=orginalPrice-orginalPrice*lowEndReduction){
		return true;
	}else{
		return false;
	}

	}
}