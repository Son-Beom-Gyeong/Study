
public class Rectangle {
	int x1,y1,x2,y2,a;
	
	public Rectangle(){
		
	}
	public Rectangle(int x1,int y1,int x2,int y2){
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}	
	int square(){
		if(x2>x1){
			if(y2>y1){
			a = (x2-x1)*(y2-y1);
		}
			else if(y2<y1){
				a = (x2-x1)*(y1-y2);
			}
		else if(x1>x2){
			if(y2>y1){
				a = (x1-x2)*(y2-y1);
			}
			else if(y1>y2){
				a = (x1-x2)*(y1-y2);
			}
		}
			
			a= (x1-x2)*(y1-y2);
		}
		
		
		return a;
	}
	
	public boolean equals(Object obj){
		Rectangle r = (Rectangle)obj;
		if(this.x1 == r.x1 && this.y1 == r.y1 && this.x2 == r.x2 && this.y2 ==r.y2)
			return true;
		else
			return false;
	}
	
	
	void show(){
		System.out.println("»ç°¢ÇüÀÇ ³ÐÀÌ = "+ square());
		System.out.println("x1ÀÇ ÁÂÇ¥ = " + x1);
		System.out.println("x2ÀÇ ÁÂÇ¥ = " + x2);
		System.out.println("y1ÀÇ ÁÂÇ¥ = " + y1);
		System.out.println("y2ÀÇ ÁÂÇ¥ = " + y2);
	}
	
	
	
	void set(int x1, int y1, int x2, int y2){
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	
	public static void main(String args[]){
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1,1,2,3);
		
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2, 2, -1, 4);
		r.show();
		System.out.println(r.square());
		if(r.equals(s)){
			System.out.println("µÎ »ç°¢ÇüÀº °°½À´Ï´Ù");
		}	
	}
}


