package secondsessional;

public abstract class picturedecorater implements pictureviewInterface {
	protected pictureviewInterface decopicture;
	
	public picturedecorater (pictureviewInterface decopicture){
	      this.decopicture = decopicture;
	   }
	
		public void view(){
			decopicture.view();
	}
	
	

}
