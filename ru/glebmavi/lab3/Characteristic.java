package ru.glebmavi.lab3;

public enum Characteristic {
    DUB("Дуботолк"),
    HAB("Способный"),
    TAL("Талантливый"),
    DED("Мёртвый"),
    OTH("Другой");

    private final String title;

    Characteristic(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
