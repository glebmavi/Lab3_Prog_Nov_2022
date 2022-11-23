import ru.glebmavi.lab3.*;

public class Main {
    public static void main(String[] args) {

        Senior s = new Senior("Спрутс");
        System.out.println(s);
        Senior d = new Senior("Дубе");
        d.addComo(Characteristic.DUB);
        System.out.println(d);

        Lichnost a = new Lichnost("Agent 47");
        a.addComo(Characteristic.HAB);
        a.addComo(Characteristic.TAL);
        System.out.println(a);
        Lichnost b = new Lichnost("Agent 48");
        b.addComo(Characteristic.HAB);
        b.addComo(Characteristic.TAL);
        System.out.println(b);

        Storychar m = new Storychar("Миго");
        Storychar j = new Storychar("Жулио");
        Storychar n = new Storychar("Незнайка");
        Storychar k = new Storychar("Козлик");
        System.out.println(m);
        System.out.println(j);
        System.out.println(n);
        System.out.println(k);


        System.out.println("---");
        s.talk("Моё выступление окончено");
        d.talk("У меня имеются две личности: " + a.getName() + " он" + a.getComoTitles() + " и " + b.getName() + " он" + b.getComoTitles());
        d.talk("Они могут взяться за это дельце и в два счета уберут с дороги " + m.getName() + " и " + j.getName() + ", а заодно и " + n.getName() + " с " + k.getName());
        s.talk("Вы " + d.getName() + ", видимо меня не поняли, так как, говоря о том, что дело надо убить в зародыше, я вовсе не подразумевал, что кого-либо следует убить в буквальном смысле этого слова.");
        System.out.println("---");

        System.out.println("---");
        a.kill(m);
        a.kill(j);
        a.kill(n);
        b.kill(k);
        System.out.println("---");

        System.out.println(a);
        System.out.println(b);

        System.out.println(m);
        System.out.println(j);
        System.out.println(n);
        System.out.println(k);


        System.out.println("---");
        System.out.println("Является ли " + d.getName() + " равный " + s.getName() + "? " + d.equals(s));
        System.out.println("Хешкод " + d.getName() + " " + d.hashCode());
        System.out.println("Хешкод " + s.getName() + " " + s.hashCode());
        System.out.println("---");


    }
}