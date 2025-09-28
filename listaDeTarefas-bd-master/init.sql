CREATE TABLE IF NOT EXISTS tarefa (
  id SERIAL PRIMARY KEY,
  descricao VARCHAR(255),
  concluida BOOLEAN
);

INSERT INTO tarefa (descricao, concluida) VALUES
  ('Estudar Docker', false),
  ('Ler documentação do Angular', true),
  ('Criar API com Spring Boot', false);
