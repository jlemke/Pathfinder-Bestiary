package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Joe on 11/16/2016.
 */
public class RacialModifierPK implements Serializable {
    private String name;
    private String modifier;

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "modifier")
    @Id
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RacialModifierPK that = (RacialModifierPK) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (modifier != null ? !modifier.equals(that.modifier) : that.modifier != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (modifier != null ? modifier.hashCode() : 0);
        return result;
    }
}
