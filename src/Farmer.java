public class Farmer extends Person {
   static Integer water;
    Integer bring_water(Integer ed_before,Integer incr_ed){
        Integer ed_af=ed_before+incr_ed;
        return ed_af;
    }

    Integer fix_armor(Integer def_before,Integer edu){
        Integer arm_after=def_before+=edu;
        return arm_after;
    }
}
