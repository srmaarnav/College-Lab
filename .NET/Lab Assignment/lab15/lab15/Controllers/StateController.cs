using Microsoft.AspNetCore.Mvc;

namespace lab15.Controllers
{
    public class StateController : Controller
    {
        public IActionResult Add()
        {
            return View();
        }
        [HttpPost]
        public IActionResult SetUserData(string username, string message)
        {
            HttpContext.Session.SetString("Username", username);
            TempData["Message"] = message;
            return RedirectToAction("Display");
        }
        public IActionResult Display()
        {
            string username = HttpContext.Session.GetString("Username");
            string message = TempData["Message"] as string;
            ViewBag.Username = username;
            ViewBag.Message = message;
            return View();
        }
    }
}
