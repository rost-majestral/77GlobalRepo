package org.ssglobal.training.codes.itemdb;


import java.util.ArrayList;
import java.util.List;


public class SiruxXMStation implements IObservable {
	private List<ISubscriber> observers = new ArrayList<>();
	private String content = "";

	public void signUp(ISubscriber subscriber) {
		System.out.println("Contract signed...");
		addObserver(subscriber);
	}

	public void cancelContract(ISubscriber subscriber) {
		System.out.println("Contract cancelled...");
		removeObserver(subscriber);
	}

	@Override
	public void addObserver(ISubscriber observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(ISubscriber observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (ISubscriber subscriber : observers) {
			subscriber.update(content);
		}
	}

	@Override
	public String getContent() {
		return content;
	}

	public void publish(String newContent) {
		this.content = newContent;
		notifyObservers();
	}
}