package view;


import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.IOrderPerformer;
import controller.UserOrder;
import model.IMap;
import model.IMobile;
import model.IElement;

public class BoulderdashView extends JFrame implements IBoulderdashView{

	private static final long serialVersionUID = 1L;
	private static int squareSize = 50;
	public static int mapView = 10;
	private Rectangle closeView;
	private int view;
	public IMap map;
	private IOrderPerformer orderPerformer;
	private IMobile myHero;
	private IMobile enemy;
	private IMobile blockDiamondFall;
	private IMobile blockRocherFall;
	private IMap diamond;
	private int score = 0;
	
		public BoulderdashView(final IMap map, final IMobile myHero){
				
				this.setView(mapView);
				this.setMap(map);
				this.setMyHero(myHero);
				((IElement) this.getMyHero()).getSprite();
				this.setEnemy(enemy);
				((IElement) this.getEnemy()).getSprite();
				this.setBlockDiamondFall(blockDiamondFall);
				((IElement) this.getBlockDiamondFall()).getSprite();
				this.setBlockRocherFall(blockRocherFall);
				((IElement) this.getBlockRocherFall()).getSprite();
				this.getDiamond();
				this.setDiamond(diamond);
				
				this.setCloseView(closeView);
			
				this.setTitle("Boulder Dash");
		        
		        this.setSize(getWidth(), getHeight());
		        this.setLocationRelativeTo(null);
		        JPanel pan = new JPanel((LayoutManager) map);
		        this.setContentPane(pan);
		        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        this.setVisible(true);
		        this.setResizable(false);

		        this.setContentPane(pan);
		        
		        this.setVisible(true);
		}

		public void drawScore(Graphics g){
			g.drawString("Diamond = " + score, 25, 25);
			
			//add le if contact avec diament : score + 1 = score
		}
		
		
		
//		        SwingUtilities.invokeLater(this);
//		}
//		 public IMap displayMap(Graphics g)
//		  {
//		
//		    try
//		    {
//		      map mapdisplay = new map();
//		      //Pour une image de fond
//		      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
//		    } catch (IOException e)
//		    {
//		      e.printStackTrace();
//		    }
//		  }
		
		public void displayMessage(final String message){
	        JOptionPane.showMessageDialog(null, message);
			
		}
		
		public void followMyHero(){
//			this.getCloseView().y = this.getMyHero().getY() - 1;
	}
		
		
			
		
			public IMobile getMyHero()
			{
				return this.getMyHero();
			}
			public void setMyHero(final IMobile myHero)
			{
				this.myHero = myHero;
			}
			
			public int getView()
			{
				return this.view;
			}
			public void setView(final int view)
			{
				this.view = view;
			}

			public Rectangle getCloseView()
			{
				return this.closeView;
			}
			public void setCloseView(final Rectangle closeView)
			{
				this.closeView = closeView;
			}
			
			public IOrderPerformer getOrderPerformer()
			{
				return this.orderPerformer;
			}
			public void setOrderPerformer(final IOrderPerformer orderPerformer)
			{
				this.orderPerformer = orderPerformer;
			}
			
			public IMobile getEnemy()
			{
				return this.enemy;
			}
			public void setEnemy(final IMobile enemy)
			{
				this.enemy = enemy;
			}
			
			public IMobile getBlockDiamondFall(){
				return this.blockDiamondFall;
			}
			
			public void setBlockDiamondFall(final IMobile blockDiamondFall){
				this.blockDiamondFall = blockDiamondFall;
			}
			
			public IMobile getBlockRocherFall(){
				return this.blockRocherFall;
			}
			
			public void setBlockRocherFall(final IMobile blockRocherFall){
				this.blockRocherFall = blockRocherFall;
			}
			
			public IMap getDiamond(){
				return diamond;
			}
			
			public void setDiamond(IMap diamond){
				this.diamond = diamond;
			}
			
			
//			public  void Window(IMap map)
//			{			 
//			        this.setTitle("Boulder Dash");
//			        this.setSize(getWidth(), getHeight());
//			        this.setLocationRelativeTo(null);
//			        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			        this.setVisible(true);
//			        this.setResizable(false);
//			        this.setContentPane((map) new map());
//			        this.setVisible(true);
//			     }
			
			public IMap getMap()
			{
				return this.map;
			}
			public void setMap(final IMap map)
			{
				this.map = map;
		        
		    
			}
			public static UserOrder keyCodeToUserOrder(final int keyCode){
				
				UserOrder userOrder;
		        switch (keyCode) {
		            case KeyEvent.VK_RIGHT:
		                userOrder = UserOrder.RIGHT;
		                break;
		            case KeyEvent.VK_LEFT:
		                userOrder = UserOrder.LEFT;
		                break;
		            case KeyEvent.VK_UP:
		                userOrder = UserOrder.UP;
		                break;
		            case KeyEvent.VK_DOWN:
		                userOrder = UserOrder.DOWN;
		                break;
		            default:
		                userOrder = UserOrder.NOP;
		                break;
		        }
		        return userOrder;}
			public void keyTyped(final KeyEvent keyEvent){
				
			}
			public final void keyPressed(final KeyEvent keyEvent){
				 try {
			            this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
			        } catch (final IOException exception) {
			            exception.printStackTrace();
			        }
			}
			public void keyReleased(final KeyEvent keyEvent){
				
			}
}

