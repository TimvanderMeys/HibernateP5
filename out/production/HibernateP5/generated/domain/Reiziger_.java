package domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Reiziger.class)
public abstract class Reiziger_ {

	public static volatile SingularAttribute<Reiziger, String> achternaam;
	public static volatile SingularAttribute<Reiziger, Integer> reizigerid;
	public static volatile SingularAttribute<Reiziger, String> voorletters;
	public static volatile SingularAttribute<Reiziger, String> tussenvoegsel;
	public static volatile ListAttribute<Reiziger, OVchipkaart> ov_chipkaart;
	public static volatile SingularAttribute<Reiziger, Date> gebortedatum;

	public static final String ACHTERNAAM = "achternaam";
	public static final String REIZIGERID = "reizigerid";
	public static final String VOORLETTERS = "voorletters";
	public static final String TUSSENVOEGSEL = "tussenvoegsel";
	public static final String OV_CHIPKAART = "ov_chipkaart";
	public static final String GEBORTEDATUM = "gebortedatum";

}

