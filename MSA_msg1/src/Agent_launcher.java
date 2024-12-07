
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;

public class Agent_launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {
			Runtime rt = Runtime.instance();
			ProfileImpl p = new ProfileImpl("localhost",1099,"JADE");
			ContainerController mc = rt.createMainContainer(p);
			AgentController ag1 = mc.createNewAgent("buyer1", "Agent1", null);
			
			ag1.start();
		} catch (StaleProxyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Object[] arg1 = {"Car","1500"};
		Object[] arg2 = {"Laptop","4500.50"};
		try {
			Runtime rt = Runtime.instance();
			ProfileImpl p = new ProfileImpl();
			p.setParameter(Profile.LOCAL_HOST,"localhost");
			p.setParameter(Profile.LOCAL_PORT,"1099");
			p.setParameter(Profile.GUI,"true");
			ContainerController mc = rt.createMainContainer(p);
			//AgentController ag1 = mc.createNewAgent("buyer1", "Agent1", null);
			AgentController ag1 = mc.createNewAgent("buyer1", "Agdisplay", arg1);
			ag1.start();
			//AgentController ag2 = mc.createNewAgent("buyer2", "Agent1", null);
			AgentController ag2 = mc.createNewAgent("buyer2", "Agdisplay",arg2);
			ag2.start();
			
		} catch (StaleProxyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
