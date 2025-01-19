﻿using Microsoft.EntityFrameworkCore;
using MVC.Models;
using MVC.Context;

namespace MVC.Context
{
    public class AgendaContext : DbContext
    {
        public AgendaContext(DbContextOptions<AgendaContext> options) : base(options) 
        {
        }

        public DbSet<Contato> Contatos { get; set; }
    }
}
