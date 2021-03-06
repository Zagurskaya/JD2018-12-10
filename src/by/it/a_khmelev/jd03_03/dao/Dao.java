package by.it.a_khmelev.jd03_03.dao;

public class Dao {

    private volatile static Dao dao;

    public RoleDao role;
    public UserDao user;
    public AdDao ad;

    private Dao() {
        role=new RoleDao();
        user=new UserDao();
        ad=new AdDao();
    }

    public static Dao getDao(){
        if (dao==null) {
            synchronized (Dao.class){
                if (dao==null)
                    dao=new Dao();
            }
        }
        return dao;
    }
}
