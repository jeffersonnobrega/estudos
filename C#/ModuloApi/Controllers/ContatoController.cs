
using Microsoft.AspNetCore.Mvc;
using ModuloApi.Context;
using ModuloApi.Entities;

namespace ModuloApi.Controllers
{
    

    [ApiController]
    [Route("[Controller]")]
    public class ContatoController : ControllerBase{
        
        private readonly AgendaContext _context;
        public ContatoController(AgendaContext context)
        {
            _context = context;
        }
        [HttpPost]
        public IActionResult Create (Contato contato)
        {
            _context.Add(contato);
            _context.SaveChanges();
            return Ok(contato);

        }

    }

}