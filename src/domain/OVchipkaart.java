package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name ="OV_CHIPKAART")
public class OVchipkaart {
    @Id
    private int kaartNummer;

    @Column
    private Date geldigTot;

    @Column
    private int klasse;

    @Column
    private float saldo;

    @ManyToOne()
    @JoinColumn(name="reizigerId")
    private Reiziger reiziger;


    public OVchipkaart() {}

    public OVchipkaart(int kaartNummer, Date geldigTot, int klasse, float saldo, Reiziger reiziger) {
        this.kaartNummer = kaartNummer;
        this.geldigTot = geldigTot;
        this.klasse = klasse;
        this.saldo = saldo;
        this.reiziger = reiziger;
    }

    @Override
    public String toString() {
        return "OVchipkaart{" +
                "kaartNummer=" + kaartNummer +
                ", geldigTot=" + geldigTot +
                ", klasse=" + klasse +
                ", saldo=" + saldo +
                ", reiziger=" + reiziger +
                '}';
    }
}
