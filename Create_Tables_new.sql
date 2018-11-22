--tbCurso (PK:Sigla do Curso)
--tbTurma (PK: Sigla da Turma FK: Sigla do Curso)
--tbInstrutor (PK: Cpf)
--tbAluno (PK: Cpf)

--IMPORTANTE ESTE SQL FOI CRIADO NO POSTGRES
--PARA RODAR NO SQLDEVELOPER ADICIONAR VIRGULAS E ";"
--TROCAR "varchar2" POR "varchar22"


CREATE TABLE tb_Curso (
curso_sigla varchar2(8) PRIMARY KEY,
curso_nome varchar2(30),
curso_carga_horaria int,
curso_valor INT,
curso_data_vigente varchar2(8),
curso_valor_hora_instrutor varchar2(50),
curso_programa varchar2(50),
);

CREATE TABLE tb_Turma (
turma_sigla varchar2(8),
turma_data_inicio varchar2(8),
turma_data_termino varchar2(8),
turma_periodo varchar2(10),
turma_qtd_vagas int,
PRIMARY KEY (turma_sigla),
FOREIGN KEY (turma_curso) REFERENCES tb_Curso(curso_sigla)
);

CREATE TABLE tb_Aluno(
aluno_cpf varchar2(15) PRIMARY KEY,
aluno_nome varchar2(40),
aluno_data_nascimento varchar2 (8),
aluno_sexo varchar2 (1),
aluno_estado_civil varchar (20),
aluno_escolaridade varchar2(40),
aluno_endereço varchar2 (150),
aluno_numero varchar2 (5),
aluno_bairro varchar2 (150),
aluno_CEP varchar2 (15),
aluno_cidade varchar2 (50),
aluno_estado varchar2 (2),
aluno_tel_residencial varchar2 (15),
aluno_celular varchar2 (15),
aluno_RG varchar2 (15),
aluno_email varchar2 (20),
);

CREATE TABLE tb_Instrutor(
instrutor_cpf varchar2(15) PRIMARY KEY,
instrutor_nome varchar2(40),
instrutor_data_nascimento varchar2(8),
instrutor_sexo varchar2(1)
instrutor_estado_civil varchar (20),
intrutor_endereço varchar2 (150),
intrutor_numero varchar2 (5),
intrutor_bairro varchar2 (150),
intrutor_CEP varchar2 (15),
intrutor_cidade varchar2 (50),
intrutor_estado varchar2 (2),
intrutor_tel_residencial varchar2 (15),
intrutor_celular varchar2 (15),
intrutor_RG varchar2 (15
instrutor_formacao varchar2(50),
intrutor_area_atuacao varchar2(50),
instrutor_email varchar2(20)
)

