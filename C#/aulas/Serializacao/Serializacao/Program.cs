
using Newtonsoft.Json;
using Serializacao;
using System.Text.Json.Serialization;

Clientes clientes = new Clientes(1,"Material de escritorio", 1.50M);

string serializado = JsonConvert.SerializeObject(clientes, Formatting.Indented);

File.WriteAllText("Models/clientes.json", serializado);

Console.WriteLine(serializado);