import java.util.ArrayList;

public class Vet {
    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name){
        this.name = name;
        clients = new ArrayList<Animal>();
    }

    public void addClient(Animal pet){
        if(clients.indexOf(pet) == -1){
            clients.add(pet);
            System.out.println("Welcome to " + name + "  office, " + pet.getName() + "!\n");
        } else{
            System.out.println(pet.getName() + " is already a client of " + name +"!");

        }
    }


}
