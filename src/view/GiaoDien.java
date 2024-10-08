package view;
import javax.swing.*;

import controller.DoAnController;

import java.awt.*;
import java.awt.event.ActionListener;

public class GiaoDien extends JFrame {
    private static JPanel cards;
	private static JFrame frame;
public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            frame = new JFrame("Quản lí kho hàng");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            

            // Tạo một mảng các JLabel với thuộc tính tùy chỉnh (text, màu văn bản, màu nền, kích thước)
            CustomJLabel[] labels = {
                    new CustomJLabel("Bán hàng", Color.white,new Color(0,128,128), new Dimension(120, 50)),
                    new CustomJLabel("Quản lý sản phẩm", Color.white, new Color(0,128,128), new Dimension(120, 50)),
                    new CustomJLabel("Quản lý nhân viên", Color.white, new Color(0,128,128), new Dimension(120, 50)),
                    new CustomJLabel("Quản lý khách hàng", Color.white,new Color(0,128,128), new Dimension(120, 50)),
                    new CustomJLabel("Nhập", Color.white, new Color(0,128,128), new Dimension(120, 50)),
                    new CustomJLabel("Hóa đơn", Color.white,new Color(0,128,128), new Dimension(120, 50)),
                    new CustomJLabel("Tài khoản", Color.white,new Color(0,128,128), new Dimension(120, 50)),
                    new CustomJLabel("Thống kê", Color.white, new Color(0,128,128), new Dimension(120, 50))
            };
                
        
            // Tạo một JList và đặt ListCellRenderer để hiển thị các JLabel với kích thước tùy chỉnh
            JList<CustomJLabel> jList = new JList<>(labels);
            jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            

     //       jList.setBorder(BorderFactory.createLineBorder(Color.black));
            jList.setCellRenderer(new CustomSizeLabelListCellRenderer());
            
            
            JPanel jPanel_west_giua = new JPanel();
            jPanel_west_giua.setBackground(new Color(0,128,128));
           
            jPanel_west_giua.setBorder(BorderFactory.createLineBorder(Color.black));
            jPanel_west_giua.add(jList, BorderLayout.CENTER);
       
            
        
            //duoi
            JPanel jPanel_footer = new JPanel();
    	    jPanel_footer.setBackground(Color.DARK_GRAY);
    	
    	    //tren  
    		   JPanel jPanel_head = new JPanel();
    		   jPanel_head.setBackground(new Color(0,128,128));
    		 
    		   JLabel jLabel_head = new JLabel("QUẢN LÍ KHO HÀNG");
    	
    		   jLabel_head.setForeground(Color.white);
    		   jPanel_head.setLayout(new FlowLayout(FlowLayout.LEFT));
    		   jPanel_head.add(jLabel_head);
            
    		   //giua
    		           //trai
    		 //trái
	           
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
            
            
            
            
            
	        cards = new JPanel(new CardLayout());
	       
	        frame.getContentPane().add(cards, BorderLayout.CENTER);
            frame.add(jPanel_head, BorderLayout.NORTH);
            frame.add(jPanel_footer, BorderLayout.SOUTH);
            frame.add(jPanel_west, BorderLayout.WEST);
            frame.setSize(700, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
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
    public JFrame getFrame() {
        return frame;
    }

    public JPanel getCards() {
        return cards;
    }
}


