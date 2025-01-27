package com.jad;

public class Corge implements ICorge {
    private IFoo foo;

    public Corge(Foo foo) {
        this.foo = foo;
    }

    @Override
    public IFoo getFoo() {
        return this.foo;
    }

    @Override
    public void setFoo(IFoo foo) {
        this.foo = foo;
    }
}
