package view;

import Controller.Controller;
import controller.DoAnController;
import controller.MyController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.Flow;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.KhachHang;
import model.MyListModel;
import model.NhanVien;
import model.QLDL;
import model.SanPham;
import view.JLabelInJListExample.CustomJLabel;
import view.JLabelInJListExample.CustomSizeLabelListCellRenderer;
import view.MyView.CustomListCellRenderer;


public class DoAnView extends JFrame {
    private QLDL model;
    private JButton jLabel_head2_a;
    private JList<String> jList_hienthi;
    private ArrayList<SanPham> sanphams;
    private ArrayList<NhanVien> nhanviens;
    private ArrayList<KhachHang> khachhangs;

    private DefaultTableModel tableModelSP;
    private DefaultTableModel tableModelNV;
    private DefaultTableModel tableModelKH;

    private JTable table_center1;
    private JTable table_center2;
    private JTable table_center3;
	private JPanel cards;
	private JList list;
	private DoAnController controller;

    

    public DoAnView () {
        this.model = new QLDL();
        this.Init();
        this.setVisible(true);
    }
    public void Init () {
        this.setSize (950,530);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //head
        JPanel jPanel_head = new JPanel();
		   jPanel_head.setBackground(new Color(0,128,128));
		 
		   JLabel jLabel_head = new JLabel("QUẢN LÍ KHO HÀNG");
	
		   jLabel_head.setForeground(Color.white);
		   jPanel_head.setLayout(new FlowLayout(FlowLayout.LEFT));
		   jPanel_head.add(jLabel_head);
        //giữa
        //-----------------------------------------------------------------------------------------
        
        //JPanel_quanlysanpham
        
        
        JPanel jPanel_center = new JPanel();
        jPanel_center.setLayout(new GridLayout(2,1,10,10));
        //tren




        JPanel jPanel_center1 = new JPanel();
        jPanel_center1.setLayout(new BorderLayout());
        JLabel jLabel_center1 = new JLabel("Thông tin sản phẩm");
        jLabel_center1.setBackground(new Color(0,128,128));
        jLabel_center1.setOpaque(true);
        jLabel_center1.setForeground(Color.WHITE);
//Object [][] data = {
////                {"Mã sản phẩm","Tên sản phẩm","Số lượng","Loại","Mã nhà cung cấp","Giá tiền"},
//                {"abc123","Coca","1","1","Abc123","10.000 VND"},
//                {"abc123","Coca","1","1","Abc123","10.000 VND"},
//                {"abc123","Coca","1","1","Abc123","10.000 VND"},
//                {"abc123","Coca","1","1","Abc123","10.000 VND"},
//                {"abc123","Coca","1","1","Abc123","10.000 VND"},
//                {"abc123","Coca","1","1","Abc123","10.000 VND"},
//                {"abc123","Coca","1","1","Abc123","10.000 VND"},
//        };
//        String[] columnNames = {"Mã sản phẩm","Tên sản phẩm","Số lượng","Loại","Mã nhà cung cấp","Giá tiền"};
//        
//
//            JTable table_center1 = new JTable(String[]columnNames);


        sanphams = new ArrayList<>();
        tableModelSP = new DefaultTableModel();
        tableModelSP.addColumn("Mã sản phẩm ");
        tableModelSP.addColumn("Tên sản phẩm ");
        tableModelSP.addColumn("Số lượng");
        tableModelSP.addColumn("Loại");
        tableModelSP.addColumn("Mã nhà cung cấp");
        tableModelSP.addColumn("Giá tiền");
//        Object[] rowData1 = {"101", "vuvu", "123", "1","q10","1000"};
//        Object[] rowData2 = {"102", "vunguyen", "321", "1","q10","1000"};
//        tableModel.addRow(rowData1);
//        tableModel.addRow(rowData2);
        table_center1 = new JTable(tableModelSP);
        JScrollPane jScrollPane = new JScrollPane(table_center1);
        
        // Thanh tìm kiếm
        
        JPanel thanhtimkiem = new JPanel();
        thanhtimkiem.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton jButton_thanhtimkiem = new JButton ("Tìm kiếm");
        jButton_thanhtimkiem.setForeground(Color.white);
        jButton_thanhtimkiem.setBackground(new Color(0,128,128));
        jButton_thanhtimkiem.setPreferredSize(new Dimension (100,20));

        JTextField jTextField_thanhtimkiem = new JTextField(20);


        thanhtimkiem.add(jTextField_thanhtimkiem);
        thanhtimkiem.add(jButton_thanhtimkiem);
////---------------------------------------------------------------------------------------

        jPanel_center1.add(jLabel_center1, BorderLayout.NORTH);
        jPanel_center1.add(jScrollPane, BorderLayout.CENTER);
        jPanel_center1.add(thanhtimkiem, BorderLayout.SOUTH);
        jPanel_center1.setBorder(BorderFactory.createLineBorder(Color.black) );
        //dưới
        JPanel jPanel_ct2 = new JPanel();
        jPanel_ct2.setLayout(new BorderLayout());


        JPanel jPanel_center2 = new JPanel();
        jPanel_center2.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel_center2.setLayout(new GridLayout(4,2));
        JLabel center2a = new JLabel("Mã sản phẩm");
        JLabel center2b = new JLabel("Tên sản phẩm");
        JLabel center2c = new JLabel("Số lượng");
        JLabel center2d = new JLabel("Loại");
        JLabel center2e = new JLabel("Mã nhà cung cấp");
        JLabel center2f = new JLabel("Giá tiền");
        JLabel center2g = new JLabel("");
        JLabel center2h = new JLabel("");

        JTextField jTextField_center1 = new JTextField(23);
        JTextField jTextField_center2 = new JTextField(23);
        JTextField jTextField_center3 = new JTextField(25);
        JTextField jTextField_center4 = new JTextField(29);
        JTextField jTextField_center5 = new JTextField(21);
        JTextField jTextField_center6 = new JTextField(27);
        
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel5 = new JPanel();
        jPanel5.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel6 = new JPanel();
        jPanel6.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel7 = new JPanel();
        jPanel6.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel8 = new JPanel();
        jPanel6.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        
        
      jPanel1.add(center2a);
      jPanel1.add(jTextField_center1);
      jPanel2.add(center2b);
      jPanel2.add(jTextField_center2);
      jPanel3.add(center2c);
      jPanel3.add(jTextField_center3);
      jPanel4.add(center2d);
      jPanel4.add(jTextField_center4);
      jPanel5.add(center2e);
      jPanel5.add(jTextField_center5);
      jPanel6.add(center2f);
      jPanel6.add(jTextField_center6);
      jPanel7.add(center2g);
      jPanel8.add(center2h);
      
      
      jPanel_center2.add(jPanel1);
      jPanel_center2.add(jPanel2);
      jPanel_center2.add(jPanel3);
      jPanel_center2.add(jPanel4);
      jPanel_center2.add(jPanel5);
      jPanel_center2.add(jPanel6);
      jPanel_center2.add(jPanel7);
      jPanel_center2.add(jPanel8);

        
      

        JPanel  jPanel_center2a = new JPanel();
        jPanel_center2a.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton them = new JButton ("Thêm");
        them.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Kiểm tra xem tất cả các trường văn bản có được nhập đủ không
        if (jTextField_center1.getText().isEmpty() || 
            jTextField_center2.getText().isEmpty() || 
            jTextField_center3.getText().isEmpty() ||
            jTextField_center4.getText().isEmpty() ||
            jTextField_center5.getText().isEmpty() ||
            jTextField_center6.getText().isEmpty()) {
            // Hiển thị thông báo nếu không đủ dữ liệu được nhập
            JOptionPane.showMessageDialog(jPanel_center2, "Vui lòng nhập đủ dữ liệu.");
        } else {
            // Kiểm tra xem dữ liệu nhập vào các trường có đúng kiểu không
            try {
                // Thêm dữ liệu vào bảng nếu không có vấn đề
                themdanhsach();
} catch (NumberFormatException ex) {
                // Hiển thị thông báo nếu dữ liệu nhập không đúng kiểu
                JOptionPane.showMessageDialog(jPanel_center2, "Sai kiểu dữ liệu. Vui lòng kiểm tra lại.");
            }
        }
            }

