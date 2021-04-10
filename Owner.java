
package ASSNT2;

/*
 * @author NASIR ALI BALOCH
 */
public class Owner {
    private String owner_name;
    private long owner_CNIC;
    
    public Car c=new Car();   //CREATE OBJECT CAR CLASS
    
    public Mob m=new Mob();   //CREATE OBJECT MOB CLASS
    
    public Owner()               //CONSTRACTOR NUMBER 1
    {
        owner_name="Nasir Ali";
        owner_CNIC=1210184855689L;
    }
    public Owner(String owner_name1,long owner_CNIC1)    //CONSTRACTOR NUMBER 2
    {
        owner_name=owner_name1;
        owner_CNIC=owner_CNIC1;
    }
    public void setOwner_name(String owner_name4)          //SETTER
    {
        owner_name=owner_name4;
    }
    public String getOwner_name(String owner_name7)        //GETTER
    {
    return owner_name;
    }
    public void setOwner_CNIC(long owner_CNIC4)            //SETTER
    {
        owner_CNIC=owner_CNIC4;
    }
    public long getOwner_CNIC(long owner_CNIC0)            //GETTER   
    {
        return owner_CNIC;
    }
   public void showOwner()                                 //FUNCTION 
   {
       System.out.println("owner_name is="+owner_name);
       System.out.println("owner_CNIC is="+owner_CNIC);
   }
    
}
