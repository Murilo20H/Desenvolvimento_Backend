CREATE DATABASE aula50_1;

USE aula50_1;

CREATE TABLE heroi(
id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(30), ataque INT, defesa INT, pontos_vida INT);
CREATE TABLE inimigo(
id INT, nome VARCHAR(30), ataque INT, defesa INT, pontos_vida INT);
CREATE TABLE dangeum(
id INT, nome VARCHAR(30), largura INT, altura INT, bioma VARCHAR(30), quantidade_baus INT, quantidade_inimigos INT);

DESCRIBE heroi;

DELETE FROM heroi WHERE id=4 LIMIT 1;

ALTER TABLE heroi ADD PRIMARY KEY(id);
ALTER TABLE heroi MODIFY COLUMN id INT AUTO_INCREMENT;

INSERT INTO heroi (nome, ataque, defesa, pontos_vida) VALUES ('Jorge', '8', '3', '18');
INSERT INTO heroi (nome, ataque, defesa, pontos_vida) VALUES ('Zian', '6', '6', '16');
INSERT INTO heroi (nome, ataque, defesa, pontos_vida) VALUES ('Higer', '10', '6', '8');

SELECT * FROM heroi;

CREATE TABLE mascote(
id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(30), id_heroi INT,
FOREIGN KEY (id_heroi) REFERENCES heroi(id));

DESCRIBE mascote;

ALTER TABLE mascote MODIFY COLUMN id_heroi INT NOT NULL;

INSERT INTO mascote (nome, id_heroi) VALUES ('Bolt', '1');
INSERT INTO mascote (nome, id_heroi) VALUES ('Lake', '2');
INSERT INTO mascote (nome, id_heroi) VALUES ('Trixie', '1');

SELECT * FROM mascote;