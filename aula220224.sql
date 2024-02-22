DROP TABLE T_ESTUDANTE;
DROP TABLE T_DOCUMENTO;

CREATE TABLE T_ESTUDANTE(
    rm int PRIMARY KEY,
    nome varchar2 (100) CONSTRAINT nn_nome  not null,
    dt_nascimento date,
    sx_biologico char(1)--F,M,N
);

CREATE TABLE T_DOCUMENTO(
    id_doc int,
    rg varchar(15) constraint uk_rg unique,
    cpf varchar(15),
    rm_fk int references T_ESTUDANTE(rm),
    constraint uk_cpf unique(cpf)
    primary key (id_doc)
);

CREATE TABLE T_DISCIPLINA(
    id_disc int primary key,
    nm_disc varchar2(50)
);

CREATE TABLE T_NOTAS(
    id_nota int primary key,
    cp1 number,
    cp2 number,
    cp3 number,
    id_disc_fk int references T_DISCIPLINA(id_disc),
    rm_fk int references T_ESTUDANTE(rm)
);