            private void themdanhsach() {
                String idSP = jTextField_center1.getText();
                String name = jTextField_center2.getText();
                String quantity = jTextField_center3.getText();
             
                String type = jTextField_center4.getText();
               

                String idNCC = jTextField_center5.getText();
                String price = jTextField_center6.getText();
                double vPrice = Double.parseDouble(price);

                
                // tạo một thí sinh mới và thêm vào danh sách
                SanPham sanPham = new SanPham(idSP,name, quantity,type, idNCC, vPrice);
                sanphams.add(sanPham);
                Object[] rowData = {
                    
                  
                    
                     sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getSoLuongSanPham(),sanPham.getLoaiSanPham(), sanPham.getMaNhaCungCap(), sanPham.getGiaTienSanPham()
                    
                };
                tableModelSP.addRow(rowData);
                
            jTextField_center1.setText("");
            jTextField_center2.setText("");
            jTextField_center3.setText("");
            jTextField_center4.setText("");
            jTextField_center5.setText("");
            jTextField_center6.setText("");
                
            }
        });
        
        jPanel_center2a.add(them);
        
        
        them.setBackground(new Color(0,128,128));
        them.setForeground(Color.WHITE);
        JButton xoa = new JButton ("Xóa");
        
        xoa.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                xoadanhsach();
            }

            private void xoadanhsach() {
                int selectedRow = table_center1.getSelectedRow();
                if(selectedRow == -1)
                {
                    JOptionPane.showMessageDialog(DoAnView.this,"Vui lòng chọn sản phẩm bạn muốn xóa!");
                    return;
                }
                
                // xóa sinh viên khỏi danh sách và model của bảng
                int confirm = JOptionPane.showConfirmDialog(DoAnView.this,"Bạn có chắc muốn xóa sản phẩm này?");
                if(confirm == JOptionPane.YES_OPTION)
                {
                    sanphams.remove(selectedRow);
                    tableModelSP.removeRow(selectedRow);
                }
            }
        });
        
        jPanel_center2a.add(xoa);
        
        xoa.setBackground(new Color(0,128,128));
xoa.setForeground(Color.WHITE);
        JButton sua = new JButton ("Sửa");
        
        sua.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                suadanhsach();
            }


            private void suadanhsach() {
                int selectedRow = table_center1.getSelectedRow();
                if(selectedRow == -1)
                {
                    JOptionPane.showMessageDialog(DoAnView.this,"Vui lòng chọn sản phẩm bạn muốn sửa!");
                    return;
                }
                
                String idSP = (String) tableModelSP.getValueAt(selectedRow, 0);
                String name = (String) tableModelSP.getValueAt(selectedRow, 1);
                String quantity = (String) tableModelSP.getValueAt(selectedRow, 2);
                String type = (String) tableModelSP.getValueAt(selectedRow, 3);
                String idNCC = (String) tableModelSP.getValueAt(selectedRow, 4);
                Double price = (Double) tableModelSP.getValueAt(selectedRow, 5);
                

                jTextField_center1.setText(idSP);
                jTextField_center2.setText(name);
                jTextField_center3.setText(quantity);
                jTextField_center4.setText(type);
                jTextField_center5.setText(idNCC);
                jTextField_center6.setText(String.valueOf(price));

                 //xóa các thông tin được chọn ra khỏi danh sách nếu thông tin bị thay đổi
                if(!idSP.equals(jTextField_center1.getText()) || !price.equals(jTextField_center6.getText()) ||
                        !name.equals(jTextField_center2.getText()) ||
                        !quantity.equals(jTextField_center3.getText()) ||
                        !type.equals(jTextField_center4.getText()) ||
                        !idNCC.equals(jTextField_center5.getText()) )
                {
                    sanphams.remove(selectedRow);
                    tableModelSP.removeRow(selectedRow);
                }
            }
        });
        
        jPanel_center2a.add(sua);
        sua.setBackground(new Color(0,128,128));
        sua.setForeground(Color.WHITE);
        JButton save = new JButton ("Lưu");
        save.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Kiểm tra xem tất cả các trường văn bản có được nhập đủ không
        if (jTextField_center1.getText().isEmpty() || 
            jTextField_center2.getText().isEmpty() || 
            jTextField_center3.getText().isEmpty() ||
            jTextField_center4.getText().isEmpty() ||
            jTextField_center5.getText().isEmpty() ||
            jTextField_center6.getText().isEmpty()) {
            // Hiển thị thông báo nếu không đủ dữ liệu được nhập
JOptionPane.showMessageDialog(jPanel_center2, "Vui lòng nhập đủ dữ liệu.");
        } else {
            // Kiểm tra xem dữ liệu nhập vào các trường có đúng kiểu không
            try {
                // Thêm dữ liệu vào bảng nếu không có vấn đề
                savedanhsach();
            } catch (NumberFormatException ex) {
                // Hiển thị thông báo nếu dữ liệu nhập không đúng kiểu
                JOptionPane.showMessageDialog(jPanel_center2, "Sai kiểu dữ liệu. Vui lòng kiểm tra lại.");
            }
        }
            }

            private void savedanhsach() {
                String idSP = jTextField_center1.getText();
                String name = jTextField_center2.getText();
                String quantity = jTextField_center3.getText();
             
                String type = jTextField_center4.getText();
               

                String idNCC = jTextField_center5.getText();
                String price = jTextField_center6.getText();
                double vPrice = Double.parseDouble(price);

                
                // tạo một thí sinh mới và thêm vào danh sách
                SanPham sanPham = new SanPham(idSP,name, quantity,type, idNCC, vPrice);
                sanphams.add(sanPham);
                Object[] rowData = {
                    
                  
                    
                     sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getSoLuongSanPham(),sanPham.getLoaiSanPham(), sanPham.getMaNhaCungCap(), sanPham.getGiaTienSanPham()
                    
                };
                tableModelSP.addRow(rowData);
                
            jTextField_center1.setText("");
            jTextField_center2.setText("");
            jTextField_center3.setText("");
            jTextField_center4.setText("");
            jTextField_center5.setText("");
            jTextField_center6.setText("");
                
            }
      
        });
        
        jPanel_center2a.add(save);
        save.setBackground(new Color(0,128,128));
        save.setForeground(Color.WHITE);
        
        
        
        JButton huy = new JButton ("Hủy");
        
        huy.addActionListener(new ActionListener()
        {
            @Override
              public void actionPerformed(ActionEvent e) {
            jTextField_center1.setText("");
            jTextField_center2.setText("");
            jTextField_center3.setText("");
            jTextField_center4.setText("");
            jTextField_center5.setText("");
            jTextField_center6.setText("");
        
            }
           
        });
        
        jPanel_center2a.add(huy);
        huy.setBackground(new Color(0,128,128));
        huy.setForeground(Color.WHITE);
       
        jPanel_ct2.add(jPanel_center2, BorderLayout.CENTER);

        jPanel_ct2.add(jPanel_center2a, BorderLayout.SOUTH);
JLabel jLabel_Chinhsua = new JLabel ("Chỉnh sửa thông tin");
        jLabel_Chinhsua.setForeground(Color.white);
        jLabel_Chinhsua.setBackground(new Color(0,128,128));
        jLabel_Chinhsua.setOpaque(true);

        JPanel jPanel_Chinhsua = new JPanel();
        jPanel_Chinhsua.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanel_Chinhsua.setBackground(new Color(0,128,128));
        jPanel_Chinhsua.setOpaque(true);

        jPanel_Chinhsua.add(jLabel_Chinhsua);

        jPanel_ct2.add(jPanel_Chinhsua, BorderLayout.NORTH);





        jPanel_center.add(jPanel_center1);
        jPanel_center.add(jPanel_ct2);
//----------------------------------------------------------------------------------------------------



        //JPanel_quanlynhanvien

        
        
        
        
        
        JPanel jPanel_qlnv = new JPanel();
        jPanel_qlnv.setLayout(new GridLayout(2,1,10,10));
        //tren




        JPanel jPanel_qlnv1 = new JPanel();
        jPanel_qlnv1.setLayout(new BorderLayout());

        JLabel jLabel_qlnv1 = new JLabel("Thông tin nhân viên");
        jLabel_qlnv1.setBackground(new Color(0,128,128));
        jLabel_qlnv1.setOpaque(true);
        jLabel_qlnv1.setForeground(Color.WHITE);

