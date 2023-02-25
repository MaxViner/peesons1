public class marksman extends range_attakers{



    public marksman(String name_class,String name,Integer Type_of_damage,Integer damage, Integer hit_point,Integer Endurance,
                          Integer Parrying,Integer Ph_Immunity,Integer M_Immunity, Integer bullet, Integer accuracy)
    {
        super(name_class,name,damage,hit_point,Endurance,Parrying,Ph_Immunity,M_Immunity,Type_of_damage,bullet,accuracy);

    }
    public marksman(String name){
        super("снипель",name,250,125,1,100,20,10,5,15,96);
        super.name=name;

    }

    @Override
    public void get_info() {
        super.get_info();
    }
}
