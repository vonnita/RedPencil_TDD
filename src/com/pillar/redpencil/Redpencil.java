package com.pillar.redpencil;

public class Redpencil {

	public boolean isActivated(double lowEndReduction, double highEndReduction, double discountPrice,
			double orginalPrice, int days) {
		if (discountPrice <= orginalPrice - orginalPrice * lowEndReduction && (days>30)) {
			return true;
		} else {

			
			return false;
		}

	}

}