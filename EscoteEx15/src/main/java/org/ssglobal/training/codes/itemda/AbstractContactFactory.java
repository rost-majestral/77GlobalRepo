package org.ssglobal.training.codes.itemda;


public abstract class AbstractContactFactory {
	public abstract IAddress createAddress(String address);
	public abstract IPhoneNumber createPhoneNumber(String number);
}