public class bandit extends dog_fiters{
    public bandit(String name_of_class,String name, Integer hit_points, Integer Endurance, Integer Parryng,
                  Integer type_of_damage, Integer damage, Integer ph_Immunity, Integer M_imm, Integer speed) {
        super(name_of_class,name, hit_points, Endurance, Parryng, type_of_damage, damage, ph_Immunity, M_imm,speed);
    }




    public bandit(String name){
        super("свой пацан",name,1000,140,1,200,35,60,10,99999);
        super.name=name;

    }


    @Override
    public String get_info() {
        return ("я - бандитка еще так, а ты зови меня "+name);
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
