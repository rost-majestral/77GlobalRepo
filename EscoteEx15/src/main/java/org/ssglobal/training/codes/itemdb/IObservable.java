package org.ssglobal.training.codes.itemdb;


public interface IObservable {
	void addObserver(ISubscriber observer);
	void removeObserver(ISubscriber observer);
	void notifyObservers();
	String getContent(); 
}