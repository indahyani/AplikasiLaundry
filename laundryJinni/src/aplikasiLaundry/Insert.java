/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasiLaundry;

import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class Insert extends JFrame{
    
    JPanel panel = new JPanel();
    
    JLabel lJudul = new JLabel("Insert data");
     
    final JTextField fname = new JTextField(100);
    JLabel lname = new JLabel("Nama : ");
   
    final JTextField fberat = new JTextField(100);
    JLabel lberat = new JLabel("Berat : ");
    
    JLabel lCuci = new JLabel("Paket");
    String[]  nCuci = {"Cuci", "Cuci Setrika","Express 1 hari", "Express 1 jam"};
    JComboBox cCuci = new JComboBox(nCuci); 
    
    JButton bSave =new JButton("Save");
    JButton bDelete =new JButton("Delete");
    
    
    
    
    public Insert(){
        setTitle("Insert Laundry Jinni");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400,400);
        
        add(lJudul);//buat judul
        lJudul.setBounds(120, 30, 300, 50);
        lJudul.setFont(new java.awt.Font("Times New Roman", 0, 30));
        
        
        add(lname);
          lname.setBounds(80,100,100,25);
        add(fname);
         fname.setBounds(160,100,150,25);
         
       add(lberat);
          lberat.setBounds(80,130,100,25);
        add(fberat);
         fberat.setBounds(160,130,30,25);
         
       add(lCuci);
         lCuci.setBounds(80,160,100,20);
        
        add(cCuci);
        cCuci.setBounds(160,160,150,20);
        
         add(bSave);
        bSave.setBounds(100,300,100,20);
       
        add(bDelete);
         bDelete.setBounds(220,300,100,20);
         
        
    }

    
}
