package secondsessional;

public class pictureviewdemo {
	public static void main(String[] args) {

	pictureviewInterface objview = new viewer();
	
	pictureviewInterface top = new framefeature(new topframe());
	
	pictureviewInterface bottom =new framefeature(new bottomframe());
	
	pictureviewInterface left =new framefeature(new leftframe());
	
	pictureviewInterface right =new framefeature(new rightframe());
	
	System.out.println(" picture view with existing view");
	objview.view();
	
	System.out.println(" Picture  View with top frame");
	top.view();
	
	System.out.println(" Picture View with bottom frame");
	bottom.view();
	
	System.out.println(" Picture View with left frame");
	left.view();
	
	System.out.println("Picture  View with right frame");
	right.view();
	
	
	
	
	}
	
	
}

