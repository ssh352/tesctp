package com.xceder.ctp.thosttraderapi;

import org.bridj.BridJ;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;
import org.bridj.cpp.CPPRuntime;

@Library("Thosttraderapi")
@Runtime(CPPRuntime.class)
public class ThosttraderapiLibrary {
    static {
        BridJ.register();
    }

    public ThosttraderapiLibrary() {
    }
}
