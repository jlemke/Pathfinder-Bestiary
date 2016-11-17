package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Joe on 11/16/2016.
 */
public class PreparedSpellPK implements Serializable {
    private String name;
    private String spell;

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "spell")
    @Id
    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PreparedSpellPK that = (PreparedSpellPK) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (spell != null ? !spell.equals(that.spell) : that.spell != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (spell != null ? spell.hashCode() : 0);
        return result;
    }
}
