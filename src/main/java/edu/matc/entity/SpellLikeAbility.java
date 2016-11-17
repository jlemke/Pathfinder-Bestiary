package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "spell_like_abilities", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(SpellLikeAbilityPK.class)
public class SpellLikeAbility {
    private String name;
    private String ability;
    private String timesPerDay;

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

    @Basic
    @Column(name = "times_per_day")
    public String getTimesPerDay() {
        return timesPerDay;
    }

    public void setTimesPerDay(String timesPerDay) {
        this.timesPerDay = timesPerDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpellLikeAbility that = (SpellLikeAbility) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (ability != null ? !ability.equals(that.ability) : that.ability != null) return false;
        if (timesPerDay != null ? !timesPerDay.equals(that.timesPerDay) : that.timesPerDay != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (ability != null ? ability.hashCode() : 0);
        result = 31 * result + (timesPerDay != null ? timesPerDay.hashCode() : 0);
        return result;
    }
}
