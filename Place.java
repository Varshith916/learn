class Park  {
    void location()
    {
        System.out.println("location is:");
    }
    void famous()
    {
        System.out.println("famous is:");
    }
}
class MysoreextendPark {
    void location()
    {
        System.out.println("in karnataka");
    }
    void famous()
    {
        System.out.println("the mysore is beautiful");
    }
}
class MandyaextendPark {
    void location()
    {
        System.out.println("in karnataka");
    }
    void famous()
    {
        System.out.println("the Mandya is beautiful");
    }
}    
public class Place{
    public static void main(String args [])
    {
        Park obj= new Park();
        Mysore M  = new Mysore();
        Mandya Ma = new Mandya();
        obj.location();
        obj.famous();
        M.location();
        M.famous();
        Ma.location();
        Ma.famous();

    }
}