SELECT * FROM Clientes

CREATE TABLE Enderecos(
	Id int PRIMARY KEY IDENTITY(1,1) NOT NULL,
	IdCliente int NULL,
	Rua VARCHAR(255) NULL,
	Bairro VARCHAR(255)NULL,
	Cidade VARCHAR(255) NULL,
	Estado VARCHAR(2) NULL,

	CONSTRAINT FK_Enderecos_Clientes FOREIGN KEY(IdCliente)
	REFERENCES Clientes(Id)
)

SELECT * FROM Clientes WHERE Id = 4

SELECT * FROM Enderecos WHERE IdCliente = 4

INSERT INTO Enderecos VALUES (4, 'Conjunto 6', 'Samambaia Sul', 'Samambaia', 'DF')

SELECT * FROM
 Clientes
INNER JOIN Enderecos ON Clientes.Id = Enderecos.IdCliente
WHERE Clientes.Id = 4