SELECT * FROM Produtos

SELECT COUNT(*) FROM Produtos

SELECT COUNT(*) QtdProdutos FROM Produtos WHERE Tamanho = 'M'

SELECT SUM (Preco) TotalPrecos FROM Produtos  

SELECT SUM (Preco) TotalPrecos FROM Produtos  WHERE Tamanho = 'M'

SELECT MAX(Preco) ProdutoMaisCaro FROM Produtos

SELECT MAX(Preco) ProdutoMaisCaroP FROM Produtos WHERE Tamanho = 'P'

SELECT MIN(Preco) ProdutoMaisBarato FROM Produtos

SELECT AVG(Preco) MediadePrecos FROM Produtos