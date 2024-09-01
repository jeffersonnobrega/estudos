SELECT * FROM Produtos

SELECT Nome, Cor FROM Produtos

SELECT Nome  + ' - ' + Cor FROM Produtos

SELECT Nome  + ' - ' + Cor CONCATENADO FROM Produtos

SELECT
		UPPER (Nome) Nome, 
		LOWER (Cor) Cor

FROM Produtos

ALTER TABLE Produtos 
ADD DataCadastro DATETIME2

UPDATE Produtos SET DataCadastro = GETDATE()

ALTER TABLE Produtos ADD Preco2 DECIMAL

ALTER TABLE Produtos DROP COLUMN Preco2

SELECT FORMAT(DataCadastro, 'dd-MM-yyyy') Data FROM Produtos 