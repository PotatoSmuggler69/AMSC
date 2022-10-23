/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity.billing.system;
import javax.swing.*; // Imports JFrame Class
/**
 *
 * @author abhis
 */
public class FirstFrame extends JFrame implements Runnable{
    Thread t2;
    Loading main_obj;
    @Override
    public void run(){
        try{
            Thread.sleep(7000);
            main_obj.setVisible(false);
            main_obj.dispose();
            new LoginUI().setVisible(true);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    
    // Constructor
    FirstFrame(){
        t2 = new Thread(this);
        t2.start();
        main_obj = new Loading();
        main_obj.setVisible(true);
    }
    public static void main(String[] args){
        FirstFrame ff1 = new FirstFrame();
        
        
        
    }
}
