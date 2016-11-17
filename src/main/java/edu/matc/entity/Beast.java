package edu.matc.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Joe on 11/16/2016.
 */

@Entity
@Table(name = "beasts")
@SecondaryTables({
        @SecondaryTable(name="auras", pkJoinColumns={
            @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="defense", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="ecology", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="offense", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="statistics", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="senses", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="subtypes", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") })
})
public class Beast {

    private String name;
    private String variantGroup;
    private String description;
    private Integer cr;
    private Integer xp;
    private String gender;
    private String race;
    private String npcClass;
    private String alignment;
    private String size;
    private String type;
    private Integer init;
    private Integer perception;

    private List<Aura> auras;
    private Defense defense;
    private Ecology ecology;
    private Offense offense;
    private List<Sense> senses;
    private List<Subtype> subtypes;
    private Statistics statistics;

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "auras")
    public List<Aura> getAuras() {
        return auras;
    }

    public void setAuras(List<Aura> auras) {
        this.auras = auras;
    }


    @OneToOne
    @JoinColumn(name = "name")
    public Defense getDefense() {
        return defense;
    }

    public void setDefense(Defense defense) {
        this.defense = defense;
    }

    @OneToOne
    @JoinColumn(name = "name")
    public Ecology getEcology() {
        return ecology;
    }

    public void setEcology(Ecology ecology) {
        this.ecology = ecology;
    }

    @OneToOne
    @JoinColumn(name = "name")
    public Offense getOffense() {
        return offense;
    }

    public void setOffense(Offense offense) {
        this.offense = offense;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "senses")
    public List<Sense> getSenses() {
        return senses;
    }

    public void setSenses(List<Sense> senses) {
        this.senses = senses;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "subtypes")
    public List<Subtype> getSubtypes() {
        return subtypes;
    }

    public void setSubtypes(List<Subtype> subtypes) {
        this.subtypes = subtypes;
    }

    @OneToOne
    @JoinColumn(name = "name")
    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
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
    @Column(name = "variant_group")
    public String getVariantGroup() {
        return variantGroup;
    }

    public void setVariantGroup(String variantGroup) {
        this.variantGroup = variantGroup;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "cr")
    public Integer getCr() {
        return cr;
    }

    public void setCr(Integer cr) {
        this.cr = cr;
    }

    @Basic
    @Column(name = "xp")
    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "race")
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Basic
    @Column(name = "npc_class")
    public String getNpcClass() {
        return npcClass;
    }

    public void setNpcClass(String npcClass) {
        this.npcClass = npcClass;
    }

    @Basic
    @Column(name = "alignment")
    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    @Basic
    @Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
    @Column(name = "init")
    public Integer getInit() {
        return init;
    }

    public void setInit(Integer init) {
        this.init = init;
    }

    @Basic
    @Column(name = "perception")
    public Integer getPerception() {
        return perception;
    }

    public void setPerception(Integer perception) {
        this.perception = perception;
    }

}
