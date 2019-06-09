package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name ="REIZIGER")
public class Reiziger {
    @Id
    private int reizigerid;

    @Column
    private String voorletters;

    @Column
    private String tussenvoegsel;

    @Column
    private String achternaam;

    @Column
    private Date gebortedatum;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "reiziger")
    private List<OVchipkaart> ov_chipkaart;

    public Reiziger() {}

    public Reiziger(int reizigerid, String voorletters, String tussenvoegsel, String achternaam, Date gebortedatum) {
        this.reizigerid = reizigerid;
        this.voorletters = voorletters;
        this.tussenvoegsel = tussenvoegsel;
        this.achternaam = achternaam;
        this.gebortedatum = gebortedatum;
    }

        public void addOvChipKaarten(OVchipkaart oVchipkaart) { this.ov_chipkaart.add(oVchipkaart); }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        getOv_chipkaart().forEach(p -> builder.append(p.getKaartNummer()).append(", "));


        return "Reiziger{" +
                "reizigerid=" + reizigerid +
                ", voorletters='" + voorletters + '\'' +
                ", tussenvoegsel='" + tussenvoegsel + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", gebortedatum=" + gebortedatum +
                ", ovChipKaarten=" + builder +
                '}';
    }
}
