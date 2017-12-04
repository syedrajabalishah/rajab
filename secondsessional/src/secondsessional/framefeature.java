package secondsessional;

public class framefeature extends picturedecorater {

	public framefeature(pictureviewInterface decopicture) {
		super(decopicture);
		
	}


	 @Override
	   public void view() {
	    decopicture.view();
	    topframe(decopicture);
	    bottomframe(decopicture);
	    leftframe(decopicture);
	    rightframe(decopicture);
	   }

	 private void topframe(pictureviewInterface decopicture){
	      System.out.println(" Available Picture frame: Top ");
	   }
	 private void bottomframe(pictureviewInterface decopicture){
	      System.out.println(" Available frame: bottom ");
	   }
	 private void leftframe(pictureviewInterface decopicture){
	      System.out.println(" Available frame: left");
	   }
	 private void rightframe(pictureviewInterface decopicture){
	      System.out.println(" Available frame: right \n");
	   }
		
}
	 
	


