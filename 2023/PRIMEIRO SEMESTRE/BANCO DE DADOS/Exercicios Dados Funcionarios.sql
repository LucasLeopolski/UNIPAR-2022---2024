select * from dependentes

select * from departamento 

select * from funcionario 

select * from salarios
--============================================================


-- 1) Quanto foi gasto com folha de pagamentos entre 
--01/01/2021 - 31/12/2022


select f1.nome, sum (s1.valor_salario * (
		extract ('MONTH' from AGE (TO_DATE ('2022/12/31', 'yyyy/mm/dd'),data_alteracao)) + 
		(12* extract ('year' from AGE (TO_DATE('2022/12/31', 'yyyy/mm/dd'),data_alteracao)))))

from funcionario f1
left join salarios s1 on s1.id_funcionario = f1.codigo
where
	s1.data_alteracao between to_date ('2021/01/01', 'yyy/mm/dd') and to_date ('2022/12/31','yyy/mm/dd')

group by f1.nome


--============================================================


-- 2) Qual o valor da folha de cada departamento 

select sum (valor_salario), departamento.
from salarios

and 





--============================================================
-- 3) Qual o colaborador com o maior salario? 


select funcionario.nome, salarios.valor_salario, MAX( valor_salario) AS maior_salario
from funcionario

inner join salarios ON funcionario.codigo = salarios.codigo
group by funcionario.nome, salarios.valor_salario 





--============================================================
-- 4) Qual o departamento possui o colaborador com o menor salario? 

select departamento.descricao ,funcionario.nome, salarios.valor_salario
from departamento
inner join funcionario ON departamento.codigo = funcionario.codigo
inner join salarios on funcionario.codigo = salarios.id_funcionario



--============================================================
-- 5) Crie uma estrutura que possa ser possivel marcar como 'demitido'
-- um colaborador, quando isso ocorrer, o salário dele
-- deverá ser atualizado para "0"



----============================================================
Apresente uma consulta com todos os dependentes assim como seus respectivos funcionario, mostrando 
-- também os funcionarios que não possuem dependentes
select d1.nome, f1.nome 
from dependentes d1

right join funcionario f1 on f1.codigo = d1.codigo;