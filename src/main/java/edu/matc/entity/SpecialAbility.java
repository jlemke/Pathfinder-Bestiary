package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "special_abilities", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(SpecialAbilityPK.class)
public class SpecialAbility {
    private String name;
    private String ability;
    private String type;
    private String description;

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
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpecialAbility that = (SpecialAbility) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (ability != null ? !ability.equals(that.ability) : that.ability != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (ability != null ? ability.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
