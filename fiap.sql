    CREATE TABLE T_ALUNO (
        id_aluno int,
        nm_aluno varchar2(100)
    );
    
    CREATE TABLE T_ENDERECO (
        cep int primary key,
        nm_rua varchar(100),
        cidade varchar(100)
    );

--meu primeiro coment�rio

--deletar tabela
DROP TABLE T_ALUNO;