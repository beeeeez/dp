package quest6;


	import java.util.ArrayList;

	public class newData implements sub{

		private ArrayList peeps;
		private String ding;
		private String dong;
		private String doodle;
		
		public newData() {
			peeps=new ArrayList();
		}
		public void addPeep( peep x) {
			peeps.add(x);
		}
		public void delPeep( peep x) {
			int i = peeps.indexOf(x);
			if(i>=0) {
				peeps.remove(i);
			}
			
		}
		public void shout() {
			for(int i=0;i<peeps.size();i++) {
				peep poo = (peep)peeps.get(i);
				//poo.change(ding, dong, doodle);
				poo.notifySubs(this);
				
			}
		}
		public void thingChanged() {
			shout();
		}
		public void setData(String ding, String dong, String doodle) {
			this.ding=ding;
			this.dong=dong;
			this.doodle=doodle;
			thingChanged();
		}
		public String getDing() {
			return ding;
		}
		public String getDong() {
			return dong;
		}
		public String getDoodle() {
			return doodle;
		}

	}

