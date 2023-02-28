public class spearman extends dog_fiters{


    public spearman(String name_of_class,String name, Integer hit_points, Integer Endurance, Integer Parryng,
                    Integer type_of_damage, Integer damage, Integer ph_Immunity,
                    Integer M_imm,Integer speed,int x,int y, boolean team ,String state,
                    int max_hp) {
        super(name_of_class,name, hit_points, Endurance, Parryng, type_of_damage, damage, ph_Immunity,
                M_imm,speed,x,y,team,state,max_hp);
    }

    public spearman(String name, int x, int y){
        super("пиказавр",name,1000,140,1,200,35,
                60,10,60,x,y, false, Alive, 1000);
        super.name=name;
        this.x=x;
        this.y=y;

    }

    @Override
    public String get_info() {
        return ("я - "+name_of_class+" меня звать "+name);
    }
}
