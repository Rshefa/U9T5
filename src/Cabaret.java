import java.util.ArrayList;

public class Cabaret {

    private String name;
    private ArrayList<Performer> performers;


    public Cabaret(String name){
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Performer> getPerformers(){
        return performers;
    }

    public boolean addPerformer(Performer perf) {
        if (performers.indexOf(perf) == -1) {
            performers.add(perf);
            return true;
        } else {
            return false;

        }
    }
        public boolean removePerformer(Performer perf){
            if(performers.indexOf(perf) != -1){
                performers.remove(perf);
                return true;
            }
            return false;

        }

        public double averagePerformerAge(){
            int ageSum = 0;
            for(Performer performer: performers){
                ageSum += performer.getAge();
            }
            double average = ageSum / (double) performers.size();
            return average;
        }

        public ArrayList<Performer> performersOverAge(int Age){
            ArrayList<Performer> overAge = new ArrayList<>();
            for(Performer performer: performers){
                if(performer.getAge() >= age){
                    overAge.add(performer);
                }
            }
            return overAge;
        }

       public void groupRehearsal(){
        for(Performer performer: performers){
            System.out.println("REHEARSAL CALL! " + performer.getName());
            if(performer instanceof Comedian){
                Comedian temp = (Comedian) performer;
                temp.rehearse(false);
            } else{
                performer.rehearse();
            }
        }
    }



}