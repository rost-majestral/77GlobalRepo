package org.ssglobal.training.codes.itemda;


public class NorthAmericaContactFactory extends AbstractContactFactory {
	@Override
	public IAddress createAddress(String address) { return new NorthAmericaAddress(address); }

	@Override
	public IPhoneNumber createPhoneNumber(String number) { return new NorthAmericaPhoneNumber(number); }
}