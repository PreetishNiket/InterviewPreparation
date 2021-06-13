package OOPs;

public class ComplexNumbers {
	private int real;
	private int img;
	public ComplexNumbers(int real,int img) {
		this.real=real;
		this.img=img;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImg() {
		return img;
	}
	public void setImg(int img) {
		this.img = img;
	}
	public void print() {
		int a=this.real;
		int b=this.img;
		System.out.println(a+" + "+"i"+b);
	}
	public void plus(ComplexNumbers c2) {
		this.real=this.real+c2.real;
		this.img=this.img+c2.img;
	}
	public void multiply(ComplexNumbers c2) {
		 int a= (this.real * c2.real) - (this.img * c2.img);
	     int b = (this.real * c2.img) + (this.img * c2.real);
	     this.real=a;
	     this.img=b;
	}
	public static ComplexNumbers add(ComplexNumbers c1,ComplexNumbers c2) {
		int newReal =c1.real+c2.real;
		int newImg=c1.img+c2.img;
		ComplexNumbers c = new ComplexNumbers(newReal, newImg);
		return c;
	}
	public ComplexNumbers conjugate() {
		int newReal=this.real;
		int newImg=-this.img;
		ComplexNumbers cc = new ComplexNumbers(newReal, newImg);
		return cc;
	}
}
