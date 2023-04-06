package org.javarush.oleksandr.singletonExample;

public enum President {
    INSTANCE("Test name");

    private final String  name;

    President(String name) {
        this.name = name;
    }

    public static President getInstance(){
        return INSTANCE;
    }

    public String getName() {
        return name;
    }
}
