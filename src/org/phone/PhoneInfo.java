package org.phone;
public class PhoneInfo {
	private void phoneName() {
		System.out.println("Samsung");
}
	private void phoneMieiNum() {
		System.out.println("6363636636363636");
}
	private void camera() {
		System.out.println("108MP");
}
	private void storage() {
		System.out.println("8GB");
}
	private void osName() {
		System.out.println("andriod");
}
public static void main(String [] args) {
	PhoneInfo pi=new PhoneInfo();
	pi.phoneName();
	pi.phoneMieiNum();
	pi.camera();
	pi.storage();
	pi.osName();
}
}
