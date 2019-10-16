package com.Assignments2;

import java.util.Date;

public class ImmutableClass
{
 
    private final Integer immutableField1;
 
    private final String immutableField2;
 
    private ImmutableClass(Integer fld1, String fld2)
    {
        this.immutableField1 = fld1;
        this.immutableField2 = fld2;
    }
 
    public static ImmutableClass createNewInstance(Integer fld1, String fld2)
    {
        return new ImmutableClass(fld1, fld2);
    }
 
    public Integer getImmutableField1() {
        return immutableField1;
    }
    public String getImmutableField2() {
        return immutableField2;
    }

	@Override
	public String toString() {
		return "ImmutableClass [immutableField1=" + immutableField1 + ", immutableField2=" + immutableField2 + "]";
	}
}