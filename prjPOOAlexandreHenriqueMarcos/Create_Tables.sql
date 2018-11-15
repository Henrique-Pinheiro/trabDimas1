--tbCurso (PK:Sigla do Curso)
--tbTurma (PK: Sigla da Turma FK: Sigla do Curso)
--tbInstrutor (PK: Cpf)
--tbAluno (PK: Cpf)

--IMPORTANTE ESTE SQL FOI CRIADO NO POSTGRES
--PARA RODAR NO SQLDEVELOPER ADICIONAR VIRGULAS E ";"
--TROCAR "VARCHAR" POR "VARCHAR2"


CREATE TABLE tb_Curso (
curso_sigla VARCHAR(8) PRIMARY KEY,
curso_nome VARCHAR(30),
curso_carga_horaria int,
curso_valor INT,
curso_data_vigente date,
curso_valor_hora_instrutor VARCHAR(50),
curso_programa VARCHAR(50),
curso_turma VARCHAR(10)
);

CREATE TABLE tb_Turma (
turma_sigla VARCHAR(8),
turma_descricao VARCHAR(30),
turma_data_inicio date,
turma_data_termino date,
turma_periodo VARCHAR(10),
turma_qtd_vagas int,
turma_obs VARCHAR(150),
turma_instrutor VARCHAR(40),
turma_matriculas varchar(40),
turma_curso VARCHAR(8),
PRIMARY KEY (turma_sigla),
FOREIGN KEY (turma_curso) REFERENCES tb_Curso(curso_sigla)
);

CREATE TABLE tb_Aluno(
aluno_cpf VARCHAR(15) PRIMARY KEY,
aluno_nome VARCHAR(40),
aluno_escolaridade VARCHAR(40),
aluno_matricula VARCHAR(150)
);

