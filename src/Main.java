import java.util.Random;

public class Main {
    public static void mai(String[] args) {




    }
    public static void main(String[] args) {
        Person barsik = new Person("kat","barsik",1,25,100,1,24,2,3);
//        barsik.hit_points=1;
//        barsik.Endurance=25;
//        barsik.Parrying=100;
//        barsik.Type_of_damage=1;
//        barsik.name_of_class="kat";
//        barsik.damage=44;
//        barsik.Ph_Immunity=20;
//        barsik.M_Immunity=20;
        barsik.get_all_info();

        marksman myrzik=new marksman("barsik");
        spearman jpra = new spearman("jora");
        bandit ahmed = new bandit("ahmeed");
        mag vital = new mag("vital");

        Farmer jo = new Farmer(get_name());
        jo.get_info();
        for (int i=0;i<10;i++){

            Farmer rand_test = new Farmer(get_name());
            rand_test.get_info();
        }
    }

    private static String get_name(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }





}

