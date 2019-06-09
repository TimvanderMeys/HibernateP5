import dao.*;
import domain.OVchipkaart;
import domain.Reiziger;

public class Main {
    public static void main(String[] args) {
        HibernateUtil.buildSessionFactory();
        ReizigerDao reizigerDao = new ReizigerDaoJpaImpl();
        OVchipkaartDao oVchipkaartDao = new OVchipkaartDaoJpaImpl();

        System.out.println("REIZIGER GET BY ID");
        Reiziger reiziger = reizigerDao.findById(7);
        System.out.println("Reiziger: "  + reiziger.toString());

        System.out.println("REIZIGER UPDATE");
        reiziger.setAchternaam("Test");
        reizigerDao.update(reiziger);

        System.out.println("REIZIGER CREATE");
        Reiziger reiziger1 = new Reiziger(20, "Bert", "De", "Haan", reiziger.getGebortedatum());
        reizigerDao.insert(reiziger1);

        System.out.println("REIZIGER DELETE");
        reizigerDao.delete(reiziger1);

        System.out.println("---------------------");

        System.out.println("OVCHIPKAART GET BY ID");
        OVchipkaart oVchipkaart = oVchipkaartDao.findById(57404);
        System.out.println("OVchipkaart: " + oVchipkaart);

        System.out.println("OVCHIPKAART UPDATE");
        oVchipkaart.setSaldo(100);
        oVchipkaartDao.update(oVchipkaart);

        System.out.println("OVCHIPKAART CREATE");
        OVchipkaart oVchipkaart1 = new OVchipkaart(123456, oVchipkaart.getGeldigTot(), 1, 100, reiziger);
        oVchipkaartDao.insert(oVchipkaart1);

        System.out.println("OVCHIPKAART DELETE");
        oVchipkaartDao.delete(oVchipkaart1);

    }

}

