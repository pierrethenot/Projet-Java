package model;

import java.sql.SQLException;
import java.util.Observable;

import model.element.IElement;

public interface IMap {
 

	public IElement getOnTheMapXY(int x, int y);
	public void setMobileHasChanged();
	public Observable getObservable();
	public int getHeight();
	public int getWidth();
	void setOnTheMapXY(IElement element, int x, int y);

	
}
