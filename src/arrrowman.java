public class arrrowman extends range_attakers{

    public arrrowman(String name_class,String name,Integer Type_of_damage,Integer damage, Integer hit_point,Integer Endurance,
                    Integer Parrying,Integer Ph_Immunity,Integer M_Immunity, Integer bullet, Integer accuracy,Integer speed)
    {
        super(name_class,name,damage,hit_point,Endurance,Parrying,Ph_Immunity,M_Immunity,Type_of_damage,bullet,accuracy,speed);

    }
    public arrrowman(String name){
        super("арбалетор",name,250,100,1,150,
                5,20,20,30,72,55);
        super.name=name;

    }

    @Override
    public String get_info() {
        return ("я - стреляю точно в цель "+name_of_class+" "+name);

    }
}
