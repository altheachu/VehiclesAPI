CREATE TABLE IF NOT EXISTS price (
    vehicle_id INT PRIMARY KEY auto_increment,
    currency VARCHAR(50),
    price DECIMAL(10,2),
);

INSERT INTO price (vehicle_id, currency, price) VALUES (1,'Euros',1000);
