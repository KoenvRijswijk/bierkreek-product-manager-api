package productmanager;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    private final JdbcTemplate jdbc;

    public ProductRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<Product> findAll() {
        return jdbc.query(
                "SELECT * FROM products",
                (rs, rowNum) -> new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("category"),
                        rs.getString("rootstock"),
                        rs.getDouble("price"),
                        rs.getInt("stock"),
                        rs.getBoolean("is_active")
                )
        );
    }

    public void save(Product p) {
        jdbc.update(
                "INSERT INTO products (name, category, rootstock, price, stock, is_active) VALUES (?, ?, ?, ?, ?, ?)",
                p.getName(), p.getCategory(), p.getRootstock(), p.getPrice(), p.getStock(), p.getIsActive()
        );
    }
}