//        Object [][] dataqlnv = {
//                {"Mã nhân viên","Tên nhân viên","Chức vụ","Ngày sinh","Giới tính","Số điện thoại"},
//                {"abc123","Nguyễn Tiến Sỹ","Nhân viên","26/7/2004","Nam","0353567485"},
//                {"abc123","Nguyễn Tiến Sỹ","Nhân viên","26/7/2004","Nam","0353567485"},
//                {"abc123","Nguyễn Tiến Sỹ","Nhân viên","26/7/2004","Nam","0353567485"},
//                {"abc123","Nguyễn Tiến Sỹ","Nhân viên","26/7/2004","Nam","0353567485"},
//                {"abc123","Nguyễn Tiến Sỹ","Nhân viên","26/7/2004","Nam","0353567485"},
//{"abc123","Nguyễn Tiến Sỹ","Nhân viên","26/7/2004","Nam","0353567485"},
//        };
        nhanviens = new ArrayList<>();
        tableModelNV = new DefaultTableModel();
        tableModelNV.addColumn("Mã nhân viên");
        tableModelNV.addColumn("Tên nhân viên ");
        tableModelNV.addColumn("Chức vụ");
        tableModelNV.addColumn("Ngày sinh");
        tableModelNV.addColumn("Giới tính");
        tableModelNV.addColumn("Số điện thoại");

        table_center2 = new JTable(tableModelNV);

       
        

        JScrollPane jScrollPane_qlnv = new JScrollPane(table_center2);

        
        
        /// Thanh tìm kiếm
        JPanel thanhtimkiem_qlnv = new JPanel();
        thanhtimkiem_qlnv.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton jButton_thanhtimkiem_qlnv = new JButton ("Tìm kiếm");
        jButton_thanhtimkiem_qlnv.setForeground(Color.white);
        jButton_thanhtimkiem_qlnv.setBackground(new Color(0,128,128));
        jButton_thanhtimkiem_qlnv.setPreferredSize(new Dimension (100,20));

        JTextField jTextField_thanhtimkiem_qlnv = new JTextField(20);
thanhtimkiem_qlnv.add(jTextField_thanhtimkiem_qlnv);
        thanhtimkiem_qlnv.add(jButton_thanhtimkiem_qlnv);

//// kết thúc thanh tìm kiếm

//-----------------------------------------------------------------------------------------------------------------------

        jPanel_qlnv1.add(jLabel_qlnv1, BorderLayout.NORTH);
        jPanel_qlnv1.add(jScrollPane_qlnv, BorderLayout.CENTER);
        jPanel_qlnv1.add(thanhtimkiem_qlnv, BorderLayout.SOUTH);
        jPanel_qlnv1.setBorder(BorderFactory.createLineBorder(Color.black) );
        //dưới
        JPanel jPanel_qlnv2 = new JPanel();
        jPanel_qlnv2.setLayout(new BorderLayout());


  	  JPanel jPanel_qlnv3 = new JPanel();
      jPanel_qlnv3.setBorder(BorderFactory.createLineBorder(Color.black));
      jPanel_qlnv3.setLayout(new GridLayout(4,2));
      JLabel qlnv3a = new JLabel("Mã nhân viên");
      JLabel qlnv3b = new JLabel("Tên nhân viên");
      JLabel qlnv3c = new JLabel("Chức vụ");
      JLabel qlnv3d = new JLabel("Ngày sinh");
      JLabel qlnv3e = new JLabel("Giới tính");
      JLabel qlnv3f = new JLabel("Số điện thoại");
      JLabel qlnv3g = new JLabel("");
      JLabel qlnv3h = new JLabel("");

      JTextField jTextField_qlnv1 = new JTextField(23);
      JTextField jTextField_qlnv2 = new JTextField(23);
      JTextField jTextField_qlnv3 = new JTextField(26);
      JTextField jTextField_qlnv4 = new JTextField(26);
      JTextField jTextField_qlnv5 = new JTextField(26);
      JTextField jTextField_qlnv6 = new JTextField(24);
      
      JPanel jPanel1qlnv = new JPanel();
      jPanel1qlnv.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
      JPanel jPanel2qlnv = new JPanel();
      jPanel2qlnv.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
      JPanel jPanel3qlnv = new JPanel();
      jPanel3qlnv.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
      JPanel jPanel4qlnv = new JPanel();
      jPanel4qlnv.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
      JPanel jPanel5qlnv = new JPanel();
      jPanel5qlnv.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
      JPanel jPanel6qlnv = new JPanel();
      jPanel6qlnv.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
      JPanel jPanel7qlnv = new JPanel();
      jPanel6qlnv.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
      JPanel jPanel8qlnv = new JPanel();
      jPanel6qlnv.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
      
      
    jPanel1qlnv.add(qlnv3a);
    jPanel1qlnv.add(jTextField_qlnv1);
    jPanel2qlnv.add(qlnv3b);
    jPanel2qlnv.add(jTextField_qlnv2);
    jPanel3qlnv.add(qlnv3c);
    jPanel3qlnv.add(jTextField_qlnv3);
    jPanel4qlnv.add(qlnv3d);
    jPanel4qlnv.add(jTextField_qlnv4);
    jPanel5qlnv.add(qlnv3e);
    jPanel5qlnv.add(jTextField_qlnv5);
    jPanel6qlnv.add(qlnv3f);
    jPanel6qlnv.add(jTextField_qlnv6);
    jPanel7qlnv.add(qlnv3g);
    jPanel8qlnv.add(qlnv3h);
    
    
    jPanel_qlnv3.add(jPanel1qlnv);
    jPanel_qlnv3.add(jPanel2qlnv);
    jPanel_qlnv3.add(jPanel3qlnv);
    jPanel_qlnv3.add(jPanel4qlnv);
    jPanel_qlnv3.add(jPanel5qlnv);
    jPanel_qlnv3.add(jPanel6qlnv);
    jPanel_qlnv3.add(jPanel7qlnv);
    jPanel_qlnv3.add(jPanel8qlnv);



        JPanel  jPanel_qlnv4 = new JPanel();
        jPanel_qlnv4.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        //// Thêm sửa xóa ---------------------------------------------------------------
        
        
        
        

        JButton them_qlnv = new JButton ("Thêm");
        them_qlnv.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Kiểm tra xem tất cả các trường văn bản có được nhập đủ không
        if (jTextField_qlnv1.getText().isEmpty() || 
            jTextField_qlnv2.getText().isEmpty() || 
            jTextField_qlnv3.getText().isEmpty() ||
            jTextField_qlnv4.getText().isEmpty() ||
            jTextField_qlnv5.getText().isEmpty() ||
            jTextField_qlnv6.getText().isEmpty()) {
            // Hiển thị thông báo nếu không đủ dữ liệu được nhập
JOptionPane.showMessageDialog(jPanel_qlnv3, "Vui lòng nhập đủ dữ liệu.");
        } else {
            // Kiểm tra xem dữ liệu nhập vào các trường có đúng kiểu không
            try {
                // Thêm dữ liệu vào bảng nếu không có vấn đề
                themdanhsachNV();
            } catch (NumberFormatException ex) {
                // Hiển thị thông báo nếu dữ liệu nhập không đúng kiểu
                JOptionPane.showMessageDialog(jPanel_qlnv3, "Sai kiểu dữ liệu. Vui lòng kiểm tra lại.");
            }
        }
            }

            private void themdanhsachNV() {
                String idNV = jTextField_qlnv1.getText();
                String name = jTextField_qlnv2.getText();
                String position = jTextField_qlnv3.getText();
             
                String birthday  = jTextField_qlnv4.getText();
               

                String gioitinh = jTextField_qlnv5.getText();
                String phone = jTextField_qlnv6.getText();
                int vPhone = Integer.parseInt(phone);

                
                // tạo một thí sinh mới và thêm vào danh sách
                NhanVien nhanVien = new NhanVien(idNV,name, position,birthday, gioitinh, vPhone);
                nhanviens.add(nhanVien);
                Object[] rowData1 = {
                    
                  
                    
                     nhanVien.getMaNhanVien(), nhanVien.getTenNhanVien(), nhanVien.getChucVu(),nhanVien.getNgaySinhNhanVien(), nhanVien.getGioiTinhNhanVien(), nhanVien.getSoDienThoaiNhanVien()
                    
                };
                tableModelNV.addRow(rowData1);
                
            jTextField_qlnv1.setText("");
            jTextField_qlnv2.setText("");
            jTextField_qlnv3.setText("");
            jTextField_qlnv4.setText("");
            jTextField_qlnv5.setText("");
            jTextField_qlnv6.setText("");
                
            }
        });
            jPanel_qlnv4.add(them_qlnv);

        

        them_qlnv.setBackground(new Color(0,128,128));
        them_qlnv.setForeground(Color.WHITE);
        
        
        // xoa nhan vien 
        
        //--------------------------------------
        
        
        
        JButton xoa_qlnv = new JButton ("Xóa");
        
         xoa_qlnv.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                xoadanhsachNV();
            }

            private void xoadanhsachNV() {
                int selectedRow = table_center2.getSelectedRow();
                if(selectedRow == -1)
                {
                    JOptionPane.showMessageDialog(DoAnView.this,"Vui lòng chọn sản phẩm bạn muốn xóa!");
                    return;
                }
                
                // xóa sinh viên khỏi danh sách và model của bảng
int confirm = JOptionPane.showConfirmDialog(DoAnView.this,"Bạn có chắc muốn xóa sản phẩm này?");
                if(confirm == JOptionPane.YES_OPTION)
                {
                    nhanviens.remove(selectedRow);
                    tableModelNV.removeRow(selectedRow);
                }
            }
        });

        
        xoa_qlnv.setBackground(new Color(0,128,128));
        xoa_qlnv.setForeground(Color.WHITE);
        JButton sua_qlnv = new JButton ("Sửa");
        
        
        sua_qlnv.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                suadanhsachNV();
            }


            private void suadanhsachNV() {
                int selectedRow = table_center2.getSelectedRow();
                if(selectedRow == -1)
                {
                    JOptionPane.showMessageDialog(DoAnView.this,"Vui lòng chọn sản phẩm bạn muốn sửa!");
                    return;
                }
                
                String idSP = (String) tableModelNV.getValueAt(selectedRow, 0);
                String name = (String) tableModelNV.getValueAt(selectedRow, 1);
                String quantity = (String) tableModelNV.getValueAt(selectedRow, 2);
                String type = (String) tableModelNV.getValueAt(selectedRow, 3);
                String idNCC = (String) tableModelNV.getValueAt(selectedRow, 4);
                int price = (int) tableModelNV.getValueAt(selectedRow, 5);
                

                jTextField_qlnv1.setText(idSP);
                jTextField_qlnv2.setText(name);
                jTextField_qlnv3.setText(quantity);
                jTextField_qlnv4.setText(type);
                jTextField_qlnv5.setText(idNCC);
                jTextField_qlnv6.setText(String.valueOf(price));
 
                nhanviens.remove(selectedRow);
                tableModelNV.removeRow(selectedRow);
                // ép kiểu
//                int priceInt = Integer.parseInt(jTextField_qlnv6.getText()) ;
//                 //xóa các thông tin được chọn ra khỏi danh sách nếu thông tin bị thay đổi
//                if(!idSP.equals(jTextField_qlnv1.getText()) || price != priceInt ||
//                        !name.equals(jTextField_qlnv2.getText()) ||
//                        !quantity.equals(jTextField_qlnv3.getText()) ||
//                        !type.equals(jTextField_qlnv4.getText()) ||
//                        !idNCC.equals(jTextField_qlnv5.getText()) )
//                {
//                    
//                    
//                    System.out.print("hello");
////                    nhanviens.remove(selectedRow);
////                    tableModelNV.removeRow(selectedRow);
//                }
            }
        });

        
        sua_qlnv.setBackground(new Color(0,128,128));
        sua_qlnv.setForeground(Color.WHITE);
