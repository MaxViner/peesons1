public class bandit extends Person{
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
