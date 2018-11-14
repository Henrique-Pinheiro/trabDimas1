--tbCurso (PK:Sigla do Curso)
--tbTurma (PK: Sigla da Turma FK: Sigla do Curso)
--tbInstrutor (PK: Cpf)
--tbAluno (PK: Cpf)

CREATE TABLE tb_Curso (
curso_sigla VARCHAR2(8) PRIMARY KEY,
curso_nome VARCHAR2(30),
curso_
)