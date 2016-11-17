package edu.matc.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "offense")
@SecondaryTables({
        @SecondaryTable(name="attacks", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="speeds", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="special_attacks", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="spell_like_abilities", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="prepared_spells", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") })
})
public class Offense {
    private String name;
    private String space;
    private String reach;
    private Integer casterLevel;
    private Integer concentrationBonus;
    private List<Attack> attacks;
    private List<Speed> speeds;
    private List<SpecialAttack> specialAttacks;
    private List<SpellLikeAbility> spellLikeAbilities;
    private List<PreparedSpell> preparedSpells;

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "attacks")
    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "speeds")
    public List<Speed> getSpeeds() {
        return speeds;
    }

    public void setSpeeds(List<Speed> speeds) {
        this.speeds = speeds;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "special_attacks")
    public List<SpecialAttack> getSpecialAttacks() {
        return specialAttacks;
    }

    public void setSpecialAttacks(List<SpecialAttack> specialAttacks) {
        this.specialAttacks = specialAttacks;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "spell_like_abilities")
    public List<SpellLikeAbility> getSpellLikeAbilities() {
        return spellLikeAbilities;
    }

    public void setSpellLikeAbilities(List<SpellLikeAbility> spellLikeAbilities) {
        this.spellLikeAbilities = spellLikeAbilities;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "prepared_spells")
    public List<PreparedSpell> getPreparedSpells() {
        return preparedSpells;
    }

    public void setPreparedSpells(List<PreparedSpell> preparedSpells) {
        this.preparedSpells = preparedSpells;
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
    @Column(name = "space")
    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    @Basic
    @Column(name = "reach")
    public String getReach() {
        return reach;
    }

    public void setReach(String reach) {
        this.reach = reach;
    }

    @Basic
    @Column(name = "caster_level")
    public Integer getCasterLevel() {
        return casterLevel;
    }

    public void setCasterLevel(Integer casterLevel) {
        this.casterLevel = casterLevel;
    }

    @Basic
    @Column(name = "concentration_bonus")
    public Integer getConcentrationBonus() {
        return concentrationBonus;
    }

    public void setConcentrationBonus(Integer concentrationBonus) {
        this.concentrationBonus = concentrationBonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Offense offense = (Offense) o;

        if (name != null ? !name.equals(offense.name) : offense.name != null) return false;
        if (space != null ? !space.equals(offense.space) : offense.space != null) return false;
        if (reach != null ? !reach.equals(offense.reach) : offense.reach != null) return false;
        if (casterLevel != null ? !casterLevel.equals(offense.casterLevel) : offense.casterLevel != null) return false;
        if (concentrationBonus != null ? !concentrationBonus.equals(offense.concentrationBonus) : offense.concentrationBonus != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (space != null ? space.hashCode() : 0);
        result = 31 * result + (reach != null ? reach.hashCode() : 0);
        result = 31 * result + (casterLevel != null ? casterLevel.hashCode() : 0);
        result = 31 * result + (concentrationBonus != null ? concentrationBonus.hashCode() : 0);
        return result;
    }
}
