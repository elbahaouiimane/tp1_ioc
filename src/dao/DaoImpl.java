package dao;

public class DaoImpl implements IDao {
    @Override
    public double GetData() {
        /*
        se connecter a la BD
         */
        System.out.println("versionbd");
        double temp=Math.random()*40;
        return temp;
    }
}
