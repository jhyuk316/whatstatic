package com.tutorial.whatstatic.config;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import com.tutorial.whatstatic.util.CountUtil;

public class CountAppender extends AppenderBase<ILoggingEvent> {

    @Override
    protected void append(ILoggingEvent eventObject) {
        if(eventObject.getLevel() == Level.ERROR) {
            int i = CountUtil.increaseCount();
            System.out.println("Error Count = " + i);
        }
    }
}
