package constructorinjection;

public class person {
        private String name;
        private int personid;
        
        public person(String name,int personid) {
        	
        	
        	this.name=name;
        	this.personid=personid;
        }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.name+"="+this.personid;
		}
}
