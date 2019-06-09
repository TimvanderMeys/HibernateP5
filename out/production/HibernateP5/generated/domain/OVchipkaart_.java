package domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OVchipkaart.class)
public abstract class OVchipkaart_ {

	public static volatile SingularAttribute<OVchipkaart, Integer> klasse;
	public static volatile SingularAttribute<OVchipkaart, Date> geldigTot;
	public static volatile SingularAttribute<OVchipkaart, Float> saldo;
	public static volatile SingularAttribute<OVchipkaart, Integer> kaartNummer;
	public static volatile SingularAttribute<OVchipkaart, Reiziger> reiziger;

	public static final String KLASSE = "klasse";
	public static final String GELDIG_TOT = "geldigTot";
	public static final String SALDO = "saldo";
	public static final String KAART_NUMMER = "kaartNummer";
	public static final String REIZIGER = "reiziger";

}

