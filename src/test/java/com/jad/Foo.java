package com.jad;

import java.util.ArrayList;

public class Foo implements IFoo {
    private final IQux qux;
    private IBaz baz;
    private ArrayList<IBar> bars = new ArrayList<>();
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
        this.qux = new Qux();
    }

    public void addBar(IBar bar) {
        this.bars.add(bar);
    }

    @Override
    public ICorge getCorge() {
        return this.corge;
    }

    @Override
    public void setCorge(ICorge corge) {
        this.corge = corge;
    }

    public IQux getQux() {
        return this.qux;
    }

    public ArrayList<IBar> getBars() {
        return this.bars;
    }

    public void setBars(ArrayList<IBar> bars) {
        this.bars = bars;
    }
}
