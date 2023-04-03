alter table talentos
add column empresa varchar(200) not null,
add column cargo varchar(100) not null,
add column descricao varchar(500) not null,
add column dataEntrada varchar (12) not null,
add column ativo varchar(10) not null,
add column dataSaida varchar(12) not null;