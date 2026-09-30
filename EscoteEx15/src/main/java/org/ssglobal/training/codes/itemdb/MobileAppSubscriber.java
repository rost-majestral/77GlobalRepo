package org.ssglobal.training.codes.itemdb;


public class MobileAppSubscriber implements ISubscriber {
	private String content;

	@Override
	public void update(String content) {
		this.content = content;
		display();
	}

	@Override
	public void pull(IObservable source) {
		update(source.getContent());
	}

	private void display() {
		System.out.format("Mobile App: content received - %s", content);
	}
}