JButton ok_qlnv = new JButton ("Lưu");
        
        ok_qlnv.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Kiểm tra xem tất cả các trường văn bản có được nhập đủ không
        if (jTextField_qlnv1.getText().isEmpty() || 
            jTextField_qlnv2.getText().isEmpty() || 
            jTextField_qlnv3.getText().isEmpty() ||
            jTextField_qlnv4.getText().isEmpty() ||
            jTextField_qlnv5.getText().isEmpty() ||
            jTextField_qlnv6.getText().isEmpty()) {
            // Hiển thị thông báo nếu không đủ dữ liệu được nhập
            JOptionPane.showMessageDialog(jPanel_qlnv3, "Vui lòng nhập đủ dữ liệu.");
        } else {
            // Kiểm tra xem dữ liệu nhập vào các trường có đúng kiểu không
            try {
                // Thêm dữ liệu vào bảng nếu không có vấn đề
                luudanhsachNV();
            } catch (NumberFormatException ex) {
                // Hiển thị thông báo nếu dữ liệu nhập không đúng kiểu
                JOptionPane.showMessageDialog(jPanel_qlnv3, "Sai kiểu dữ liệu. Vui lòng kiểm tra lại.");
            }
        }
            }

            private void luudanhsachNV() {
                String idNV = jTextField_qlnv1.getText();
                String name = jTextField_qlnv2.getText();
                String position = jTextField_qlnv3.getText();
             
                String birthday  = jTextField_qlnv4.getText();
               

                String gioitinh = jTextField_qlnv5.getText();
                String phone = jTextField_qlnv6.getText();
                int vPhone = Integer.parseInt(phone);

                
                // tạo một thí sinh mới và thêm vào danh sách
                NhanVien nhanVien = new NhanVien(idNV,name, position,birthday, gioitinh, vPhone);
                nhanviens.add(nhanVien);
                Object[] rowData1 = {
                    
                  
                    
                     nhanVien.getMaNhanVien(), nhanVien.getTenNhanVien(), nhanVien.getChucVu(),nhanVien.getNgaySinhNhanVien(), nhanVien.getGioiTinhNhanVien(), nhanVien.getSoDienThoaiNhanVien()
                    
                };
                tableModelNV.addRow(rowData1);
                
            jTextField_qlnv1.setText("");
            jTextField_qlnv2.setText("");
            jTextField_qlnv3.setText("");
            jTextField_qlnv4.setText("");
            jTextField_qlnv5.setText("");
            jTextField_qlnv6.setText("");
                
            }
        });
        
        
        ok_qlnv.setBackground(new Color(0,128,128));
        ok_qlnv.setForeground(Color.WHITE);
        JButton huy_qlnv = new JButton ("Hủy");
        huy_qlnv.addActionListener(new ActionListener()
        {
            @Override
public void actionPerformed(ActionEvent e) {
    
            jTextField_qlnv1.setText("");
            jTextField_qlnv2.setText("");
            jTextField_qlnv3.setText("");
            jTextField_qlnv4.setText("");
            jTextField_qlnv5.setText("");
            jTextField_qlnv6.setText("");
            
        }
         
        });

        
        
        
        huy_qlnv.setBackground(new Color(0,128,128));
        huy_qlnv.setForeground(Color.WHITE);
        jPanel_qlnv4.add(sua_qlnv);
        jPanel_qlnv4.add(xoa_qlnv);
        jPanel_qlnv4.add(ok_qlnv);
        jPanel_qlnv4.add(huy_qlnv);



        jPanel_qlnv2.add(jPanel_qlnv3, BorderLayout.CENTER);

        jPanel_qlnv2.add(jPanel_qlnv4, BorderLayout.SOUTH);


        JLabel jLabel_Chinhsua_qlnv = new JLabel ("Chỉnh sửa thông tin");
        jLabel_Chinhsua_qlnv.setForeground(Color.white);
        jLabel_Chinhsua_qlnv.setBackground(new Color(0,128,128));
        jLabel_Chinhsua_qlnv.setOpaque(true);

        JPanel jPanel_Chinhsua_qlnv = new JPanel();
        jPanel_Chinhsua_qlnv.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanel_Chinhsua_qlnv.setBackground(new Color(0,128,128));
        jPanel_Chinhsua_qlnv.setOpaque(true);

        jPanel_Chinhsua_qlnv.add(jLabel_Chinhsua_qlnv);

        jPanel_qlnv2.add(jPanel_Chinhsua_qlnv, BorderLayout.NORTH);





        jPanel_qlnv.add(jPanel_qlnv1);
        jPanel_qlnv.add(jPanel_qlnv2);


        //JPanel_qlkh
        JPanel jPanel_qlkh = new JPanel();
        jPanel_qlkh.setLayout(new GridLayout(2,1,10,10));
        //tren




        JPanel jPanel_qlkh1 = new JPanel();
        jPanel_qlkh1.setLayout(new BorderLayout());

        JLabel jLabel_qlkh1 = new JLabel("Thông tin khách hàng");
        jLabel_qlkh1.setBackground(new Color(0,128,128));
        jLabel_qlkh1.setOpaque(true);
        jLabel_qlkh1.setForeground(Color.WHITE);

