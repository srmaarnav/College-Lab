using System.ComponentModel.DataAnnotations;

namespace lab14.Models
{
    public class Employee
    {
        [Key]
        public int Id { get; set; }
        public string? Name { get; set; }
        public decimal Age { get; set; }
        public decimal Salary { get; set; }
    }
}
