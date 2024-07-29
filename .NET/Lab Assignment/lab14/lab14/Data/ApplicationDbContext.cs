using lab14.Models;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace lab14.Data
{
    public class ApplicationDbContext : DbContext
    {
        public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options)
        : base(options)
        {
        }

        public DbSet<Employee>? Employees { get; set; }
    }
}


