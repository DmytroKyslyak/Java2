package ua.univer.products;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;

	public class ProductDAO {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/goodsdb", "root", "1");
	}
	
public List<Integer> getProductIds() throws Exception {
	List<Integer> productIds = new ArrayList<Integer>();
	// ��������� ���������� � ��
	Connection con = getConnection();
	// ���������� SQL-�������
	ResultSet rs = con.createStatement().executeQuery(
	"Select id_pr From products");
	// ����������� ���������� �������
	while (rs.next()) {
	// �� ������ ������ ������� ��������
	// ��������� � �������� � ���������
	productIds.add(rs.getInt(1));
	}
	// ��������� ������� � ���������� � ��
	rs.close();
	con.close();
	return productIds;
	}
	/**
	* ���������� ����� �� ��������������
	*
	* @return
	*/
public List<Product> getProductById(int id) throws Exception {
	List<Product> products = new ArrayList<Product>();
	// ��������� ���������� � ��
	Connection con = getConnection();
	// ���������� SQL-�������
	PreparedStatement st = con.prepareStatement(
	"Select description, rate, quantity " +
	"From products " +
	"Where id_pr = ?");
	// �������� �������� ���������� �������
	st.setInt(1, id);
	// ���������� �������
	ResultSet rs = st.executeQuery();
	Product product = null;
	// ����������� ���������� �������
	while (rs.next()) {
	// �� ������ ������ ������� �������� ����������,
	// ��������� ����� ������ Product
	// � �������� ��� � ���������
	product = new Product(
	id,
	rs.getString(1),
	rs.getFloat(2),
	rs.getInt(3));
	products.add(product);
	}
	// ��������� ������� � ���������� � ��
	rs.close();
	con.close();
	return products;
	}
	/**
	* ��������� ����� �����
	* @param product
	* @throws Exception
	*/
public void addProduct(Product product) throws Exception {
	// ��������� ���������� � ��
	Connection con = getConnection();
	// ���������� SQL-�������
	PreparedStatement st = con.prepareStatement(
	"Insert into products " +
	"(id_pr, description, rate, quantity) " +
	"values (?, ?, ?, ?)");
	// �������� �������� ���������� �������
	st.setInt(1, product.getId());
	st.setString(2, product.getDescription());
	st.setFloat(3, product.getRate());
	st.setInt(4, product.getQuantity());
	// ���������� �������
	st.executeUpdate();
	con.close();
	}
	/**
	* ��������� ������ � ������
	* @param product
	* @throws Exception
	*/
public void setProduct(Product product) throws Exception {
	// ��������� ���������� � ��
	Connection con = getConnection();
	// ���������� SQL-�������
	PreparedStatement st = con.prepareStatement(
	"Update products " +
	"Set description=?, rate=?, quantity=? " +
	"Where id_pr=?");
	// �������� �������� ���������� �������
	st.setString(1, product.getDescription());
	st.setFloat(2, product.getRate());
	st.setInt(3, product.getQuantity());
	st.setInt(4, product.getId());
	// ���������� �������
	st.executeUpdate();
	con.close();
	}
	public void removeProduct(int id) throws Exception {
	// ��������� ���������� � ��
	Connection con = getConnection();
	// ���������� SQL-�������
	PreparedStatement st = con.prepareStatement(
	"Delete from products " +
	"Where id_pr = ?");
	// �������� �������� ���������� �������
	st.setInt(1, id);
	// ���������� �������
	st.executeUpdate();
	con.close();
	}
	}