//        Object [][] dataqlkh = {
//                {"Mã khách hàng","Tên khách hàng","Địa chỉ","Ngày sinh","Giới tính","Số điện thoại"},
//                {"abc123","Nguyễn Tiến Sỹ","33/6,Phước Vĩnh An, Củ Chi, TPHCM","26/7/2004","Nam","0353567485"},
//                {"abc123","Nguyễn Tiến Sỹ","33/6,Phước Vĩnh An, Củ Chi, TPHCM","26/7/2004","Nam","0353567485"},
//                {"abc123","Nguyễn Tiến Sỹ","33/6,Phước Vĩnh An, Củ Chi, TPHCM","26/7/2004","Nam","0353567485"},
//                {"abc123","Nguyễn Tiến Sỹ","33/6,Phước Vĩnh An, Củ Chi, TPHCM","26/7/2004","Nam","0353567485"},
//                {"abc123","Nguyễn Tiến Sỹ","33/6,Phước Vĩnh An, Củ Chi, TPHCM","26/7/2004","Nam","0353567485"},
//                {"abc123","Nguyễn Tiến Sỹ","33/6,Phước Vĩnh An, Củ Chi, TPHCM","26/7/2004","Nam","0353567485"},
//        };
//        String[] columnNamesqlkh = {"Mã khách hàng","Tên khách hàng","Địa chỉ","Ngày sinh","Giới tính","Số điện thoại"};
//        JTable table_qlkh1 = new JTable(dataqlkh, columnNamesqlkh);
khachhangs = new ArrayList<>();
        tableModelKH = new DefaultTableModel();
        tableModelKH.addColumn("Mã khách hàng ");
        tableModelKH.addColumn("Tên khách hàng");
        tableModelKH.addColumn("Địa chỉ");
        tableModelKH.addColumn("Ngày sinh");
        tableModelKH.addColumn("Giới tính ");
        tableModelKH.addColumn("Số điện thoại");
        
        table_center3 = new JTable(tableModelKH);
        

        JScrollPane jScrollPane_qlkh = new JScrollPane(table_center3);

        JPanel thanhtimkiem_qlkh = new JPanel();
        thanhtimkiem_qlkh.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton jButton_thanhtimkiem_qlkh = new JButton ("Tìm kiếm");
        jButton_thanhtimkiem_qlkh.setForeground(Color.white);
        jButton_thanhtimkiem_qlkh.setBackground(new Color(0,128,128));
        jButton_thanhtimkiem_qlkh.setPreferredSize(new Dimension (100,20));

        JTextField jTextField_thanhtimkiem_qlkh = new JTextField(20);


        thanhtimkiem_qlkh.add(jTextField_thanhtimkiem_qlkh);
        thanhtimkiem_qlkh.add(jButton_thanhtimkiem_qlkh);



        jPanel_qlkh1.add(jLabel_qlkh1, BorderLayout.NORTH);
        jPanel_qlkh1.add(jScrollPane_qlkh, BorderLayout.CENTER);
        jPanel_qlkh1.add(thanhtimkiem_qlkh, BorderLayout.SOUTH);
        jPanel_qlkh1.setBorder(BorderFactory.createLineBorder(Color.black) );
        //dưới
        JPanel jPanel_qlkh2 = new JPanel();
        jPanel_qlkh2.setLayout(new BorderLayout());


        
  	  JPanel jPanel_qlkh3 = new JPanel();
        jPanel_qlkh3.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel_qlkh3.setLayout(new GridLayout(4,2));
        JLabel qlkh3a = new JLabel("Mã khách hàng");
        JLabel qlkh3b = new JLabel("Tên khách hàng");
        JLabel qlkh3c = new JLabel("Địa chỉ");
        JLabel qlkh3d = new JLabel("Ngày sinh");
        JLabel qlkh3e = new JLabel("Giới tính");
        JLabel qlkh3f = new JLabel("Số điện thoại");
        JLabel qlkh3g = new JLabel("");
        JLabel qlkh3h = new JLabel("");

        JTextField jTextField_qlkh1 = new JTextField(23);
        JTextField jTextField_qlkh2 = new JTextField(23);
        JTextField jTextField_qlkh3 = new JTextField(27);
        JTextField jTextField_qlkh4 = new JTextField(26);
        JTextField jTextField_qlkh5 = new JTextField(26);
        JTextField jTextField_qlkh6 = new JTextField(24);
        
        JPanel jPanel1qlkh = new JPanel();
        jPanel1qlkh.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel2qlkh = new JPanel();
        jPanel2qlkh.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel3qlkh = new JPanel();
        jPanel3qlkh.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel4qlkh = new JPanel();
        jPanel4qlkh.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel5qlkh = new JPanel();
        jPanel5qlkh.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel6qlkh = new JPanel();
        jPanel6qlkh.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel7qlkh = new JPanel();
        jPanel6qlkh.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel8qlkh = new JPanel();
        jPanel6qlkh.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        
        
      jPanel1qlkh.add(qlkh3a);
      jPanel1qlkh.add(jTextField_qlkh1);
      jPanel2qlkh.add(qlkh3b);
      jPanel2qlkh.add(jTextField_qlkh2);
      jPanel3qlkh.add(qlkh3c);
      jPanel3qlkh.add(jTextField_qlkh3);
      jPanel4qlkh.add(qlkh3d);
      jPanel4qlkh.add(jTextField_qlkh4);
      jPanel5qlkh.add(qlkh3e);
      jPanel5qlkh.add(jTextField_qlkh5);
      jPanel6qlkh.add(qlkh3f);
      jPanel6qlkh.add(jTextField_qlkh6);
      jPanel7qlkh.add(qlkh3g);
      jPanel8qlkh.add(qlkh3h);
      
      
      jPanel_qlkh3.add(jPanel1qlkh);
      jPanel_qlkh3.add(jPanel2qlkh);
      jPanel_qlkh3.add(jPanel3qlkh);
      jPanel_qlkh3.add(jPanel4qlkh);
      jPanel_qlkh3.add(jPanel5qlkh);
      jPanel_qlkh3.add(jPanel6qlkh);
      jPanel_qlkh3.add(jPanel7qlkh);
      jPanel_qlkh3.add(jPanel8qlkh);



        JPanel  jPanel_qlkh4 = new JPanel();
        jPanel_qlkh4.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
// Nút thêm
        //---------------------------------------
        
        
        
        
        JButton them_qlkh = new JButton ("Thêm");
        
         them_qlkh.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Kiểm tra xem tất cả các trường văn bản có được nhập đủ không
        if (jTextField_qlkh1.getText().isEmpty() || 
            jTextField_qlkh2.getText().isEmpty() || 
            jTextField_qlkh3.getText().isEmpty() ||
            jTextField_qlkh4.getText().isEmpty() ||
            jTextField_qlkh5.getText().isEmpty() ||
            jTextField_qlkh6.getText().isEmpty()) {
            // Hiển thị thông báo nếu không đủ dữ liệu được nhập
            JOptionPane.showMessageDialog(jPanel_qlkh3, "Vui lòng nhập đủ dữ liệu.");
        } else {
            // Kiểm tra xem dữ liệu nhập vào các trường có đúng kiểu không
            try {
                // Thêm dữ liệu vào bảng nếu không có vấn đề
                themdanhsachKH();
            } catch (NumberFormatException ex) {
                // Hiển thị thông báo nếu dữ liệu nhập không đúng kiểu
                JOptionPane.showMessageDialog(jPanel_qlkh3, "Sai kiểu dữ liệu. Vui lòng kiểm tra lại.");
            }
        }
            }

            private void themdanhsachKH() {
                String idSP = jTextField_qlkh1.getText();
                String name = jTextField_qlkh2.getText();
                String quantity = jTextField_qlkh3.getText();
             
                String type = jTextField_qlkh4.getText();
               

                String idNCC = jTextField_qlkh5.getText();
                String price = jTextField_qlkh6.getText();
                int vPrice = Integer.parseInt(price);

                
                // tạo một thí sinh mới và thêm vào danh sách
                KhachHang khachHang = new KhachHang(idSP,name, quantity,type, idNCC, vPrice);
                khachhangs.add(khachHang);
                Object[] rowData2 = {
                    
                  
                    
                     khachHang.getMaKhachHang(), khachHang.getTenKhachHang(), khachHang.getDiaChiKhachHang(),khachHang.getNgaySinhKhachHang(), khachHang.getGioiTinhKhachHang(), khachHang.getSoDienThoaiKhachHang()
                    
                };
                tableModelKH.addRow(rowData2);
                
            jTextField_qlkh1.setText("");
            jTextField_qlkh2.setText("");
            jTextField_qlkh3.setText("");
            jTextField_qlkh4.setText("");
            jTextField_qlkh5.setText("");
            jTextField_qlkh6.setText("");
                
            }
        });

        them_qlkh.setBackground(new Color(0,128,128));
        them_qlkh.setForeground(Color.WHITE);
        JButton xoa_qlkh = new JButton ("Xóa");
