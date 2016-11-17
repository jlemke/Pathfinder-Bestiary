package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "attacks", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(AttackPK.class)
public class Attack {
    private String name;
    private String attack;
    private String type;
    private Integer bonusFirst;
    private Integer bonusSecond;
    private Integer bonusThird;
    private String damage;
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
    @Column(name = "attack")
    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
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
    @Column(name = "bonus_first")
    public Integer getBonusFirst() {
        return bonusFirst;
    }

    public void setBonusFirst(Integer bonusFirst) {
        this.bonusFirst = bonusFirst;
    }

    @Basic
    @Column(name = "bonus_second")
    public Integer getBonusSecond() {
        return bonusSecond;
    }

    public void setBonusSecond(Integer bonusSecond) {
        this.bonusSecond = bonusSecond;
    }

    @Basic
    @Column(name = "bonus_third")
    public Integer getBonusThird() {
        return bonusThird;
    }

    public void setBonusThird(Integer bonusThird) {
        this.bonusThird = bonusThird;
    }

    @Basic
    @Column(name = "damage")
    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
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

        Attack attack1 = (Attack) o;

        if (name != null ? !name.equals(attack1.name) : attack1.name != null) return false;
        if (attack != null ? !attack.equals(attack1.attack) : attack1.attack != null) return false;
        if (type != null ? !type.equals(attack1.type) : attack1.type != null) return false;
        if (bonusFirst != null ? !bonusFirst.equals(attack1.bonusFirst) : attack1.bonusFirst != null) return false;
        if (bonusSecond != null ? !bonusSecond.equals(attack1.bonusSecond) : attack1.bonusSecond != null) return false;
        if (bonusThird != null ? !bonusThird.equals(attack1.bonusThird) : attack1.bonusThird != null) return false;
        if (damage != null ? !damage.equals(attack1.damage) : attack1.damage != null) return false;
        if (additionalEffects != null ? !additionalEffects.equals(attack1.additionalEffects) : attack1.additionalEffects != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (attack != null ? attack.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (bonusFirst != null ? bonusFirst.hashCode() : 0);
        result = 31 * result + (bonusSecond != null ? bonusSecond.hashCode() : 0);
        result = 31 * result + (bonusThird != null ? bonusThird.hashCode() : 0);
        result = 31 * result + (damage != null ? damage.hashCode() : 0);
        result = 31 * result + (additionalEffects != null ? additionalEffects.hashCode() : 0);
        return result;
    }
}
