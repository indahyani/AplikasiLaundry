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
public class VBeranda extends JFrame{
    
    JPanel panel = new JPanel();
    JLabel lJudul = new JLabel("Laundry Kuyy");
     
            
    JButton bInsert =new JButton("Insert data");
    JButton bRead =new JButton("Read data");
    JButton bUpdate =new JButton("Update data");
    JButton bDelete =new JButton("Delete data");
    
    public VBeranda()
    {
        setTitle("Beranda Laundry Jinni");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(500,400);
        
        add(lJudul);//buat judul
        lJudul.setBounds(100, 10, 300, 50);
        lJudul.setFont(new java.awt.Font("Times New Roman", 0, 40));
        
        add(bInsert);
        bInsert.setBounds(150,150,150,30);
       
        add(bRead);
         bRead.setBounds(150,200,150,30);
        
        add(bUpdate);
        bUpdate.setBounds(150,250,150,30);
       
        add(bDelete);
         bDelete.setBounds(150,300,150,30);
        
    }
}