xoa_qlkh.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                xoadanhsachKH();
            }

            private void xoadanhsachKH() {
                int selectedRow = table_center3.getSelectedRow();
                if(selectedRow == -1)
                {
                    JOptionPane.showMessageDialog(DoAnView.this,"Vui lòng chọn sản phẩm bạn muốn xóa!");
                    return;
                }
                
                // xóa sinh viên khỏi danh sách và model của bảng
                int confirm = JOptionPane.showConfirmDialog(DoAnView.this,"Bạn có chắc muốn xóa sản phẩm này?");
                if(confirm == JOptionPane.YES_OPTION)
                {
                    khachhangs.remove(selectedRow);
                    tableModelKH.removeRow(selectedRow);
                }
            }
        });

        
        xoa_qlkh.setBackground(new Color(0,128,128));
        xoa_qlkh.setForeground(Color.WHITE);
        JButton sua_qlkh = new JButton ("Sửa");
        
        sua_qlkh.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                suadanhsachKH();
            }


            private void suadanhsachKH() {
                int selectedRow = table_center3.getSelectedRow();
                if(selectedRow == -1)
                {
                    JOptionPane.showMessageDialog(DoAnView.this,"Vui lòng chọn sản phẩm bạn muốn sửa!");
                    return;
                }
                
                String idSP = (String) tableModelKH.getValueAt(selectedRow, 0);
                String name = (String) tableModelKH.getValueAt(selectedRow, 1);
                String quantity = (String) tableModelKH.getValueAt(selectedRow, 2);
                String type = (String) tableModelKH.getValueAt(selectedRow, 3);
                String idNCC = (String) tableModelKH.getValueAt(selectedRow, 4);
                int price = (int) tableModelKH.getValueAt(selectedRow, 5);
                

                jTextField_qlkh1.setText(idSP);
                jTextField_qlkh2.setText(name);
                jTextField_qlkh3.setText(quantity);
                jTextField_qlkh4.setText(type);
                jTextField_qlkh5.setText(idNCC);
                jTextField_qlkh6.setText(String.valueOf(price));
                
                khachhangs.remove(selectedRow);
                tableModelKH.removeRow(selectedRow);
                 //xóa các thông tin được chọn ra khỏi danh sách nếu thông tin bị thay đổi
//                if(!idSP.equals(jTextField_center1.getText()) || !price.equals(jTextField_center6.getText()) ||
//                        !name.equals(jTextField_center2.getText()) ||
//                        !quantity.equals(jTextField_center3.getText()) ||
//                        !type.equals(jTextField_center4.getText()) ||
//                        !idNCC.equals(jTextField_center5.getText()) )
//                {
//                    sanphams.remove(selectedRow);
//                    tableModelSP.removeRow(selectedRow);
//                }
            }
        });

        
        sua_qlkh.setBackground(new Color(0,128,128));
        sua_qlkh.setForeground(Color.WHITE);
        JButton ok_qlkh = new JButton ("Lưu");
        
        ok_qlkh.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Kiểm tra xem tất cả các trường văn bản có được nhập đủ không
        if (jTextField_qlkh1.getText().isEmpty() || 
            jTextField_qlkh2.getText().isEmpty() || 
            jTextField_qlkh3.getText().isEmpty() ||
            jTextField_qlkh4.getText().isEmpty() ||
            jTextField_qlkh5.getText().isEmpty() ||
            jTextField_qlkh6.getText().isEmpty()) {
            // Hiển thị thông báo nếu không đủ dữ liệu được nhập
            JOptionPane.showMessageDialog(jPanel_qlkh3, "Vui lòng nhập đủ dữ liệu.");
        } else {
            // Kiểm tra xem dữ liệu nhập vào các trường có đúng kiểu không
            try {
                // Thêm dữ liệu vào bảng nếu không có vấn đề
                luudanhsachKH();
            } catch (NumberFormatException ex) {
                // Hiển thị thông báo nếu dữ liệu nhập không đúng kiểu
                JOptionPane.showMessageDialog(jPanel_qlkh3, "Sai kiểu dữ liệu. Vui lòng kiểm tra lại.");
            }
        }
            }

            private void luudanhsachKH() {
                String idSP = jTextField_qlkh1.getText();
                String name = jTextField_qlkh2.getText();
                String quantity = jTextField_qlkh3.getText();
             
                String type = jTextField_qlkh4.getText();
               

                String idNCC = jTextField_qlkh5.getText();
                String price = jTextField_qlkh6.getText();
                int vPrice = Integer.parseInt(price);

                
                // tạo một thí sinh mới và thêm vào danh sách
                KhachHang khachHang = new KhachHang(idSP,name, quantity,type, idNCC, vPrice);
                khachhangs.add(khachHang);
                Object[] rowData2 = {
                    
                  
                    
                     khachHang.getMaKhachHang(), khachHang.getTenKhachHang(), khachHang.getDiaChiKhachHang(),khachHang.getNgaySinhKhachHang(), khachHang.getGioiTinhKhachHang(), khachHang.getSoDienThoaiKhachHang()
                    
                };
                tableModelKH.addRow(rowData2);
                
            jTextField_qlkh1.setText("");
jTextField_qlkh2.setText("");
            jTextField_qlkh3.setText("");
            jTextField_qlkh4.setText("");
            jTextField_qlkh5.setText("");
            jTextField_qlkh6.setText("");
                
            }
        });
        
        
        ok_qlkh.setBackground(new Color(0,128,128));
        ok_qlkh.setForeground(Color.WHITE);
        JButton huy_qlkh = new JButton ("Hủy");
        
        huy_qlkh.addActionListener(new ActionListener()
        {
            @Override
              public void actionPerformed(ActionEvent e) {
            jTextField_qlkh1.setText("");
            jTextField_qlkh2.setText("");
            jTextField_qlkh3.setText("");
            jTextField_qlkh4.setText("");
            jTextField_qlkh5.setText("");
            jTextField_qlkh6.setText("");
            
        }
        });
        huy_qlkh.setBackground(new Color(0,128,128));
        huy_qlkh.setForeground(Color.WHITE);
        jPanel_qlkh4.add(them_qlkh);
        jPanel_qlkh4.add(sua_qlkh);
        jPanel_qlkh4.add(xoa_qlkh);
        jPanel_qlkh4.add(ok_qlkh);
        jPanel_qlkh4.add(huy_qlkh);
        jPanel_qlkh2.add(jPanel_qlkh3, BorderLayout.CENTER);

        jPanel_qlkh2.add(jPanel_qlkh4, BorderLayout.SOUTH);


        JLabel jLabel_Chinhsua_qlkh = new JLabel ("Chỉnh sửa thông tin");
        jLabel_Chinhsua_qlkh.setForeground(Color.white);
        jLabel_Chinhsua_qlkh.setBackground(new Color(0,128,128));
        jLabel_Chinhsua_qlkh.setOpaque(true);

        JPanel jPanel_Chinhsua_qlkh = new JPanel();
        jPanel_Chinhsua_qlkh.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanel_Chinhsua_qlkh.setBackground(new Color(0,128,128));
        jPanel_Chinhsua_qlkh.setOpaque(true);

        jPanel_Chinhsua_qlkh.add(jLabel_Chinhsua_qlkh);

        jPanel_qlkh2.add(jPanel_Chinhsua_qlkh, BorderLayout.NORTH);





        jPanel_qlkh.add(jPanel_qlkh1);
        jPanel_qlkh.add(jPanel_qlkh2);


        //JPanel_taikhoan
        JPanel jPanel_taikhoan = new JPanel();

        //JPanel_thongke
        JPanel jPanel_thongke = new JPanel();
        //JPanel_banhang
        JPanel jPanel_banhang = new JPanel();
        //JPanel_phieuNhap
        JPanel jPanel_phieunhap = new JPanel();
        //Jpanel hoaDon
        JPanel jPanel_hoadon = new JPanel();
        //JPanel_nhacungcap
        JPanel jPanel_nhacungcap = new JPanel();




        //dưới
        JPanel jPanel_footer = new JPanel();
	    jPanel_footer.setBackground(new Color(0,128,128));




       


        //phiếu nhập

        jPanel_phieunhap.setLayout(new GridLayout(2, 1, 10, 10));

        // Phần trên
        JPanel jPanel_nhap1 = new JPanel();
        jPanel_nhap1.setLayout(new BorderLayout());

        JLabel jLabel_nhap1 = new JLabel("Thông tin đơn hàng");
        jLabel_nhap1.setBackground(new Color(0,128,128));
        jLabel_nhap1.setOpaque(true);
        jLabel_nhap1.setForeground(Color.WHITE);


        Object[][] dataNhap = {
                {"Mã phiếu nhập", "Mã Sản Phẩm", "Tên Sản Phẩm ", "Số Lượng", "Đơn Giá", "Tổng tiền"},
                {"abc123", "12345678", "abc", "1", "30000", "30000"},
                {"abc123", "12345678", "abc", "1", "30000", "30000"},
                {"abc123", "12345678", "abc", "1", "30000", "30000"},
                {"abc123", "12345678", "abc", "1", "30000", "30000"},
                {"abc123", "12345678", "abc", "1", "30000", "30000"},
                {"abc123", "12345678", "abc", "1", "30000", "30000"},

        };
        String[] columnNamesNhapXuat = {"Mã phiếu nhập", "Mã Sản Phẩm", "Tên Sản Phẩm ", "Số Lượng", "Đơn Giá", "Tổng tiền"};
        JTable tableNhapXuat = new JTable(dataNhap, columnNamesNhapXuat);

        JScrollPane jScrollPaneNhap = new JScrollPane(tableNhapXuat);

        JPanel thanhtimkiem_nhap = new JPanel();
        thanhtimkiem_nhap.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton jButton_thanhtimkiem_nhap = new JButton("Tìm kiếm");
        jButton_thanhtimkiem_nhap.setForeground(Color.white);
        jButton_thanhtimkiem_nhap.setBackground(new Color(0,128,128));
        jButton_thanhtimkiem_nhap.setPreferredSize(new Dimension(100, 20));

        JTextField jTextField_thanhtimkiem_nhap = new JTextField(20);

        thanhtimkiem_nhap.add(jTextField_thanhtimkiem_nhap);
        thanhtimkiem_nhap.add(jButton_thanhtimkiem_nhap);

        jPanel_nhap1.add(jLabel_nhap1, BorderLayout.NORTH);
        jPanel_nhap1.add(jScrollPaneNhap, BorderLayout.CENTER);
        jPanel_nhap1.add(thanhtimkiem_nhap, BorderLayout.SOUTH);
