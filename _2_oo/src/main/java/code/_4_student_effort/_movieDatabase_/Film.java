package code._4_student_effort._movieDatabase_;

import code._4_student_effort._movieDatabase_.Actor;

public class Film {
    public final Integer anAparitie;
    public final String nume;
    public final Actor[] actori;
    public Film(Integer anAparitie, String nume, Actor[] actori){
        this.anAparitie=anAparitie;
        this.nume=nume;
        this.actori=actori;
    }
}
