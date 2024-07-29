using Microsoft.AspNetCore.Mvc;
using MVC_Core.Models;
using MVC_Core.Services;
using System.Diagnostics;

namespace MVC_Core.Controllers
{
    public class HomeController : Controller
    {
        public readonly ILog _ILog;
        public HomeController(Services.ILog ilog)
        {
            _ILog = ilog;
        }

        public IActionResult Index()
        {
            _ILog.Info("Hi");
            return View();
        }
        // [NonAction]
        public IActionResult Privacy(int id, string name)
        {
            return View();
        }
        [HttpPost]
        public IActionResult Privacy(Frm form)
        {
            if (ModelState.IsValid)
            {
                return Content("Done");
            }
            else
            {
                return View(form);
            }
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
