create table tbColaborador(
idColaborador int primary key not null, 
nome varchar (50),
cpf varchar (50),
endereco varchar (50),
email varchar (50),
departament int not null
)


insert into tbColaborador (idColaborador, nome, cpf, endereco, email, departament) values (1,  'José', '111.222.333-44', 'Rua Rio Grande', 'jose@gmail.com' , 2)

select * from tbColaborador


create table tbDepartamento(
idDepartamento int primary key not null, 
nomeDeprtamento varchar (50)
)


insert into tbDepartamento (iddepartamento , nomeDeprtamento) values ( 1, 'Contabilidade');

insert into tbDepartamento (iddepartamento , nomeDeprtamento) values ( 2, 'Financeiro')

select * from tbdepartamento where idDepartamento = 1