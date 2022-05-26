package com.ex999;

public interface IRFMouse {
	String RF_Type_IR = "적외선";
	String RF_Type_BT = "블루투스";

	void wconnect();

	void wdisconnect();
}
