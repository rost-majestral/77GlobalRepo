package org.ssglobal.training.codes.itemdb;


public interface ISubscriber {
	void update(String content);      
	void pull(IObservable source);    
}