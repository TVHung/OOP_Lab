package week3;

import javax.swing.JOptionPane;

public class Complex {
	private int phanthuc;
	private int phanao;
	
	//getter and setter 
	public int getPhanthuc() {
		return phanthuc;
	}
	public void setPhanthuc(int phanthuc) {
		this.phanthuc = phanthuc;
	}
	public int getPhanao() {
		return phanao;
	}
	public void setPhanao(int phanao) {
		this.phanao = phanao;
	}
	
	//contructor
	public Complex() {
		setPhanthuc(0);
		setPhanao(0);
	}
	public Complex(int phanthuc, int phanao) {
		setPhanthuc(phanthuc);
		setPhanao(phanao);
	}
	
	public void nhapSoPhuc(Complex cmp) {
		String strPa, strPt;
		
		strPa = JOptionPane.showInputDialog(null,"Nhap phan thuc: ",JOptionPane.INFORMATION_MESSAGE);
		int iphanthuc = Integer.parseInt(strPa);
		strPt = JOptionPane.showInputDialog(null,"Nhap phan ao: ", JOptionPane.INFORMATION_MESSAGE);
		int iphanao = Integer.parseInt(strPt);
		
		cmp.setPhanthuc(iphanthuc);
		cmp.setPhanao(iphanao);
	}
	
	public void inSoPhuc(Complex cmp) {
		if(cmp.getPhanao() < 0)
			System.out.println("So phuc la: " + cmp.getPhanthuc() + cmp.getPhanao() + "i" );
		else
			System.out.println("So phuc la: " + cmp.getPhanthuc() + " + " + cmp.getPhanao() + "i" );
	}
}







