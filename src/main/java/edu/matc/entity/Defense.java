package edu.matc.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "defense")
@SecondaryTables({
        @SecondaryTable(name="armor_bonuses", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="defensive_abilities", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="weaknesses", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") })
})
public class Defense {
    private String name;
    private Integer ac;
    private Integer touch;
    private Integer flatFooted;
    private Integer hp;
    private String hpRoll;
    private Integer fort;
    private Integer ref;
    private Integer will;
    private List<ArmorBonus> armorBonuses;
    private List<DefensiveAbility> defensiveAbilities;
    private List<Weakness> weaknesses;

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "armor_bonuses")
    public List<ArmorBonus> getArmorBonuses() {
        return armorBonuses;
    }

    public void setArmorBonuses(List<ArmorBonus> armorBonuses) {
        this.armorBonuses = armorBonuses;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "defensive_abilities")
    public List<DefensiveAbility> getDefensiveAbilities() {
        return defensiveAbilities;
    }

    public void setDefensiveAbilities(List<DefensiveAbility> defensiveAbilities) {
        this.defensiveAbilities = defensiveAbilities;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "weaknesses")
    public List<Weakness> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<Weakness> weaknesses) {
        this.weaknesses = weaknesses;
    }


    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "ac")
    public Integer getAc() {
        return ac;
    }

    public void setAc(Integer ac) {
        this.ac = ac;
    }

    @Basic
    @Column(name = "touch")
    public Integer getTouch() {
        return touch;
    }

    public void setTouch(Integer touch) {
        this.touch = touch;
    }

    @Basic
    @Column(name = "flat_footed")
    public Integer getFlatFooted() {
        return flatFooted;
    }

    public void setFlatFooted(Integer flatFooted) {
        this.flatFooted = flatFooted;
    }

    @Basic
    @Column(name = "hp")
    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    @Basic
    @Column(name = "hp_roll")
    public String getHpRoll() {
        return hpRoll;
    }

    public void setHpRoll(String hpRoll) {
        this.hpRoll = hpRoll;
    }

    @Basic
    @Column(name = "fort")
    public Integer getFort() {
        return fort;
    }

    public void setFort(Integer fort) {
        this.fort = fort;
    }

    @Basic
    @Column(name = "ref")
    public Integer getRef() {
        return ref;
    }

    public void setRef(Integer ref) {
        this.ref = ref;
    }

    @Basic
    @Column(name = "will")
    public Integer getWill() {
        return will;
    }

    public void setWill(Integer will) {
        this.will = will;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Defense defense = (Defense) o;

        if (name != null ? !name.equals(defense.name) : defense.name != null) return false;
        if (ac != null ? !ac.equals(defense.ac) : defense.ac != null) return false;
        if (touch != null ? !touch.equals(defense.touch) : defense.touch != null) return false;
        if (flatFooted != null ? !flatFooted.equals(defense.flatFooted) : defense.flatFooted != null) return false;
        if (hp != null ? !hp.equals(defense.hp) : defense.hp != null) return false;
        if (hpRoll != null ? !hpRoll.equals(defense.hpRoll) : defense.hpRoll != null) return false;
        if (fort != null ? !fort.equals(defense.fort) : defense.fort != null) return false;
        if (ref != null ? !ref.equals(defense.ref) : defense.ref != null) return false;
        if (will != null ? !will.equals(defense.will) : defense.will != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (ac != null ? ac.hashCode() : 0);
        result = 31 * result + (touch != null ? touch.hashCode() : 0);
        result = 31 * result + (flatFooted != null ? flatFooted.hashCode() : 0);
        result = 31 * result + (hp != null ? hp.hashCode() : 0);
        result = 31 * result + (hpRoll != null ? hpRoll.hashCode() : 0);
        result = 31 * result + (fort != null ? fort.hashCode() : 0);
        result = 31 * result + (ref != null ? ref.hashCode() : 0);
        result = 31 * result + (will != null ? will.hashCode() : 0);
        return result;
    }
}
