package org.ssglobal.training.codes.itemdb;


public class RadioSubscriber implements ISubscriber {
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
		System.out.format("Radio: content received - %s", content);
	}
}