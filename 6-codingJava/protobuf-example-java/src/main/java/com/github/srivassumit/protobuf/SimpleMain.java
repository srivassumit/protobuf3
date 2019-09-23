package com.github.srivassumit.protobuf;

import example.simple.Simple.SimpleMessage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SimpleMessage.Builder builder = SimpleMessage.newBuilder();

//        builder.setId(42);
//        builder.setIsSimple(true);
//        builder.setName("My Simple Message Name");

        // method calls can be chained.
        builder.setId(42)
                .setIsSimple(true)
                .setName("My Simple Message Name");

        //repeated fields
        //add one at a time
        builder.addSampleList(1)
                .addSampleList(2)
                .addSampleList(3);

        //add a list
        builder.addAllSampleList(Arrays.asList(1, 2, 3));
        //clear the list
        builder.clearSampleList();

        System.out.print(builder.toString());

        SimpleMessage message = builder.build();

        message.getId();
        message.getName();

        //write protobuf binary to a file.
        try {
            FileOutputStream outputStream = new FileOutputStream("simple_message.bin");
            message.writeTo(outputStream);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //send message as a byte stream
//        byte[] bytes = message.toByteArray();

        try {
            FileInputStream inputStream = new FileInputStream("simple_message.bin");
            SimpleMessage messageFromFile = SimpleMessage.parseFrom(inputStream);
            System.out.println(messageFromFile);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