jPanel_nhap1.setBorder(BorderFactory.createLineBorder(Color.black));

        // Phần dưới
        JPanel jPanel_nhap2 = new JPanel();
        jPanel_nhap2.setLayout(new BorderLayout());
        
        JPanel jPanel_nhap3 = new JPanel();
  	  jPanel_nhap3.setBorder(BorderFactory.createLineBorder(Color.black));
  	  jPanel_nhap3.setLayout(new GridLayout(4,2));
        JLabel nhap3a = new JLabel("Mã phiếu nhập");
        JLabel nhap3b = new JLabel("Mã sản phẩm");
        JLabel nhap3c = new JLabel("Tên sản phẩm");
        JLabel  nhap3d = new JLabel("Số lượng");
        JLabel  nhap3e = new JLabel("Đơn giá");
        JLabel  nhap3f = new JLabel("Tổng tiền");
        JLabel  nhap3g = new JLabel("");
        JLabel  nhap3h = new JLabel("");

        JTextField jTextField_nhap1 = new JTextField(23);
        JTextField jTextField_nhap2 = new JTextField(23);
        JTextField jTextField_nhap3 = new JTextField(23);
        JTextField jTextField_nhap4 = new JTextField(25);
        JTextField jTextField_nhap5 = new JTextField(26);
        JTextField jTextField_nhap6 = new JTextField(25);
        
        JPanel jPanel1nhap = new JPanel();
        jPanel1nhap.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel2nhap = new JPanel();
        jPanel2nhap.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel3nhap = new JPanel();
        jPanel3nhap.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel4nhap = new JPanel();
        jPanel4nhap.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel5nhap = new JPanel();
        jPanel5nhap.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel6nhap = new JPanel();
        jPanel6nhap.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel7nhap = new JPanel();
        jPanel6nhap.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel jPanel8nhap = new JPanel();
        jPanel6nhap.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        
        
      jPanel1nhap.add(nhap3a);
      jPanel1nhap.add(jTextField_nhap1);
      jPanel2nhap.add(nhap3b);
      jPanel2nhap.add(jTextField_nhap2);
      jPanel3nhap.add(nhap3c);
      jPanel3nhap.add(jTextField_nhap3);
      jPanel4nhap.add(nhap3d);
      jPanel4nhap.add(jTextField_nhap4);
      jPanel5nhap.add(nhap3e);
      jPanel5nhap.add(jTextField_nhap5);
      jPanel6nhap.add(nhap3f);
      jPanel6nhap.add(jTextField_nhap6);
      jPanel7nhap.add(nhap3g);
      jPanel8nhap.add(nhap3h);
      
      
      jPanel_nhap3.add(jPanel1nhap);
      jPanel_nhap3.add(jPanel2nhap);
      jPanel_nhap3.add(jPanel3nhap);
      jPanel_nhap3.add(jPanel4nhap);
      jPanel_nhap3.add(jPanel5nhap);
      jPanel_nhap3.add(jPanel6nhap);
      jPanel_nhap3.add(jPanel7nhap);
      jPanel_nhap3.add(jPanel8nhap);
        JPanel jPanel_nhap4 = new JPanel();
        jPanel_nhap4.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton jButton_them_nhap = new JButton("Thêm");
        jButton_them_nhap.setBackground(new Color(0,128,128));
        jButton_them_nhap.setForeground(Color.WHITE);
        JButton jButton_xoa_nhap = new JButton("Xóa");
        jButton_xoa_nhap.setBackground(new Color(0,128,128));
        jButton_xoa_nhap.setForeground(Color.WHITE);
        JButton jButton_sua_nhap = new JButton("Sửa");
        jButton_sua_nhap.setBackground(new Color(0,128,128));
        jButton_sua_nhap.setForeground(Color.WHITE);
        JButton jButton_ok_nhap = new JButton("OK");
        jButton_ok_nhap.setBackground(new Color(0,128,128));
        jButton_ok_nhap.setForeground(Color.WHITE);
        JButton jButton_huy_nhap = new JButton("Hủy");
        jButton_huy_nhap.setBackground(new Color(0,128,128));
        jButton_huy_nhap.setForeground(Color.WHITE);
        jPanel_nhap4.add(jButton_them_nhap);
        jPanel_nhap4.add(jButton_sua_nhap);
        jPanel_nhap4.add(jButton_xoa_nhap);
        jPanel_nhap4.add(jButton_ok_nhap);
        jPanel_nhap4.add(jButton_huy_nhap);

        jPanel_nhap2.add(jPanel_nhap3, BorderLayout.CENTER);
        jPanel_nhap2.add(jPanel_nhap4, BorderLayout.SOUTH);

        JLabel jLabel_Chinhsua_nhap = new JLabel("Nhập thông tin đơn hàng");
