CREATE DATABASE aula50_2;

USE aula50_2;

CREATE TABLE medico(
crm INT PRIMARY KEY, nome VARCHAR(50), especialidade VARCHAR(30));

INSERT INTO medico(crm, nome, especialidade) VALUES (123, 'Jorge Fabrício da Cunha Silva', 'Oftalmologista');
INSERT INTO medico(crm, nome, especialidade) VALUES (234, 'Silva Jorge da Cunha Fabrício', 'Neurologistas');
INSERT INTO medico(crm, nome, especialidade) VALUES (345, 'Fabrício da Cunha Jorge Silva', 'Cardiologista');
INSERT INTO medico(crm, nome, especialidade) VALUES (456, 'Jorge da Cunha Silva Fabrício', 'Ortopedista');

SELECT * FROM medico;

UPDATE medico SET especialidade='Neurologista' WHERE crm=234;