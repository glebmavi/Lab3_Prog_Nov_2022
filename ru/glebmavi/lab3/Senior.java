package ru.glebmavi.lab3;

public class Senior extends Personaje implements Talker {

    public Senior(){
        super();
    }
    public Senior(String name){
        super("Господин " + name);
    }

    public void talk(String text) {
        System.out.println(getName() + " сказал \"" + text + "\"");
    }


    @Override
    public String toString() {
        return this.getClass() + " {" + "name = '" + name + '\'' + ", como = " + this.getComoTitles() + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Personaje comp = (Personaje) obj;
        return name.equals(comp.name) && como.equals(comp.como);

    }

    @Override
    public int hashCode() {
        int result = 7;
        if (name != null) {
            result = 13 * result + name.hashCode();
        }
        if (como != null) {
            result = 13 * result + como.hashCode();
        }
        return result;
    }
}
