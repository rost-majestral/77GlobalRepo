package org.ssglobal.training.codes.itemda;


class NorthAmericaPhoneNumber implements IPhoneNumber {
	private String number;

	NorthAmericaPhoneNumber(String number) { this.number = number; }

	@Override
	public boolean validate() {
		System.out.println("Validate North America phone number...");
		return true;
	}

	@Override
	public void getPhoneNumber() { System.out.format("North America phone number: %d", number); }
}