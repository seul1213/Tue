package chap05;

interface PhoneInterface{
	final int TIMEOUT=10000;
	abstract void sendCall();
	abstract void receiveCall();
	default void printLogo() {System.out.println("**Phone**");}
}



public class SamsungPhone implements PhoneInterface {
	
	@Override
	public void sendCall() {
		System.out.println("�츮������~");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
		
	}
	
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.sendCall();
		phone.receiveCall();
		phone.printLogo();
		System.out.println(phone.TIMEOUT);

	}

	
}
