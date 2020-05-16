
package aplikasiLaundry;

import java.awt.Color;
import static java.awt.SystemColor.window;
import java.util.Scanner;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class ViewLaundry extends JFrame {
    
   
    JLabel lJudul = new JLabel("Laundry Kuyy");
    JLabel lNim = new JLabel("Kode  ");
    
    JTextField tfnim = new JTextField();
    JLabel lNamaMhs = new JLabel("Nama  ");
    JTextField tfNamaMhs = new JTextField();
    JLabel lBerat = new JLabel("Berat  ");
    JTextField tfBerat = new JTextField();
    JLabel lkg = new JLabel("KG  ");
    JLabel lBayar = new JLabel("Total bayar  ");
    JLabel lUang = new JLabel("Uang bayar  ");
    JTextField tfUang = new JTextField();
    JLabel lKembalian = new JLabel("Kembalian   ");
    JTextField tfKembalian = new JTextField();
    JLabel labelGender = new JLabel("Jenis Kelamin  ");
    JRadioButton rbPria = new JRadioButton("Laki - laki");
    JRadioButton rbWanita = new JRadioButton("Perempuan");
    JLabel lAlamatMhs = new JLabel("Alamat  ");
    JTextField tfAlamatMhs = new JTextField();

    JLabel labelAgama = new JLabel("Kategori Cuci");
    String[] namaAgama = {"--Pilih--", "Cuci", "Cuci Setrika", "Express 1 jam", "Express 1 hari"};
    JComboBox cmbAgama = new JComboBox(namaAgama);
    
     JButton btnTotalPanel = new JButton("TOTAL");

    JButton btnTambahPanel = new JButton("Tambah");
    JButton btnBatalPanel = new JButton("Reset");
    JButton btnUbahPanel = new JButton("Ubah");
    JButton btnHapusPanel = new JButton("Hapus");

    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"Kode", "Nama", "Jenis Kelamin", "Alamat", "Katerogi Cuci","Berat"}; //membuat kolom dalam array

    public ViewLaundry() {

        tableModel = new DefaultTableModel(namaKolom, 0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);

        setTitle("Laundry Kuyyy");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(655, 650);

        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);

        //TABEL
        add(scrollPane);
        scrollPane.setBounds(30, 235, 580, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(lJudul);//buat judul
        lJudul.setBounds(150, 5, 300, 50);
        lJudul.setFont(new java.awt.Font("Times New Roman", 0, 40));
        
        add(lNim);
        lNim.setBounds(35, 60, 90, 20);
        add(tfnim);
        tfnim.setBounds(140, 60, 170, 20);
        
        add(lNamaMhs);
        lNamaMhs.setBounds(35, 90, 90, 20);
        add(tfNamaMhs);
        tfNamaMhs.setBounds(140, 90, 170, 20);
        
        add(lBerat);
        lBerat.setBounds(330, 90, 90, 20);
        add(tfBerat);
        tfBerat.setBounds(380, 90, 50, 20);
        add(lkg);
        lkg.setBounds(440, 90, 90, 20);
        add(btnTotalPanel);
        btnTotalPanel.setBounds(500, 90, 90, 25);
        
        add(lUang);
        lUang.setBounds(330, 150, 90, 20);
        add(tfUang);
        tfUang.setBounds(420, 150, 150, 20);
        
        add(lKembalian);
        lKembalian.setBounds(330, 180, 90, 20);
        
        add(lAlamatMhs);
        lAlamatMhs.setBounds(35, 120, 90, 20);
        add(tfAlamatMhs);
        tfAlamatMhs.setBounds(140, 120, 170, 40);
        
        add(lBayar);
        lBayar.setBounds(330, 120, 90, 20);
// Jenis Kelamin
        
        add(labelGender);
        labelGender.setBounds(35, 160, 90, 20);
        add(rbPria);
        rbPria.setBounds(136, 160, 80, 20);
        add(rbWanita);
        rbWanita.setBounds(220, 160, 100, 20);
        
// Agama
        
        add(labelAgama);
        labelAgama.setBounds(35, 190, 170, 20);
        add(cmbAgama);
        cmbAgama.setBounds(140, 190, 170, 20);
        
// Kumpulan Tombol
        add(btnTambahPanel);
        btnTambahPanel.setBounds(30, 550, 90, 25);
        add(btnUbahPanel);
        btnUbahPanel.setBounds(130, 550, 90, 25);
        add(btnHapusPanel);
        btnHapusPanel.setBounds(230, 550, 90, 25);
        add(btnBatalPanel);
        btnBatalPanel.setBounds(330, 550, 90, 25);
    }

    public String getNim() {
        return tfnim.getText();
    }

    public String getNamaMhs() {
        return tfNamaMhs.getText();
    }

    public String getAlamatMhs() {
        return tfAlamatMhs.getText();
    }

    public String getAgama() {
        if (cmbAgama.getSelectedItem().equals("--Pilih--")) {
            return "";
        } else {
            return (String) cmbAgama.getSelectedItem();
        }
    }

    public String getJK() {
        if (rbPria.isSelected()) {
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }
    
    public String getBerat() {
        return tfBerat.getText();
    }


}

 