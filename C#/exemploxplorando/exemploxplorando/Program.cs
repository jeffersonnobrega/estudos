using exemploxplorando.Models;


Pessoa p1 = new Pessoa(nome: "Luna", sobrenome: "Nóbrega");


Pessoa p2 = new Pessoa("Jefferson", "Nóbrega");

Curso cursodeIngles = new Curso();

cursodeIngles.Nome = "Inglês";
cursodeIngles.Alunos = new List<Pessoa>();

cursodeIngles.AdicionarAluno(p1);
cursodeIngles.AdicionarAluno(p2);
cursodeIngles.ListarAlunos();