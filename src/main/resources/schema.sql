CREATE TABLE IF NOT EXISTS products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    category VARCHAR(255),
    rootstock VARCHAR(255),
    price DOUBLE,
    stock INT,
    is_active BOOLEAN
);

INSERT INTO products (name, category, rootstock, price, stock, is_active)
VALUES
('Rosa Rugosa', 'Bodembedekkers', 'Eigen wortel', 9.95, 120, true),
('Rosa New Dawn', 'Klimrozen', 'Laxa', 12.50, 80, true),
('Rosa Queen Elizabeth', 'Trosrozen', 'Multiflora', 11.25, 40, true);
