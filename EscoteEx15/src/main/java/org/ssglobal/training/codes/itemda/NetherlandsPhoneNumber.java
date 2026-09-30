package org.ssglobal.training.codes.itemda;


class NetherlandsPhoneNumber implements IPhoneNumber {
	private String number;

	NetherlandsPhoneNumber(String number) { this.number = number; }

	@Override
	public boolean validate() {
		System.out.println("Validate Netherlands phone number...");
		return true;
	}

	@Override
	public void getPhoneNumber() { System.out.format("Netherlands phone number: %d", number); }
}