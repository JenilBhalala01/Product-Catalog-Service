CREATE TABLE reviews (
    id         BIGINT PRIMARY KEY AUTO_INCREMENT,
    comment    VARCHAR(255) NOT NULL,
    product_id BIGINT,
    FOREIGN KEY (product_id) REFERENCES products(id)
);