using Microsoft.AspNetCore.Mvc;

namespace ASP.NETCORE_MVC.Controllers
{
    public class DefaultController : Controller
    {
        public IActionResult Index(string name="apple", int id = 2)
        {

            // return View();

            ViewData["name"] = name;
            ViewData["id"] = id;
            return View();
        }
    }
}
