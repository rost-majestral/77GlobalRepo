package org.ssglobal.training.codes.itemda;

public class NetherlandsContactFactory extends AbstractContactFactory {
	@Override
	public IAddress createAddress(String address) { return new NetherlandsAddress(address); }

	@Override
	public IPhoneNumber createPhoneNumber(String number) { return new NetherlandsPhoneNumber(number); }
}