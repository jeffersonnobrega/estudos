namespace WebApi.Models
{
    public class ServiceResponse<T>
    {
        public T? Dados { get; set; } //o ? indica que pode ser nulo
        public string Mensagem { get; set; } = string.Empty; //instanciada como uma string vazia
        public bool Sucesso { get; set; } = true;
    }
}
