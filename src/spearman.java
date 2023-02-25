public class spearman extends dog_fiters{


    public spearman(String name_of_class,String name, Integer hit_points, Integer Endurance, Integer Parryng, Integer type_of_damage, Integer damage, Integer ph_Immunity, Integer M_imm) {
        super(name_of_class,name, hit_points, Endurance, Parryng, type_of_damage, damage, ph_Immunity, M_imm);
    }

    public spearman(String name){
        super("пиказавр",name,1000,140,1,200,35,60,10);
        super.name=name;

    }

    @Override
    public void get_info() {
        super.get_info();
    }
}
