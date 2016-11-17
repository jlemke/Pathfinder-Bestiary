package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "skills", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(SkillPK.class)
public class Skill {
    private String name;
    private String skill;
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
    @Column(name = "skill")
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
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

        Skill skill1 = (Skill) o;

        if (name != null ? !name.equals(skill1.name) : skill1.name != null) return false;
        if (skill != null ? !skill.equals(skill1.skill) : skill1.skill != null) return false;
        if (bonus != null ? !bonus.equals(skill1.bonus) : skill1.bonus != null) return false;
        if (additionalEffects != null ? !additionalEffects.equals(skill1.additionalEffects) : skill1.additionalEffects != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (skill != null ? skill.hashCode() : 0);
        result = 31 * result + (bonus != null ? bonus.hashCode() : 0);
        result = 31 * result + (additionalEffects != null ? additionalEffects.hashCode() : 0);
        return result;
    }
}
