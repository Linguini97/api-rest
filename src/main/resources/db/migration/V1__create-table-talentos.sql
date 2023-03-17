create table talentos(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    cpf varchar(11) not null,
    email varchar(100) not null,
    celular varchar(20) not null,
    Data_de_Nascimento varchar(10) not null,
    Gênero varchar(20) not null,
    Cep varchar(9) not null,
    Cidade varchar(100) not null,
    Estado varchar(2) not null,
    País varchar(50) not null,
    Curso varchar(100) not null,
    Instituição varchar(100) not null,
    Situação varchar(50) not null,
    Ano_de_Formação varchar(4) not null,
    Biografia varchar(250) not null,

    primary key(id)

);