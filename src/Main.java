import java.util.*;

public class Main {

    static final int UNITS = 10;

    public static ArrayList<Person> allTeam = new ArrayList<>();
    public static ArrayList<Person> team1 = new ArrayList<>();
    public static ArrayList<Person> team2 = new ArrayList<>();
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();
        createTeam(team1, 0, 1);
        createTeam(team2, 3, 10);
        allTeam.addAll(team1);
        allTeam.addAll(team2);
        sortTeam(allTeam);

        System.out.println("<<<___TEAM1___>>>");
        for (int i = 0; i < UNITS; i++) {
            System.out.println(team1.get(i).get_info());
        }
        System.out.println("\n\n\n");

        System.out.println("<<<___TEAM2___>>>");
        for (int i = 0; i < UNITS; i++) {
            System.out.println(team2.get(i).get_info());
        }
        System.out.println("\n\n\n");


        System.out.println("Список героев по убыванию СКОРОСТИ");
        allTeam.forEach(n -> System.out.print( n.get_info()+ " скорость " + n.getSpeed() + " здоровье " + n.getHP() + ", \n"));

        while (true){
            View.view();
            int alive_1=0;
            int alive_2=0;
            user_input.nextLine();
            for (Person active: allTeam) {
                if (active.hit_points >= 0) {
                    if (team1.contains(active)) {
                        active.step(team1, team2);alive_1+=1;
                    }
                    else{
                        active.step(team2, team1);
                        alive_2+=2;
                    }

                }
            }
            if (alive_1==0){
                System.out.println("победа тим 2");
                break;

            }
            if(alive_2==0) {
                System.out.println("победа тим 1");
                break;
            }
        }
    }



    static void createTeam (ArrayList team, int offset, int y) {
        if (offset == 0) {
            for (int i = 0; i < UNITS; i++) {
                int rnd = new Random().nextInt(4) + offset;
                switch (rnd) {
                    case 0:
                        team.add(new marksman(get_name(), i + 1, y));
                        break;
                    case 1:
                        team.add(new Farmer(get_name(), i + 1, y, true));
                        break;
                    case 2:
                        team.add(new Priest(get_name(), i + 1, y));
                        break;
                    case 3:
                        team.add(new bandit(get_name(), i + 1, y));
                        break;
                    default:

                        break;

                }
            }

        } else {
            for (int i = 0; i < UNITS; i++) {
                int rnd = new Random().nextInt(4);
                switch (rnd) {
                    case 0:
                        team.add(new arrrowman(get_name(), i + 1, y));
                        break;
                    case 1:
                        team.add(new Farmer(get_name(), i + 1, y, false));

                        break;
                    case 2:
                        team.add(new mag(get_name(), i + 1, y));
                        break;
                    case 3:
                        team.add(new spearman(get_name(), i + 1, y));
                        break;
                    default:
                        System.out.println("something wrong");
                        break;
                }
            }
        }
    }



        /** Создать в основной программе два списка. */
        /** Во втором крестьянин, копейщик, арбалетчик, монах */





        static void sortTeam (ArrayList<Person> team){
            team.sort(new Comparator<Person>() {
                @Override
                public int compare(Person t0, Person t1) {
                    if (t1.speed == t0.speed) {
                        return (int) (t1.getHp() - t0.getHp());
                    } else  return (int) (t1.speed - t0.speed);
                }
            });
        }
        // System.out.println("Общий список:");
        /** Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа */












    private static String get_name(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }





}

