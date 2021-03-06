package com.wmbest.jenesis.m68k.instructions;

import com.wmbest.jenesis.m68k.*;

public class ANDItoCCR extends AndI {

    public void setup(int value) {
        super.setup(value);
        size = BYTE;
    }

    @Override
    public void handle() {
        cpu.setCCR(cpu.getCCR() & (int) data);
    }
}
