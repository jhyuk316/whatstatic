package com.tutorial.whatstatic.config;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.fasterxml.jackson.core.JsonGenerator;
import com.tutorial.whatstatic.util.CountUtil;
import net.logstash.logback.composite.AbstractJsonProvider;

import java.io.IOException;

public class JsonProvider extends AbstractJsonProvider<ILoggingEvent> {
    @Override
    public void writeTo(JsonGenerator generator, ILoggingEvent iLoggingEvent) throws IOException {
        if(iLoggingEvent.getLevel() == Level.ERROR) {
            int i = CountUtil.increaseCount();
            System.out.println("Error Count = " + i);
        }
    }
}
