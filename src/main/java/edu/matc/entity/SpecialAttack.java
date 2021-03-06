package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "special_attacks", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(SpecialAttackPK.class)
public class SpecialAttack {
    private String name;
    private String attack;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "attack")
    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpecialAttack that = (SpecialAttack) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (attack != null ? !attack.equals(that.attack) : that.attack != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (attack != null ? attack.hashCode() : 0);
        return result;
    }
}
