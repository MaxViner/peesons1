public class Priest extends Person{
    static Integer Magic_energy;
    Integer get_heal( Integer hp_before,Integer incr_hp){
        Integer hp_after=hp_before+incr_hp;
        Magic_energy+=incr_hp;
        return hp_after;
    }
}
