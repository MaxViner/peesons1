public class marksman extends range_attakers{



    public marksman(String name_class,
                    String name,
                    Integer Type_of_damage,
                    Integer damage,
                    Integer hit_point,
                    Integer Endurance,
                          Integer Parrying,
                    Integer Ph_Immunity,
                    Integer M_Immunity,
                    Integer bullet,
                    Integer accuracy, Integer speed, int x, int y,boolean team,String state,
    int max_hp)
    {
        super(name_class,name,Type_of_damage,damage,hit_point,Endurance,Parrying,Ph_Immunity,M_Immunity,
                bullet,accuracy,speed,x,y,team,state, max_hp);

    }
    public marksman(String name,int x,int y){
        super("снипель",name,250,125,1,100,
                20,10,5,15,96,40,x,y,false,Alive, 250);
        super.name=name;
        this.x=x;
        this.y=y;

    }

    @Override
    public String get_info() {
        return ("я - стреляю точно в цель "+name_of_class+" "+name);

    }

}
