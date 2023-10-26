    CREATE TABLE T_ALUNO (
        id_aluno int,
        nm_aluno varchar2(100)
    );
    
    CREATE TABLE T_ENDERECO (
        cep int primary key,
        nm_rua varchar(100),
        cidade varchar(100)
    );

--meu primeiro comentário

--deletar tabela
DROP TABLE T_ALUNO;