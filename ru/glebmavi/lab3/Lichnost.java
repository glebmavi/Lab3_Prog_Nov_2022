package ru.glebmavi.lab3;

public class Lichnost extends Personaje implements Killer{

    private int killcount = 0;

    public Lichnost(){
        super();
    }
    public Lichnost(String name){
        super(name);
    }

    @Override
    public int getKillcount() {
        return killcount;
    }

    @Override
    public void kill(Personaje p) {
        p.die();
        this.killcount++;
        System.out.println(getName() + " Убил " + p.getName());
    }

    @Override
    public String toString() {
        return this.getClass() + " {" + "name = '" + name + '\'' + ", como = " + this.getComoTitles() + ", killcount = " + killcount +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Lichnost comp = (Lichnost) obj;
        return this.killcount == ((Lichnost) obj).killcount && name.equals(comp.name) && como.equals(comp.como);

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
        result += killcount;
        return result;
    }
}
