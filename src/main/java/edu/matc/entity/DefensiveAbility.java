package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "defensive_abilities", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(DefensiveAbilityPK.class)
public class DefensiveAbility {
    private String name;
    private String ability;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "ability")
    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DefensiveAbility that = (DefensiveAbility) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (ability != null ? !ability.equals(that.ability) : that.ability != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (ability != null ? ability.hashCode() : 0);
        return result;
    }
}
