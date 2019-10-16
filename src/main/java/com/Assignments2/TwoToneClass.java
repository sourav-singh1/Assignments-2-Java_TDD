package com.Assignments2;

public class TwoToneClass {

	private static TwoToneClass OBJECT_INSTANCE;
	private static Integer ObjectCounter = 0;

	private TwoToneClass() {
		ObjectCounter++;
	}

	public static synchronized TwoToneClass getInstance() {
		if ((ObjectCounter < 3)) {
			ObjectCounter++;
			OBJECT_INSTANCE = new TwoToneClass();
		}
		return OBJECT_INSTANCE;
	}
}
