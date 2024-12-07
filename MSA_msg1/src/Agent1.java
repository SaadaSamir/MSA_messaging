import jade.core.Agent;

public class Agent1 extends Agent {

	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		super.setup();
		System.out.println("Hello world, My name is "+getLocalName());
	}
}
