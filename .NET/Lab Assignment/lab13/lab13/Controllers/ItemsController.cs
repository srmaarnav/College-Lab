using lab13.Models;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Data.SqlClient;

namespace lab13.Controllers
{
    public class ItemController : Controller
    {
        private string _connectionString = "Server=ARNAV;Database=lab_assignment;Integrated Security=true;Encrypt=false";

        public IActionResult Index()
        {
            List<Item> items = new List<Item>();
            using (SqlConnection connection = new SqlConnection(_connectionString))
            {
                connection.Open();
                string query = "SELECT * FROM Items";
                using SqlCommand command = new SqlCommand(query, connection);
                using SqlDataReader reader = command.ExecuteReader();
                while (reader.Read())
                {
                    Item item = new Item
                    {
                        Id = Convert.ToInt32(reader["Id"]),
                        Name = reader["Name"].ToString(),
                        Description = reader["Description"].ToString(),
                        Quantity = Convert.ToDecimal(reader["Quantity"])
                    };
                    items.Add(item);
                }
            }
            return View(items);
        }

        public IActionResult Create()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Create(Item item)
        {
            using (SqlConnection connection = new SqlConnection(_connectionString))
            {
                connection.Open();
                string query = "INSERT INTO Items (Name, Description, Quantity) VALUES (@Name, @Description, @Quantity)";
                using SqlCommand command = new SqlCommand(query, connection);
                command.Parameters.AddWithValue("@Name", item.Name);
                command.Parameters.AddWithValue("@Description", item.Description);
                command.Parameters.AddWithValue("@Quantity", item.Quantity);
                command.ExecuteNonQuery();
            }
            return RedirectToAction("Index");
        }

        public IActionResult Edit(int id)
        {
            Item item = new Item();
            using (SqlConnection connection = new SqlConnection(_connectionString))
            {
                connection.Open();
                string query = "SELECT * FROM Items WHERE Id = @Id";
                using SqlCommand command = new SqlCommand(query, connection);
                command.Parameters.AddWithValue("@Id", id);
                using SqlDataReader reader = command.ExecuteReader();
                while (reader.Read())
                {
                    item.Id = Convert.ToInt32(reader["Id"]);
                    item.Name = reader["Name"].ToString();
                    item.Description = reader["Description"].ToString();
                    item.Quantity = Convert.ToDecimal(reader["Quantity"]);
                }
            }
            return View(item);
        }

        [HttpPost]
        public IActionResult Edit(Item item)
        {
            using (SqlConnection connection = new SqlConnection(_connectionString))
            {
                connection.Open();
                string query = "UPDATE Items SET Name = @Name, Description = @Description, Quantity = @Quantity WHERE Id = @Id";
                using SqlCommand command = new SqlCommand(query, connection);
                command.Parameters.AddWithValue("@Id", item.Id);
                command.Parameters.AddWithValue("@Name", item.Name);
                command.Parameters.AddWithValue("@Description", item.Description);
                command.Parameters.AddWithValue("@Quantity", item.Quantity);
                command.ExecuteNonQuery();
            }
            return RedirectToAction("Index");
        }

        public IActionResult Delete(int id)
        {
            using (SqlConnection connection = new SqlConnection(_connectionString))
            {
                connection.Open();
                string query = "DELETE FROM Items WHERE Id = @Id";
                using SqlCommand command = new SqlCommand(query, connection);
                command.Parameters.AddWithValue("@Id", id);
                command.ExecuteNonQuery();
            }
            return RedirectToAction("Index");
        }
    }
}
