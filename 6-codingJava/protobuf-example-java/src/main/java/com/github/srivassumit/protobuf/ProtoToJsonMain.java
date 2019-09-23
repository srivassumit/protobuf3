package com.github.srivassumit.protobuf;

import com.google.protobuf.util.JsonFormat;
import example.simple.Simple.SimpleMessage;

import java.util.Arrays;

public class ProtoToJsonMain {

    public static void main(String[] args) throws Exception {

        SimpleMessage.Builder builder = SimpleMessage.newBuilder();

        builder.setId(42)
                .setIsSimple(true)
                .setName("My Simple Message Name");

        builder.addSampleList(1)
                .addSampleList(2)
                .addSampleList(3);

        //add a list
        builder.addAllSampleList(Arrays.asList(4, 5, 6));


        // ProtoBuf to JSON (not recommended doing on PROD... only for debug)
        String jsonString = JsonFormat.printer().includingDefaultValueFields().omittingInsignificantWhitespace()
                .print(builder);
        System.out.println(jsonString);

        // Parse json to ProtoBuf (not recommended doing on PROD... only for debug)
        SimpleMessage.Builder builder2 = SimpleMessage.newBuilder();

        JsonFormat.parser().ignoringUnknownFields().merge(jsonString, builder2);

        System.out.println(builder2.toString());
    }
}
