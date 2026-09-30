package org.ssglobal.training.codes.itemda;


class NorthAmericaAddress implements IAddress {
	private String address;

	NorthAmericaAddress(String address) { this.address = address; }

	@Override
	public boolean validate() {
		System.out.println("Validate North America address...");
		return true;
	}

	@Override
	public void getAddress() { System.out.format("North America address: %s", address); }
}