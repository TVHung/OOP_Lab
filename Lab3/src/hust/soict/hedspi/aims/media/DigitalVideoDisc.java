package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media{
	private String diretor;
	private int length;

	public DigitalVideoDisc() {	
	}
	public DigitalVideoDisc(String title) {
		super(title);
	}	
	public DigitalVideoDisc(String title, String category) {
		super(title, category);
	}
	public DigitalVideoDisc(String title, String category, String diretor) {
		super(title, category);
		this.diretor = diretor;
	}
	public DigitalVideoDisc(String title, String category, String diretor, int length) {
		super(title, category);
		this.diretor = diretor;
		this.length = length;
	}
	//getter and setter
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
}
