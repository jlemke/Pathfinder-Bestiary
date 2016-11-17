package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Joe on 11/16/2016.
 */
public class SpecialAttackPK implements Serializable {
    private String name;
    private String attack;

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "attack")
    @Id
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

        SpecialAttackPK that = (SpecialAttackPK) o;

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
