package aplikasiLaundry;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ControllerLaundry {

    ModelLaundry modellaundry;
    ViewLaundry viewlaundry;

    public ControllerLaundry(ModelLaundry modellaundry, ViewLaundry viewlaundry) {
        this.modellaundry = modellaundry;
        this.viewlaundry = viewlaundry;

        if (modellaundry.getBanyakData() != 0) {
            String datapelanggan[][] = modellaundry.readpelanggan();
            viewlaundry.tabel.setModel((new JTable(datapelanggan, viewlaundry.namaKolom)).getModel());
            listenerTabel();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        viewlaundry.btnTambahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = viewlaundry.getNim();
                String nama = viewlaundry.getNamaMhs();
                String alamat = viewlaundry.getAlamatMhs();
                String jk = viewlaundry.getJK();
                String agama = viewlaundry.getAgama();
                String berat = viewlaundry.getBerat();
                modellaundry.insertpelanggan(nim, nama, alamat, jk, agama,berat);

                String datapelanggan[][] = modellaundry.readpelanggan();
                viewlaundry.tabel.setModel(new JTable(datapelanggan, viewlaundry.namaKolom).getModel());
                listenerTabel();
            }
        });
        
        viewlaundry.btnUbahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = viewlaundry.getNim();
                String nama = viewlaundry.getNamaMhs();
                String alamat = viewlaundry.getAlamatMhs();
                String jk = viewlaundry.getJK();
                String agama = viewlaundry.getAgama();
                String berat = viewlaundry.getBerat();

                modellaundry.updatepelanggan(nim, nama, alamat, jk, agama,berat);
                
                String datapelanggan[][] = modellaundry.readpelanggan();
                viewlaundry.tabel.setModel(new JTable(datapelanggan, viewlaundry.namaKolom).getModel());
                listenerTabel();
            }
        });
        
        viewlaundry.btnHapusPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = viewlaundry.getNim();
                String nama = viewlaundry.getNamaMhs();
                String alamat = viewlaundry.getAlamatMhs();
                String jk = viewlaundry.getJK();
                String agama = viewlaundry.getAgama();
                String berat = viewlaundry.getBerat();

                modellaundry.deletepelanggan(nim);
                
                String datapelanggan[][] = modellaundry.readpelanggan();
                viewlaundry.tabel.setModel(new JTable(datapelanggan, viewlaundry.namaKolom).getModel());
                resetForm();
                listenerTabel();
            }
        });
        
        viewlaundry.btnBatalPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
                
                String datapelanggan[][] = modellaundry.readpelanggan();
                viewlaundry.tabel.setModel(new JTable(datapelanggan, viewlaundry.namaKolom).getModel());
                listenerTabel();
            }
        });
    }

    public void listenerTabel() {
        String data[][] = modellaundry.readpelanggan();
        String datapelanggan[][] = modellaundry.readpelanggan();
        viewlaundry.tabel.setModel(new JTable(datapelanggan, viewlaundry.namaKolom).getModel());
        viewlaundry.tabel.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = viewlaundry.tabel.getSelectedRow();
                int col = viewlaundry.tabel.getSelectedColumn();

                viewlaundry.tfnim.setText(data[row][0].toString());
                viewlaundry.tfnim.setEnabled(false);
                viewlaundry.tfNamaMhs.setText(data[row][1].toString());
                if (data[row][2].toString().equals("Perempuan")) {
                    viewlaundry.rbWanita.setSelected(true);
                    viewlaundry.rbPria.setSelected(false);
                } else if (data[row][2].toString().equals("Laki-laki")) {
                    viewlaundry.rbPria.setSelected(true);
                    viewlaundry.rbWanita.setSelected(false);
                }
                
                viewlaundry.tfAlamatMhs.setText(data[row][3].toString());
                viewlaundry.cmbAgama.setSelectedItem(data[row][4]);
                viewlaundry.tfBerat.setText(data[row][5].toString());
            }
        });
    }
    
    public void resetForm(){
        viewlaundry.tfnim.setText("");
        viewlaundry.tfnim.setEnabled(true);
        viewlaundry.tfNamaMhs.setText(""); 
        viewlaundry.rbPria.setSelected(false);
        viewlaundry.rbWanita.setSelected(false);
        viewlaundry.tfAlamatMhs.setText("");
        viewlaundry.cmbAgama.setSelectedItem("--Pilih--");
        viewlaundry.tfBerat.setText("");
    }

}
