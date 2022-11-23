package ru.glebmavi.lab3;

public class Storychar extends Personaje{

    String info = "Нет информации";

    public Storychar(){
        super();
    }
    public Storychar(String name){
        super(name);
    }

    public Storychar(String name, String info){
        super(name);
        this.info = info;
    }

    @Override
    public String toString() {
        return this.getClass() + " {" + "name = '" + name + '\'' + ", como = " + this.getComoTitles() + ", info = " + info + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Storychar comp = (Storychar) obj;
        return name.equals(comp.name) && como.equals(comp.como) && info.equals(comp.info);

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
        if (info != null) {
            result = 13 * result + info.hashCode();
        }
        return result;
    }

}
