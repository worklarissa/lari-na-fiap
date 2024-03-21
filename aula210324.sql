CREATE DATABASE FIAP;

-- Utilize USE antes de criar uma tabela para selecionar o bd.
USE FIAP;

CREATE TABLE ALUNO(
	ra int primary key,
    nm_aluno varchar(100),
    dt_nascimento date, 
    st_aluno char(1) CHECK(st_aluno IN ('a', 'i'))
);


-- não procedural(atualiza os dados em todas as linhas de uma determinada coluna)
INSERT INTO ALUNO VALUES(1, 'Felipe', '2000-07-01', 'a');

-- procedural (atualiza os dados em algumas linhas de uma determinada coluna)
INSERT INTO ALUNO (ra, nm_aluno) VALUES (2, 'Douglas');

-- consulta simples(Não Procedural)
SELECT * FROM ALUNO;

UPDATE ALUNO SET nm_aluno="João";

UPDATE ALUNO SET nm_aluno="João Lima" WHERE ra=1;

-- cenários de erro cim o insert
-- 1: Colunas a menos (1136)
INSERT INTO ALUNO VALUES(1, 'Felipe', '2000-07-01');

-- 2:chave primaria duplicada(1062)
INSERT INTO ALUNO VALUES(1, 'Felipe', '2000-07-01', 'a');

-- 3: Constraint CHECK não atende o valor padrão (4025)
INSERT INTO ALUNO VALUES(1, 'Felipe', '2000-07-01', 's');

-- 4: tipo de dado incorreto para a coluna (1054 e 1366)
INSERT INTO ALUNO VALUES(1, Felipe, '2000-07-01', 'a');
INSERT INTO ALUNO VALUES('A3', 'Felipe', '2000-07-01', 'a');

-- auto inccrement: é um contador automático de numerais em inteiro
CREATE TABLE CONTATO(
	id_contato int primary key auto_increment,
    ddd int not null,
    nr_telefone int not null,
    ra int REFERENCES ALUNO(ra)
);

INSERT INTO CONTATO VALUES(null, 11, 915364789,1);

SELECT * FROM CONTATO;

-- 5: coluna com valor vazio(1048) em razão do not null
INSERT INTO CONTATO VALUES(null, null, 208434802, 5);