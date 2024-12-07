import jade.core.Agent;

public class Agdisplay extends Agent {

	float price;
	String name;
	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		super.setup();//pour lancer les traitements de l'agent
		Object[] args = getArguments();
		if(args!=null) {
			name = (String) args[0];
			price = Float.valueOf((String) args[1]).floatValue();
		}
		System.out.println("In Agent : "+getLocalName()+" Sell product "+name+" at price "+price);
		//System.out.println("Hello world, My name is "+getLocalName());
		doDelete(); //pour tuer l'agent
	}

}
