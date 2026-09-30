package org.ssglobal.training.codes.itemda;


class NetherlandsAddress implements IAddress {
	private String address;

	NetherlandsAddress(String address) { this.address = address; }

	@Override
	public boolean validate() {
		System.out.println("Validate Netherlands address...");
		return true;
	}

	@Override
	public void getAddress() { System.out.format("Netherlands address: %s", address); }
}