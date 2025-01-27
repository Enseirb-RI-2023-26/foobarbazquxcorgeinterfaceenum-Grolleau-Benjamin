package com.jad;

public interface IFoo {

    public ICorge getCorge();

    public void setCorge(ICorge corge);

    // Only there because I need 3 functions and I don't understand which one is the last one
    // to implement in this interface so fill it to avoid warning
    public IQux getQux();
}
