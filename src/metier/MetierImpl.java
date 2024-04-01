package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.GetData();
        double res=tmp*50;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
