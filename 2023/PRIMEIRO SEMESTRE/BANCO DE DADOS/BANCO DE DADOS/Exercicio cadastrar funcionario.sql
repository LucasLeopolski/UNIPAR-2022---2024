create table Departamento (

codID int primary key not null, 
nome varchar(50),
ativo boolean not null
)

create table ControleColaborador(
codID int primary key not null, 
nomeColaborador varchar(50),
cpf varchar (15) not null, 
data_Nascimento Date not null, 
data_Admissao Date not null, 
departamento int, 

constraint fk_departamento foreign key (departamento) references Departamento (codID)
)

select * from controlecolaborador 

select * from Departamento 

insert into Departamento values (1, 'Departamento1', true)

insert into controlecolaborador values(1, 'Colaborador1', '124.124.124-24', '2002-09-09', '2018-11-28', 1)

create table Epi(
idEpi int primary key not null, 
descricao varchar(50), 
data_Fabricacao Date not null, 
data_Vencimento Date not null

)

create table EntregaEpi(
idEntregaEpi int primary key not null, 
data_entrega Date not null,
idColaborador int, 
idEpi int,

constraint fk_idColaborador foreign key (idColaborador) references ControleColaborador (codID),

constraint fk_idEpi foreign key (idEpi) references Epi (idEpi)

)


insert into Epi values (111, 'Capacete', '2013-05-20', '2015-05-20')
select * from Epi

insert into EntregaEpi values (111, '2013-08-15', 1, 111)
select * from EntregaEpi





