package OOP.class_object.clone;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {

        Agent agent = new Agent("Mr. Joe Wanted");
        Agent[] agents = male1000Clone(agent);
        for (Agent clone : agents) {
            System.out.println(clone);
        }
    }

    public static Agent[] male1000Clone(Agent agent) throws CloneNotSupportedException{
        Agent[] agents = new Agent[1000];
        for (int i = 0; i < 1000; i++) {
            agents[i] = (Agent) agent.clone();
        }
        return agents;
    }
}
