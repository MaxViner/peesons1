public class bandit extends dog_fiters{
    public bandit(String name_of_class,String name, Integer hit_points, Integer Endurance, Integer Parryng, Integer type_of_damage, Integer damage, Integer ph_Immunity, Integer M_imm) {
        super(name_of_class,name, hit_points, Endurance, Parryng, type_of_damage, damage, ph_Immunity, M_imm);
    }




    public bandit(String name){
        super("свой пацан",name,1000,140,1,200,35,60,10);
        super.name=name;

    }

    @Override
    public void get_info() {
        super.get_info();
    }

    Integer do_critical_damage(Integer damage, Integer edu){
        if (edu>=50){
        damage=damage*2;
        edu-=50;}
        else {
            System.out.println("need some rest");
        }
        return damage;
    }
}
