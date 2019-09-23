package com.github.srivassumit.protobuf;

import example.complex.Complex.ComplexMessage;
import example.complex.Complex.DummyMessage;

import java.util.Arrays;

public class ComplexMain {

    public static void main(String[] args) {
        System.out.println("Complex Example");
        DummyMessage oneDummy = newDummyMessage("Name", 32);

        ComplexMessage.Builder builder = ComplexMessage.newBuilder();

        builder.setOneDummy(oneDummy);

        builder.addMultipleDummy(newDummyMessage("John", 12));
        builder.addMultipleDummy(newDummyMessage("Tim", 89));
        builder.addMultipleDummy(newDummyMessage("Mike", 432));

        builder.addAllMultipleDummy(Arrays.asList(newDummyMessage("Alice", 456), newDummyMessage("Gina", 64)));

        ComplexMessage message = builder.build();

        System.out.println(message.toString());
    }

    private static DummyMessage newDummyMessage(String name, Integer id) {
        DummyMessage.Builder builder = DummyMessage.newBuilder();
        DummyMessage message = builder.setName(name).setId(id).build();
        return message;
    }
}
