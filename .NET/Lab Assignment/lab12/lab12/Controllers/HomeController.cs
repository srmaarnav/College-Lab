using lab12.Models;
using lab12.Services;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace lab12.Controllers
{
    public class HomeController : Controller
    {
        private readonly ISubjectService _services;

        public HomeController(ISubjectService services)
        {
            _services = services;
        }

        public IActionResult Index()
        {
            string message = _services.GetRoutine();
            return View(model: message);
        }
    }
}
