import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Random rand = new Random();
        List<Person> team1 = new ArrayList<>();
        List<Person> team2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    team1.add(new marksman(get_name(),val,1));
                    break;
                case 1:
                    team1.add(new Farmer(get_name(),val,2,true));
                    break;
                case 2:
                    team1.add(new mag(get_name(),10,10));
                    break;
                case 3:
                    team1.add(new bandit(get_name(),9,9));
                    break;
                default:
                    // teams.add(new BaseHero());
                    break;
            }

        }
        /** Создать в основной программе два списка. */
        /** Во втором крестьянин, копейщик, арбалетчик, монах */



        for (int i = 0; i < 10; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    team2.add(new arrrowman(get_name(),1,val));
                    break;
                case 1:
                    team2.add(new Farmer(get_name(),10,val,false));
                    break;
                case 2:
                    team2.add(new Priest(get_name(),1,1));
                    break;
                case 3:
                    team2.add(new spearman(get_name(),1,1));
                    break;
                default:
                  System.out.println("something wrong");
                    break;
            }

        }

        List<Person> compare_all = new ArrayList<>();
        compare_all.addAll(team1);
        compare_all.addAll(team2);
        // System.out.println("Общий список:");
        /** Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа */
       compare_all.sort(new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                if (o2.getSpeed() == o1.getSpeed())
                    return o2.getHP() - o1.getHP();
                return o2.getSpeed() - o1.getSpeed();
            }
        });
        System.out.println("Список героев по убыванию СКОРОСТИ");
        compare_all.forEach(n -> System.out.print( n.get_info()+ " скорость " + n.getSpeed() + " здоровье " + n.getHP() + ", \n"));


        arrrowman pet=new arrrowman("jo",5,5) ;
        pet.get_info();
        mag jo = new mag("op",8,8);


    }





    private static String get_name(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }





}

