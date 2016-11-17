package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "racial_modifiers", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(RacialModifierPK.class)
public class RacialModifier {
    private String name;
    private String modifier;
    private Integer bonus;
    private String additionalEffects;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "modifier")
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Basic
    @Column(name = "bonus")
    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    @Basic
    @Column(name = "additional_effects")
    public String getAdditionalEffects() {
        return additionalEffects;
    }

    public void setAdditionalEffects(String additionalEffects) {
        this.additionalEffects = additionalEffects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RacialModifier that = (RacialModifier) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (modifier != null ? !modifier.equals(that.modifier) : that.modifier != null) return false;
        if (bonus != null ? !bonus.equals(that.bonus) : that.bonus != null) return false;
        if (additionalEffects != null ? !additionalEffects.equals(that.additionalEffects) : that.additionalEffects != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (modifier != null ? modifier.hashCode() : 0);
        result = 31 * result + (bonus != null ? bonus.hashCode() : 0);
        result = 31 * result + (additionalEffects != null ? additionalEffects.hashCode() : 0);
        return result;
    }
}
