package model;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Observable;

import model.dao.DataDAO;
import model.dao.SaveMapDAO;
import model.element.IElement;


public class Map extends Observable implements IMap{
	
	

	private IElement[][] onTheMap;
	int height;
	int width;
	int diamond;
	int idmap;
	int row;
	int collumn;
	String elementlist;

	public Map(String fileName, DataDAO datadao) throws IOException, SQLException{
		super();
	
		
		width = DataDAO.getWidth(idmap);
		height = DataDAO.getHeight(idmap);
		diamond = DataDAO.getDiamond(idmap);
		elementlist =  SaveMapDAO.getElement(idmap, row, collumn);
		
		this.loadFile(fileName);
	}
//	public int getIdmap(int idmap){
//		switch(idmap){
//		
//		case 1 : 	
//				idmap=1;
//				break;
//		case 2 : 
//				idmap=2;
//				break;
//		case 3 : 
//				idmap=3;
//				break;
//		case 4 : 
//				idmap=4;
//				break;
//		case 5 : 
//				idmap=5;
//				break;
//		}
//		return idmap;
//	} 
	
	private void loadFile(final String fileName) throws IOException{
		
		String tab
	    
	
	}
// get a map of an element double table
	
	public IElement getOnTheMapXY(final int x, final int y){
		return this.onTheMap[x][y];
	}
	
	public Observable getObservable(){
		return this;
	}
	

	// set a map of an element double table
	private void setOnTheMapXY(final IElement element, final int x, final int y){
		this.onTheMap[x][y] = element;
	}
	
	// refresh the map when the mobile element move
	public void setMobileHasChanged(){
		this.setChanged();
        this.notifyObservers();
	}
	public void getSprite(){
		return;
	}
	
	
	
}
