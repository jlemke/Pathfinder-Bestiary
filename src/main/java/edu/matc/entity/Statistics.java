package edu.matc.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "statistics")
@SecondaryTables({
        @SecondaryTable(name="feats", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="skills", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="racial_modifiers", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="languages", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="special_qualities", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="gear", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") })
})
public class Statistics {
    private String name;
    private Integer strength;
    private Integer dexterity;
    private Integer constitution;
    private Integer intelligence;
    private Integer wisdom;
    private Integer charisma;
    private Integer baseAttack;
    private Integer cmb;
    private Integer cmd;

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "feats")
    public List<Feat> getFeats() {
        return feats;
    }

    public void setFeats(List<Feat> feats) {
        this.feats = feats;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "skills")
    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "racial_modifiers")
    public List<RacialModifier> getRacialModifiers() {
        return racialModifiers;
    }

    public void setRacialModifiers(List<RacialModifier> racialModifiers) {
        this.racialModifiers = racialModifiers;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "special_qualities")
    public List<SpecialQuality> getSpecialQualities() {
        return specialQualities;
    }

    public void setSpecialQualities(List<SpecialQuality> specialQualities) {
        this.specialQualities = specialQualities;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "gear")
    public List<Gear> getGear() {
        return gear;
    }

    public void setGear(List<Gear> gear) {
        this.gear = gear;
    }

    private List<Feat> feats;
    private List<Skill> skills;
    private List<RacialModifier> racialModifiers;
    private List<SpecialQuality> specialQualities;
    private List<Gear> gear;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "strength")
    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    @Basic
    @Column(name = "dexterity")
    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    @Basic
    @Column(name = "constitution")
    public Integer getConstitution() {
        return constitution;
    }

    public void setConstitution(Integer constitution) {
        this.constitution = constitution;
    }

    @Basic
    @Column(name = "intelligence")
    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    @Basic
    @Column(name = "wisdom")
    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }

    @Basic
    @Column(name = "charisma")
    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    @Basic
    @Column(name = "base_attack")
    public Integer getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(Integer baseAttack) {
        this.baseAttack = baseAttack;
    }

    @Basic
    @Column(name = "cmb")
    public Integer getCmb() {
        return cmb;
    }

    public void setCmb(Integer cmb) {
        this.cmb = cmb;
    }

    @Basic
    @Column(name = "cmd")
    public Integer getCmd() {
        return cmd;
    }

    public void setCmd(Integer cmd) {
        this.cmd = cmd;
    }

}
