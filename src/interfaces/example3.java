package interfaces;

interface I1{
	public void x();
}

interface I2{
	public void z();
}

interface I3{
	public void x();
}

interface I4 extends I3{
	public void z();
}



class B implements I4{
	public void x() {}
	public void z() {}
}


public class example3 {

}
