package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Joe on 11/16/2016.
 */
public class SkillPK implements Serializable {
    private String name;
    private String skill;

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "skill")
    @Id
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SkillPK skillPK = (SkillPK) o;

        if (name != null ? !name.equals(skillPK.name) : skillPK.name != null) return false;
        if (skill != null ? !skill.equals(skillPK.skill) : skillPK.skill != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (skill != null ? skill.hashCode() : 0);
        return result;
    }
}
