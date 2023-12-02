-- data.sql
-- schema.sql

-- Creating the fish table
CREATE TABLE IF NOT EXISTS fish (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);


-- Inserting sample data into the fish table
INSERT INTO fish (name) VALUES ('Goldfish');
INSERT INTO fish (name) VALUES ('Betta Fish');
INSERT INTO fish (name) VALUES ('Guppy');
