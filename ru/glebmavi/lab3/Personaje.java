package ru.glebmavi.lab3;

import java.util.ArrayList;

public abstract class Personaje implements Die {
    protected String name;
    protected ArrayList<Characteristic> como;

    public Personaje() {
        this.name = "Безымянный";
        this.como = new ArrayList<Characteristic>();
    }
    public Personaje(String name) {
        this();
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void addComo(Characteristic c) {
        this.como.add(c);
    }

    public ArrayList getComo() {
        return como;
    }
    public String getComoTitles() {
        if (como == null || como.isEmpty()) {
            return "без характеристик";
        }
        String ret = "";
        for (Characteristic c : como) {
            ret = ret + " " + c.getTitle();
        }
        return ret;
    }

    @Override
    public void die() {
        this.addComo(Characteristic.DED);
        System.out.println(getName() + " Умер :(");
    }


}
