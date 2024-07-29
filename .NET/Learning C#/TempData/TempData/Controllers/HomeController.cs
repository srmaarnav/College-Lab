using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;
using TempData.Models;

namespace TempData.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }

        public IActionResult Index()
        {
            TempData["Id"] = 101;
            return View();
        }

        public IActionResult First()
        {
            var uid = TempData["Id"];
            TempData.Keep();
            return View();
        }

        public IActionResult Second()
        {
            var uid = TempData["Id"];
            return View();
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
