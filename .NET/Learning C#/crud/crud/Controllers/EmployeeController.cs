using crud.Data;
using crud.Models;
using Microsoft.AspNetCore.Mvc;

namespace crud.Controllers
{
    public class EmployeeController : Controller
    {
        private readonly ApplicationContext context;
        public EmployeeController(ApplicationContext context)
        {
            this.context = context;
        }
        public IActionResult Index()
        {
            var employee = context.Employees.ToList();
            return View(employee);
        }
        [HttpGet]
        public IActionResult Create()
        {
            return View();
        }
        [HttpPost]
        public IActionResult Create(Employee model)
        {
            if (ModelState.IsValid)
            {
                var data = new Employee
                {
                    Name = model.Name,
                    Salary = model.Salary,
                };
                context.Employees.Add(data);
                context.SaveChanges();
                return RedirectToAction("Index");
            }
            else
            {
                return View(model);
            }
            /*var data = new Employee
            {
                Name = "John",
                Salary = 12000,
            };
            context.Employees.Add(data);
            context.SaveChanges();
            return RedirectToAction("Index");*/

        }

        public IActionResult Delete(int id) 
        { 
            var emp = context.Employees.SingleOrDefault(x => x.Id == id);
            context.Employees.Remove(emp);
            context.SaveChanges();
            return RedirectToAction("Index");
        }


        public IActionResult Edit(int id) 
        {
            var emp = context.Employees.SingleOrDefault(x => x.Id == id);
            var result = new Employee()
            {
                Name = emp.Name,
                Salary = emp.Salary,
            };
            return View(result);
        }
        [HttpPost]
        public IActionResult Edit(Employee model)
        {
           var emp = context.Employees.SingleOrDefault(emp => emp.Id == model.Id);

            if(emp != null)
            {
                emp.Name = model.Name;
                emp.Salary = model.Salary;
                context.Employees.Update(emp);
                context.SaveChanges();
            }
            return RedirectToAction("Index");
        }
    }
}
