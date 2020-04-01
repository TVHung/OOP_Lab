package myPac;

public class fraction {
	private int tuso;
	private int mauso;
	  
	  public fraction(int tuso, int mauso) {
		   this.tuso = tuso;
		   this.mauso = mauso;
	  }
	  
	  public fraction(fraction tuso,fraction mauso,String operator) {
		  
	  }
	  
	  public String print() {
		  return this.getTuso() + "/" + this.getMauso();
	  }
	  
	  //toi gian phan so
	  public void normalize() {
		  int ucln = this.UCLN(this.getTuso(), this.getMauso());
		  this.setTuso(this.getTuso()/ucln);
		  this.setMauso(this.getMauso()/ucln);
	  }
	//  tong 2 phan so
	  public void add(fraction tuso,fraction mauso) {
	  
	  }
	//  hieu 2 phan so
	  public void sub(fraction tuso,fraction mauso) {
	  
	  }
	//  tich 2 phan so
	  public void multiply(fraction tuso,fraction mauso) {
	  
	  }
	//  thuong 2 phan so
	  public void divide(fraction tuso,fraction mauso) {
	  
	  }
	  private int UCLN(int x,int y) {
		  int ucln = Math.min(x, y);
		  while(ucln >= 1) {
			  if(x % ucln == 0 && y % ucln == 0) {
				  return ucln;
			  }
			  ucln--;
		  }
		  return 1;
	  }
	  public boolean checkNormalize() {
		  boolean flag = false;
		  int ucln = this.UCLN(this.getTuso(), this.getMauso());
		  if(ucln == 1)
			  return true;
		  return false;
	  }
	  public int getTuso() {
		  return tuso;
	  }
	  public void setTuso(int tuso) {
		  this.tuso = tuso;
	  }
	  public int getMauso() {
		  return mauso;
	  }
	  public void setMauso(int mauso) {
		  this.mauso = mauso;
	  }
}
