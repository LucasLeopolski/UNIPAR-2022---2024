create table funcionario(
idFuncionario int primary key not null, 
nome varchar (50),
endereco varchar (50),
telefone varchar (50),
codDepartamento int not null,

codDepart int, 

constraint fk_depart foreign key (codDepart) references departamento (idDepartamento))

insert into funcionario (idFuncionario, nome, endereco, telefone, codDepartamento) values (10, 'João Paulo','Rua dos Ipês - 233', '(45) 9 999999999', 1);
insert into funcionario (idFuncionario, nome, endereco, telefone, codDepartamento) values (20, 'Ana','Rua Marechal - 3874', '(45) 9 888888888', 2);
insert into funcionario (idFuncionario, nome, endereco, telefone, codDepartamento) values (30, 'Maria','Rua Recife - 31', '(45) 9 777777777', 3);
insert into funcionario (idFuncionario, nome, endereco, telefone, codDepartamento) values (40, 'Antonio','Rua Paraná - 3341', '(45) 9 666666666', 4);
insert into funcionario (idFuncionario, nome, endereco, telefone, codDepartamento) values (50, 'Marcos','Rua das Araras - 0371', '(45) 9 655555566', 4)

select * from funcionario

create table dependentes(
idDependentes int primary key not null, 
codFuncionario int not null, 
nome varchar (50),
dataNascimento varchar (50),

codFuncio int,

constraint fk_funcionario foreign key (codFuncio) references funcionario (idFuncionario)
)

insert into dependentes (idDependentes, codFuncionario, nome, dataNascimento) values (4, 10, 'Marcos', '2015-12-08' );
insert into dependentes (idDependentes, codFuncionario, nome, dataNascimento) values (8, 10, 'Maria', '2008-02-18' );
insert into dependentes (idDependentes, codFuncionario, nome, dataNascimento) values (12, 30, 'Joao', '2009-10-12' );
insert into dependentes (idDependentes, codFuncionario, nome, dataNascimento) values (15, 30, 'Carina', '2011-01-18' );

select * from dependentes


create table departamento (
idDepartamento int primary key not null,
descricao varchar (50)
)

insert into departamento (idDepartamento, descricao) values (1, 'Compras');
insert into departamento (idDepartamento, descricao) values (2, 'Financeiro');
insert into departamento (idDepartamento, descricao) values (3, 'Atendimento ao Cliente');
insert into departamento (idDepartamento, descricao) values (4, 'Recursos Humanos ')

select * from departamento


create table salarios (
idSalario int primary key not null,
valorSlario money not null,
dataAlteracao date, 
codFuncionario int,

constraint fk_codFuncionario foreign key (codFuncionario) references funcionario (idFuncionario)
)

insert into salarios (idSalario, valorSlario, dataAlteracao, codFuncionario) values (1, '1.524.80', '2000-08-05', 10);
insert into salarios (idSalario, valorSlario, dataAlteracao, codFuncionario) values (9, '1.524.80', '2000-08-05', 20);
insert into salarios (idSalario, valorSlario, dataAlteracao, codFuncionario) values (3, '1.524.80', '2000-08-05', 30);
insert into salarios (idSalario, valorSlario, dataAlteracao, codFuncionario) values (5, '', '2000-08-05', 40)

select * from salarios


select f1.nome,
s1.valorslario 
from funcionario f1

inner join salarios  s1 on s1.codfuncionario =  f1.idfuncionario;


select f1.nome,
s1.valorslario
from funcionario f1

left join salarios s1 on s1.codfuncionario = f1.idfuncionario

select dp1.nome Nome_dependente,
f1.nome 
from dependentes dp1

right join funcionario f1  on f1.coddepart  = dp1.codFuncionario



