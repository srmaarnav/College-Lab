﻿using System.ComponentModel.DataAnnotations;

namespace crud.Models
{
    public class Employee
    {
        [Key]
        public int Id { get; set; }
        [Required]
        public string Name { get; set; }
        [Required]
        public int Salary { get; set; }
    }
}
