package ua.univer.products;

	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.List;
	import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JDialog;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;
	
public class ProductInfoClient extends JDialog {
	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	// ������� DAO-������
	ProductDAO productDAO = new ProductDAO();
	// ���������� ��������� ����������
	private JLabel lbSelectId = new JLabel("����� ������ �� Id");
	private JLabel lbId = new JLabel("Id");
	private JLabel lbDescription = new JLabel("��������");
	private JLabel lbRate = new JLabel("����");
	private JLabel lbQuantity = new JLabel("�������");
	private JComboBox comboId = new JComboBox();
	private JTextField txtId = new JTextField();
	private JTextField txtDescription = new JTextField();
	private JTextField txtRate = new JTextField();
	private JTextField txtQuantity = new JTextField();
	private JButton btnAdd = new JButton("��������");
	private JButton btnUpdate = new JButton("��������");
	private JButton btnRemove = new JButton("�������");
	private JButton btnClear = new JButton("��������");
	/**
	* ������� ��������� �������
	* @param args
	*/
	public static void main(String[] args) {
	new ProductInfoClient();
	}
	/**
	* ����������� �������
	*/
	public ProductInfoClient() {
	this.setTitle("���������� � �������");
	this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	this.setLayout(new GridLayout(8, 2));
	this.setBounds(100, 50, 400, 200);
	// ���������� ��������� ���������� � ������
	this.add(lbSelectId);
	this.add(comboId);
	this.add(lbId);
	this.add(txtId);
	this.add(lbDescription);
	this.add(txtDescription);
	this.add(lbRate);
	this.add(txtRate);
	this.add(lbQuantity);
	this.add(txtQuantity);
	this.add(btnAdd);
	this.add(btnUpdate);
	this.add(btnRemove);
	this.add(btnClear);
	// �������� ������������ �������
	comboId.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	showProductData();
	}
	});
	btnAdd.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	addProduct();
	}
	});
	btnUpdate.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	updateProduct();
	}
	});
	btnRemove.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	removeProduct();
	}
	});
	btnClear.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	clearProductInfo();
	}
	});
	// ��������� ������ ��������������� �������
	refreshIdList();
	// ���������� ������ �� ������
	this.setVisible(true);
	}
	/**
	* ��������� ������ ��������������� �������
	* � ��������� ������
	*/
	private void refreshIdList() {
	try {
	// �������� ������ ���������������
	List<Integer> productIds = productDAO.getProductIds();
	// ������� ������
	comboId.removeAllItems();
	// ��������� ������ ����������� �������
	for (Integer productId: productIds) {
	comboId.addItem(productId);
	}
	} catch (Exception e) {
	e.printStackTrace();
	JOptionPane.showMessageDialog(this, e.getMessage());
	}
	}
	/**
	* ���������� ������ � ������ ��
	* ���������� � ������ ��������������
	*/
	protected void showProductData() {
	try {
	// �������� ��������, ��������� � ������
	// ��������������� �������
	Integer productId = (Integer)comboId.getSelectedItem();
	if (productId != null) {
	// �������� ����� �� ��������������
	List<Product> product = productDAO.getProductById(productId);
	// ��������� ��������� ���� ����������
	// ���������� ������
	for(int i=0; i<product.size(); i++){
	txtId.setText(String.valueOf(product.get(i).getId()));
	txtDescription.setText(product.get(i).getDescription());
	txtRate.setText(String.valueOf(product.get(i).getRate()));
	txtQuantity.setText(String.valueOf(product.get(i).getQuantity()));
	}
	}
	} catch (Exception e) {
	e.printStackTrace();
	JOptionPane.showMessageDialog(this, e.getMessage());
	}
	}
	/**
	* ��������� ����� ����� �� ������
	* ������ ��������� �����
	*/
	protected void addProduct() {
	try {
	// ������� ����� ������-�����
	// �� ������ ������ �������
	Product product = new Product(
	Integer.parseInt(txtId.getText()),
	txtDescription.getText(),
	Float.parseFloat(txtRate.getText()),
	Integer.parseInt(txtQuantity.getText()));
	// ��������� ����� � ��
	productDAO.addProduct(product);
	// ��������� ������ ���������������
	refreshIdList();
	// ������������� ������� ����������� �����
	comboId.setSelectedItem(
	Integer.parseInt(txtId.getText()));
	} catch (Exception e) {
	e.printStackTrace();
	JOptionPane.showMessageDialog(this, e.getMessage());
	}
	}
	/**
	* ��������� ���������� � ������ �� ������
	* ������ ��������� �����
	*/
	protected void updateProduct() {
	try {
	// ��������� ������-�����
	// �� ������ ������ �������
	Product product = new Product(
	Integer.parseInt(txtId.getText()),
	txtDescription.getText(),
	Float.parseFloat(txtRate.getText()),
	Integer.parseInt(txtQuantity.getText()));
	// ��������� ������ � ������ � ��
	productDAO.setProduct(product);
	} catch (Exception e) {
	e.printStackTrace();
	JOptionPane.showMessageDialog(this, e.getMessage());
	}
	}
	/**
	* ������� ��������� �����
	*/
	protected void removeProduct() {
	try {
	// ������� ����� �� ��
	productDAO.removeProduct(
	Integer.parseInt(txtId.getText()));
	// ��������� ������ ��������������� �������
	refreshIdList();
	// ���������� ������ �� ������� ������ � ������
	showProductData();
	} catch (Exception e) {
	e.printStackTrace();
	JOptionPane.showMessageDialog(this, e.getMessage());
	}
	}
	/**
	* ������� ������ � ��������� �����
	*/
	protected void clearProductInfo() {
	try {
	txtId.setText("");
	txtDescription.setText("");
	txtRate.setText("");
	txtQuantity.setText("");
	} catch (Exception e) {
	e.printStackTrace();
	JOptionPane.showMessageDialog(this, e.getMessage());
	}
	}
	}