jLabel_Chinhsua_nhap.setForeground(Color.white);
        jLabel_Chinhsua_nhap.setBackground(new Color(0,128,128));
        jLabel_Chinhsua_nhap.setOpaque(true);

        JPanel jPanel_Chinhsua_nhap = new JPanel();
        jPanel_Chinhsua_nhap.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanel_Chinhsua_nhap.setBackground(new Color(0,128,128));
        jPanel_Chinhsua_nhap.setOpaque(true);

        jPanel_Chinhsua_nhap.add(jLabel_Chinhsua_nhap);

        jPanel_nhap2.add(jPanel_Chinhsua_nhap, BorderLayout.NORTH);

        jPanel_phieunhap.add(jPanel_nhap1);
        jPanel_phieunhap.add(jPanel_nhap2);


        //JPanel_banhang

        jPanel_banhang.setLayout(new BorderLayout());

        Object [][] databh = {
{"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
                {"abc123","Coca","1","1","Abc123","10.000 VND"},
        };
        String[] columnNamesbh = {"Mã sản phẩm","Tên sản phẩm","Số lượng","Loại","Mã nhà cung cấp","Giá tiền"};
        JTable table_bh1 = new JTable(databh, columnNamesbh);

        JScrollPane jScrollPane_bh = new JScrollPane(table_bh1);
        jPanel_banhang.add(jScrollPane_bh, BorderLayout.CENTER);
//JPanel_taikhoan
        jPanel_taikhoan.setLayout(new BorderLayout());
        Object [][] datatk = {

                {"abc123","Coca","abc123","0353567485","Hoạt động"},
                {"abc123","Coca","abc123","0353567485","Hoạt động"},
                {"abc123","Coca","abc123","0353567485","Hoạt động"},
                {"abc123","Coca","abc123","0353567485","Hoạt động"},
                {"abc123","Coca","abc123","0353567485","Hoạt động"},
                {"abc123","Coca","abc123","0353567485","Hoạt động"},
        };
String[] columnNamestk = {"Mã tài khoản","Tên đăng nhập","Mã nhân viên","Số điện thoại","Trạng thái"};
        JTable table_tk1 = new JTable(datatk, columnNamestk);

        JScrollPane jScrollPane_tk = new JScrollPane(table_tk1);
        jPanel_taikhoan.add(jScrollPane_tk, BorderLayout.CENTER);
//JPanel_nhacungcap
        jPanel_nhacungcap.setLayout(new BorderLayout());
        Object [][] datancc = {

                {"abc123","Coca","Nguyễn Tiến Sỹ","TPHCM","0353567485"},
                {"abc123","Coca","Nguyễn Tiến Sỹ","TPHCM","0353567485"},
                {"abc123","Coca","Nguyễn Tiến Sỹ","TPHCM","0353567485"},
{"abc123","Coca","Nguyễn Tiến Sỹ","TPHCM","0353567485"},
                {"abc123","Coca","Nguyễn Tiến Sỹ","TPHCM","0353567485"},
        };
        String[] columnNamesncc = {"Mã nhà cung cấp","Tên nhà cung cấp","Tên người liên hệ","Địa chỉ","Số điện thoại"};
        JTable table_ncc1 = new JTable(datancc, columnNamesncc);

        JScrollPane jScrollPane_ncc = new JScrollPane(table_ncc1);
        jPanel_nhacungcap.add(jScrollPane_ncc, BorderLayout.CENTER);







        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.addTab("Bán hàng", jPanel_banhang );
        jTabbedPane.addTab("Quản lý sản phẩm",jPanel_center);
        jTabbedPane.addTab("Quản lý nhân viên", jPanel_qlnv);
        jTabbedPane.addTab("Quản lý khách hàng", jPanel_qlkh);
        jTabbedPane.addTab("Phiếu Nhập", jPanel_phieunhap);
        jTabbedPane.addTab("Hóa Đơn", jPanel_hoadon);
        jTabbedPane.addTab("Nhà cung cấp",jPanel_nhacungcap);
        jTabbedPane.addTab("Tài khoản", jPanel_taikhoan);
        jTabbedPane.addTab("Thống kê", jPanel_thongke);

//trái JList 
        /*
        CustomJLabel[] labels = {
                new CustomJLabel("Bán hàng", Color.white,new Color(0,128,128), new Dimension(120, 50)),
                new CustomJLabel("Quản lý sản phẩm", Color.white, new Color(0,128,128), new Dimension(120, 50)),
                new CustomJLabel("Quản lý nhân viên", Color.white, new Color(0,128,128), new Dimension(120, 50)),
                new CustomJLabel("Quản lý khách hàng", Color.white,new Color(0,128,128), new Dimension(120, 50)),
                new CustomJLabel("Nhập", Color.white, new Color(0,128,128), new Dimension(120, 50)),
                new CustomJLabel("Hóa đơn", Color.white,new Color(0,128,128), new Dimension(120, 50)),
                new CustomJLabel("Nhà cung cấp", Color.white,new Color(0,128,128), new Dimension(120, 50)),
                new CustomJLabel("Tài khoản", Color.white,new Color(0,128,128), new Dimension(120, 50)),
                new CustomJLabel("Thống kê", Color.white, new Color(0,128,128), new Dimension(120, 50))
        };
              DoAnController controller = new DoAnController(this);
        // Tạo một JList và đặt ListCellRenderer để hiển thị các JLabel với kích thước tùy chỉnh
        JList<CustomJLabel> jList = new JList<>(labels);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    

     

 //       jList.setBorder(BorderFactory.createLineBorder(Color.black));
        jList.setCellRenderer(new CustomSizeLabelListCellRenderer());
        
        */
        ListModel listModel = new model.ListModel();
        list = new JList<>(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     
        list.setBackground(new Color(0,128,128));
        list.setForeground(Color.white);
        
        
        
        
        
        JPanel jPanel_west_giua = new JPanel();
        jPanel_west_giua.setBackground(new Color(0,128,128));
       
        jPanel_west_giua.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel_west_giua.add(list, BorderLayout.CENTER);
        
        JPanel jPanel_west = new JPanel();
        jPanel_west.setLayout(new BorderLayout());
        Color color = new Color (32,178,170 );
        
        
        
        JPanel jPanel_west_tren = new JPanel();
        jPanel_west_tren.setBackground(new Color(0,128,128));
        jPanel_west_tren.setLayout(new GridLayout(5,1));
        JLabel jLabel_xinchao = new JLabel("Xin Chào! SYNGUYEN");
        jLabel_xinchao.setForeground(Color.white);
        jLabel_xinchao.setBackground(new Color(0,128,128));
        JLabel jLabel_xinchao1 = new JLabel("");
        JLabel jLabel_xinchao2 = new JLabel("");
        JLabel jLabel_xinchao3 = new JLabel("");
        JLabel jLabel_xinchao4 = new JLabel("");
        
     
        jPanel_west_tren.setBorder(BorderFactory.createLineBorder(Color.black));
 
        jPanel_west_tren.add(jLabel_xinchao4);
        jPanel_west_tren.add(jLabel_xinchao1);
        jPanel_west_tren.add(jLabel_xinchao);
        jPanel_west_tren.add(jLabel_xinchao2);
        jPanel_west_tren.add(jLabel_xinchao3);
        
        
        
        JPanel jPanel_west_duoi = new JPanel();
        jPanel_west_duoi.setLayout(new GridLayout(2,1));
        JButton jButton_doithongtin = new JButton("Đổi thông tin");

        jButton_doithongtin.setBackground(new Color(0,128,128));
        jButton_doithongtin.setForeground(Color.white);
        jButton_doithongtin.setBorder(BorderFactory.createLineBorder(Color.black));
        JButton jButton_dangxuat = new JButton("Đăng xuất");

        jButton_dangxuat.setBackground(new Color(0,128,128));
        jButton_dangxuat.setForeground(Color.white);
        jButton_dangxuat.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel_west_duoi.add(jButton_doithongtin);
        jPanel_west_duoi.add(jButton_dangxuat);
    
        jPanel_west.add(jPanel_west_tren, BorderLayout.NORTH);
        jPanel_west.add(jPanel_west_duoi, BorderLayout.SOUTH);
        jPanel_west.add(jPanel_west_giua, BorderLayout.CENTER);
    
         CardLayout cardLayout = new CardLayout();
         cards = new JPanel(cardLayout); 
         cards.add(jPanel_banhang, "Bán hàng");
         cards.add(jPanel_center, "Quản lý sản phẩm");
         cards.add(jPanel_qlnv, "Quản lý nhân viên");
         cards.add(jPanel_qlkh, "Quản lý khách hàng");
         cards.add(jPanel_phieunhap, "Nhập");
         cards.add(jPanel_hoadon, "Hóa đơn");
         cards.add(jPanel_nhacungcap, "Nhà cung cấp");
         cards.add(jPanel_taikhoan, "Tài khoản");
         cards.add(jPanel_thongke, "Thống kê");
         
         
         list.setCellRenderer(new CustomListCellRenderer()); 

         list.addListSelectionListener(new ListSelectionListener() {
             public void valueChanged(ListSelectionEvent e) {
                 if (!e.getValueIsAdjusting()) {
                     String selectedCategory = (String) list.getSelectedValue();
                     cardLayout.show(cards, selectedCategory);
                 }
             }
         });
         
         controller = new DoAnController(this);

         list.addListSelectionListener(e -> {
             JList<String> source = (JList<String>) e.getSource();
             String selectedPanel = source.getSelectedValue();
             controller.changeCard(selectedPanel);
         });
         
         





        this.setLayout(new BorderLayout(10,10));
        this.setBackground(Color.cyan);
        this.add(jPanel_west, BorderLayout.WEST);
        this.add(jPanel_head, BorderLayout.NORTH);
        this.getContentPane().add(cards, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);






    }
    // Lớp JLabel tùy chỉnh với text, màu văn bản, màu nền và kích thước
    static class CustomJLabel extends JLabel {
        private Dimension preferredSize;

        public CustomJLabel(String text, Color textColor, Color backgroundColor, Dimension preferredSize) {
            super(text);
            setForeground(textColor);
            setBackground(backgroundColor);
            this.preferredSize = preferredSize;
            setHorizontalAlignment(SwingConstants.CENTER);
            setVerticalAlignment(SwingConstants.CENTER);
        }

        public Dimension getPreferredSize() {
            return preferredSize;
        }
    }

    // Lớp renderer để hiển thị các JLabel với kích thước tùy chỉnh trong JList
    static class CustomSizeLabelListCellRenderer extends JLabel implements ListCellRenderer<CustomJLabel> {
        public CustomSizeLabelListCellRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends CustomJLabel> list, CustomJLabel value, int index, boolean isSelected, boolean cellHasFocus) {
            // Sử dụng JLabel tùy chỉnh từ mảng để hiển thị
            CustomJLabel label = value;

            // Thiết lập màu sắc và viền dựa trên isSelected
            setBackground(isSelected ? list.getSelectionBackground() : label.getBackground());
            setForeground(isSelected ? list.getSelectionForeground() : label.getForeground());

            // Thiết lập giá trị từ JLabel tùy chỉnh
            setText(label.getText());

            // Thiết lập kích thước từ JLabel tùy chỉnh
            setPreferredSize(label.getPreferredSize());

            return this;
        }
    }
    class CustomListCellRenderer extends DefaultListCellRenderer {
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            label.setPreferredSize(new Dimension(120, 30)); // Thiết lập kích thước ô
            return label;
        }
    }

    public JFrame getFrame() {
        return this;
    }

    public JPanel getCards() {
        return cards;
    }
    

    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DoAnView();
            }
        });
    }

}